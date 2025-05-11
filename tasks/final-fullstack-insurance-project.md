# 🚀 Final Project: Full-Stack Insurance Premium Calculator (Spring Boot + React + Copilot)

## 🎯 Objective

Build a complete full-stack application that calculates insurance premiums based on user inputs. Use **Spring Boot (Java)** for the backend and **React (JavaScript)** for the frontend. You must use **GitHub Copilot** to assist in generating:

- SQL schema
- JPA models
- Services & Controllers
- Unit and Integration Tests
- Swagger/OpenAPI documentation
- React components and HTTP integration

---

## 🧩 System Overview

The system should allow users to input details such as name, age, plan type, and smoker status. The backend will calculate the insurance premium and return the result to the frontend.

---

## 🗃️ Database Tables (Use Copilot to Generate `schema.sql`)

### 1. `customers`
- `id` (Primary Key)
- `name` (String)
- `age` (int)
- `smoker` (boolean)

### 2. `plans`
- `id` (Primary Key)
- `name` (Enum: BASIC, STANDARD, PREMIUM)
- `base_premium` (double)

### 3. `premium_calculations`
- `id` (Primary Key)
- `customer_id` (Foreign Key)
- `plan_id` (Foreign Key)
- `calculated_premium` (double)
- `calculated_on` (timestamp)

---

## 🛠️ Backend Task Flow (Spring Boot)

### ✅ Step 1: Generate Entities Using Copilot
> Use comments like:
// Generate entity class for Customer with fields: id, name, age, smoker

- `Customer.java`
- `Plan.java`
- `PremiumCalculation.java`

### ✅ Step 2: Create Repository Interfaces
> Use Spring Data JPA `JpaRepository` for each entity.

### ✅ Step 3: Write Service Layer
- `PremiumCalculatorService.java`
- Implement premium logic: 
  - Add 20% if smoker
  - Add 10% if age > 50
  - Base premium comes from `plans` table

### ✅ Step 4: Create REST Controller
- Endpoints:
  - `POST /api/calculate-premium` – accepts customer + plan info and returns premium
  - `GET /api/calculations` – returns all past calculations

### ✅ Step 5: Write Unit Tests Using JUnit 5
> Prompt Copilot:
// Write a unit test for PremiumCalculatorService with age > 50 and smoker = true

### ✅ Step 6: Add Swagger Documentation
> Prompt Copilot:
// Add Swagger/OpenAPI annotations to this controller

---

## 💻 Frontend Task Flow (React + Axios)

### ✅ Step 1: Create React Project
- Use `create-react-app` or Vite

### ✅ Step 2: Build Form Component
- Inputs: Name, Age, Smoker (checkbox), Plan (dropdown)
> Prompt Copilot:
// Create a form to collect insurance inputs and send them via Axios

### ✅ Step 3: Send POST Request to Backend
- Use Axios to send data to `/api/calculate-premium`
- Display calculated premium on the screen

### ✅ Step 4: Show All Calculations
- Use a table or card layout to show past premium calculations

---

## 🧠 Prompts to Use with Copilot

- `// Generate a JPA entity for Customer`
- `// Write a REST controller for calculating premiums`
- `// Write Swagger docs for this endpoint`
- `// Create a React component to submit insurance form`
- `// Use Axios to send POST request to /api/calculate-premium`

---

## ✅ Deliverables

- `schema.sql`
- Spring Boot project with:
  - Models, Repositories, Services, Controllers
  - Tests and Swagger UI
- React app with:
  - Form, HTTP integration, Result display
- Use Copilot to generate, refactor, and test your code.

---

🏁 **Goal:** Practice full-stack development with AI pair programming using Copilot. Push clean, tested, documented code — from DB to browser.