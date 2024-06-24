# PCCW Accounts Application (How to run locally in Docker)

## Requirements

For building and running the application you need:


- [Docker Desktop](https://docs.docker.com/desktop/install/windows-install/)
- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Set JAVA_HOME in System Variables](https://javatutorial.net/set-java-home-windows-10/)
- [Set MAVEN_HOME in System Variables](https://www.qamadness.com/knowledge-base/how-to-install-maven-and-configure-environment-variables/)

## Running the application locally

To run the application, follow these steps:

1. Open Docker Desktop application. Make sure engine is running.
2. Open [runaccounts.bat](runaccounts.bat) to start building and running the application.

## Accessing the database

The application uses [H2 Database](https://www.h2database.com/) which is an in-memory database.
To access the database, follow these steps:

1. Make sure the application is already running.
2. Open http://localhost:8080/h2-console in your browser.
3. Input the following:
   * Driver Class: org.h2.Driver
   * JDBC URL: jdbc:h2:mem:testdb
   * User Name: test
   * Password: (leave as blank)
4. Click Connect.