package main

import (
	"errors"
	"fmt"
	"log"
	"strconv"
)

func one() {
	err := errors.New("failure to be productive: playing with dog")
	if err != nil {
		log.Print(err)
	}
}

func two() {
	i, err := strconv.Atoi("42a")
	if err != nil {
		fmt.Printf("couldn't convert number: %v\n", err)
		return
	}
	fmt.Println("Converted integer:", i)
}

func main() {
	one()
	two()
}
