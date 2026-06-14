# [Smart Contact Manager 2.0](https://github.com/shreysomu/smart-contact-manager2.0)

A full-stack Contact Management System built using Java, Spring Boot, Thymeleaf, MySQL, Spring Security, Hibernate, and Maven.

This project is being developed by following the Smart Contact Manager 2.0 series while focusing on understanding industry-level backend development concepts and best practices.

---

## Project Overview

Smart Contact Manager (SCM) is a web application that allows users to securely manage their personal and professional contacts.

Users will be able to:

* Register and Login
* Add Contacts
* View Contacts
* Update Contacts
* Delete Contacts
* Search Contacts
* Upload Profile Images
* Manage Personal Contact Information
* Secure Data Using Spring Security

---

## Current Progress

---

## 📈 Progress Tracker

### Completed

- [x] Episode 1 - Project Introduction
- [x] Episode 2 - Spring Boot Project Setup
- [x] Episode 3 - Database Setup
- [x] Episode 4 - TailwindCSS Setup

### Upcoming
- [ ] Episode 5 - Layout Creation
- [ ] Episode 6 - Home Page Design
- [ ] Episode 7 - User Entity
- [ ] Episode 8 - User Registration

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate

### Frontend

* Thymeleaf
* HTML5
* CSS3
* Bootstrap
* JavaScript

### Database

* MySQL

### Build Tool

* Maven

### Version Control

* Git
* GitHub

---

## 📂 Project Structure

```text
src/main/java
└── com.scm
    ├── controllers
    ├── services
    ├── repositories
    ├── entities
    ├── config
    ├── helpers
    └── Application.java

src/main/resources
├── templates
├── static
│   ├── css
│   ├── js
│   └── images
└── application.properties
```

---

## 🏗️ Architecture

```text
User
 ↓
Controller
 ↓
Service
 ↓
Repository
 ↓
Database
```

### Layer Responsibilities

| Layer      | Responsibility                    |
| ---------- | --------------------------------- |
| Controller | Handles HTTP Requests & Responses |
| Service    | Business Logic                    |
| Repository | Database Operations               |
| Entity     | Database Mapping                  |
| View       | User Interface                    |

---

### Completed Episodes

#### Episode 1

* Project Introduction
* Understanding Project Scope
* Tech Stack Overview

#### Episode 2

* Spring Boot Project Creation
* Maven Project Setup
* Dependency Management

#### Episode 3 

* Database Configuration
* application.properties Setup
* MySQL Connectivity
* Spring Boot Database Integration


#### Episode 4

* TailwindCSS Installation
* Frontend Build Setup
* Styling Configuration
* UI Development Environment Setup

---
## Dependencies Used

* Spring Web
* Spring Boot Starter Thymeleaf
* Spring Data JPA
* MySQL Driver
* Spring Boot DevTools
* Spring Security (Upcoming)
* Validation (Upcoming)

---

## Learning Outcomes So Far

### Spring Boot

* What is Spring Boot?
* Advantages of Spring Boot
* Auto Configuration
* Starter Dependencies

### Maven

* Maven Basics
* pom.xml
* Dependency Management
* Build Lifecycle

### Project Structure

* Layered Architecture
* Separation of Concerns
* Resource Management

### MVC Architecture

* Model
* View
* Controller
* Request Flow

---

## Interview Questions Covered

### Spring Boot

#### What is Spring Boot?

Spring Boot is an extension of the Spring Framework that simplifies application development through auto-configuration and starter dependencies.

#### Why Spring Boot instead of Spring?

* Less configuration
* Faster development
* Embedded Tomcat
* Production-ready features

#### What does @SpringBootApplication do?

It combines:

* @Configuration
* @EnableAutoConfiguration
* @ComponentScan

---

### Maven

#### What is Maven?

Maven is a build automation and dependency management tool.

#### What is pom.xml?

The central configuration file used to manage dependencies, plugins, and build settings.

---

### MVC

#### What is MVC?

MVC stands for:

* Model
* View
* Controller

It separates application responsibilities into different layers.

#### Why use MVC?

* Better maintainability
* Scalability
* Testability
* Cleaner code

---

### Layered Architecture

#### Why do we use Controller Layer?

Handles HTTP requests and responses.

#### Why do we use Service Layer?

Contains business logic.

#### Why do we use Repository Layer?

Handles database operations.

#### What is JPA?

Java Persistence API is a specification for mapping Java objects to database tables.

#### What is Hibernate?

Hibernate is the most popular implementation of JPA.

#### Difference Between JPA and Hibernate?
| JPA | Hibernate |
|------|-----------|
| Specification | Implementation |
| Defines Standards | Provides Implementation |
| Vendor Independent | Hibernate Specific |

#### What does ddl-auto=update do?

Automatically updates database tables according to entity changes.

#### What does show-sql=true do?

Displays generated SQL queries in the console.
#### Episode 3     
What is application.properties?    
What is a datasource?    
Why do we use JDBC URL?   
Difference between MySQL Driver and JPA?    

#### Episode 4
What is TailwindCSS?     
Why use Tailwind instead of writing raw CSS?     
What is package.json?     
Why do we need Node.js for Tailwind?    

---

## Future Features

* User Registration
* Login System
* Spring Security
* Contact CRUD Operations
* Pagination
* Search Functionality
* Profile Management
* Image Upload
* Email Verification
* Forgot Password
* Dashboard

---

## Git Workflow

git add .
git commit -m "meaningful commit message"
git push

---

## 🚧 Current Status

### Completed

* Project Initialization
* Maven Configuration
* MVC Setup
* Template Configuration
* Home Page Setup

## Current Focus:

* TailwindCSS Integration
* Layout Development
* Thymeleaf Templates
* User Entity Design
* JPA & Hibernate

## Upcoming Topics

- Thymeleaf Fragments
- Tailwind Components
- User Entity Mapping
- Spring Data JPA
- User Registration
- Spring Security
- Contact CRUD Operations

---

## ▶️ How to Run the Project

### Prerequisites

* Java 21+ (or your project's version)
* Maven
* MySQL
* Node.js & npm (for TailwindCSS)

### Steps

1. Clone the repository

```bash
git clone https://github.com/shreysomu/smart-contact-manager2.0.git
```

2. Navigate to the project

```bash
cd smart-contact-manager2.0
```

3. Configure database properties in `application.properties`

4. Build and run

```bash
mvn spring-boot:run
```

5. Open browser

```text
http://localhost:8080
```


---

## Author

Shrey

Java Backend Developer 

Learning Journey:
Java → Spring → Spring Boot → Hibernate → Microservices → System Design

## ⭐ Repository Goal

Build a production-ready Contact Management System while mastering:

* Java Backend Development
* Spring Ecosystem
* Database Design
* Security
* REST APIs
* Industry Best Practices


