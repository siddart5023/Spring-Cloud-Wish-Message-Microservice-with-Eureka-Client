# 🚀 Spring Cloud – Wish Message Microservice with Eureka Client

A Spring Boot Microservice that registers itself with a **Netflix Eureka Server** and exposes a REST API to return greeting messages. This project demonstrates **Service Registration** and **Service Discovery** using Spring Cloud Netflix Eureka.

---

## 📖 Project Overview

This project acts as a **Eureka Client**. When the application starts, it automatically registers itself with the running **Eureka Server**, making it discoverable by other microservices.

The microservice exposes a simple REST endpoint that returns a wish message.

---

## ✨ Features

- Spring Boot Microservice
- Netflix Eureka Client
- Automatic Service Registration
- RESTful API
- Dynamic Service Discovery
- Eureka Dashboard Monitoring

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Client
- Spring Web
- Maven
- Eclipse IDE
- Postman

---

## 📚 Concepts Covered

- Microservices Architecture
- Service Registry
- Service Discovery
- Eureka Client
- `@EnableDiscoveryClient`
- REST Controller
- Spring Boot REST API

---

## 📂 Project Structure

```text
WishMessage-Service
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── controller
│   │   │   │      WishMessageController.java
│   │   │   ├── runner
│   │   │   └── WishMessageApplication.java
│   │   └── resources
│   │          application.properties
│   │
├── pom.xml
└── README.md
```

---

## ⚙️ Configuration

```properties
server.port=8081

spring.application.name=WISH-SERVICE

eureka.client.service-url.defaultZone=http://localhost:8761/eureka
```

---

## ▶️ How to Run

### Step 1: Start Eureka Server

Run the **SpringCloud-EurekaServer** project first.

```text
http://localhost:8761
```

Wait until the Eureka Dashboard is available.

---

### Step 2: Start Wish Message Service

Run this project.

The service will automatically register with the Eureka Server.

---

### Step 3: Verify Registration

Open the Eureka Dashboard:

```text
http://localhost:8761
```

You should see:

```text
WISH-SERVICE
Status : UP
```

---

### Step 4: Test the REST API

```http
GET /wish-api/message
```

Example:

```text
http://localhost:8081/wish-api/message
```

### Sample Response

```text
Good Morning!
```

---

## 📸 Screenshots

Include screenshots of:

- Eureka Server Running without any Register with Eureka Server
  <img width="1920" height="1080" alt="Screenshot 2026-08-07 172011" src="https://github.com/user-attachments/assets/694be8fc-0924-45fa-9f3e-b000c3566dba" />
-Eureka Server showing the instance of WishMessageApi 
<img width="1920" height="1080" alt="Screenshot 2026-08-07 174959" src="https://github.com/user-attachments/assets/825b9fa9-28fe-4af2-8513-a9d41aa8ce9c" />
-After executing the Result
<img width="1117" height="262" alt="Screenshot 2026-08-07 175116" src="https://github.com/user-attachments/assets/4639b167-7bd3-4183-959c-6081fdfc6c41" />

---

## 🎯 Learning Outcomes

- Registered a Spring Boot Microservice with Eureka Server.
- Learned automatic service registration and discovery.
- Built a REST API using Spring Boot.
- Verified service registration through the Eureka Dashboard.
- Understood the startup sequence in a Microservices architecture.

---

## 📌 Prerequisite

⚠️ **This project depends on the Eureka Server.**

Before running this application, make sure the **SpringCloud-EurekaServer** project is running.

---

## 👨‍💻 Author

**Botuka Siddartha **

Java Backend Developer | Spring Boot | Spring Cloud | Microservices

---

⭐ If you found this project helpful, don't forget to **Star** this repository!
