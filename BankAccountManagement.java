
import java.util.ArrayList;

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in " + accountNumber);
        }
    }

    public void display() {
        System.out.println("Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public void displayAllAccounts() {
        for (Account acc : accounts) {
            acc.display();
        }
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("Peter Irmgard", "C0011", 5000.0);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500.0);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        System.out.println("Initial Account Details:");
        bank.displayAllAccounts();

        System.out.println();
        System.out.println("After depositing 1000 into account1:");
        account1.deposit(1000);
        account1.display();

        System.out.println("No transaction in account2:");
        account2.display();

        System.out.println("After withdrawing 5000 from account3:");
        account3.withdraw(5000);
        account3.display();
    }
}
