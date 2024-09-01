# Banking_System
This Java program implements a simple banking system that allows users to interact with two types of bank accounts: a savings account and a checking account. The system is designed using interfaces and classes, following object-oriented principles.

At the core, the BankAccount interface defines three methods: deposit(), withdraw(), and getBalance(). These methods are implemented by the SavingsAccount and CheckingAccount classes. Each account maintains its own balance, and the methods allow for depositing, withdrawing, and checking the account balance.

The program also features a BankCustomer class that represents a customer who can hold both a savings and a checking account. When a new BankCustomer is created, it initializes separate instances of SavingsAccount and CheckingAccount. The customer can deposit money into or withdraw money from either account by calling the relevant methods of the respective account type.

In the Main class, the program prompts the user to input the customer's name and proceed to deposit or withdraw funds from both accounts. It uses a Scanner object to take user inputs for the amounts to deposit and withdraw from the savings and checking accounts. After performing these operations, it prints out the current balance for both accounts.

The SavingsAccount and CheckingAccount classes check if the user has sufficient funds before allowing a withdrawal, ensuring that negative balances are avoided. If the balance is insufficient, the program prints an error message.

Overall, this program demonstrates basic banking operations and object-oriented principles like inheritance and encapsulation, making it easy to expand for further banking functionalities.
