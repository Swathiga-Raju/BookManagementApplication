Book Management Application

- A simple Book Management Application built using Spring Boot, MySQL, and REST API.
- This project demonstrates basic CRUD operations: Create, Read, Update, Delete.

Project Name
Book Management System – Spring Boot CRUD

Features
- Add a new book

- Get details of all books

- Get a book by ID

- Update book details

- Delete a book

- REST API using Spring Boot

- Database support using MySQL

- Auto table creation using JPA and Hibernate

Tech Stack

Technology Description
Java 17+ (Programming language)
Spring Boot	(Backend framework)
Spring Web	(REST API)
Spring Data JPA	ORM (for database)
MySQL	(Database)
Maven	(Build tool)
Postman / Curl	(API testing)


Getting Started

Prerequisites

Install the following:

- Java 17 or above

- Maven 3+

- MySQL Server

- IDE (IntelliJ, Eclipse, or VS Code)

Installation Steps

Step 1: Clone the Repository
git clone https://github.com/your-username/book-management.git
cd book-management

Step 2: Create MySQL Database
CREATE DATABASE bookdb;

Step 3: Configure application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Step 4: Build the Project
mvn clean install

Step 5: Run the Application
mvn spring-boot:run

API Endpoints
Add Book

POST /books/add
Body:

{
  "title": "Java Programming",
  "author": "James Gosling",
  "price": 499.0
}

Get All Books

GET /books/all

Get Book by ID

GET /books/{id}

Update Book

PUT /books/update/{id}
Body:

{
  "title": "Advanced Java",
  "author": "James Gosling",
  "price": 699.0
}

Delete Book

DELETE /books/delete/{id}

Project Structure
src/main/java/com/example/bookapp
 ├── BookAppApplication.java
 ├── controller/BookController.java
 ├── entity/Book.java
 ├── repository/BookRepository.java
src/main/resources
 └── application.properties
