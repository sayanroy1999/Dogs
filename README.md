# Dogs API 🐶

A Spring Boot web application for managing dogs, backed by MySQL on Railway.

## Tech Stack
- Java 21
- Spring Boot 4.0
- Spring Data JPA
- MySQL (Railway)
- Lombok
- Thymeleaf (UI)

## Features
- Create a dog
- Get all dogs
- Get dog by ID
- Update a dog
- Delete a dog

## Web Endpoints

| Method | Endpoint         | Description        |
|--------|------------------|--------------------|
| GET    | /                | Home - list all dogs |
| GET    | /add             | Show add dog form  |
| POST   | /save            | Save a new dog     |
| GET    | /edit/{id}       | Show edit form     |
| POST   | /update/{id}     | Update a dog       |
| GET    | /delete/{id}     | Delete a dog       |

## Running Locally

### Prerequisites
- Java 21
- Maven

### Steps
1. Clone the repo
   git clone https://github.com/sayanroy1999/Dogs.git

2. Configure application.properties with your DB credentials

3. Run the app
   ./mvnw spring-boot:run

4. Access at http://localhost:8080

## Reflection
Built this using Spring Boot and Thymeleaf for a clean
full-stack solution. Railway made deployment straightforward
with its built-in MySQL plugin.

## Deployment
Both Spring Boot app and MySQL are hosted on Railway.

### Live URL
https://dogs-production-8ada.up.railway.app