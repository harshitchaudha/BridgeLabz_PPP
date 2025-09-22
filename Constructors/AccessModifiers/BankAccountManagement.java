package Constructors.AccessModifiers;
class BankAccountManagement {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccountManagement(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccountManagement {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    public void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("101A", "Kavita", 15000.0);
        sa.showAccountDetails();
        System.out.println("Balance: " + sa.getBalance());
        sa.setBalance(16000.0);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
