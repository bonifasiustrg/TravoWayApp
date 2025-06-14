# TravoWay-PBO

TravoWay-PBO is a desktop application designed for travel agencies to manage customer data, bookings, and travel packages efficiently. Built with JavaFX and Spring, it provides a modern, user-friendly interface and robust reporting features.
This project is intended for our OOP Course final assignment.


## Features / Menus

- **Dashboard**  
  Displays key data summaries such as the number of customers, travel packages, and recent transactions.

- **Customer Management**  
  - Add, edit, delete, and search customer data.
  - View customer transaction history.

- **Travel Package Management**  
  - Manage the list of travel packages (name, price, destination, etc.).
  - Update and delete packages as needed.

- **Booking Management**  
  - Process customer bookings for travel packages.
  - Manage payment status and booking confirmations.

- **Reporting**  
  - Print customer, package, and transaction reports using JasperReports.
  - Export reports to PDF.

- **User Authentication**  
  - Login system for secure application access.


### Dependencies

The project uses several external libraries (see [`nbproject/project.properties`](nbproject/project.properties)), including:

- **Java** (JDK 8+)
- **JavaFX** (UI, FXML, FontAwesomeFX)
- **Spring Framework** (Core, Context, Beans, AOP)
- **MySQL** (Database, via JDBC)
- **JasperReports** & **iText** (Reporting)
- **Apache Commons** (Utilities)
- **Jackson** (JSON Processing)
- **Lucene** (Text search, if used)
- **NetBeans** (IDE, recommended)
- **Apache Ant** (Build tool)
- Others (see the `file.reference.*.jar` entries)

Dependencies are expected in the `dist/lib/` directory as referenced in the properties file.


## Getting Started

1. **Clone the repository**
2. **Install dependencies** (copy all JARs in `dist/lib/`)
3. **Set up the MySQL database** (import sample schema if available)
4. **Configure the database connection** in the source/config
5. **Build & Run**  
   - NetBeans: Clean and Build, then Run  
   - Ant:  
     ```sh
     ant clean
     ant build
     ant run
     ```

## Contributor

- ditorifadli
- bonifasiustrg
- rendyadie
- hermawanalgozhy


## Preview

![alt text](<preview/WhatsApp Image 2025-06-14 at 10.38.01_e2bafc61.jpg>)


<video controls src="preview/WhatsApp Video 2025-06-14 at 10.38.02_a629e1d4.mp4" title="Title"></video>