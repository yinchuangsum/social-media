#Simple Social Media App

## Starting the application
### building the application
```
cd social-media
mvn clean install
```
### run the application
```
cd target
java -jar demo-0.0.1-SNAPSHOT.jar
```

## API
### Get friends
```
API: GET /mysocialnetwork/user/:id/friends
Sample response:
[
    {
        "id": 1
    },
    {
        "id": 3
    },
    {
        "id": 4
    }
]
```

### Get movie watched
```
API: GET /mysocialnetwork/user/:id/movies
Sample response:
[
    {
        "name": "3"
    },
    {
        "name": "4"
    },
    {
        "name": "5"
    }
]
```
