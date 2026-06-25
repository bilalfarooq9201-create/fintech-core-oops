# 🏦 FinTech Core - Smart Banking System

A robust console-based Banking Application built in **Java** to practically demonstrate the core pillars of Object-Oriented Programming (OOP): **Encapsulation** and **Inheritance**.

---

## 🛠️ OOPs Concepts Demonstrated

### 1. Encapsulation (Data Security)
- Sensitive data fields like `accountNumber`, `accountHolderName`, and `balance` are secured inside the `BankAccount` class using appropriate access modifiers (`private`/`protected`).
- Input validation logic is enforced in methods (e.g., preventing negative deposits or overdraft abuse).

### 2. Inheritance & Polymorphism (Code Reusability)
- **`SavingsAccount`** inherits from `BankAccount` and extends functionality by introducing an interest calculation module (`addInterest`).
- **`CurrentAccount`** inherits from `BankAccount` and overrides the `withdraw()` method to implement a real-world **Overdraft Facility**.

---

## 🚀 How to Run

1. Clone the repository:
```bash
   git clone [https://github.com/bilalfarooq9201-create/fintech-core-oops.git](https://github.com/bilalfarooq9201-create/fintech-core-oops.git)
