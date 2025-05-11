# 🧪 Task: Policy Premium Calculator – Service Layer Design 

## 🏢 Background

Code With Z Inc. works with enterprise clients in domains like **insurance, healthcare, and finance**. In many systems, they compute **insurance premiums** based on user profile data and plan options.

---

## 🎯 Objective

Implement a **service layer** and **model class** to calculate the insurance premium. You will also write a **unit test** to validate your logic.

---

## ✅ Requirements

### 1. Model Class – `CustomerPolicyRequest`

Create a class with the following fields:

- `String customerName`
- `int age`
- `String planType` – values: `BASIC`, `STANDARD`, `PREMIUM`
- `boolean isSmoker`

---

### 2. Service Class – `PremiumCalculatorService`

Implement the method:

```java
double calculatePremium(CustomerPolicyRequest request);
```

### 💡 Premium Calculation Rules:

- **BASIC** → ₹5,000 base
- **STANDARD** → ₹8,000 base
- **PREMIUM** → ₹12,000 base
- If `isSmoker == true`, add **20%**
- If `age > 50`, add **10% surcharge**

👉 Use enums and clean code practices.

---

### 3. Unit Test – `PremiumCalculatorServiceTest`

Write test cases using **JUnit 5** to verify:

- Young non-smoker with BASIC plan
- Smoker aged 55 with PREMIUM plan
- Invalid plan type throws `IllegalArgumentException`

---

## ❌ Constraints

- Do **not** create a database or controller
- Focus only on: **Model**, **Service**, and **Test**

---

## 🤖 Suggested Copilot Prompts

In `PremiumCalculatorService.java`:
```java
// Calculate premium based on age, plan, and smoker status
```

In `PremiumCalculatorServiceTest.java`:
```java
// Write test for calculatePremium with age 55 and smoker true
```

---

## 📦 Deliverables

- `CustomerPolicyRequest.java`
- `PremiumCalculatorService.java`
- `PremiumCalculatorServiceTest.java`

---

🎯 This task is designed to reinforce clean service layer design, business logic implementation, and test-first development.