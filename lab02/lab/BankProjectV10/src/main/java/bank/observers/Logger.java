package bank.observers;

import bank.domain.Account;
import bank.subjects.ISubject;

import java.util.Date;

public class Logger implements IObserver{

    private void log(String logStr) {
        System.out.println("Log [" + new Date() + "] " + logStr);
    }

    @Override
    public void update(ISubject subject) {
        if (subject instanceof Account) {
            Account account = (Account) subject;
            String logStr = "Account No. " + account.getAccountnumber() + " has been changed. New Balance is "
                    + account.getBalance();
            log(logStr);
        }
    }
}
