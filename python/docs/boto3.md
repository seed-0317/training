# [Boto 3](http://aws.amazon.com/sdk-for-python/)
* AWS SDK for Python

### Install
* **Note:** Should install in a virtual environment.

```sh
pip3 install boto3
```


### [Resources](https://boto3.readthedocs.io/en/latest/guide/resources.html)
**Resources** represent an object-oriented interface to AWS.

```python
import boto3

resource = boto3.resource('s3')
```


### [Clients](https://boto3.readthedocs.io/en/latest/guide/clients.html)
**Clients** provide a low-level interface to AWS whose methods map close to 1:1 with service APIs.

```python
import boto3

client = boto3.client('s3')
```


### Useful Links
* [Boto3 Docs](https://boto3.readthedocs.io/en/latest/index.html)
* [AWS Docs](http://aws.amazon.com/sdk-for-python/)
* [Boto 3 GitHub](https://github.com/boto/boto3)
* [Introduction to Version 3 of the AWS SDK for Python (Boto)](https://www.youtube.com/watch?v=Cb2czfCV4Dg)
