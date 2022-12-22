public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount marsisAccount = new BankAccount(0, 0);

        marsisAccount.deposit(100, "savings");
        marsisAccount.deposit(100, "checking");
        marsisAccount.withdraw(50, "savings");
        marsisAccount.totalMoneyOfBothAccounts();
    }
}
