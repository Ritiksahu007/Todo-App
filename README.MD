✅ Todo App — Spring Boot + Thymeleaf + MySQL

A simple yet powerful Todo Management Application built with Spring Boot, Thymeleaf, HTML, CSS, and MySQL.
This project demonstrates full-stack web development, covering CRUD operations, database integration, and cloud deployment with Render.

🌐 Live Demo

🚀 View Live App on Render

(Replace with your actual deployed URL once it’s live.)

🧩 Tech Stack
Layer	Technology
Frontend	Thymeleaf, HTML5, CSS3.
Backend	Spring Boot (Java 17).
Database	MySQL.
Build Tool	Maven.
Deployment	Render (Free Cloud Hosting).
Version Control	Git & GitHub.
CI/CD	GitHub Actions + Render Auto Deploy.
✨ Features

📝 Add new todos with title and description

✅ Mark tasks as completed or pending

🔄 Update or edit existing todos

❌ Delete todos permanently

📋 View all todos in an interactive web UI

💾 Persistent data storage using MySQL

☁️ Cloud deployment via Render

⚙️ Optional CI/CD automation via GitHub Actions

⚙️ Application Workflow

User Interface (Thymeleaf Templates)

The user interacts through forms rendered by Thymeleaf.

Controller Layer (Spring MVC)

Handles user requests and maps endpoints like /addTodo, /updateTodo, /deleteTodo.

Service Layer

Contains business logic and handles validation before sending data to the repository.

Repository Layer (Spring Data JPA)

Communicates with the MySQL database and performs CRUD operations.

Database (MySQL)

Stores all todo items persistently.

🗄️ Database Configuration

In src/main/resources/application.properties:

server.port=${PORT:8080}

# MySQL configuration (use environment variables in Render)
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


When running locally, replace variables with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=yourpassword

🚀 Deployment Pipeline

This app is deployed on Render, using GitHub integration for CI/CD.

🧭 Deployment Steps

Push code to GitHub (main branch).

Render automatically pulls from GitHub, builds using Maven, and deploys.

The app becomes accessible via a live Render URL.

🧩 GitHub Actions Workflow (optional)

.github/workflows/build.yml:

name: Build and Deploy Spring Boot App

on:
push:
branches: [ "main" ]

jobs:
build:
runs-on: ubuntu-latest
steps:
- name: Checkout code
uses: actions/checkout@v4

      - name: Set up JDK 17
        uses: actions/setup-java@v4
        with:
          java-version: '17'
          distribution: 'temurin'

      - name: Build with Maven
        run: mvn clean package -DskipTests

📸 Screenshots
Description	Screenshot
Homepage

Add Todo Form : - <img src ="D:\code\Projects\Springboot\Todo-App\Todo-App\docs\Frontphoto.png" width="600"/> 


Phpadmin on cloud mysql : -<img src="D:\code\Projects\Springboot\Todo-App\Todo-App\docs\phpadminimage.png" width="600"/>  
Deployed on Render

CI/CD Pipeline

(Place your screenshots inside a /docs folder in your project.)

🧠 Future Enhancements

🔐 Implement user authentication (Spring Security)

📱 Improve responsive design for mobile devices

📊 Add charts and statistics for completed tasks

☁️ Dockerize app for multi-cloud deployment

👨‍💻 Author

Ritik Sahu
📫 GitHub Profile

🪄 How to Run Locally

Clone the repo:

git clone https://github.com/Ritiksahu007/Todo-App.git
cd Todo-App


Update your application.properties file with your local MySQL details.

Start MySQL and create the database:

CREATE DATABASE todo_db;


Run the application:

./mvnw spring-boot:run


or

mvn spring-boot:run


Visit http://localhost:8080
in your browser.

🧾 License

This project is licensed under the MIT License — you can use, modify, and distribute it freely.

⭐ If you found this project helpful, please star it on GitHub!
It motivates continued learning and open-source contributions.