# flow control
* `for`
* `if` `else if` `else`
* `switch`
* `defer`


## `for`

Typical for loop

```go
for i := 0; i < 10; i++ {
    fmt.Println(i)
}
```

Full program

```go
package main

import (
	"fmt"
)

func main() {

  for i := 0; i < 10; i++ {
    fmt.Println(i)
  }

}
```

No while loop.  Use `for`

```go
sum := 1
for sum < 1000 {
	sum += sum
}
fmt.Println(sum)
```

Infinite loop

```go
for {

}
```

## `if`

```go
if false {
    fmt.Println("cat")
} else {
    fmt.Println("dog")
}
```

## `switch`
A case body breaks automatically, unless it ends with a `fallthrough` statement.

```go
animal := "squirrel"

switch animal {
	case "dog":
		fmt.Println("dog")
	case "squirrel":
		fmt.Println("squirrel")
	default:
		fmt.Println("?")
}
```

```go
animal := "squirrel"

switch animal {
	case "dog":
		fmt.Println("dog")
	case "squirrel":
		fmt.Println("squirrel")
		fallthrough
	default:
		fmt.Println("?")
}
```

## `defer`
defer the execution of a function until the surrounding function returns.

```go
func main() {
	defer fmt.Println("world")

	fmt.Println("hello")
}
```
