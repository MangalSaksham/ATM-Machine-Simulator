# 🏧 ATM Machine Simulator

A simple, console-based ATM simulator written in Java that demonstrates object-oriented design, basic authentication, account management, and transaction logging. This project is a learning exercise focused on Java, OOP principles, and algorithmic problem solving.

[![Java](https://img.shields.io/badge/Java-8%2B-orange?logo=java)](https://www.oracle.com/java/) [![Status](https://img.shields.io/badge/status-experimental-yellowgreen)]()

---

✨ Highlights
- Clean, small classes that illustrate OOP design
- In-memory account management with PIN authentication
- Deposit / Withdraw / View balance operations
- Transaction logging (in-memory) for learning purposes
- Easy to run from IntelliJ or command line

---

## Table of contents
- [Demo](#demo)
- [Features](#features)
- [Tech & tools](#tech--tools)
- [Project structure](#project-structure)
- [Quick start](#quick-start)
  - [Run in IntelliJ IDEA](#run-in-intellij-idea)
  - [Run from the command line](#run-from-the-command-line)
- [Example usage (sample session)](#example-usage-sample-session)
- [Design notes](#design-notes)
- [Extend & ideas](#extend--ideas)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## Demo
A lightweight inline demo (SVG) showing a short animated sequence of the app's console interaction.

![demo](demo/demo.svg)

---

## Features
- 🔒 PIN-based authentication  
- 💰 Balance check, deposit and withdrawal operations  
- 🧾 Transaction tracking (in-memory list)  
- ✅ Input validation and basic error handling  
- 🧩 Small, single-responsibility classes to make the flow easy to follow

---

## Tech & tools
- Java (core)  
- IntelliJ IDEA (recommended for development)  
- Plain Java — no external frameworks

---

## Project structure
Source files are under:
```
src/com/ATMproject/
  ├─ ATM.java                # Account model
  ├─ AtmOperationInterf.java # Operations interface
  ├─ AtmOperationImpl.java   # Implementation of operations
  └─ MainClass.java          # Console entry point
```

Note: `out/` is used by IntelliJ for compiled classes and is ignored by Git.

---

## Quick start

### Run in IntelliJ IDEA (recommended)
1. Open IntelliJ → File → Open... → choose this project folder.  
2. Configure Project SDK if required (File → Project Structure → Project SDK).  
3. Right-click `MainClass` → Run `MainClass.main()` to start the console app.

### Run from the command line
1. Clone the repo:
```bash
git clone https://github.com/MangalSaksham/ATM-Machine-Simulator.git
cd ATM-Machine-Simulator
```

2. Compile the sources:
```bash
javac -d out src/com/ATMproject/*.java
```

3. Run the app:
```bash
java -cp out com.ATMproject.MainClass
```

---

## Example usage (sample session)
```
Welcome to Simple ATM Simulator 🏧
Enter account PIN: 1234
1. View Balance
2. Deposit
3. Withdraw
4. View Transactions
5. Exit
Choose an option: 1

Current Balance: 5000.0

Choose an option: 3
Enter amount to withdraw: 1500
Collect the Cash 1500.0
Transaction recorded: Amount Withdrawn - 1500.0

Choose an option: 4
Transactions:
1. Amount Withdrawn - 1500.0
```

---

## Design notes
- The project uses a simple in-memory model (no DB) to keep the code readable and focused on OOP concepts.  
- Interface `AtmOperationInterf` decouples the contract from its implementation `AtmOperationImpl`.  
- `MainClass` handles I/O and orchestrates calls to the ATM operations — an opportunity to extract a controller/service later when adding tests or persistence.

---

## Extend & ideas
- 🗄️ Add file-based or embedded DB persistence (H2 / SQLite)  
- 🧪 Add unit tests (JUnit)  
- 🔐 Add PIN retry limits & account lockout  
- 🖼️ Create a simple GUI (JavaFX) or a web frontend (Spring Boot)  
- 📦 Convert to Maven/Gradle for builds & CI integration  
- ⚙️ Add GitHub Actions to compile and run tests on push

---

## Contributing
Contributions are welcome! Suggested workflow:
1. Fork the repo  
2. Create a feature branch: `git checkout -b feat/my-change`  
3. Make small, focused commits  
4. Open a pull request describing your change

Please add tests where applicable.

---

## License
This project is not currently licensed.

---

## Contact
- Author: Saksham Mangal  
- LinkedIn: https://www.linkedin.com/in/saksham-mangal  
- Repo: https://github.com/MangalSaksham/ATM-Machine-Simulator

---

If you confirm which option to use, I will proceed.
