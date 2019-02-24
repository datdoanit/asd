package com.mum.asd.labs.lab02.homework;

public interface ISubject {
    void addObserver(IObserver observer);
    void doNotify();
}
