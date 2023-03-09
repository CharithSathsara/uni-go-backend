# UniGo Spring Boot Backend

This is the backend repository for UniGo, a mobile application designed for university students. The app provides students with information about degree programs, subjects, announcements, events, and clubs in their university. Students can register and login using their email to access these features.

## Table of Contents

 - [About the Project](#about-the-project)
 - [Hackathon Achievement](#hackathon-achievement)
 - [Team](#team)
 - [Technologies Used](#technologies-used)
 - [Installation](#installation)
 - [Usage](#usage)
 - [Endpoints](#endpoints)
 - [Contributing](#contributing)

## About the Project

UniGo is a mobile application designed for university students. The app provides students with information about degree programs, subjects, announcements, events, and clubs in their university. Students can register and login using their email to access these features.

This repository contains the backend code for the UniGo application, built using the Spring Boot framework for Java.

## Hackathon Achievement

UniGo was developed as a project for the MADHACK Hackathon organized by the IEEE Student Branch of UCSC. This project won the 2nd runners up in the hackathon.

## Team

This project was developed by Code Duo, a team of two university students who are passionate about software development and solving real-world problems.

## Technologies Used

The following technologies were used in the development of this application:

- **Spring Boot**: The app's backend is built using the Spring Boot framework for Java.
- **MySQL**: The app's data is stored in a MySQL database.

## Installation

To install the backend server, follow these steps:

1. Clone this repository using Git.
2. Install Java and MySQL on your computer.
3. Open the project in your preferred IDE.
4. Configure your MySQL database connection settings in the `application.properties` file.
5. Run the project by executing the `UniGoApplication.java` file.

## Usage

To use the backend server, follow these steps:

1. Ensure that the server is running by executing the `UniGoApplication.java` file.
2. Use the UniGo mobile application to interact with the backend endpoints.

## Endpoints

The following endpoints are available in the UniGo Spring Boot backend:

- `/register`: Allows users to register a new account.
- `/login`: Allows users to login to their account.
- `/getAllStudents`: Returns a list of all students in the database.
- `/getAllCourses`: Returns a list of all courses in the database.
- `/getAllSubjects`: Returns a list of all subjects in the database.
- `/getSubjects/{course_id}`: Returns a list of subjects for a specific course.
- `/getAllEvents`: Returns a list of all events in the database.
- `/getAllAnnouncements`: Returns a list of all announcements in the database.

## Contributing

Contributions are welcome! If you have any suggestions or would like to report a bug, please create an issue on the repository.
