package bank.observers;

import bank.domain.Account;
import bank.subjects.ISubject;

import java.util.Date;

public class SMSSender implements IObserver{

    private void send(String sms) {
        System.out.println("Sending SMS [" + new Date() + "] " + sms);
    }

    @Override
    public void update(ISubject subject) {
        if (subject instanceof Account) {
            Account account = (Account) subject;
            String sms = "Account No. " + account.getAccountnumber() + " has been changed. New Balance is "
                    + account.getBalance();
            send(sms);
        }
    }
}
