# Session
* a user using a site for a time period (until 30 minutes inactive)
* allows us to store data between requests

```
HttpSession httpSession = request.getSession();
```


# Cookies
* file on the client's computer
* `JSESSIONID` is a cookie that holds a user's unique session id
