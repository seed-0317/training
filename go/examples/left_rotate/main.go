package main

import "fmt"

func LeftRotate(slice []int, d int) []int {
	d %= len(slice)
	rotatedSlice := append(slice[d:], slice[:d]...)
	return rotatedSlice

	/*
	   d %= len(slice)

	   for j := 0; j < d; j++ {
	       temp := slice[0]

	       for i := 1; i < len(slice); i++ {
	           slice[i-1] = slice[i]
	       }

	       slice[len(slice) - 1] = temp
	   }

	   return slice
	*/

}

func main() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT

	var n, d int
	fmt.Scanf("%d", &n)
	fmt.Scanf("%d", &d)

	slice := make([]int, n)

	for i := 0; i < len(slice); i++ {
		fmt.Scanf("%d", &slice[i])
	}

	rotatedSlice := LeftRotate(slice, d)

	for _, value := range rotatedSlice {
		fmt.Print(value, " ")
	}
}
