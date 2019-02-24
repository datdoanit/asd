package bank.observers;

import bank.subjects.ISubject;

public interface IObserver {
    void update(ISubject subject);
}
