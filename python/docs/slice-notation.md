# Slice Notation
* returns copy of a sequence

```python
a[start:end] # items start through end-1
a[start:]    # items start through the rest of the array
a[:end]      # items from the beginning through end-1
a[:]         # a copy of the whole array
a[start:end:step] # start through not past end, by step
```

```
+---+---+---+---+---+
| H | e | l | p | A |
+---+---+---+---+---+
0   1   2   3   4   5
-5  -4  -3  -2  -1
```

### Examples

###### strings

```python
"hello world"[:]
```

```python
"hello world"[:5]
```

```python
"hello world"[6:]
```

###### lists

```python
["dog", 42, "cat", "fox",][1:2]
```

```python
["dog", 42, "cat", "fox",][1::2]
```

### Useful links
* [stackoverflow](http://stackoverflow.com/questions/509211/explain-pythons-slice-notation)
