# Dogs API 🐶

A Spring Boot REST API for managing dogs, backed by MySQL on Railway.

## Tech Stack
- Java 23
- Spring Boot 4.0
- Spring Data JPA
- MySQL (Railway)
- Lombok
- Thymeleaf

## Features
- Create a dog
- Get all dogs
- Get dog by ID
- Update a dog
- Delete a dog

## API Endpoints

| Method | Endpoint    | Description   |
|--------|-------------|---------------|
| GET    | /dogs       | Get all dogs  |
| GET    | /dogs/{id}  | Get dog by ID |
| POST   | /dogs       | Add a new dog |
| PUT    | /dogs/{id}  | Update a dog  |
| DELETE | /dogs/{id}  | Delete a dog  |

## Running Locally

### Prerequisites
- Java 23
- Maven

### Steps
1. Clone the repo
   git clone https://github.com/sayanroy1999/Dogs.git

2. Configure application.properties
   spring.datasource.url=jdbc:mysql://HOST:PORT/railway
   spring.datasource.username=root
   spring.datasource.password=YOUR_PASSWORD

3. Run the app
   ./mvnw spring-boot:run

4. Access at http://localhost:9090

## Deployment (Railway)

Both the Spring Boot app and MySQL database are hosted on Railway.

### Services on Railway
- **MySQL** → Database service
- **Dogs API** → Spring Boot application service

### Environment Variables set on Railway
- SPRING_DATASOURCE_URL
- SPRING_DATASOURCE_USERNAME
- SPRING_DATASOURCE_PASSWORD
- SERVER_PORT

### Live URL
https://dogs-production.up.railway.app
