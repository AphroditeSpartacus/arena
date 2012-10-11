import re


def is_valid_ipv4(ip):
    # ipv4 = re.compile(r'^(([0-1]\d\d?|2[0-4]\d|25[0-5])\.){3}([0-1]\d\d?|2[0-4]\d|25[0-5])$') # allow 00.000.00.0
    ipv4 = re.compile(r'^((\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.){3}(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])$')
    return bool(ipv4.search(ip)) if type(ip) is str else None


def ipv4_netmask_to_cidr(netmask):
    if not is_valid_ipv4(netmask):
        return None
    bit_str = ''.join(map(lambda x: '%04d' % int(bin(int(x))[2:]), netmask.split('.'))).rstrip('0')
    if bit_str.find('0') != -1:
        return None
    return len(bit_str)


def ipv4_cidr_to_netmask(cidr):
    MAX_CIDR = 32
    if type(cidr) is not int or cidr > MAX_CIDR:
        return None
    bit_str = ''.join(['1' if x < cidr else '0' for x in range(MAX_CIDR + 1)])
    bit_range = range(0, MAX_CIDR + 1, 8)
    return '.'.join(map(lambda x: str(int(x, 2)), [bit_str[bit_range[i - 1]:bit_range[i]] for i in range(1, len(bit_range))]))


if __name__ == '__main__':
    for x in range(36):
        print(x, ipv4_cidr_to_netmask(x), ipv4_netmask_to_cidr(ipv4_cidr_to_netmask(x)))

    print(is_valid_ipv4('0.0.0.0'))
