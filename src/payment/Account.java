package payment;

import java.util.logging.Logger;

public class Account {
    private final Logger log=Logger.getLogger(Account.class.getName());
    private  double balance=10000;
    public void upiPayment(double amount){
        if(amount>balance){
         log.warning("Insufficient Fund");
        }
        else
        {
            log.info("Payment is initiated");
            balance-=amount;
            log.info("Payment SuccessFull");
            log.fine("Balance is {}"+balance);
        }

    }



}
