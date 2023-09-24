package decorator;

public class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return .99;
    }

    public DarkRoast(){
        description = "Dark Roast template.Coffee.";
    }
}
