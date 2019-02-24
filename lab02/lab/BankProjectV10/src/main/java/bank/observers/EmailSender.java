package bank.observers;

import bank.domain.Account;
import bank.subjects.ISubject;

import java.util.Date;

public class EmailSender implements IObserver{

    private void send(String email) {
        System.out.println("Sending email [" + new Date() + "] " + email);
    }

    @Override
    public void update(ISubject subject) {
        if (subject instanceof Account) {
            Account account = (Account) subject;
            if(account.getBalance() == 0.0) {
                String email = "Account No. " + account.getAccountnumber() + " has been created.";
                send(email);
            }
        }
    }
}
