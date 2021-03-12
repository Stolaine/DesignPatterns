package com.stolaine.strategyPattern.data;

public class Duck {

    private IQuackBehaviour quackBehaviour;
    private IDisplayBehaviour displayBehaviour;
    private IFlyBehaviour flyBehaviour;

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

    public IQuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public IDisplayBehaviour getDisplayBehaviour() {
        return displayBehaviour;
    }

    public void setDisplayBehaviour(IDisplayBehaviour displayBehaviour) {
        this.displayBehaviour = displayBehaviour;
    }

    public IFlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void fly() {
        this.flyBehaviour.fly();
    }

    public void quack() {
        this.quackBehaviour.quack();
    }

    public void display() {
        this.displayBehaviour.display();
    }
}
