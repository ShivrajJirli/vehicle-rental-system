<div align="center">
  <h1>🚗 Vehicle Rental System</h1>
  <p><strong>A robust web-based Vehicle Rental System built with Spring Boot</strong></p>
  
  [![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://java.com/)
  [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
  [![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)](https://maven.apache.org/)
  [![H2 Database](https://img.shields.io/badge/Database-H2-blueviolet.svg)](https://h2database.com/)
</div>

<hr/>

## 📋 About

A complete backend system for vehicle rental management that provides RESTful APIs for handling vehicle details. It features full CRUD operations utilizing an in-memory H2 database, making it perfect for learning Spring Boot or serving as a solid foundation for your rental management applications.

## ✨ Features

- ➕ **Comprehensive Management:** Add, view, update, and delete vehicle records with complete details.
- 🔍 **Targeted Retrieval:** Fetch specific vehicles effortlessly using their unique IDs.
- 🗄️ **Zero-Config Database:** In-memory H2 database included with a web console for quick development and testing.
- 🔒 **Modern Architecture:** Clean and scalable RESTful API design.

## 🛠️ Tech Stack

| Technology | Description |
| :--- | :--- |
| **Java 17** | Core programming language |
| **Spring Boot 3.x** | Application framework |
| **Spring Data JPA** | Database interaction layer |
| **H2 Database** | In-memory relational database |
| **Maven** | Dependency management and build tool |
| **Postman** | API testing environment |

## 🚀 Quick Start

### Prerequisites
Make sure you have the following installed on your machine:
- **Java 17** or higher
- **Maven 3.6+**
- **Postman** (Optional, for API testing)

### Installation & Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/shivrajjirli/vehicle-rental-system.git
   ```

2. **Navigate to project directory**
   ```bash
   cd vehicle-rental-system
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**
   > Server will start running at: `http://localhost:8081`

---

## 📡 API Endpoints

| Method | Endpoint | Description |
| :---: | :--- | :--- |
| <kbd>POST</kbd> | `/api/vehicles` | Add a new vehicle |
| <kbd>GET</kbd> | `/api/vehicles` | View all vehicles |
| <kbd>GET</kbd> | `/api/vehicles/{id}` | Get vehicle by ID |
| <kbd>PUT</kbd> | `/api/vehicles/{id}` | Update vehicle details |
| <kbd>DELETE</kbd>| `/api/vehicles/{id}` | Delete a vehicle |

---

## 🧪 API Usage Examples

<details>
<summary><b>1. Add a New Vehicle</b></summary>

**Request:**
```http
POST http://localhost:8081/api/vehicles
Content-Type: application/json
```

**Body:**
```json
{
  "brand": "Toyota",
  "model": "Camry",
  "year": 2022,
  "color": "White",
  "rentalPrice": 45.50,
  "available": true
}
```
</details>

<details>
<summary><b>2. Get All Vehicles</b></summary>

**Request:**
```http
GET http://localhost:8081/api/vehicles
```
</details>

<details>
<summary><b>3. Get Vehicle by ID</b></summary>

**Request:**
```http
GET http://localhost:8081/api/vehicles/1
```
</details>

<details>
<summary><b>4. Delete a Vehicle</b></summary>

**Request:**
```http
DELETE http://localhost:8081/api/vehicles/1
```
</details>

---

## 🗃️ H2 Database Console

Access the built-in database console to view and manage your data directly:

- **URL:** [`http://localhost:8081/h2-console`](http://localhost:8081/h2-console)
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** *(leave empty)*

> ⚠️ **Note:** The H2 console is only available during development. Since it's an in-memory database, all data will be lost when the application stops.

---

## ⚙️ Configuration

You can customize the application by updating the `src/main/resources/application.properties` file. Here are the default settings:

```properties
# --- Server Configuration ---
server.port=8081

# --- H2 Database Settings ---
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# --- H2 Console ---
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# --- JPA Settings ---
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
```

---

## 🏗️ Build Commands

| Action | Command |
| :--- | :--- |
| **Clean and build project** | `mvn clean install` |
| **Run tests** | `mvn test` |
| **Create executable JAR** | `mvn clean package` |
| **Run with specific profile**| `mvn spring-boot:run -Dspring-boot.run.profiles=dev` |

---

## 🔧 Project Structure

```text
vehicle-rental-system/
├── src/
│   ├── main/
│   │   ├── java/com/rental/rentalservice/
│   │   │   ├── controller/
│   │   │   ├── exception/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── RentalServiceApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   └── test/java/com/rental/rentalservice/
│       └── RentalServiceApplicationTests.java
├── pom.xml
└── README.md
```

---

## 🐛 Troubleshooting

### Common Issues:

* **Port already in use:** Change `server.port` in `application.properties`.
* **H2 console not accessible:** Ensure `spring.h2.console.enabled=true` in your configuration.
* **Database connection error:** Verify that the JDBC URL in the H2 console matches the application properties.

### Quick Fixes (Port Issues):

**Windows:**
```bash
netstat -ano | findstr :8081
taskkill /PID <PID> /F
```

**Linux/Mac:**
```bash
lsof -ti:8081 | xargs kill -9
```

---

## 🤝 Bug Reports & Contributing

If you encounter any bugs or have feature requests, please open an issue with:
* Detailed description of the bug
* Steps to reproduce
* Expected vs actual behavior
* Screenshots (if applicable)

---

## 👤 Author

**Shivraj Jirli** 
* GitHub: [@ShivrajJirli](https://github.com/ShivrajJirli)

<br/>
<div align="center">
  <sub>Built with ❤️ by Shivraj Jirli</sub>
</div>
