public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;

    private static int numberOfAccounts = 0;
    private static int totalOfMoney = 0;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        accountNumber = generateAccountNumber();
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double money, String bankAccount){
        if (bankAccount == "checking"){
            checkingBalance += money;
            System.out.println("your " + money + " dollars deposit at checking was done successfully. Your balance is: " + checkingBalance);
        }
        else if(bankAccount == "savings"){
            savingsBalance += money;
            System.out.println("your " + money + " dollars deposit at savings was done successfully. Your balance is: " + savingsBalance);
        }
        else {
            System.out.println("you dont have a bank account");
            return;
        }

        totalOfMoney += money;
    }

    public void withdraw(double money, String bankAccount){
        if (bankAccount == "checking" && money <= checkingBalance){
            checkingBalance -= money;
            System.out.println("your " + money + " dollars withdraw from checking was done successfully. Your balance is: " + checkingBalance);
        }
        else if(bankAccount == "savings" && money <= savingsBalance){
            savingsBalance -= money;
            System.out.println("your " + money + " dollars withdraw from checking was done successfully. Your balance is: " + savingsBalance);
        }
        else {
            System.out.println("you are broke asf");
            return;
        }
        totalOfMoney -= money;
    }

    public void totalMoneyOfBothAccounts(){
        double total = checkingBalance + savingsBalance;
        System.out.println("Your total balance on both accounts is: " + total);
    }

    private long generateAccountNumber(){
        return (long)(Math.random() * 9000000000L + 1000000000);
    }
}
