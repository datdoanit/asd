package bank.service;

public class DepositCommand implements Command {

    private final IAccountService accountService;
    private final long accountNumber;
    private final double amount;

    public DepositCommand(IAccountService accountService, long accountNumber, double amount) {
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void execute() {
        accountService.deposit(accountNumber, amount);
    }

    @Override
    public void undo() {
            accountService.withdraw(accountNumber, amount);
    }
}
