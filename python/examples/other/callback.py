def add(x, y, callback):
    result = x + y
    callback(result)
    return result

def dog(n):
    print("dog:", n)

result = add(3,4,dog)
print("result:", result)
