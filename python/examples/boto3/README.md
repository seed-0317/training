# boto3 examples
* [listS3Buckets](listS3Buckets)


### Setup

###### Set up AWS configuration

First get create an IAM user with privileges.  Have the access keys ready.

Then run this command to set up your **aws cli** configuration.

```sh
aws configure
```

###### Create virtual environment

```sh
mkvirtualenv boto3-venv
```

###### Install dependencies

First `cd` into project

```sh
cd listS3Buckets/
```

Notice that `cd`-ing into this directory activated a virtual environment.  You are now using `python` from
the virtual environment.  You can test this by running the following.

```sh
which python
```

Install dependencies

```sh
pip install -r requirements.txt
```

### Run

There are many examples in this project.  Let's run one of them:

```sh
python s3/listBuckets.py
```

### Tear Down

###### Deactivate virtual environment

```sh
deactivate
```
