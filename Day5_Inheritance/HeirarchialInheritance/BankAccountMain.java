package Day5_Inheritance.HeirarchialInheritance;


class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
 
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
 
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

 
class FixedDepositAccount extends BankAccount {
    int durationMonths;

    FixedDepositAccount(String accountNumber, double balance, int durationMonths) {
        super(accountNumber, balance);
        this.durationMonths = durationMonths;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Duration: " + durationMonths + " months");
    }
}
 
public class BankAccountMain {
    public static void main(String[] args) {
        
        SavingsAccount savings = new SavingsAccount("SAV123", 25000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CHK456", 15000.0, 5000.0);
        FixedDepositAccount fd = new FixedDepositAccount("FD789", 100000.0, 12);

       
        System.out.println("=== Savings Account ===");
        savings.displayAccountType();

        System.out.println("\n=== Checking Account ===");
        checking.displayAccountType();

        System.out.println("\n=== Fixed Deposit Account ===");
        fd.displayAccountType();
    }
}
