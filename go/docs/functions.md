# [functions](https://tour.golang.org/basics/4)

```go
func sayHi() {
  fmt.Println("Hi")
}
```

```go
func add(x int, y int) int {
	return x + y
}
```

```go
func add(x, y int) int {
	return x + y
}
```

### [multiple results](https://tour.golang.org/basics/6)

```go
func towel() (string, int) {
	return "Hitchhiker's Guide to the Galaxy", 42
}
```
