package com.mum.asd.labs.observer_pattern;

public interface ISubject {
    void addObserver(IObserver observer);
    void doNotify();
}
