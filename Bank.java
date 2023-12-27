import java.util.Scanner;

class BankAccount {
    int balance;
    int withdraw;
    int initialBalance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
        this.initialBalance = initialBalance;
    }

    public void deposit() {
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter the deposit amount:");
        int deposit = dc.nextInt();
        balance += deposit;
        System.out.println("Deposited amount is " + deposit);
        dc.close();
    }

    public void withdraw() {
        Scanner wc = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount:");
        // int withdraw = wc.nextInt();
        wc.close();
    }

    public int getBalance() {
        return balance;
    }

    public int getInitialBalance() {
        return initialBalance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int initialBalance) {
        super(initialBalance);
    }

    public void withdraw() {
        Scanner wc = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount:");
        // int withdraw = wc.nextInt();
        wc.close();
        if (super.getBalance() <= 1000) {
            System.out.println("You cannot Withdraw");
        } else {
           System.out.println("You can Withdraw");
        }
    }
}

class Bank {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(30);
        account.deposit();
        account.withdraw();
        System.out.println("Initial balance: " + account.getInitialBalance());
        System.out.println("Current balance: " + account.getBalance());
    }
}
