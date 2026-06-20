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

### Project Structure

![Project Structure](ss/project-structure.png)

### Add Event API

![Add Event](ss/add-event.png)

### View Events API

![View Events](ss/view-events.png)

### Update Event API

![Update Event](ss/update-event.png)

### Register User API

![Register User](ss/register-user.png)

### View Registrations API

![View Registrations](ss/view-registrations.png)

### Database Tables

![Database](ss/database.png)

### Application Running

![Application Running](ss/application-running.png)

---

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
