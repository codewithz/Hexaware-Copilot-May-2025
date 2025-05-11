# 💡 Copilot Prompt Suggestions – University Course Registration Project

Use the following prompts to guide GitHub Copilot in helping you complete the project in either **Java with JDBC** or **JavaScript with MySQL**. Try them in your code files or Copilot Chat for best results.

---

## 🛠️ 1. SQL Schema & Data (Common)

```
Create a MySQL table named students with columns id (auto-increment), name, and email
Create a table named courses with id, course_name, and description
Create a table registrations with student_id and course_id as foreign keys
Insert sample data into students and courses
Write a SELECT query to list all courses a student is registered for
Write a JOIN query to list students in a particular course
```

---

## 💻 2. Java (JDBC) Prompts

```
Connect to a MySQL database using JDBC
Create a method to insert a student into the students table
Write a method to fetch all courses a student is registered for using JOIN
Use PreparedStatement to avoid SQL injection in insert queries
Create a utility method to return a database connection object
Build a CLI menu to add students and register them to courses
Catch and print SQLException for any failed queries
```

---

## 💻 3. JavaScript (Node.js + mysql2) Prompts

```
Connect to MySQL using mysql2 in Node.js
Write an async function to insert a course into the database
Create a function to list all students in a course using a JOIN query
Use readline module to create CLI menu in Node.js
Write a query to delete a student by ID
Add try-catch blocks for error handling in MySQL queries
```

---

## 🧪 4. Debug, Explain, and Fix (Use Copilot Chat)

```
Explain this SQL JOIN query
Fix this SQL syntax error
Why is this PreparedStatement throwing an error?
Refactor this JDBC code to use try-with-resources
Optimize this Node.js MySQL connection code
```

---

## 🎯 5. Bonus Feature Prompts

```
Write a method to export registrations to a CSV file
Add search functionality by student name or course name
Validate that email format is correct before inserting
Write a SQL query to get courses registered in the last 7 days
```

---

🎓 Use these prompts as training wheels while developing your own prompt intuition. Explore, debug, and ask Copilot for help like a coding assistant!