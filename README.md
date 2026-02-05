# Item Management Service

A simple **Spring Boot** backend application that implements a **RESTful API** for managing a collection of items using **in-memory storage**.

---

## Table of Contents

- [Project Setup](#project-setup)  
- [Running the Application](#running-the-application)  
- [API Endpoints](#api-endpoints)  
- [Validation](#validation)  
- [Sample Requests & Responses](#sample-requests--responses)  
- [Deployment](#deployment)

---

## Project Setup

**Project Name:** `item-management-service`  
**Base Package:** `com.sagar.itemmanagement`  
**Java Version:** 17  
**Dependencies:** 
- Spring Web  
- Validation 
- Devtool 

**Packages:**
- `model` → `Item.java`  
- `controller` → `ItemController.java`  
- `store` → `ItemStore.java`

---

## Running the Application

1. Ensure **Java 17** is installed.  
2. Clone or extract the project folder.  
3. Open in **STS / IntelliJ IDEA**.  
4. Run the main class:
```bash
ItemManagementServiceApplication.java

### Run Using Docker (Recommended)

Build the Docker image:
docker build -t item-management-service .

Run the container:
docker run -p 8080:8080 item-management-service



Application will start on http://localhost:8080

***Sample Requests & Responses***
POST:-  http://localhost:8080/items

Request:

{
  "name": "iPhone 14",
  "description": "Apple smartphone"
}


Response (201 Created):

{
  "name": "iPhone 14",
  "description": "Apple smartphone",
  "id": 1
}

GET:- http://localhost:8080/items/1

Response (200 OK):

{
  "name": "iPhone 14",
  "description": "Apple smartphone",
  "id": 1
}


GET:- http://localhost:8080/items/999 (non-existing)

Response (404 Not Found):

(empty body)


POST /items with blank name

Request:

{
  "name": "",
  "description": "Test"
}


Response (400 Bad Request):

{
  "timestamp": "...",
  "status": 400,
  "error": "Bad Request",
  "message": "Validation failed for object='item'. Error count: 1",
  "path": "/items"
}


## Deployment

The application is containerized using Docker and deployed as a Web Service on Render.

- Source Code: GitHub repository
- Build Type: Docker
- Platform: Render
- Runtime Port: 8080

After deployment, the API can be accessed using the public Render URL.

