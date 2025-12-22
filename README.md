# Security Command Center – AEGIS Gateway
## Project Overview

The Security Command Center – A Contemporary Guideline-Based AEGIS Mechanism for Gateway is a Java-based web application developed as part of a 6-month internship project.

The project demonstrates how a secure, centralized command and communication system can be designed using traditional J2EE technologies, following enterprise development practices and secure coding guidelines.

The term AEGIS in this project represents an application-level protective gateway, where all user requests are validated, controlled, and routed securely before accessing system resources.

## Objectives

Implement secure authentication using Java Servlets

Design a centralized command dashboard

Enable controlled message communication

Maintain structured backend and database interaction

Demonstrate MVC architecture using J2EE

Practice real-world internship-level Java web development

## System Architecture

The application follows a 3-Tier J2EE Architecture:

Presentation Layer

JSP, HTML, CSS, JavaScript

Dashboard-style UI aligned with screenshots

Application Layer

Java Servlets

DAO classes

Authentication Filter (AEGIS Gateway logic)

Data Layer

MySQL Database

JDBC connectivity

All requests pass through controlled servlet logic before accessing data, simulating a secure gateway mechanism.

## User Interface (UI)

The UI is designed in a dashboard style, inspired by secure command systems.

Implemented Screens:

Login Screen

Command (Admin) Dashboard

Secure Messaging Screen

Officer Management Screen

Security Monitoring Screen

UI Note:
The screenshots included in this repository represent the conceptual and functional user interface.
The visual design is enhanced for presentation purposes while accurately reflecting the implemented backend modules and system flow.

## Technology Stack
## Frontend

JSP (Java Server Pages)

HTML5

CSS3

JavaScript 

## Backend

Java (JDK 8+)

Java Servlets

JDBC

Servlet Filters

## Database

MySQL

MySQL Workbench

## Frameworks & Tools

Apache Tomcat 9

Apache Maven

Visual Studio IDE

## Key Features

Secure login using Servlets and sessions

Role-based access control

Centralized command dashboard

Secure message handling

Officer management interface

Basic security monitoring and logging

Maven-based build and deployment

## Database Details

The database stores:

User (officer/admin) credentials

Message content

Activity logs

JDBC PreparedStatements are used to prevent SQL Injection and ensure safe data access.

## How to Run the Project
Prerequisites

JDK 8 or above

Apache Tomcat 8/9

MySQL Server

Eclipse IDE

Apache Maven

. Steps

Clone or download this repository

Import project into Eclipse as Existing Maven Project

Create database using database/schema.sql

Update database credentials in DatabaseConnection.java

Configure Apache Tomcat in Eclipse

Run the project on server

Access the application at:

http://localhost:8080/security-command-center/login.jsp

## Screenshots

Screenshots are available in the screenshots/ folder and correspond to:

Login screen

Admin dashboard

Secure messaging

Officer management

Security monitor

## Internship Context

This project was developed as part of a six-month internship training program to demonstrate:

Practical Java web development

Secure coding concepts

Enterprise-style architecture

Real-world project documentation and version control

## Future Enhancements

Password hashing (BCrypt)

JWT-based authentication

Role-based permissions (RBAC)

RESTful API layer

Mobile or Flutter frontend

Advanced security logging

## Author

Name: Giri Prasaath D
Role: Intern @ VCodez
Technology Focus: Java, J2EE, Web Development

## License

This project is created for educational and internship purposes only.
