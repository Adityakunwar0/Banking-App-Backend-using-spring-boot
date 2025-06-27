# Bank Account Management System

This project is a Bank Account Management System built using Spring Boot. It provides RESTful APIs to perform core banking operations such as creating an account, updating details, depositing money, withdrawing money, and fetching account information.

## Technologies Used
 - Java 17+

 - Spring Boot

 - Spring Web

 - Spring Data JPA

 - MySQL / H2 Database

 - Postman (for API testing)

## Core Functionalities
 - Create Account – Add a new bank account with user details and an initial balance.

 - Get Account by ID – Retrieve individual account details by account ID.

 - Get All Accounts – View details of all registered bank accounts.

 - Update Account – Modify user details (e.g., name, email).

 - Deposit Money – Add funds to an account.

 - Withdraw Money – Withdraw funds from an account (with balance validation).

 - Delete Account – Remove an account permanently.

## API Endpoints

 - Create a new bank account
   - Method : POST
   - EndPoint : http://localhost:8081/api/accounts

 - Get account details by ID
   - Method : GET
   - EndPoint : http://localhost:8081/api/accounts/{id}

 - Get all account details
   - Method : POST
   - EndPoint : http://localhost:8081/api/accounts

 - Deposit amount
   - Method : PUT
   - EndPoint : http://localhost:8081/api/accounts/{id}/deposit

 - Withdraw amount
   - Method : PUT
   - EndPoint : http://localhost:8081/api/accounts/{id}/withdraw

- Delete an account
   - Method : DELETE
   - EndPoint : http://localhost:8081/api/accounts/{id}

## Validations & Rules
 - Cannot withdraw more than the current balance.

 - Account ID must exist to perform any operation.

 - Proper exception handling for invalid requests.


## Summary Of Project

Developed a backend banking application that provides APIs to handle core account operations such as account creation, detail retrieval, deposit, withdrawal, and deletion. Implemented balance validation and exception handling to ensure robust operations. The system uses Spring Boot with Spring Data JPA and connects to a MySQL database.



