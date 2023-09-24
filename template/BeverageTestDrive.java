package template;

public class BeverageTestDrive {

    public static void main(String[] args ){

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking template.Tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking template.Coffee...");
        coffeeHook.prepareRecipe();

    }

}
