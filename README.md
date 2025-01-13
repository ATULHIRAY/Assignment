# Patient Management System
This project provides a simple Spring Boot-based Patient Management System where we can manage Client and Therapist information. This system allows performing CRUD operations on the Client and Therapists entities via REST APIs.

# Features
  Client Management:
  Add new client
  Update client details
  Find client by ID
  Delete client by ID
  List all clients

# Therapist Management:
  Add new therapist
  Update therapist details
  Find therapist by ID
  Delete therapist by ID
  List all therapists
  
# Technologies Used
  Java 17 (or later)
  Spring Boot 2.x
  Spring Data JPA
  Hibernate
  MySQL / H2 (for database)
  Maven (for dependency management)

# Setup Instructions
  Prerequisites
  Java 17+ (or later)
  Maven (for managing dependencies)
  MySQL Database (or you can use an in-memory H2 database for testing)
  
# The application will start on http://localhost:8080.

# API Endpoints
 
  Client API
  Create Client:
  
# POST /cl
  Body: {"clientId": "C123", "name": "John Doe", "email": "johndoe@example.com"}
  Update Client:

# PUT /cl
  Body: {"clientId": "C123", "name": "John Doe", "email": "john.doe@newemail.com"}
  Get Client by ID:

# GET /cl/{id}
# Delete Client by ID:

# DELETE /cl/{id}
  List all Clients:

# GET /cl
  Therapist API
  Create Therapist:

# POST /th
  Body: {"therapistsId": "T123", "name": "Dr. Smith", "number": "1234567890"}
  Update Therapist:

# PUT /th
  Body: {"therapistsId": "T123", "name": "Dr. Smith", "number": "0987654321"}
  Get Therapist by ID:

# GET /th/{id}
  Delete Therapist by ID:

# DELETE /th/{id}
  List all Therapists:

# GET /th

# Postman collection - https://www.postman.com/atulhiray/workspace/effdog/documentation/37723561-8dd97891-6ca1-4239-bfd6-0b98aafd52de
