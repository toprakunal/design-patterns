package decorator;

public class Espresso extends Beverage{

    public Espresso(){
        description = "decorator.Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
