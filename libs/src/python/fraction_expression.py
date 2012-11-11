def fraction_expression(numerator, denominator, base=10):
    '''return (divisor, digits_before_cycle, digits_of_cycle)'''
    divisor, remainder = divmod(numerator, denominator)
    digits, cache= [], {}
    while remainder != 0 and remainder not in cache:
        cache[remainder] = len(digits)
        d, remainder = divmod(remainder * base, denominator)
        digits.append(d)
    if remainder == 0:
        digits_before_cycle, digits_of_cycle = digits, []
    else:
        digits_before_cycle, digits_of_cycle = digits[:cache[remainder]], digits[cache[remainder]:]
    return divisor, digits_before_cycle, digits_of_cycle
