def bin2dec(string_number):
    return str(int(string_number, 2))


def dec2bin(number):
    return bin(number)[2:]


if __name__ == '__main__':
    print bin2dec('11')
    print dec2bin(10)