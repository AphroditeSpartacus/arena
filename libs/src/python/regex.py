import re

# allow 00.00.000.00
# ipv4 = re.compile(r'^(([0-1]\d\d?|2[0-4]\d|25[0-5])\.){3}([0-1]\d\d?|2[0-4]\d|25[0-5])$')

# allow only 0.0.0.0
ipv4 = re.compile(r'^((\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.){3}(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])$')


if __name__ == '__main__':
    ip1 = '172.16.82.15'
    # ip1 = '0.0.0.0'
    print(ipv4.search(ip1).group())
