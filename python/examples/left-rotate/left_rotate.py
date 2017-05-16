def left_rotate(list, n):
    """Rotate list n times

    Attributes:
        list: A list to be rotated
        n: An integer representing the number of times to rotate
    """
    n %= len(list)
    return list[n:] + list[:n]


input_str = input()
n = int(input())
list = input_str.split()

result = left_rotate(list, n)
print(result)
