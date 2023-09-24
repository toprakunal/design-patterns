package template;

public class Coffee extends CaffeineBeverage {


    @Override
    void brew() {
        System.out.println("Dripping template.Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
