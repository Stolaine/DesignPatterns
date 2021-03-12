package com.stolaine.observerPattern.data;

public interface IObservable {
    void register(IObserver observer);
    void unRegister(IObserver observer);
    void notifyObserver();
}
