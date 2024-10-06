
package src;
import java.util.*;



public class BankAccountJonah {
    //declaring the variables
    //use the keyword final to make certain fields like name hard to change
    private final String accountName;
    private final String accountNumber;
    private float accountBalance;
    private List<String> transactions;
    private boolean openStatus;
    private Date creatingDate;
    private Date closingDate;

    


//the constrctors for the class, 2 types

//errors will occur because the accountName is immutable and has not been declared during initialisation
    public BankAccountJonah(String accountName) {
        this.openStatus = true;
        accountNumber = generateAccountNo();
        this.accountName = accountName;
        this.accountBalance = 0.0f;
        if(transactions == null){
            transactions = new ArrayList<>();
        }
       
    }

    public BankAccountJonah(String accountName, float accountBalance){
        this.openStatus = true;
        accountNumber = generateAccountNo();
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        if(transactions == null){
            transactions = new ArrayList<>();}
    }


/*     private String generateAccountNo(){
        int startAsciiNo = 65;
        int endAsciiNo = 90;
        int accountNoLength = 10;

        Random random = new Random();
        String accountNo = "";
        for(int i = 0; i< accountNoLength; i++){
            int randomValue = startAsciiNo + (int) random.nextFloat()*(endAsciiNo-startAsciiNo);
            accountNo = accountNo + (char) randomValue;
        }//instructor method to generate the random numbers
        return accountNo;
        
    } */

    private String generateAccountNo(){
        String accountNo = "";
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            accountNo = accountNo + rand.nextInt(10);

        }
        //System.out.println("Testing out account No generation. Generated accountNo is " + accountNo);
        return accountNo;


    }


//methods like deposit and withdraw
    public void deposit(float depositAmount){

        if(depositAmount > 0 && openStatus){
            setAccountBalance(getAccountBalance() + depositAmount);
            String depositMessage = "Deposit amount:$" + depositAmount + " at the time:" + timeStamp();
            System.out.println(depositMessage);
            transactions.add(depositMessage);
        } else{
            throw new IllegalArgumentException("The deposit amount you entered is invalid, or your account is not open!");
        }
        
    }

    public void withdraw(float withdrawAmount){
        if(withdrawAmount > 0 && openStatus){
            setAccountBalance(getAccountBalance() - withdrawAmount);
            String withdrawMessage = "Withdraw amount:$" + withdrawAmount + " at the time:" + timeStamp();
            transactions.add(withdrawMessage);
        } else{
            throw new IllegalArgumentException("The withdrawal amount you entered is invalid, or your account is not open!");
        }
        


    }

    //method to get the current timestamp for recordkeeping purposes
    public String timeStamp(){
        Calendar cal = Calendar.getInstance();
        Date dateTime = cal.getTime();
        return dateTime.toString();
    }




//getters and setters
    public String getAccountName() {
        return accountName;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
    public List<String> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
    public boolean isOpenStatus() {
        return openStatus;
    }
    public void setOpenStatus(boolean openStatus) {
        this.openStatus = openStatus;
    }
    public Date getCreatingDate() {
        return creatingDate;
    }
    public void setCreatingDate(Date creatingDate) {
        this.creatingDate = creatingDate;
    }
    public Date getClosingDate() {
        return closingDate;
    }
    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }
    
}
