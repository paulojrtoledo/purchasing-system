# 🛒 Credit Card Purchasing System

A Java-based credit card purchasing system developed as part of the One - Oracle Next Education program challenge. This application demonstrates core Object-Oriented Programming principles and Java Collections Framework usage.

## 🚀 Features

- **Credit Card Management**: Set credit limits and track balances
- **Purchase Processing**: Add purchases with descriptions and values
- **Balance Validation**: Real-time balance checking before transactions
- **Automatic Sorting**: Purchases automatically sorted by value using Comparable interface
- **Clean Architecture**: Proper separation of concerns with dedicated classes

## 🛠️ Technologies Used

- **Java** - Core programming language
- **Collections Framework** - ArrayList, List interfaces
- **OOP Principles** - Encapsulation, Polymorphism, Inheritance
- **Comparable Interface** - For custom object sorting
- **Git** - Version control

## 📁 Project Structure

src/
├── CreditCard.java # Manages credit card operations and balance
├── Purchase.java # Represents individual purchases (implements Comparable)
└── Main.java # Application entry point and user interface


## 🎯 Key Learning Objectives

This project demonstrates:
- **ArrayList manipulation** with add, get, and size methods
- **Custom object sorting** using Comparable interface
- **Encapsulation** with private fields and public methods
- **Clean code architecture** with separated concerns
- **Polymorphism** through List interface usage

## 📋 How to Run

1. **Compile the project**:
   ```bash
   javac src/*.java
   java src/Main

   Follow the menu prompts to:

Set your credit card limit
Add purchases with descriptions and values
View sorted purchase history
Monitor remaining balance

💡 Technical Highlights
Comparable Implementation
java
@Override
public int compareTo(Purchase otherPurchase) {
    return Double.compare(this.value, otherPurchase.value);
}

Encapsulation Example
java
public class CreditCard {
    private double limit;
    private double balance;
    private List<Purchase> purchases;
    
    // Business logic encapsulated within class
    public boolean launchPurchase(Purchase purchase) {
        if (this.balance >= purchase.getValue()) {
            this.balance -= purchase.getValue();
            this.purchases.add(purchase);
            return true;
        }
        return false;
    }
}

🎓 Educational Value
This project was developed to solidify understanding of:

Java Collections Framework
Object-Oriented Design principles
Interface implementation (Comparable)
List operations and sorting algorithms
Professional code organization

📝 License
This project was developed as part of the One - Oracle Next Education program for educational purposes.

Developer: Paulo Emilio de Toledo Jr
Program: One - Oracle Next Education
Focus: Java Backend Development

This README:
- ✅ **Professional presentation** in English
- ✅ **Highlights technical skills** learned
- ✅ **Clear structure** for recruiters to understand
- ✅ **Code examples** showing key implementations
- ✅ **Educational context** for the project
- ✅ **Ready for your portfolio** and LinkedIn

