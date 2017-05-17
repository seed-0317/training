import boto3

s3 = boto3.resource('s3')
bucket = s3.Bucket('revature-taylor-test')

with open('s3/sample-file.txt', 'rb') as data:
    bucket.Object('sample-file.txt').put(Body=data)
