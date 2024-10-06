package src;
import src.BankAccountJonah;

public class FixedDepositAccountJonah extends BankAccountJonah{
    private float interest;
    private int durationInMonths;
    private int changeCount;




    public FixedDepositAccountJonah(String accountName,Float balance){
        super(accountName);
        this.interest = 3;
        this.durationInMonths = 6;
        this.changeCount = 0;
        setAccountBalance(balance);
    }

    public FixedDepositAccountJonah(String accountName, Float balance, Float interest){
        super(accountName);
        this.interest = interest;
        this.durationInMonths = 6;
        this.changeCount = 0;
        setAccountBalance(balance);

    }

    public FixedDepositAccountJonah(String accountName, Float balance, Float interest, int duration){
        super(accountName);
        this.interest = interest;
        this.durationInMonths = duration;
        this.changeCount = 0;
        setAccountBalance(balance);

    }










    @Override
    public void deposit(float depositAmount){
        System.out.println("Balance unchanged. Sorry no deposits to fixed deposit");

    }

    @Override
    public void withdraw(float withdrawAmount){
        System.out.println("Balance Unchanged. Sorry no withdrawal from fixed deposit");

    }

    @Override
    public float getAccountBalance(){
        System.out.println("Your base balance is:" + super.getAccountBalance());
        float balanceWithInterest = super.getAccountBalance()*(((durationInMonths/12.0f)*interest)+100.0f)/100.0f;
        System.out.println("this is your fixed deposit balance including interest" + balanceWithInterest );
        return balanceWithInterest ;
    }




    
}
