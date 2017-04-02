# Git
* Distributed Version Control System
  * History
  * Collaboration

### Terms
* **Repository** is the full history of file changes *(a bunch of commits)*
* **Commit** a single point in the repo history
* **Branch** is a pointer to a commit
* **Remote** is a repo that is not on your local machine

### Help

Show common git commands

```
git
```

Help with specific command

```
git help commit
```

# Walkthrough

### Create repo

Make a directory for all your repositories

```
mkdir -p ~/code/repos
```

Let's create our first git repo

```
cd ~/code/repos
mkdir test
cd test

git init
```

A git repository is a directory with a `.git/` directory in it

```
ls -a
```

### Basic workflow

* `git status` - show the working tree status
* `git add` - add file to index
* `git commit` - record changes to the repository

```
touch a.txt
touch b.txt
git status

git add a.txt
git add b.txt
git status

git commit -m "my first commit"
git status
```

### Types of files
* Changes to be committed
* Changes not staged for commit
* Untracked files

```
touch c.txt

echo "hello" >> a.txt
echo "world" >> b.txt

git add a.txt

git status
```

### Working with remotes
* Git is distributed, which means there are many independent copies of a repo
* `git push` - push local changes to remote
* `git pull` - pull remote changes into local repo
* `git remote` - list remotes


# Useful links

* [Git Glossary](https://git-scm.com/docs/gitglossary)
* [GitHub Glossary](https://help.github.com/articles/github-glossary/)


### Atlassian has good git tutorials.
* [Saving changes](https://www.atlassian.com/git/tutorials/saving-changes)
* [Inspecting a repository](https://www.atlassian.com/git/tutorials/inspecting-a-repository/git-status)
* [Viewing old commits](https://www.atlassian.com/git/tutorials/viewing-old-commits)
* [Undoing changes](https://www.atlassian.com/git/tutorials/undoing-changes/git-revert)
* [Syncing](https://www.atlassian.com/git/tutorials/syncing)
