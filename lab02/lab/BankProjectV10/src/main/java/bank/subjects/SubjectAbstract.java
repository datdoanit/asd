package bank.subjects;

import bank.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectAbstract implements ISubject{

    private final List<IObserver> observers = new ArrayList<>();

    @Override
    public void doNotify(ISubject subject) {
        observers.forEach(observer -> observer.update(subject));
    }

    @Override
    public void addObserver(IObserver observer) {
        if (observer == null || observers.contains(observer)) {
            return;
        }
        observers.add(observer);
    }
}
