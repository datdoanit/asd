package bank.service;

public interface Command {
    void execute();
    void undo();
}
