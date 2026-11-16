# FinTech Core — Smart Banking System

An educational, console-based Java banking project demonstrating core Object-Oriented Programming (OOP) concepts through bank accounts.

## Concepts demonstrated

- **Encapsulation:** account details are kept inside the `BankAccount` class.
- **Inheritance:** `SavingsAccount` and `CurrentAccount` extend `BankAccount`.
- **Polymorphism:** `CurrentAccount` overrides `withdraw()` to apply an overdraft rule.
- **Constructors and `super`:** child account constructors initialize shared parent state.

## Current features

- Deposit with a positive-amount check.
- Withdrawal with a balance check.
- Savings interest calculation.
- Current-account overdraft demonstration.
- Account information display.

## Requirements

- JDK 8 or newer
- A terminal (or any Java IDE)

## Run from the repository root

The current source file is located at `en-In/src/Main.java`.

**Windows:**

```powershell
javac -d en-In/out en-In/src/Main.java
java -cp en-In/out Main
```

**macOS / Linux:**

```bash
mkdir -p en-In/out
javac -d en-In/out en-In/src/Main.java
java -cp en-In/out Main
```

## Current limitations

- The demo currently keeps multiple classes in one source file.
- Amounts use `int`; a real banking system should use `BigDecimal` and currency-aware rules.
- Input is demonstrated with fixed values rather than a user-driven menu.
- This is an OOP learning project, **not** a real banking or financial application.

## Planned improvements

1. Validate interest rates and overdraft limits.
2. Add automated tests for deposits, withdrawals, interest, and overdraft boundaries.
3. Split classes into separate files and adopt a conventional Java source layout.
4. Add a menu-driven interface and improve error handling.
5. Add a project-level `.gitignore` and remove generated IDE/build artifacts from version control.

## License

See the repository's license file.
