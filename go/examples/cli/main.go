package main

import (
	"flag"
	"fmt"
)

func main() {

	namePtr := flag.String("name", "", "your name")
	flag.Parse()

	args := flag.Args()

	fmt.Println(*namePtr, args)

}
