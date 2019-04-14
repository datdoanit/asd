package bank.service;

public class WithDrawCommand implements Command{

    private final IAccountService accountService;
    private final long accountNumber;
    private final double amount;

    public WithDrawCommand(IAccountService accountService, long accountNumber, double amount) {
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void execute() {
        accountService.withdraw(accountNumber, amount);
    }

    @Override
    public void undo() {
        accountService.deposit(accountNumber, amount);
    }
}
