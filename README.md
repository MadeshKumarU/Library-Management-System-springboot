# Library Management System (Spring Boot Backend)

Library Management System built using Spring Boot and PostgreSQL. Implements RESTful APIs for managing books with full CRUD operations, layered architecture (Controller, Service, Repository), and database persistence using Spring Data JPA. Designed to demonstrate backend development, API design, and clean software architecture.

---

## Features
- RESTful CRUD APIs for managing library books  
- Add, update, view, and delete book records  
- PostgreSQL database integration using Spring Data JPA  
- Clean layered architecture (Controller, Service, Repository)  
- Backend-only implementation without a frontend  

---

## Tech Stack
- **Language:** Java  
- **Framework:** Spring Boot  
- **Database:** PostgreSQL  
- **ORM:** Spring Data JPA / Hibernate  
- **Build Tool:** Maven  
- **API Testing:** Postman  

---

## Project Structure
src/main/java
          └── com.madesh.books
          ├── Controller
          ├── Service    
          ├── Repository
          ├── Entity
          └── BooksApplication.java


---

## API Endpoints
| Method | Endpoint             | Description            |
|--------|----------------------|------------------------|
| POST   | /api/lms/add         | Add a new book         |
| GET    | /api/lms/showAll     | Retrieve all books     |
| GET    | /api/lms/{id}        | Retrieve book by ID    |
| PUT    | /api/lms/update      | Update book details    |
| DELETE | /api/lms/{id}        | Delete book            |

---

## Database Configuration
Update the database credentials in `application.properties` before running the application:

properties
spring.datasource.url=jdbc:postgresql://localhost:5432/lms
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

---

## How to run the Application

1. Clone the repository
   git clone https://github.com/<your-username>/Library-Management-System-springboot.git

2. Create a PostgreSQL database named lms

3. Update database credentials in application.properties

4. Run the application
   mvn spring-boot:run

---

## Future Enhancements

- Authentication and authorization using Spring Security and JWT
- Pagination and search functionality
- API documentation using Swagger / OpenAPI
- Frontend integration using React or Angular
- Dockerization for easier deployment

---

** Author **
Madesh Kumar U
Mechatronics Postgraduate | Backend & Java Developer
