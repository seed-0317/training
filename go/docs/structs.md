# [structs](https://tour.golang.org/moretypes/2)
* A `struct` is a collection of fields.

```go
type Person struct {
	Name string
	age int
}

func main() {
	john := Person{"john", 28}
	fmt.Println(john)
}
```

## [methods](https://tour.golang.org/methods/1)

```go
type Person struct {
	Name string
	age int
}

func (p Person) SayHi() string {
	return "Hi, I'm " + p.Name
}

func main() {
	john := Person{"john", 28}
	fmt.Println(john.SayHi())
}
```
