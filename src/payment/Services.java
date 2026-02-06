package payment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Account extends Bank{


        private static final Logger log =
                LoggerFactory.getLogger(Account.class);



    public void upiPayment(double amount){
        if(amount>balance){
         log.warn("Insufficient Fund");
        }
        else
        {
            log.info("Payment is initiated");
            balance-=amount;
            log.info("Payment SuccessFull");
            log.debug("Balance is {}",balance);
        }


    }
    private boolean validateAccountNumber(int account_number){
        return super.account_number == account_number;

    }
    private boolean validateBalance(double amount){
        if(amount>super.balance){


        }

    }



}
