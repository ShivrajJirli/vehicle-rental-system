# 🚗 Vehicle Rental System

A complete web-based Vehicle Rental System built using Spring Boot that allows users to manage vehicle details through RESTful APIs. This system provides full CRUD operations for vehicle management with an in-memory H2 database.

## 📋 About
A robust backend system for vehicle rental management that supports adding, viewing, updating, and deleting vehicles through clean REST APIs. Perfect for learning Spring Boot or as a foundation for rental management applications.

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (In-memory)
- **Maven**
- **Postman** (for API testing)

## ✨ Features

- ➕ Add new vehicles with complete details
- 📋 View all available vehicles
- 🔍 Get specific vehicle by ID
- ✏️ Update existing vehicle information
- ❌ Delete vehicles from the system
- 🗄️ In-memory H2 database with web console
- 🔒 RESTful API architecture

## 🚀 Quick Start

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Postman (for API testing)

### Installation & Run

1. **Clone the repository**
   ```bash
   git clone  https://github.com/shivrajjirli/vehicle-rental-system.git

2. **Navigate to project directory**
   ```bash
   cd vehicle-rental-system

3. **Run the application**
   ```bash
   mvn spring-boot:run

4. **Access the application**
   ```bash
   Server starts at: http://localhost:8081


## 📡 API Endpoints


| Method   | Endpoint             | Description            |
| -------- | -------------------- | ---------------------- |
| `POST`   | `/api/vehicles`      | Add a new vehicle      |
| `GET`    | `/api/vehicles`      | View all vehicles      |
| `GET`    | `/api/vehicles/{id}` | Get vehicle by ID      |
| `PUT`    | `/api/vehicles/{id}` | Update vehicle details |
| `DELETE` | `/api/vehicles/{id}` | Delete a vehicle       |


## 🧪 API Usage Examples

POST http://localhost:8081/api/vehicles

**Content-Type: application/json**

**{**

  **"brand": "Toyota",**
  
  **"model": "Camry",**
  
  **"year": 2022,**
  
  **"color": "White",**
  
  **"rentalPrice": 45.50,**
  
  **"available": true**
  
**}**

**Get All Vehicles**

      GET http://localhost:8081/api/vehicles

**Get Vehicle by ID**

      GET http://localhost:8081/api/vehicles/1

**Delete Vehicle**

      DELETE http://localhost:8081/api/vehicles/1

## 🗃️ H2 Database Console

**Access the in-memory database console for direct data management:**

**URL: http://localhost:8081/h2-console**

**JDBC URL: jdbc:h2:mem:testdb**

**Username: sa**

**Password: (leave empty)**

**Note: The H2 console is available only during development. Data will be lost when the application stops.**


## 🔧 Project Structure

```
vehicle-rental-system/
├── .mvn/
│ └── wrapper/
│ └── maven-wrapper.properties
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/rental/rentalservice/
│ │ │ ├── controller/
│ │ │ ├── exception/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ ├── service/
│ │ │ └── RentalServiceApplication.java
│ │ └── resources/
│ │ ├── static/
│ │ ├── templates/
│ │ └── application.properties
│ └── test/
│ └── java/
│ └── com/rental/rentalservice/
│ └── RentalServiceApplicationTests.java
├── target/
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```


## 🏗️ Build Commands

**Clean and build project**
         
    mvn clean install

**Run tests**
         
    mvn test

**Create executable JAR**
         
    mvn clean package

**Run with specific profile**
            
    mvn spring-boot:run -Dspring-boot.run.profiles=dev


# ⚙️ Configuration
Update src/main/resources/application.properties for custom configuration:

## Server Configuration
**server.port=8081**

## H2 Database

**spring.datasource.url=jdbc:h2:mem:testdb**

**spring.datasource.driverClassName=org.h2.Driver**

**spring.datasource.username=sa**

**spring.datasource.password=do not add anything**


## H2 Console (Enable in development)

**spring.h2.console.enabled=true**

**spring.h2.console.path=/h2-console**

## JPA Settings

**spring.jpa.database-platform=org.hibernate.dialect.H2Dialect**

**spring.jpa.hibernate.ddl-auto=create-drop**

**spring.jpa.show-sql=true**



# 🐛 Troubleshooting

## Common Issues:

**Port already in use: Change server.port in application.properties**

**H2 console not accessible: Ensure spring.h2.console.enabled=true**

**Database connection error: Verify JDBC URL in H2 console matches application properties**

## Solutions:
      # Kill process using port 8081 (Windows)
      netstat -ano | findstr :8081
      taskkill /PID <PID> /F

      # Kill process using port 8081 (Linux/Mac)
      lsof -ti:8081 | xargs kill -9


# 🐛 Bug Reports
 **If you encounter any bugs, please open an issue with:**

 **Detailed description of the bug**

 **Steps to reproduce**

 **Expected vs actual behavior**

 **Screenshots (if applicable)**


# 👥 Author
Shivraj Jirli - https://github.com/ShivrajJirli
    


