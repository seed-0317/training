# Go tools
* `gofmt`
* `godoc`


## `gofmt`
* Code formatting
* [docs](https://golang.org/cmd/gofmt/)

List files that differ from `gofmt`

```sh
gofmt -l .
```

Show what file should look like

```sh
gofmt main.go
```

These commands can be applied to directories as well

```sh
gofmt .
```

Rewrite source files with `gofmt`'s formatting

```sh
gofmt -w .
```

## `godoc`
* Documentation
* [docs](https://godoc.org/golang.org/x/tools/cmd/godoc)
