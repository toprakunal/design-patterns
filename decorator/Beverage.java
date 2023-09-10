package decorator;

public abstract class Beverage {

    String description = "Unknown decorator.Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
