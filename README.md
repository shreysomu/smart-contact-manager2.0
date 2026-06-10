# Smart Contact Manager 2.0

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

* [x] Episode 1 - Project Introduction
* [x] Episode 2 - Spring Boot Project Setup
* [x] Episode 3 - MVC Architecture & Project Structure

### Upcoming

* [ ] Episode 4 - Database Configuration
* [ ] Episode 5 - User Entity Creation
* [ ] Episode 6 - Registration Module
* [ ] Episode 7 - User Validation
* [ ] Spring Security Setup
* [ ] Contact CRUD Operations
* [ ] Pagination & Search
* [ ] Image Upload
* [ ] Dashboard Implementation

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

* Project Structure Setup
* Resources Folder Configuration
* Templates and Static Resources
* MVC Architecture Overview

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

### Currently Learning

* Database Configuration
* Hibernate
* JPA
* Entity Mapping

---

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


