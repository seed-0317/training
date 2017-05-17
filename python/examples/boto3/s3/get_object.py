import boto3


s3 = boto3.resource('s3')
obj = s3.Object('revature-taylor-test', 'dog.txt')

# read attributes
print(obj.content_type)
print(obj.last_modified)

# read object body
body = obj.get()['Body'].read()
print(body)
