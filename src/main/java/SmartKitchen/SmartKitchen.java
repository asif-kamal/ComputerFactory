package SmartKitchen;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private Refrigerator refrigerator;
    private Dishwasher dishwasher;

    public SmartKitchen(CoffeeMaker coffeeMaker, Refrigerator refrigerator, Dishwasher dishwasher) {
        this.coffeeMaker = coffeeMaker;
        this.refrigerator = refrigerator;
        this.dishwasher = dishwasher;
    }

    public void addWater() {
        coffeeMaker.brewCoffee();
    }

    public void pourMilk() {
        refrigerator.orderFood();
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public void doKitchenWork() {
        System.out.println("Doing kitchen work");
    }
}
