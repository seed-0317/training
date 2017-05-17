# S3 Examples

### list buckets
List all S3 buckets

```sh
python s3/list_buckets.py
```

AWS CLI equivalent

```sh
aws s3 ls
```

### list objects
List all objects in a S3 bucket

```sh
python s3/list_objects.py
```

AWS CLI equivalent

```sh
aws s3api list-objects --bucket revature-taylor-test
```

### get object
Read object body

```sh
python s3/get_object.py
```

AWS CLI equivalent

```sh
aws s3api get-object --bucket revature-taylor-test --key sample-file.txt sample-file.txt
```

### put object
Put object into S3 bucket
* hard code object data

```sh
python s3/put_object.py
```

### put object from file
Put object into S3 bucket
* read file from host filesystem

```sh
python s3/put_object.py
```

AWS CLI equivalent

```sh
aws s3api put-object --bucket revature-taylor-test --key sample-file.txt --body s3/sample-file.txt
```
