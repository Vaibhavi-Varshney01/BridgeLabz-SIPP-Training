package Day2_ConstructorsAccessModifiers;
public class Bank {

    
    static class BankAccount {
        public String accountNumber;       
        protected String accountHolder;    
        private double balance;            

        
        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        
        public double getBalance() {
            return balance;
        }

        
        public void setBalance(double newBalance) {
            if (newBalance >= 0) {
                this.balance = newBalance;
            } else {
                System.out.println("❌ Invalid balance. Cannot be negative.");
            }
        }
 
        public void displayAccountInfo() {
            System.out.println("\n--- Bank Account Info ---");
            System.out.println("Account Number  : " + accountNumber);
            System.out.println("Account Holder  : " + accountHolder);
            System.out.println("Balance         : ₹" + balance);
        }
    }

    static class SavingsAccount extends BankAccount {

        private double interestRate;

        public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
            super(accountNumber, accountHolder, balance);
            this.interestRate = interestRate;
        }

        public void displaySavingsInfo() {
            System.out.println("\n--- Savings Account Info ---");
            System.out.println("Account Number  : " + accountNumber);   // public
            System.out.println("Account Holder  : " + accountHolder);  // protected
            System.out.println("Balance         : ₹" + getBalance());  // private (access via getter)
            System.out.println("Interest Rate   : " + interestRate + "%");
        }
    }

   
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount("ACC12345", "Vaibhavi", 10000);
        b1.displayAccountInfo();

        
        b1.setBalance(12000);
        System.out.println("Updated Balance: ₹" + b1.getBalance());
 
        SavingsAccount sa = new SavingsAccount("SAV67890", "Aryan", 15000, 3.5);
        sa.displaySavingsInfo();
    }
}
