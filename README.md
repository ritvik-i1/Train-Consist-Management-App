# 🚆 Train Consist Management App

A console-based Java application that simulates how railway systems manage a train's consist — the arrangement of bogies attached to an engine.

---

## 📌 Overview

The **Train Consist Management App** demonstrates core Java concepts through a real-world railway scenario.
It models passenger and goods bogies, tracks capacity, ensures safety constraints, and manages train composition dynamically.

---

## ✨ Features

* 🚍 Passenger Bogies (Sleeper, AC Chair, First Class)
* 📦 Goods Bogies (Rectangular, Cylindrical)
* 🔢 Capacity Tracking (Seating & Load)
* 🔁 Dynamic Addition & Removal of Bogies
* 🔒 Duplicate Prevention using Sets
* 📊 Capacity Mapping using HashMap
* 🔃 Sorting using Comparator
* 📋 Ordered Train Formation

---

## 🧠 Concepts Covered

| Concept       | Description                  |
| ------------- | ---------------------------- |
| ArrayList     | Dynamic storage of bogies    |
| LinkedList    | Maintain train order         |
| HashSet       | Ensure unique bogie IDs      |
| LinkedHashSet | Maintain order + uniqueness  |
| HashMap       | Map bogie → capacity         |
| Comparator    | Sort bogies by capacity      |
| OOP           | Classes & objects for bogies |

---

## 🏗️ Project Structure

```
TrainConsistManagementApp/
│
├── TrainConsistManagementApp.java
├── Bogie.java
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/ritvik-i1/Train-Consist-Management-App.git
```

2. Navigate to project folder:

```bash
cd Train-Consist-Management-App
```

3. Compile the program:

```bash
javac TrainConsistManagementApp.java
```

4. Run the program:

```bash
java TrainConsistManagementApp
```

---

## 📌 Sample Output

```
=== Train Consist Management App ===

Before Sorting:
[Sleeper (72 seats), AC Chair (60 seats), First Class (40 seats)]

After Sorting:
[First Class (40 seats), AC Chair (60 seats), Sleeper (72 seats)]
```

---

## 🎯 Learning Outcomes

* Understand real-world use of Java Collections
* Learn data structure selection based on use case
* Apply object-oriented programming concepts
* Implement sorting using Comparator
* Build structured, scalable applications

---

## 🚀 Future Enhancements

* GUI using JavaFX / Swing
* Database integration (MySQL)
* REST API using Spring Boot
* Real-time train simulation

---

## 👨‍💻 Author

**Ritvik**
B.Tech CSE Student

---

## ⭐ Contribute

Feel free to fork this repo and improve it!
Pull requests are welcome 🚀

---

## 📜 License

This project is for educational purposes.
