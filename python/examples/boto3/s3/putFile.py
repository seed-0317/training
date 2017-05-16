import boto3

# note: change bucket name
bucket_name = 'revature-taylor-test'

open("test.txt", "w").write("hello from boto3!")

s3 = boto3.resource('s3')

with open("test.txt", "rb") as file:
    s3.Bucket(bucket_name).put_object(Key='dog', Body=file)
