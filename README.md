# Spring Boot Actor Management

## Overview

This project is a RESTful API developed using Spring Boot
to manage actor information.

## Technologies Used

- Java 21
- Spring Boot
- Maven
- REST API
- Postman

## Features

- Get all actors
- Get an actor by ID
- Add a new actor
- Update actor information
- Delete an actor

## API Endpoints

Base URL: `/api/v1/actor`

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/v1/actor` | Get all actors |
| GET | `/api/v1/actor/{id}` | Get actor by ID |
| POST | `/api/v1/actor` | Add an actor |
| PUT | `/api/v1/actor/{id}` | Update an actor |
| DELETE | `/api/v1/actor/{id}` | Delete an actor |

## Data Storage

Actor information is stored using an ArrayList.
No database is required for this implementation.

## Running the Application

Run the application using IntelliJ IDEA or Maven.

```bash
./mvnw spring-boot:run
