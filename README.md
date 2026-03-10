# AI-Powered Chat Ordering System

**Polyglot Microservices using Spring Boot (Java) + FastAPI (Python)**

An AI-powered chat-based food ordering system built with **Spring Boot and FastAPI microservices**.
The application allows users to place food orders through a chat interface while an AI service extracts structured order data from natural language messages.

This project demonstrates **polyglot backend architecture, real-time communication, AI integration, containerization, and scalable microservices design**.

---

# System Architecture

The system separates responsibilities across multiple services.

```
Client (Web Chat UI)
        │
        │ HTTP / WebSocket
        ▼
Spring Boot Backend (Java 21)
 - Authentication (JWT)
 - User Management
 - Order Processing
 - Chat Controller
 - Redis Cache
        │
        │ REST API
        ▼
FastAPI AI Service (Python)
 - NLP Processing
 - Order Extraction
 - AI Integration (Ollama / LLaMA / GPT)
        │
        ▼
Database Layer
MySQL
```

---

# Key Features

### AI-Powered Order Extraction

Users can place orders using natural language.

Example:

```
User: I want 2 burgers and a coke
```

AI service converts it into structured data:

```json
{
  "items": [
    {"name": "burger", "quantity": 2},
    {"name": "coke", "quantity": 1}
  ]
}
```

---

### Chat-Based Ordering

Customers interact with the system through a simple chat interface to place food orders.

---

### Secure Authentication

The backend supports **JWT authentication** and role-based access control.

Roles include:

* Customer
* Admin

---

### Real-Time Communication

WebSocket integration enables real-time messaging between the user and the ordering system.

---

### Microservices Architecture

The system is split into independent services:

* **Spring Boot Service**
* **FastAPI AI Service**

This architecture allows services to scale independently.

---

### Redis Caching

Redis is used to cache session data and improve performance.

---

### Containerized Deployment

The system is fully containerized using **Docker** and can be deployed easily.

---

# Technology Stack

### Backend

* Java 21
* Spring Boot
* Spring Security
* Spring WebSocket
* Spring Data JPA

### AI Service

* Python
* FastAPI
* Pydantic

### Databases

* MySQL
* Redis

### DevOps

* Docker
* Docker Compose
* Kubernetes (optional deployment)

### Frontend

* HTML
* JavaScript
* WebSocket

---

# Project Structure

```
ai-chat-ordering-system
│
├── springboot-backend
│   ├── src
│   └── pom.xml
│
├── fastapi-ai-service
│   ├── main.py
│   └── requirements.txt
│
├── frontend
│   └── index.html
│
├── docker-compose.yml
│
└── README.md
```

---

# Running the Project

## 1. Clone Repository

```
git clone https://github.com/yourusername/ai-chat-ordering-system.git
cd ai-chat-ordering-system
```

---

## 2. Run with Docker

```
docker-compose up --build
```

Services will start:

| Service            | Port |
| ------------------ | ---- |
| Spring Boot API    | 8080 |
| FastAPI AI Service | 8000 |
| MySQL              | 3306 |
| Redis              | 6379 |

---

# API Endpoints

### Send Chat Message

```
POST /chat/message
```

Request

```json
{
 "text": "I want pizza and coke"
}
```

Response

```json
{
 "items": [
   {"name": "pizza", "quantity": 1},
   {"name": "coke", "quantity": 1}
 ]
}
```

---

# Example Workflow

1. User sends a chat message.
2. Spring Boot backend receives the message.
3. Backend sends the message to the FastAPI AI service.
4. AI extracts the structured order.
5. Backend stores the order in the database.
6. Response is returned to the user.

---

# Future Improvements

* Integrate **Ollama + LLaMA3** for local AI processing
* Add **payment gateway integration**
* Implement **Kafka event streaming**
* Add **React frontend**
* Add **Kubernetes deployment**
* Add **CI/CD pipeline with GitHub Actions**

---

# Screenshots

*(Add screenshots of the chat interface here)*

---

# Learning Objectives

This project demonstrates:

* Microservices architecture
* Polyglot backend development
* AI service integration
* Real-time chat systems
* Secure API development
* Containerized deployment

---

# Author

**Engr. Ipaye Babatunde**

Backend Developer | Java | Microservices | DevOps | Cloud-Native Systems

---

# License

This project is licensed under the MIT License.

---
