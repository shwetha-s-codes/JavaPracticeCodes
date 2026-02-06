package payment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
//Abstraction is achieved here by keeping account number and balance and using validated account Number method

public class Account{
    private int accountNumber;
    private  double balance;
    private static final Logger log =
            LoggerFactory.getLogger(Account .class);
    Account(int accountNumber,double balance)
    {
        try {
            if(validateAccountNumber(accountNumber)&&validateBalance(balance)){
                log.info("Account Created Successfully and balance inserted");
                this.accountNumber=accountNumber;
                this.balance=balance;
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

    }


    private boolean validateAccountNumber(int accountNumber) throws IllegalArgumentException{
        //Database usage
        if(accountNumber<=0)
        {
            log.error("Invalid Account Number");
            throw new IllegalArgumentException("Invalid Account Number");
        }
        String accNo=String.valueOf(accountNumber);
        if(accNo.startsWith("0")||accNo.length()>14)
        {
            log.error("Invalid Account Number");
            throw new IllegalArgumentException("Invalid Account Number");
        }
        return true;

    }
    private boolean validateBalance(double balance)
    {
        if(balance<=0)
        {
            log.error("Invalid Balance Inserted");
            throw new IllegalArgumentException("Invalid Balance");
        }
        return true;
    }
}
