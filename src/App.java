import src.BankAccountJonah;
import src.FixedDepositAccountJonah;

public class App{
    public static void main(String[] args){
        BankAccountJonah fredAccount = new BankAccountJonah("fred");
        fredAccount.deposit(102.05f);
        System.out.println("The account balance is " + fredAccount.getAccountBalance());

        fredAccount.deposit(302.05f);
        System.out.println("The account balance is " + fredAccount.getAccountBalance());
        System.out.println(fredAccount.getTransactions());

        FixedDepositAccountJonah amyAccount = new FixedDepositAccountJonah("Amy",1000200.0f,3.0f);
        amyAccount.deposit(10000);
        amyAccount.withdraw(10);
        amyAccount.getAccountBalance();

    }











}