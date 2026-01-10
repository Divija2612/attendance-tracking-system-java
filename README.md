# Attendance Tracking System

A Java Swing application using PostgreSQL to manage student attendance.

## Features
- Add students
- View student list
- Mark attendance (Present / Absent)
- JDBC + PostgreSQL integration

## Tech Stack
- Java (Swing)
- PostgreSQL
- JDBC

## How to Run
```bash
javac -cp ".;postgresql-42.7.8.jar" -d bin *.java
java -cp "bin;postgresql-42.7.8.jar" Main
