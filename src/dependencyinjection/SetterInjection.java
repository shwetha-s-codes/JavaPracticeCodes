package dependencyinjection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//Setter Injection Example
//Dependency injection should not directly alter implementation details or work with state

class Bank{
    private String bankname=" ";
    public void setBankname(String bankname){
        this.bankname=bankname;

    }
    public String  getBankname(){
        return bankname;
    }


}
class Account
{
    private static final Logger log= LoggerFactory.getLogger(Account.class);
    private Bank bank;
    private long accountNumber;
    private double balance;

    public void setBank(Bank bank) {
        this.bank = bank;
    }
    public void setDetails(long accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displayDetails(){
        log.debug("Bank Name is {}",bank.getBankname());//setting the bankname inside Account practically doesn't make sense
        log.debug("Account Number is {}",accountNumber);
        log.debug("Balance is {}",balance);
    }
}

public class SetterInjection {
    public static void main(String[] args) {
        var bank=new Bank();
        bank.setBankname("Union");
        var account=new Account();
        account.setBank(bank);
        account.setDetails(122345677,12_000);
        account.displayDetails();

    }
}
