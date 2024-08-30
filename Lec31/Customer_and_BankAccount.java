package Lec31;
public class Customer_and_BankAccount {
    class Customer {
        private int ID;
        private String name;
        private char gender;

        // Constructor
        public Customer(int ID, String name, char gender) {
            this.ID = ID;
            this.name = name;
            this.gender = gender;
        }

        // Getters
        public int getID() {
            return ID;
        }

        public String getName() {
            return name;
        }

        public char getGender() {
            return gender;
        }

        // toString method
        @Override
        public String toString() {
            return name + "(" + ID + ")";
        }
    }

    class BankAccount {
        private int ID;
        private Customer customer;
        private double balance;

        // Constructor
        public BankAccount(int ID, Customer customer, double balance) {
            this.ID = ID;
            this.customer = customer;
            this.balance = balance;
        }

        // Getters
        public int getID() {
            return ID;
        }

        public Customer getCustomer() {
            return customer;
        }

        public double getBalance() {
            return balance;
        }

        // Setter for balance
        public void setBalance(double balance) {
            this.balance = balance;
        }

        // Method to deposit money
        public void deposit(double amt) {
            if (amt > 0) {
                balance += amt;
                // System.out.println("Deposited: INR " + amt);
            } else {
                // System.out.println("Deposit amount must be positive.");
            }
        }

        // Method to withdraw money
        public void withdraw(double amt) {
            if (amt > 0 && amt <= balance) {
                balance -= amt;
                //  System.out.println("Withdrew: INR " + amt);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        // toString method
        @Override
        public String toString() {
            return customer.toString() + " balance=INR " + String.format("%.2f", balance);
    }
    }
}
