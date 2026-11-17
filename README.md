# Lab 7 – Spring Boot Actor Management with MySQL

## Overview

This project is a RESTful API developed using Spring Boot to perform CRUD (Create, Read, Update, Delete) operations for managing actor information. It uses MySQL as the database for persistent data storage.

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST API
- Postman

## Project Structure

```text
actor-management/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/site/actor_management/
│   │   │       ├── controller/
│   │   │       │   └── ActorController.java
│   │   │       ├── model/
│   │   │       │   └── Actor.java
│   │   │       ├── Repo/
│   │   │       │   └── ActorRepo.java
│   │   │       ├── Service/
│   │   │       │   └── ActorService.java
│   │   │       └── ActorManagementApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── mvnw
```

## Features

- Retrieve all actors
- Retrieve an actor by ID
- Add a new actor
- Update existing actor information
- Delete an actor
- Store actor information in a MySQL database

## Architecture

The application follows a layered architecture:

- **Model:** Defines the Actor entity.
- **Repository:** Uses Spring Data JPA to communicate with the MySQL database.
- **Service:** Handles the application's business logic.
- **Controller:** Handles HTTP requests and returns responses.

## API Endpoints

Base URL: `/api/v1/actor`

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/api/v1/actor` | Retrieve all actors |
| GET | `/api/v1/actor/{id}` | Retrieve an actor by ID |
| POST | `/api/v1/actor` | Add a new actor |
| PUT | `/api/v1/actor/{id}` | Update an actor |
| DELETE | `/api/v1/actor/{id}` | Delete an actor |



## Testing

Postman can be used to test all CRUD operations by sending HTTP requests to the API endpoints.

