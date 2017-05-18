# data types
* `bool`
* `string`
* `int` `int8` `int16` `int32` `int64`
* `uint` `uint8` `uint16` `uint32` `uint64` `uintptr`
* `byte`
  * alias for uint8
* `rune`
  * alias for int32
  * represents a Unicode code point
* `float32` `float64`
* `complex64` `complex128`

### declare and initialize variables

```go
var x int
fmt.Println(x)
```

```go
var str string = "hello world"
fmt.Println(str)
```

### type inference

```go
x := 0
fmt.Println(x)
```

```go
str := "hello world"
fmt.Println(str)
```

### [type conversion](https://tour.golang.org/basics/13)
