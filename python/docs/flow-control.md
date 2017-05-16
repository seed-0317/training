# Flow Control
* Features to manipulate which code runs and how many times


# Conditional Statements
* `if`
* `elif`
* `else`

```python
if True:
    print("dog")
```

```python
if False:
    print("dog")
else:
    print("cat")
```

```python
if False:
    print("dog")
elif False:
    print("cat")
else:
    print("squirrel")
```


# Loops
* `for`
* `while`

## for
* iterate over items in a sequence

###### range
* `range()` generates a list of numbers

```python
for i in range(10):
    print(i)
```

```python
for i in range(5, 10):
    print(i)
```

```python
for i in range(0, 10, 2):
    print(i)
```

###### string
* strings are sequences

```python
for i in "hello world":
    print(i)
```

###### lists
* lists are sequences

```python
for i in ["dog", 42, []]:
    print(i)
```

###### tuples
* tuples are sequences

```python
for i in ("dog", 42, ()):
    print(i)
```

## while
* [parrot example](../examples/io/parrot.py)

# Useful links
* [while loop](https://wiki.python.org/moin/WhileLoop)
