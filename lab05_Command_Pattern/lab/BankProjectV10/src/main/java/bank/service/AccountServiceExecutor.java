package bank.service;

import java.util.Stack;

public class AccountServiceExecutor {
    private final Stack<Command> historicalCommands = new Stack<>();

    public void execute(Command command) {
        command.execute();
        historicalCommands.push(command);
    }

    public void undo() {
        if(historicalCommands.empty()) {
            return;
        }
        historicalCommands.pop().undo();
    }
}
