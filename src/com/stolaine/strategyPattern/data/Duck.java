package com.stolaine.strategyPattern.data;

public class Duck {

    protected IQuackBehaviour quackBehaviour;
    protected IDisplayBehaviour displayBehaviour;
    protected IFlyBehaviour flyBehaviour;

    public Duck(IQuackBehaviour quackBehaviour, IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.displayBehaviour = displayBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public interface IQuackBehaviour {
        void quack();
    }

    public interface IFlyBehaviour {
        void fly();
    }

    public interface IDisplayBehaviour {
        void display();
    }
}
