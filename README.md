# Dogs Web API Project

A Spring Boot CRUD application for managing dog breeds and sub-breeds.

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL

## Features

- View all dogs
- Add a dog
- Edit dog details
- Delete dogs
- Persistent database storage
- Initial data loaded from JSON file

## Database

MySQL database name:

```sql
dogsdb
```

## Run the Project

1. Clone the repository
2. Configure MySQL in `application.properties`
3. Run the application

Application runs on:

```text
http://localhost:9090
```

## JSON Data Source

Initial dog data is loaded from:

```text
src/main/resources/data/dogs.json
```