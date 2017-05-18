# getting started

### Install

```sh
brew install go
```

### Environment variables

Put the following in your `~/.bash_profile`

```sh
# go
export GOPATH=$HOME/code/go
export GOROOT=/usr/local/opt/go/libexec
export PATH=$PATH:$GOPATH/bin
export PATH=$PATH:$GOROOT/bin
```

### [go-plus](https://atom.io/packages/go-plus)
* Install the go-plus Atom plugin


### Hello World

Make a project directory in your `GOPATH`

```sh
mkdir -p $GOPATH/src/hello-world
cd $GOPATH/src/hello-world
```

Create your first go file

```sh
vim main.go
```

Contents of `hello.go`

```go
package main

import (
	"fmt"
)

func main() {
	fmt.Println("allo world!")
}
```

###### Run

```sh
go run hello.go
```

###### Build

Build binary in *this* directory

```sh
go build
```

Run your built binary

```sh
./hello-world
```

###### Install
Puts binary in `$GOPATH/bin` which is in your `$PATH`  
This means you can run `hello-world` from anywhere on your host

```sh
go install
```

From anywhere on your host

```sh
hello-world
```

###### Note
* the entry point to a Go program is the `main` function in the `main` package
