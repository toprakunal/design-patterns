package strategy;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
        System.out.println("Model StrategyPattern.adapter.Duck");
    }
}
