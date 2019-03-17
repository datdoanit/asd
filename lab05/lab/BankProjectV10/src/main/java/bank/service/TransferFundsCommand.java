package bank.service;

public class TransferFundsCommand implements Command {

    private final IAccountService accountService;
    private final long fromAccountNumber;
    private final long toAccountNumber;
    private final double amount;
    private final String description;

    public TransferFundsCommand(IAccountService accountService,
                                long fromAccountNumber,
                                long toAccountNumber,
                                double amount,
                                String description) {
        this.accountService = accountService;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public void execute() {
        accountService.transferFunds(fromAccountNumber, toAccountNumber, amount, description);
    }

    @Override
    public void undo() {
        accountService.transferFunds(toAccountNumber, fromAccountNumber, amount, "Undo: " + description);
    }
}
