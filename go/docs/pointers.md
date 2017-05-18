# [pointers](https://tour.golang.org/moretypes/1)

### syntax
* **\*** declare pointer variable
* **\*** dereference pointer variable
* **&** get address of variable

### declare variables

Create string
```go
var str string
```

Create string pointer

```go
var strPtr *string
```

### pointer example

```go
var str string = "allo"
var strPtr *string = &str
fmt.Println(str, strPtr, *strPtr)
```

Same, with concise syntax

```go
str := "allo"
strPtr := &str
fmt.Println(str, strPtr, *strPtr)
```

### `nil`
`nil` is the **zero value** for pointers, interfaces, maps, slices, channels and function types, representing an uninitialized value.
