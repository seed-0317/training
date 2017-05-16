# Data Types
* Numbers
* Strings
* None
* Boolean


## Numbers
* All numbers are **immutable objects**
* Types
  * Integer
  * Floating-point
  * Complex

###### Integer
* No distinction between kinds of integers *(32 bit, 64 bit, etc.)*
* `1`, `100`

| prefix |     base    |
|:------:|:-----------:|
|   0b   |    Binary   |
|    0   |    Octal    |
|   0x   | Hexadecimal |


###### Floating-point
* `0.0`, `1.5`

###### Complex
* In Python, `j` is the square root of `-1`
  * Outside of Python, this value is also referred to as `i`
* `1j`, `1.5j`


## Strings
* can hold 0 or many characters
* can use single or double quotes *(no difference)*

```python
string1 = 'abc'
string2 = "abc"
string3 = 'a'
string4 = "a"
```

* `len()` returns length of a string

```python
len("abc")
```


## None
* `None`
* Denotes a null object
* Function's default return value


## Boolean
* `True`
* `False`
* truthy and falsy values

###### Falsey values
* `None`
* `False`
* zero of any **numeric type**, for example, `0`, `0.0`, `0j`
* any empty **sequence**, for example, `''`, `()`, `[]`
* any empty **mapping**, for example, `{}`
* instances of user-defined classes, if the class defines a `__bool__()` or `__len__()` method, when that method returns the integer zero or bool value `False`
