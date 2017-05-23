# composition

## has a
`Person` **has a** `Name`,which is a `string`.  This works similarly for any type.

```go
type Person struct {
	Name string
	age int
}
```

## embedded type
The outer type `Dog` has access to everything in the inner type `Animal`

```go
package main

import (
	"fmt"
)

type Animal struct {
	Name string
}

type Dog struct {
	Animal
	Breed string
}

func main() {
	fmt.Println("Hello, playground")
	d := Dog{Animal{"scout"}, "lab"}
	fmt.Println(d)
	fmt.Println(d.Breed)
	fmt.Println(d.Animal)
	fmt.Println(d.Name)


}
```

### useful links
* [Composition with Go](https://www.goinggo.net/2015/09/composition-with-go.html)
