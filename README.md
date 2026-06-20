# Event Registration System

## 📌 Project Overview

The Event Registration System is a backend application developed using **Spring Boot**, **Spring Data JPA**, and **MySQL**. The system enables users to create, update, view, and delete events while allowing participants to register for events and manage registrations through RESTful APIs.

This project was developed as part of the **CodeAlpha Backend Development Internship**.

---

## 🚀 Features

### Event Management

* Create New Events
* View All Events
* View Event Details by ID
* Update Existing Events
* Delete Events

### Registration Management

* Register Users for Events
* View All Registrations
* Cancel Registrations

### Database Management

* MySQL Integration
* Automatic Table Creation using JPA
* Event and Registration Relationship Mapping

---

## 🛠 Technologies Used

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Postman
* REST API

---

## 📂 Project Structure

```text
src
 └── main
      ├── java
      │     └── com.codealpha.eventregistration
      │            ├── controller
      │            ├── model
      │            ├── repository
      │            ├── service
      │            └── EventregistrationApplication.java
      │
      └── resources
             └── application.properties
```

---

## 🗄 Database Configuration

Database Name:

```sql
eventdb
```

Configure the database in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/eventdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📡 REST API Endpoints

### Event APIs

| Method | Endpoint     | Description     |
| ------ | ------------ | --------------- |
| POST   | /events      | Create Event    |
| GET    | /events      | Get All Events  |
| GET    | /events/{id} | Get Event By ID |
| PUT    | /events/{id} | Update Event    |
| DELETE | /events/{id} | Delete Event    |

---

### Registration APIs

| Method | Endpoint            | Description            |
| ------ | ------------------- | ---------------------- |
| POST   | /registrations      | Register User          |
| GET    | /registrations      | View All Registrations |
| DELETE | /registrations/{id} | Cancel Registration    |

---

## 📮 Sample API Requests

### Create Event

```json
{
  "eventName": "Tech Fest 2026",
  "eventDate": "2026-08-01",
  "venue": "Medicaps Auditorium",
  "description": "Annual Technical Festival"
}
```

### Register User

```json
{
  "userName": "Brettlee Soni",
  "email": "brettlee@gmail.com",
  "event": {
    "id": 1
  }
}
```

---

## 📷 Screenshots

### 1. Project Structure
Shows the complete Spring Boot project structure including controllers, services, repositories, models, and configuration files.

![Project Structure](ss/Screenshot%202026-06-20%20184621.png)

---

### 2. Create Event API (POST)
Successfully created a new event using Postman.

![Create Event](ss/Screenshot%202026-06-20%20184845.png)

---

### 3. View All Events API (GET)
Retrieved all available events from the MySQL database.

![View Events](ss/Screenshot%202026-06-20%20185104.png)

---

### 4. Update Event API (PUT)
Updated event details including description and event information.

![Update Event](ss/Screenshot%202026-06-20%20185145.png)

---

### 5. Database Records
Event and registration data stored successfully in MySQL database.

![Database Output](ss/Screenshot%202026-06-20%20185258.png)

---

### 6. View Registrations API (GET)
Retrieved all participant registrations with event details.

![View Registrations](ss/Screenshot%202026-06-20%20185439.png)

---

### 7. Register Participant API (POST)
Successfully registered a participant for an event.

![Register Participant](ss/Screenshot%202026-06-20%20185515.png)


## ▶️ How to Run

1. Clone the repository
2. Open the project in NetBeans or IntelliJ IDEA
3. Create a MySQL database named `eventdb`
4. Configure database credentials in `application.properties`
5. Run the Spring Boot application
6. Test APIs using Postman

---

## 🎯 Internship Task

**CodeAlpha Backend Development Internship**

Task Completed:

* Event Registration System

---

## 👨‍💻 Author

**Brettlee Soni**

B.Tech Computer Science Engineering
Medi-Caps University

GitHub: https://github.com/Brettlee-soni
