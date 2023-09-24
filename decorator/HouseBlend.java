package decorator;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend template.Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
