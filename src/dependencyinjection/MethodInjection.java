package dependencyinjection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//Method Injection Example
//Here we directly pass the object to a necessary method

class Bank2{
    private String bankname=" ";
    public void setBankname(String bankname){
        this.bankname=bankname;

    }
    public String  getBankname(){
        return bankname;
    }


}
class Account2
{
    private static final Logger log= LoggerFactory.getLogger(Account.class);
    private Bank2 bank;
    private long accountNumber;
    private double balance;


    public void setDetails(Bank2 bank,long accountNumber,double balance){
        this.bank=bank;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displayDetails(){
        log.debug("Bank Name is {}",bank.getBankname());//setting the bankname inside Account practically doesn't make sense
        log.debug("Account Number is {}",accountNumber);
        log.debug("Balance is {}",balance);
    }
}

public class MethodInjection {
    public static void main(String[] args) {
        var bank=new Bank2();
        bank.setBankname("Union");
        var account=new Account2();

        account.setDetails(bank,122345677,12_000);
        account.displayDetails();

    }
}
