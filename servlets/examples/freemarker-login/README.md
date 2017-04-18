# FreeMarker Login example


### HTTPie

GET `/login`
```
http -v GET localhost:8080/login
```

POST `/login`
```
http -v POST localhost:8080/login
```

POST `/login` with form data
```
http -v --form POST localhost:8080/login dog='john'
```

GET `/home` with cookie *(use cookie from last request)*
```
http -v GET localhost:8080/home 'Cookie:JSESSIONID=C6468E162F4B7F3365A1336674DBD65E'
```



