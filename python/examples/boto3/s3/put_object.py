import boto3

s3 = boto3.resource('s3')
s3.Object('revature-taylor-test', 'dog.txt').put(Body='hello from boto 3!')
