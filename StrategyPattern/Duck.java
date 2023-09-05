package StrategyPattern;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performQuack(){
        quackBehavior.quack();
    }

    void performFly(){

        flyBehavior.fly();

    }


   public abstract void display();

    void swim(){
        System.out.println("All ducks can float");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
