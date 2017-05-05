# navigation

### commands
* `pwd` - print working directory
* `ls` - list files
* `cd` - change directory

### concepts
* **relative path** - a file location relative to where you currently are in the file system.
* **absolute path** - a file location relative to the root of the file system.
* `~` is a shortcut for your home directory.

# Walkthrough
*(Mac)* Open the **Terminal** application  
*(Windows)* Open the **Git Bash** application  

### Where are you

Run the `pwd` command.
```sh
pwd
```

The output of the `pwd` command may look like:
```sh
$ pwd
/Users/tjkemper
```

Your filesystem is a tree data structure and `pwd` shows your current location.

![file system tree](images/file-system-tree.gif)

### List things

`ls` lists the files and directories in a particular location.

List the contents of your current location.
```sh
$ ls
Applications   Documents      Library        Music          Public         code
Desktop        Downloads      Movies         Pictures       VirtualBox VMs
```

List the contents of your **Desktop** directory.
```sh
$ ls Desktop
spacex.rockets   tesla.png   solar.city
```

This command used a **relative path**, which is a path from your current location.

Let's try the same command but with an **absolute path**.
```sh
$ ls /Users/tjkemper/Desktop
spacex.rockets   tesla.png   solar.city
```

Let's try the same thing using `~` *(tilde)* which is a shortcut for your home directory.  My home directory happens to be `/Users/tjkemper`

```sh
$ ls ~/Desktop
spacex.rockets   tesla.png   solar.city
```

### Move around

`cd` allows us to change directories.

Change to your Desktop directory *(using either a relative or absolute path)*.
```sh
$ cd ~/Desktop
```

Where are we?
```sh
$ pwd
/Users/tjkemper/Desktop
```

Now if we run `ls` it should print the contents in the **Desktop** directory.
```sh
$ ls
spacex.rockets   tesla.png   solar.city
```
