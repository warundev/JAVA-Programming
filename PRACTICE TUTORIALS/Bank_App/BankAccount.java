//------: Bank App Programme : --------

class BankAccount {
    String accHolderName;
    double balance;
    double minimumBalance = 500;
    double annualInterest;

    BankAccount() {
        this.accHolderName = null;
        this.balance = 0;
        this.annualInterest = 0;
    }

    BankAccount(String name, double newBalance) {
        this.accHolderName = name;
        this.balance = newBalance;
        this.annualInterest = 0;
    }

    void checkDeposit(double initialDeposit) {
        if (initialDeposit < minimumBalance) {
            System.out.println("Please Deposit more Money..!");
        }
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    double withdraw(double amount) {
        if (balance < amount + minimumBalance) {
            System.out.println("Error: Insufficient balance.");
            return 0;
        } else {
            balance = balance - amount;
            return amount;
        }
    }

    void checkBalance() {
        System.out.println("Account holder name: " + accHolderName);
        System.out.println("Balance: " + balance);
    }

}

class SavingsAccount extends BankAccount {
    SavingsAccount(String name, double newBalance) {
        super(name, newBalance);
    }

    @Override
    void checkBalance() {
        System.out.println("\nThis is a savings account..!\n");
        super.checkBalance();
    }

}

class BankApp {
    public static void main(String[] args) {
        SavingsAccount A1 = new SavingsAccount(" WARUNA ", 45000);

        SavingsAccount A2 = new SavingsAccount(" CHIRANTHA ", 25000);

        A1.deposit(5000);
        A1.checkBalance();
        A1.withdraw(800);
        A1.checkBalance();

        System.out.println("\n-------------------------\n");

        A2.deposit(8000);
        A2.checkBalance();
        A2.withdraw(10000);
        A2.checkBalance();

        System.out.println("\nThank You, Have a nice day...!");
    }

}

// OutPut:--
/*
 * This is a savings account..!
 * 
 * Account holder name: WARUNA
 * Balance: 50000.0
 * 
 * This is a savings account..!
 * 
 * Account holder name: WARUNA
 * Balance: 49200.0
 * 
 * -------------------------
 * 
 * 
 * This is a savings account..!
 * 
 * Account holder name: CHIRANTHA
 * Balance: 33000.0
 * 
 * This is a savings account..!
 * 
 * Account holder name: CHIRANTHA
 * Balance: 23000.0
 * 
 * Thank You, Have a nice day...!
 */