# 📘 Project: University Course Registration System (with GitHub Copilot)

## 🎯 Objective

Build a mini application to manage **students**, **courses**, and **registrations** using **MySQL** as the backend. Use **GitHub Copilot** to:

- Generate SQL queries and schema
- Implement code to interact with the database
- Perform basic CRUD operations

---

## ✅ Database Design (3 Tables)

### 1. `students`
- `id` (INT, Primary Key)
- `name` (VARCHAR)
- `email` (VARCHAR)

### 2. `courses`
- `id` (INT, Primary Key)
- `course_name` (VARCHAR)
- `description` (TEXT)

### 3. `registrations`
- `id` (INT, Primary Key)
- `student_id` (INT, Foreign Key → students.id)
- `course_id` (INT, Foreign Key → courses.id)
- `registered_on` (DATE)

---

## 🧩 Task Flow

1. **Use Copilot to Generate SQL Queries**
   - `CREATE TABLE`, `INSERT`, `SELECT`, `UPDATE`, `DELETE`
   - Save them in a `schema.sql` file

2. **Choose One of Two Languages**:
   - **Java** with JDBC
   - **JavaScript** with Node.js (`mysql2` or `mysql` package)

3. **Use Copilot to Write Code**
   - Establish DB connection
   - Implement CRUD for each table
   - Create queries to:
     - Show all courses a student is registered for
     - Show all students in a course

4. **Optional UI**
   - Console menu (Java)
   - Prompt-based CLI (Node.js)

---

## 💻 Java (JDBC) Implementation Tips

- Use `mysql-connector-java` in your project
- Use `Connection`, `Statement`, and `PreparedStatement`
- Ask Copilot:
  - "Connect to MySQL using JDBC"
  - "Insert student into students table"

---

## 💻 Node.js Implementation Tips

- Use `mysql2` or `mysql` package
- Create functions to execute queries
- Ask Copilot:
  - "Connect to MySQL using mysql2 in Node.js"
  - "Select all students in a course"

---

## 🧠 Use Copilot Chat for Help

Try:
- "Fix this SQL syntax error"
- "Explain why this PreparedStatement throws an error"
- "Write a SELECT query joining students and courses"
- "Generate a table of all students registered in a course"

---

## 🧪 Deliverables

- `schema.sql`
- `Main.java` or `app.js`
- Sample query results printed in the console

---

## 🔁 Bonus Features

- Add search filters by student name or course
- Export results to a CSV file
- Add basic validation or input checks

---

🎓 **Use this project to practice Copilot prompting, SQL integration, and full-stack development with database interaction!**