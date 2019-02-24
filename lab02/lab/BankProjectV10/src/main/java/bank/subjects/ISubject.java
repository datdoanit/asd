package bank.subjects;

import bank.observers.IObserver;

public interface ISubject {
    void doNotify(ISubject subject);
    void addObserver(IObserver observer);

}
