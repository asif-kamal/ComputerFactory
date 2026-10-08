package SmartKitchen;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private Refrigerator refrigerator;
    private Dishwasher dishwasher;

    public SmartKitchen(CoffeeMaker coffeeMaker, Refrigerator refrigerator, Dishwasher dishwasher) {
        this.coffeeMaker = new CoffeeMaker();
        this.refrigerator = new Refrigerator();
        this.dishwasher = new Dishwasher();
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
