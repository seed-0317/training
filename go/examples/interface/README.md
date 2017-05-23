# interfaces

## Explanation

### `Greeter` interface

```go
type Greeter interface {
	Hi() string
}
```

### `Dog` struct
* implicitly implements `Greeter`

```go
type Dog struct {
	Name string
}

func (d Dog) Hi() string {
	return "Woof, my name is " + d.Name
}
```

### `printGreeting` function
* Notice it takes in type `Greeter`

```go
func printGreeting(g Greeter) {
	fmt.Println(g.Hi())
}
```

### `main` function

```go
func main() {

	d := Dog{"scout"}
	printGreeting(d)

}
```

## Usage

```sh
# build go application
$ go build

# run binary
$ ./interface
```
