# [errors](https://tour.golang.org/methods/19)
* Go has its own idiomatic way of handling errors
* [blog](https://blog.golang.org/error-handling-and-go)

> Errors are values

```go
type error interface {
    Error() string
}
```

## example: create error

```go
func main() {
  err := errors.New("failure to be productive: playing with dog")
	if err != nil {
		log.Print(err)
	}
}
```

## example: handle error

```go
func main() {
	i, err := strconv.Atoi("42a")
	if err != nil {
		fmt.Printf("couldn't convert number: %v\n", err)
		return
	}
	fmt.Println("Converted integer:", i)
}
```

## note
* Go has something like try/catch: `panic` and `recover` *(which also requires `defer`)*
