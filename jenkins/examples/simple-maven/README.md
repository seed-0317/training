# Jenkins
Simple Maven job

## EC2 Instance
* Spin up an **Ubuntu** instance
* When it launches, `ssh` in and run the following commands:

```sh
sudo apt-get -y update
sudo apt-get install -y openjdk-8-jdk
sudo apt-get install -y maven
sudo apt-get install -y git-all
sudo wget -q -O - http://pkg.jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add -
sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt-get -y update
sudo apt-get install -y jenkins
```

###### Acccess Jenkins
Find the ip address for your EC2 instance.  Jenkins will be running on port `8080`


## Global Tool Configuration

###### Find Java home

```sh
find / -name java > output.txt
```

```sh
vim output.txt
```

Should look like this: `/usr/lib/jvm/java-8-openjdk-amd64/`

###### Find Maven home

```sh
find / -name maven > output.txt
```

```sh
vim output.txt
```

Should look like this: `/usr/share/maven`


## Create Job
* Click **New Item**
* Select **Maven Project** and name it *demo app*
* Under **Source Code Management**
  * Select *Git*
  * **Repository URL:** `https://github.com/revature-training/boot-app.git`
* Under **Build**
  * **Root POM:** `app/pom.xml`
  * **Goals and options:** `clean test`

The repo contains a simple spring boot app with 2 tests.

Try running the job.
