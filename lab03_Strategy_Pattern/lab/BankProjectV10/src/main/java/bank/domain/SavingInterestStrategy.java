package bank.domain;

public class SavingInterestStrategy implements InterestStrategy {

    @Override
    public double get(Account account) {
        double balance = account.getBalance();
        if (balance < 1000) {
            return 1;
        }
        if (balance > 1000 && balance < 5000) {
            return 2;
        }
        return 4;
    }

}
