def add(x, y=None):
    if y != None:
        return x + y
    else:
        def helper(z):
            return x + z
        return helper

print(add(3,4))
print(add(3)) # prints function
print(add(3)(4))

# named arguments
print(add(y=7, x=3))
