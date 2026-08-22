# Assignment 1 – OOP (BIT1123 Object Oriented Programming)

## Assignment Title
**Assignment 1 – Individual (20%)**
BIT1123 – Object Oriented Programming

## Student Information
| Field | Details |
|---|---|
| **Student Name** | Ahmed Mohammed Fadul Mohammed |
| **Student ID** | 202401010432 |

## Course Information
| Field | Details |
|---|---|
| **Course Code** | BIT1123 |
| **Course Name** | Object Oriented Programming |
| **Faculty** | Faculty of Information Technology |
| **University** | City University Malaysia – Cyberjaya Campus |
| **Lecturer** | Sir Nazmirul Izzad Bin Nassir |

## 📖 Brief Course Description
BIT1123 Object Oriented Programming introduces the fundamental principles of object-oriented software design and development using Java. The course covers core OOP concepts including classes and objects, encapsulation, inheritance, polymorphism, and abstraction, alongside practical skills such as user input handling, GUI development with Java Swing, and industry-standard version control using Git and GitHub. This repository consolidates all weekly tutorial work completed throughout the semester into a single, organized portfolio.

## Repository Structure
```
AHMED-MOHAMMED-FADUL-MOHAMMED-202401010432-JAVA-PROGRAMMING/
│
├── README.md
├── myreport.pdf              # Self-reflective report
├── LICENSE
│
├── week_1/                   # Java basics & conditionals
│   ├── Hello.java
│   └── StudentGrade.java
│
├── week_2/                   # Introduction to classes & objects
│   ├── Student.java
│   └── main.java
│
├── week_3-4/                 # Inheritance & polymorphism
│   ├── Person.java
│   ├── Student.java
│   ├── Lecturer.java
│   └── Main.java
│
├── week_5/                   # Encapsulation & documentation
│   ├── Student.java
│   ├── Main.java
│   └── Documentation.txt
│
├── week_6/                   # Inheritance & polymorphism (continued)
│   ├── Employee.java
│   ├── Lecturer.java
│   └── Main.java
│
├── week_7/                   # Abstraction & abstract classes
│   ├── Appliance.java
│   ├── WashingMachine.java
│   ├── Refrigerator.java
│   └── Main.java
│
├── week_8-9/                 # Applied OOP task
│   ├── Main.java
│   └── task.txt
│
└── week_10/                  # GUI programming with Java Swing
    ├── QuizBattleGUI.java
    └── Questions.java
```

## Tutorial Summary (Week 1–10)

| Week | Topic | Description |
|---|---|---|
| **Week 1** | Java Fundamentals | Introduction to Java syntax, `System.out.println`, the `Scanner` class for user input, and conditional statements — implemented through a simple "Hello World" program and a student grade calculator. |
| **Week 2** | Classes & Objects | Introduction to defining a `Student` class with fields and methods, and creating/using objects from a separate `main` class. |
| **Week 3–4** | Inheritance & Polymorphism | Designing a `Person` superclass and extending it with `Student` and `Lecturer` subclasses; overriding methods (e.g. `introduce()`) to demonstrate runtime polymorphism, alongside encapsulated (private, final) fields. |
| **Week 5** | Encapsulation & Documentation | Refining the `Student` class with private fields, getters/setters, and proper code documentation practices (`Documentation.txt`). |
| **Week 6** | Inheritance & Polymorphism (Continued) | Extending the class hierarchy with `Employee` and `Lecturer` classes to further practice inheritance relationships and method overriding. |
| **Week 7** | Abstraction | Creating an `abstract class Appliance` with an abstract `operate()` method, implemented differently by `WashingMachine` and `Refrigerator` subclasses. |
| **Week 8–9** | Applied OOP Task | A consolidated task applying the OOP concepts learned so far (classes, inheritance, encapsulation, abstraction) to a practical exercise. |
| **Week 10** | GUI Programming (Java Swing) | Building an interactive **Quiz Battle** application using `javax.swing` and `java.awt`, with `QuizBattleGUI` extending `JFrame` and a supporting `Questions` class — integrating OOP design with event-driven GUI programming. |

## Technologies Used
- **Java (JDK)** – Core programming language
- **Java Swing / AWT** – Graphical User Interface development (Week 10)
- **Git & GitHub** – Version control and repository management
- **Command Line / IDE** (Github Codespace, VScode & bash terminal) – Writing, compiling, and running Java programs

## How to Run the Projects
1. **Clone the repository**
   ```bash
   git clone https://github.com/DevFadul/AHMED-MOHAMMED-FADUL-MOHAMMED-202401010432-JAVA-PROGRAMMING.git
   cd AHMED-MOHAMMED-FADUL-MOHAMMED-202401010432-JAVA-PROGRAMMING
   ```
2. **Navigate to the desired week's folder**
   ```bash
   cd week_1
   ```
3. **Compile the Java file(s)**
   ```bash
   java *filename*
   ```
4. **Run the program** (replace `ClassName` with the file containing the `main` method, e.g. `Hello`, `StudentGrade`, `Main`, or `QuizBattleGUI`)
   ```bash
   java ClassName
   ```
   > For **Week 10**, run `java QuizBattleGUI` to launch the graphical Quiz Battle application.

## Reflection Summary
This assignment provided hands-on experience in applying core Object-Oriented Programming concepts in Java — from basic syntax and conditionals in Week 1, through classes, encapsulation, inheritance, and polymorphism, to abstraction and GUI development with Java Swing in later weeks. Beyond the programming concepts themselves, the process of organizing all tutorial work into a single, well-structured GitHub repository reinforced good software development practices such as version control, consistent project structure, and clear documentation. The full self-reflective report, including challenges faced and lessons learned.

---
