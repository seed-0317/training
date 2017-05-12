# GitHub Pull Request Builder
* [Install Plugin](#install-plugin)
* [Create Access Token](#create-access-token)
* [Configure Jenkins](#configure-jenkins)
* [Create Job](#create-job)
* [Useful Links](#useful-links)


### Install Plugin

**GitHub Pull Request Builder**

<img alt="plugin" src="images/1.png" width="700px"/>

### Create Access Token
Create an access token under a dedicated user *(so your account doesn't blow up with notifications)*.

Login to GitHub *(with user dedicated for automation)* and click *Settings*

Click **Personal Access Tokens**

<img alt="settings" src="images/2.png" width="200px"/>

Click **Generate Token**

<img alt="generate token" src="images/3.png" width="700px"/>

Set token description and scopes

<img alt="scopes" src="images/4.png"
width="700px"/>

Click **Generate Token**.  Be sure to copy this token.

### Configure Jenkins

Click on **Manage Jenkins** then **Configure System**

Scroll down to **GitHub Pull Request Builder**

Add a new *Credential*

<img alt="add credential" src="images/5.png"
width="700px"/>

Paste your token in the *Secret* section.

<img alt="create credential" src="images/6.png"
width="700px"/>

Test that your access token has the correct scopes

<img alt="test token" src="images/7.png"
width="700px"/>

Click **Save**

### Create Job

Click **New Item**

<img alt="new item" src="images/8.png"
width="200px"/>

Select *Maven project*

<img alt="maven project" src="images/9.png"
width="700px"/>

Fill out **GitHub project**

url: `https://github.com/revature-training/boot-app/`

<img alt="github project" src="images/10.png"
width="700px"/>

Fill out **Source Code Management**

* url: `https://github.com/revature-training/boot-app.git`
* name: `origin`
* refspec: `+refs/pull/*:refs/remotes/origin/pr/*`
* Branch Specifier: `${sha1}`

<img alt="source code management" src="images/11.png"
width="700px"/>

Fill out **Build Triggers**
* Select *GitHub Pull Request Builder*

<img alt="build triggers" src="images/12.png"
width="700px"/>

In the **Advanced** section of *Build Trigger*, select the following:

<img alt="advanced" src="images/13.png"
width="700px"/>

Fill out **Build**

<img alt="build" src="images/14.png"
width="700px"/>

Click **Save**

Create a branch, push, create a PR.

You now have your very own CI pipeline!

###### Note

A GitHub webhook will be created for you on the repo.
* Click on repo *Settings*
* Click *Webhooks*

You may want to add the following events:

<img alt="events" src="images/15.png"
width="700px"/>

###### Note

If you have a protected branch *(like `master`)*, you can require status checks to pass before allowing PRs to merge.

<img alt="status checks" src="images/16.png"
width="700px"/>

### Useful Links
* [plugin docs](https://wiki.jenkins-ci.org/display/JENKINS/GitHub+pull+request+builder+plugin)
* [Blog - Building GitHub Pull Requests with Jenkins](https://www.theguild.nl/building-github-pull-requests-with-jenkins/)
