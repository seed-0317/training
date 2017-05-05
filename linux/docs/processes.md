# processes

### commands
* `top`
* `ps`
* `kill`
* `jobs`
* `fg`
* `ctrl + z`

### concepts
* **control** - we have a lot of control over our running programs

# Walkthrough

### What's running

View processes taking most CPU
```sh
top -u
```

Processes you own
```sh
ps
```

All processes
```sh
ps aux
```

Run `sleep` command in the background
```sh
sleep 100 &
```

Use `grep` to search for process
```sh
ps aux | grep sleep
```

`kill` the process
```sh
kill <pid>
```
