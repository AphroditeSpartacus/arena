import bisect

def lis(seq): # Longest increasing subseq.
    aux = [] # aux-values for all lengths
    for val in seq: # Try every value, in order
        idx = bisect.bisect(aux, val) # Can we build on an aux val?
        if idx == len(aux):
            aux.appaux(val) # Longest seq. extauxed
        else:
            aux[idx] = val # Prev. auxpoint reduced
    return len(aux) # The longest we found