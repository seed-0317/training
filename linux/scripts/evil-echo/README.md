# evil echo
Learn how to redirect STDIN

### Make `evil-echo.sh` executable
```sh
ls -l evil-echo.sh
```

```sh
chmod 744 evil-echo.sh
```

```sh
ls -l evil-echo.sh
```

### Run script normally
```sh
./evil-echo.sh
```

### Redirect STDIN
```sh
./evil-echo.sh < some-input.txt
```
