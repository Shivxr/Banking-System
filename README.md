# Banking System

This is a simple Banking System application built in Java, utilizing Object-Oriented Programming (OOP) concepts and JDBC for database connectivity with SQLite. The application allows users to create an account, deposit money, withdraw funds, and view account statements.

## Features

- **User Account Creation**: Allows new users to create an account with initial details.
- **Deposit**: Users can deposit money into their account.
- **Withdraw**: Users can withdraw money from their account, with proper authentication.
- **Account Statement**: Users can view their account information and transaction history.

## Project Structure

- **Main Classes**:
  - `Authenticate.java`: Handles user authentication for secure access to deposit, withdraw, and statement features.
  - Other classes implement the functionality for each banking operation using OOP principles.
  
- **Database**:
  - Uses SQLite as the database for storing user account information and transaction history.
  - JDBC is used for database connectivity and executing SQL queries.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- SQLite database
- A JDBC driver for SQLite (if needed)
