package bank.domain;

public class CheckingInterestStrategy implements InterestStrategy {

    @Override
    public double get(Account account) {
        double balance = account.getBalance();
        if (balance < 1000) {
            return 1.5;
        }
        return 2.5;
    }
}
