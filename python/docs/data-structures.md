# [Data Structures](https://docs.python.org/3/tutorial/datastructures.html)
* A way to hold many values
* **Sequences:** ordered and indexed container of items
  * String
  * List
  * Tuple


### Python Data Structures
* Lists
* Tuples
* Dictionaries
* Sets

### Lists
* `[]` is the list literal
* **Mutable** sequence of items
* Items are separated by commas

```python
x = [] # x is a list
```

* Lists can contain a mix of data types

```python
x = ["hello", 42, 2.718281828]
```

* append value to list

```python
x = ["dog"]
x.append("cat")
```

* insert value in list

```python
x = ["dog", "cat", "fox"]
x.insert(2, "squirrel")
```

* remove last value from list

```python
x = ["dog", "cat", "fox"]

temp = x.pop()

print(x)
print(temp)
```

* remove specific value from list

```python
x = ["dog", "cat", "fox"]

temp = x.pop(0)

print(x)
print(temp)
```

* `len()` returns length of list

```python
x = ["dog", "cat", "fox"]
print(len(x))
```


### Tuples
* `()` is the tuple literal
* similar to lists
* **immutable** - cannot be changed
* Memory efficient
* Tuples can contain arbitrary data types
  * Avoid putting *mutable* items in a tuple

```python
()
(42,)
(42, "Arthur Dent", "towel")
```

```python
x = ("dog", "cat", 42)
print(x)
```


### Dictionaries
* key/value pairs
* Can also be referred to as: *hashtable* or *map*
* Keys must be unique

```python
x = {"key" : "value", "color" : "blue", "animal" : "dog"}
print(x)
```

* keys can be any value

```python
x = {1 : "dog", "1" : "cat"}
print(x)
```

* Get/Set values in dictionary

```python
x = {}
x["john"] = 1234567890
print(x)
print(x["john"])
```

* What is the value of key `"john"`

```python
x = {}
x["john"] = 1234567890
x["john"] = 7777777777
print(x["john"])
```

* Delete key/value pair from dictionary

```python
x = {"john":"blue", "amy":"red"}
del x["john"]
```


### Sets
* Unique values
* Literal: `{}`
  * Same as dictionary but without key, value pairs
* set elements can be of any type
* Types
  * set *(mutable)*
  * frozenset *(immutable)*
