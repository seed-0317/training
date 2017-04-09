# PostgreSQL

###### 1. Install PostgreSQL

```
brew install postgresql
```

###### 2. Ensure PostgreSQL was installed correctly
```
psql --version
```

**Note:** `brew info` is useful
```
brew info postgresql
```

###### 3. Start PostgreSQL database server
```
brew services start postgresql
```

###### 4. Ensure PostgreSQL is running
```
brew services list
```

<br/>

# pgAdmin

###### 1. Install pgAdmin4
This is a GUI client for PostgreSQL *(a little easier to use than command line)*

```
brew cask install pgadmin4
```

###### 2. Open pgAdmin4
* `Command Space`
* Type in pgAdmin
* `Enter`

<br/>

# Useful Links
* [PostgreSQL Command Line Cheat Sheet](http://blog.jasonmeridth.com/posts/postgresql-command-line-cheat-sheet/)
