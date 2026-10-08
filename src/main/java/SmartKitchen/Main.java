package SmartKitchen;

public class Main {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Refrigerator refrigerator = new Refrigerator();
        Dishwasher dishwasher = new Dishwasher();

        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, refrigerator, dishwasher);

        smartKitchen.doKitchenWork();
        smartKitchen.getDishwasher().doDishes();
        smartKitchen.addWater();
        smartKitchen.pourMilk();

    }
}
