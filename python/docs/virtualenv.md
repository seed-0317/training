# [Virtual Environments](http://docs.python-guide.org/en/latest/dev/virtualenvs/)
Manage dependencies for each project

###### Install

```sh
pip3 install virtualenv
```

```sh
pip install virtualenvwrapper
```

```sh
brew install autoenv
```

Add these lines to your `~/.bash_profile`

```
# python
export WORKON_HOME=$HOME/.virtualenvs
export PROJECT_HOME=$HOME/code
export VIRTUALENVWRAPPER_PYTHON=/usr/local/bin/python3
export VIRTUALENVWRAPPER_VIRTUALENV=/usr/local/bin/virtualenv
export VIRTUALENVWRAPPER_VIRTUALENV_ARGS='--no-site-packages'
source /usr/local/bin/virtualenvwrapper.sh

source $(brew --prefix autoenv)/activate.sh
```

## `virtualenv`

Create a directory for your *project*
```sh
mkdir test
cd test
```

Create a virtual environment called `dog`

```sh
virtualenv dog
```

Look in the `dog` directory

```sh
tree dog -L 2
```

Binaries are installed in the `dog` directory.

First, check `which` python you are using

```sh
which python
```

Let's activate our virtual environment so we can use those binaries.

```sh
. dog/bin/activate
```

`which` python are you using now?

```sh
which python
```

`deactivate` virtual environment

```sh
deactivate
```

This makes managing different Python environments easier.
Well, easier than deleting and reinstalling binaries.
The problem is you'll have these virtual environment laying around everywhere.

## `virtualenvwrapper`
Puts all virtual environments in one place *(denoted by your `WORKON_HOME` environment variable)*.

Create a virtual environment

```sh
mkvirtualenv fox
```

List virtual environments

```sh
lsvirtualenv
```

`workon` a virtual environment

```sh
workon fox
```

Deactivate

```sh
deactivate
```

## `autoenv`

Put a `.env` file in your project. When you `cd` into your project,
`autoenv` will execute the commands in that file.

In your `test` directory, create a `.env` file

```sh
echo "echo 'allo world!'" > .env
```

`cd` out and back into your `test` directory

```sh
cd ..
cd test
```

Now replace the contents of `.env` with:

```sh
workon fox
```

Now your virtual environments will change depending on what directory you `cd` into.

### Useful links
* [A non-magical introduction to Pip and Virtualenv for Python beginners](https://www.dabapps.com/blog/introduction-to-pip-and-virtualenv-python/)
* [Install virtualenvwrapper](https://virtualenvwrapper.readthedocs.io/en/latest/install.html)
* [autoenv](https://github.com/kennethreitz/autoenv)
