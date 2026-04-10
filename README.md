# 🌾 AGMS - Agricultural Management System (Microservices)

A scalable and distributed **Agricultural Management System (AGMS)** built using **Spring Boot** and **Spring Cloud**.  
This system is designed to manage agricultural operations such as **sensor monitoring, crop management, zone handling, automation, and task scheduling**.

---

## 🏗️ Architecture Overview

This project follows a **microservices architecture** where each service is independently developed and deployed.

```
Client → API Gateway → Microservices → Database
```

### Core Components:
- **API Gateway (Port 8080)** – Central entry point (Routing + Load Balancing)
- **Discovery Server (Eureka - Port 8761)** – Service registration & discovery
- **Config Server (Port 8888)** – Centralized configuration *(Planned)*

---

## 📦 Microservices

### 🔹 Sensor Telemetry Service (Port 8083)
Handles real-time sensor data.

**Features:**
- CRUD operations for sensor data  
- Filter by sensor type, location, and time range  
- Active/inactive record management  

---

### 🔹 Crop Inventory Service (Port 8082)
Manages crop lifecycle and inventory.

**Features:**
- Crop lifecycle tracking (GROWING → HARVESTED)  
- Crop health monitoring  
- Filtering and analytics  

---

### 🔹 Zone Management Service *(Planned)*
Manages zones, fields, and sections.

---

### 🔹 Automation Service *(Planned)*
Controls irrigation systems, pumps, and motors.

---

### 🔹 Task Management Service *(Planned)*
Handles scheduling and tracking of agricultural tasks.

---

## 🛠️ Tech Stack

- **Java 21**  
- **Spring Boot**  
- **Spring Cloud**  
- **Netflix Eureka**  
- **Spring Data JPA (Hibernate)**  
- **H2 Database**  
- **Maven**  
- **Lombok**  
- **Spring Boot Actuator**  

---

## 🚀 Getting Started

### 1. Start Discovery Server
```bash
cd discovery-server
mvn spring-boot:run
```

Access Eureka Dashboard:  
http://localhost:8761  

---

### 2. Start Services

**Sensor Telemetry Service**
```bash
cd sensor-telemetry-service
mvn spring-boot:run
```

**Crop Inventory Service**
```bash
cd crop-inventory-service
mvn spring-boot:run
```

---

### 3. Verify Services

- Sensor Service: http://localhost:8083/actuator/health  
- Crop Service: http://localhost:8082/actuator/health  

---

## 📡 API Endpoints

### Sensor Telemetry
```
POST   /api/v1/sensor-telemetry
GET    /api/v1/sensor-telemetry
GET    /api/v1/sensor-telemetry/{id}
PUT    /api/v1/sensor-telemetry/{id}
DELETE /api/v1/sensor-telemetry/{id}
```

### Crop Inventory
```
POST   /api/v1/crop-inventory
GET    /api/v1/crop-inventory
GET    /api/v1/crop-inventory/{id}
PUT    /api/v1/crop-inventory/{id}
DELETE /api/v1/crop-inventory/{id}
```

---

## 🔄 System Workflow

1. Client sends request to API Gateway  
2. Gateway routes request to appropriate service  
3. Services communicate via Eureka  
4. Data is processed and stored  
5. Response returned to client  

---

## 📊 Monitoring

Spring Boot Actuator provides:

- `/actuator/health`  
- `/actuator/metrics`  
- `/actuator/info`  

---

## 🔐 Future Improvements

- JWT Authentication  
- Role-Based Access Control (RBAC)  
- API Security  
- Cloud Deployment (AWS/Azure)  

---

## 📌 Conclusion

AGMS is a **modern microservices-based solution** for agricultural management, improving efficiency, scalability, and maintainability of the system.

---

⭐ *Feel free to contribute or fork this project!*
