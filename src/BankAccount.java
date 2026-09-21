/* Skriv en klasse til at håndtere bankkonti */

double balance = 1000;

void main() {
    withdraw(1200);
    deposit(100);
    IO.println(balance);
}

void withdraw(double amount) {
    balance = balance - amount;
}

void deposit(double amount) {
    balance = balance + amount;
}

public class BankAccount {
    final int accountNumber;
    double balance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
}