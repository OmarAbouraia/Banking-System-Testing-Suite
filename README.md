# 🏦 Banking System Testing Suite
![Java](https://img.shields.io/badge/Language-Java-blue)
![JUnit](https://img.shields.io/badge/Testing-JUnit4-green)
![Status](https://img.shields.io/badge/Project-Completed-brightgreen)
![Coverage](https://img.shields.io/badge/Coverage-100%25-success)

This project demonstrates the application of multiple software testing techniques on a simplified banking system. It was developed as part of the Software Testing, Validation, and Verification course.

## 📌 Overview
The system under test includes:
- Client account management
- Deposit and withdrawal operations
- State-based account transitions (Verified, Suspended, Closed)
- GUI interaction simulation

The project focuses on validating system correctness and reliability using structured testing methodologies.

---

## 🧪 Testing Techniques Applied

### 🔹 Black-Box Testing
- Equivalence Partitioning
- Boundary Value Analysis
- Validation of valid/invalid inputs

### 🔹 White-Box Testing
- Control Flow Graphs (CFG)
- 100% Branch Coverage
- Unit testing using JUnit

### 🔹 State-Based Testing
- Account lifecycle validation
- State transition matrix
- Illegal action handling

### 🔹 UI Testing
- Input validation checks
- Button enable/disable behavior
- Status label correctness

### 🔹 Integration Testing
- Simulated flow: GUI → Controller → Service → Account
- Validation of system interaction

### 🔹 Test-Driven Development (TDD)
- Implemented feature: **Credit Score Eligibility**
- Followed Red → Green → Refactor cycle

---
## 📸 Screenshots

### ⚠️ Test Cases Example
![Black Box Test Cases](Screenshots/BlackBoxTestCases.png)
![Integration Test Cases](Screenshots/IntegrationTestCases.png)
![State Based Test Cases](Screenshots/StateBasedTestCases.png)

### ✅ JUnit Test Execution
![JUnit](Screenshots/junit.png)

---

## 🛠️ Technologies Used
- Java
- JUnit 4
- Manual Testing Techniques
- Basic GUI Simulation (HTML / Mockups)

---


## ▶️ How to Run

1. Clone the repository:
```bash
git clone https://github.com/OmarAbouraia/banking-system-testing-suite.git
```

2. Open the project in IntelliJ or Eclipse

3. Run JUnit tests:
- Run `AccountTest.java`
- View test results and coverage

---
## 🧪 Sample Test Case

```java
@Test
public void testWithdraw_ValidAmount() {
    Account acc = new Account(100, "Verified");
    assertTrue(acc.withdraw(50));
}
```


## 📊 Key Achievements
- Achieved **100% branch coverage** for core methods
- Designed comprehensive test cases across multiple testing types
- Implemented TDD for new feature development
- Built structured test documentation and traceability matrix

---

## 🎯 Why This Project Matters

This project demonstrates my ability to:
- Design structured and comprehensive test cases
- Apply multiple testing methodologies in real scenarios
- Ensure software reliability through systematic validation
- Work with test automation tools like JUnit
- Think like a QA engineer and a developer simultaneously
  
---

## 🧠 Key Learnings

- Importance of combining multiple testing strategies
- How state-based systems affect application behavior
- Writing testable and maintainable code
- Applying Test-Driven Development (TDD) in practice
- Understanding edge cases and system limitations
---

👥 Team Members
1- Omar Ahmed Abou Raia
2- Hossam Ossama Hussieny
3- Mariam Ibrahim Assar
4- Mariam Tarek Farouk
5- Hassan Sherif
6- Habiba El-Sabaa Ali

---
## 📄 Documentation
The full project report is available in:
```
/Testing_Report.pdf
```

---

## 🚀 Notes
- This project focuses on correctness and validation, not performance or security.
- Integration testing is simulated due to system constraints.
---

⭐ Support
If you found this project helpful, consider giving it a star ⭐ on GitHub!
