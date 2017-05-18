# [range](https://tour.golang.org/moretypes/16)
* built-in function
* iterate over **slice** or **map**

### slice example

```go
animals := []string{"dog", "cat", "fox", "squirrel"}

for index, value := range animals {
  fmt.Println(index, value)
}
```

### map example

```go
animals := map[string]int{"dog": 1, "cat": 7, "fox": 3, "squirrel": 42}

for key, value := range animals {
  fmt.Println(key, value)
}
```
