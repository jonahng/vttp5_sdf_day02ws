import src.BankAccountJonah;

public class App{
    public static void main(String[] args){
        BankAccountJonah fredAccount = new BankAccountJonah("fred");
        fredAccount.deposit(102.05f);
        System.out.println(fredAccount.getAccountBalance());

    }











}