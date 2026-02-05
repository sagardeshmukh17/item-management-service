Item Management Service

A simple Spring Boot backend application that implements a RESTful REST API for managing a collection of items using in-memory storage (ArrayList).

This project demonstrates basic backend concepts such as REST APIs, input validation, in-memory data handling, and cloud deployment using Docker.

Tech Stack

Java 17
Spring Boot
Spring Web
Spring Validation
Docker
Render (Cloud Hosting)

Project Structure
src/main/java/com/sagar/itemmanagement
│
├── controller
│   └── ItemController.java
│
├── model
│   └── Item.java
│
├── store
│   └── ItemStore.java
│
└── ItemManagementServiceApplication.java

Features

Add a new item
Get item by ID

In-memory data storage (ArrayList)

Input validation

RESTful API design

Dockerized & deployed on Render

Running the Application Locally
Prerequisites:-

Java 17 installed
Maven installed (or use IDE)

Steps:-

Clone the repository:
git clone https://github.com/sagardeshmukh17/item-management-service.git
Open the project in IntelliJ IDEA / STS
Run the main class:
ItemManagementServiceApplication.java


Application will start on: http://localhost:8080

Running Using Docker (Local)
Build Docker image:
docker build -t item-management-service .

Run container:
docker run -p 8080:8080 item-management-service


Application will be available at: http://localhost:8080

API Endpoints (Local):-
Add New Item
POST: http://localhost:8080/items

Request Body

{
  "name": "iPhone 16",
  "description": "Apple smartphone"
}


Response (201 Created)

{
  "id": 1,
  "name": "iPhone 16",
  "description": "Apple smartphone"
}

Get Item by ID
GET: http://localhost:8080/items/1

Non-Existing Item
GET: http://localhost:8080/items/999
Response: 404 Not Found

Input Validation
name field is mandatory
Blank or missing name results in 400 Bad Request

Example:

{
  "name": "",
  "description": "Test"
}

Live Deployment (Render)
The application is deployed as a Dockerized Web Service on Render.

Live Base URL:- https://item-management-service.onrender.com

Live API Endpoints
Add New Item

POST:- https://item-management-service.onrender.com/items

Get Item by ID
GET:- https://item-management-service.onrender.com/items/1

Important Note
This application is hosted on Render Free Tier.
The first request may take 30–50 seconds due to cold start.

Implementation Notes:-
Uses ArrayList as in-memory data store
No database used (as per requirement)
IDs are auto-generated in memory
Data resets when application restarts

Author
Sagar Deshmukh
Java Backend Developer