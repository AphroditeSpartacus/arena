import functools

def memo(func):
    cache = {}
    @functools.wraps(func)
    def _memo(*args):
        if args not in cache:
            cache[args] = func(*args)
        return cache[args]
    return _memo
