def quick_sort(seq):
    def partition(seq, begin, end):
        import random
        pivot = begin + random.randrange(end - begin)
        head, tail = begin, end - 1
        while head < tail:
            while head < pivot and seq[head] <= seq[pivot]:
                head += 1
            if head < pivot and seq[head] > seq[pivot]:
                seq[head], seq[pivot] = seq[pivot], seq[head]
                pivot = head
            while tail > pivot and seq[tail] >= seq[pivot]:
                tail -= 1
            if tail > pivot and seq[tail] < seq[pivot]:
                seq[tail], seq[pivot] = seq[pivot], seq[tail]
                pivot = tail
        return pivot

    def quick_sort_helper(seq, begin, end):
        if begin < end:
            pivot = partition(seq, begin, end)
            quick_sort_helper(seq, begin, pivot)
            quick_sort_helper(seq, pivot + 1, end)

    quick_sort_helper(seq, 0, len(seq))
