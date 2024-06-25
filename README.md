# PCCW Accounts Application (How to run locally in Docker)

## Requirements

For building and running the application you need:
- [Docker Desktop](https://docs.docker.com/desktop/install/windows-install/)
- Active internet connection

## Running the application locally

To run the application, follow these steps:
1. Open Docker Desktop application. Make sure engine is running.
2. Make sure that port 8080 is available in the machine.
3. Open [runaccounts.bat](runaccounts.bat) to start building and running the application.

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

## Checking if Email Service is working

The application is using a fake SMTP server called [Ethereal](https://ethereal.email/).
To check if an email is successfully sent after registering a user using the POST /account API, follow these steps:

1. Go to https://ethereal.email/login in your browser.
2. Use the following credentials then click Login:
   * Email address: armando31@ethereal.email
   * Password: NVfswZQD15Vnkqp2FK
3. Go to [Messages tab](https://ethereal.email/messages) to check if the email is sent.

## Accessing the API Documentation

Before accessing the documentation, make sure that the application is running.
Link for the API Documentation of the Accounts Service: http://localhost:8080/swagger-ui/index.html#/

Alternatively, here is a PDF file with the API Documentation: [Accounts Service API Documentation.pdf](Accounts%20Service%20API%20Documentation.pdf)