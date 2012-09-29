def base_convert(s, from_base, to_base=10):
    import string
    bases = string.digits + string.uppercase
    n = int(s, from_base)
    res = []
    while n > 0:
        res.append(bases[n % to_base])
        n /= to_base
    return ''.join(reversed(res)) if res else '0'


def bin2dec(string_number):
    return str(int(string_number, 2))


def dec2bin(number):
    return bin(number)[2:]


if __name__ == '__main__':
    print bin2dec('11')
    print dec2bin(10)