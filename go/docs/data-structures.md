# data structures
* array
* slice
* map

## [array](https://tour.golang.org/moretypes/6)
* `[n]T` is an **array** of `n` values of type `T`
* fixed length


initialize array

```go
var a [10]int
```

write array values

```go
a[0] = 7
a[1] = 42
```

read array values

```go
fmt.Println(a)
fmt.Println(a[1])
```

## [slice](https://tour.golang.org/moretypes/7)
* `[]T` is a **slice** with elements of type `T`
* more convenient way to leverage arrays
* dynamically sized
* slices are like references to arrays
* slices are used more often than arrays

create *array* in one line

```go
animals := [4]string{"dog", "cat", "fox", "squirrel"}

```

create *slice* in one line

```go
animals := []string{"dog", "cat", "fox", "squirrel"}
```

create *slice* from existing *array*

```go
animals := [4]string{"dog", "cat", "fox", "squirrel"}
s := animals[:2]

fmt.Println(animals)
fmt.Println(s)
```

#### slice length
* size of slice

```go
fmt.Println("len:", len(s))
```

#### slice capacity
* size of underlying array

```go
fmt.Println("cap:", cap(s))
```

**Question:** what if we change the slice declaration to:

```go
s := animals[1:2]
```

#### `make`
* how we typically create slices
* `make([]type, len, cap)`

```go
s := make([]int, 5)
```

```go
s := make([]int, 5, 10)
```

#### `append`
* append new element to *slice*
* built-in function

```go
var s []string

s = append(s, "dog")

s = append(s, "cat", "fox", "squirrel")
```

## [maps](https://tour.golang.org/moretypes/19)
* key value pairs

Declare a map

```go
var m map[string]int
```

#### `make`

Must call `make` to add keys

```go
var m map[string]int
m = make(map[string]int)
```

Shorter version

```go
m := make(map[string]int)
```

Add key value pair

```go
m["dog"] = 7
```

Read value

```go
value, ok := m["dog"]
fmt.Println(value, ok)
```

What's the output?

```go
value, ok := m["cat"]
fmt.Println(value, ok)
```
