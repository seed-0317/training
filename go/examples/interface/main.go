package main

import "fmt"

type Greeter interface {
	Hi() string
}

type Dog struct {
	Name string
}

func (d Dog) Hi() string {
	return "Woof, my name is " + d.Name
}

func printGreeting(g Greeter) {
	fmt.Println(g.Hi())
}

func main() {

	d := Dog{"scout"}
	printGreeting(d)

}
