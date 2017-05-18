# [code organization](https://golang.org/doc/code.html#Organization)

```sh
tree $GOPATH -L 1
```

```
/Users/tjkemper/code/go
├── bin
├── pkg
└── src
```

## `src`
`src` is where we put our Go source code

Typically we put our `git` repos in `$GOPATH/src/github.com/user/repo/`

This lets `go get` work properly

## `bin`
`bin` is where `go install` puts your binaries

If you put `$GOPATH/bin` in your `$PATH` then you can run your Go binaries from anywhere on your computer

## `pkg`
`pkg` is where Go will put your packages
