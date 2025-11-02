# Cafe Management System ☕️

A Java-based cafe management application designed to streamline customer handling, table allocation, order processing, and bill generation. The system simulates real cafe operations using core Object-Oriented Programming (OOP) concepts and efficient data structures such as **Queue**, **LinkedList**, and **HashMap**.

---

## 🚀 Features

- ✅ **Customer Queue Management** (First Come - First Serve)
- ✅ **Table Allocation System** (Based on availability)
- ✅ **Menu Display using HashMap**
- ✅ **Order Placement & Bill Calculation**
- ✅ **Automatic Queue Update when tables are freed**

---

## 🧠 System Logic & Workflow

1. **Customer Arrival**
   - A new customer object is created and added to the queue
   - Each customer receives a unique customer number

2. **Menu Display**
   - Food items & prices are stored in a `HashMap<String, Integer>`
   - Menu is printed dynamically from the map

3. **Table Allocation**
   - Tables are stored in a `LinkedList` where each node indicates availability (`true` = empty, `false` = occupied)
   - First available table is allotted to the first customer in queue

4. **Order Taking & Billing**
   - Customer selects items from menu
   - Orders are stored in a `HashMap<String, Integer>`
   - Bill is auto-calculated based on selected items

5. **Queue Update**
   - When customer completes dining, table status is updated and queue is dequeued

---

## 🛠️ Tech Stack

| Component | Technology |
|-----------|------------|
| Language | Java |
| Concepts Used | OOP, Classes & Objects, Encapsulation |
| Data Structures | Queue, LinkedList, HashMap |
| Execution | Command Line / Terminal (Java `.class` files) |

---

## 🔮 Future Enhancements

- GUI version using JavaFX / Swing
- Database integration to store customer & order history
- Mobile app version for live café order tracking
- Add waiter login & shift management
- Print/export bills in PDF format

---
