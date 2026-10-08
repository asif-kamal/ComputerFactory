public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private Refrigerator refrigerator;
    private Dishwasher dishwasher;

    public void addWater() {
        coffeeMaker.brewCoffee();
    }

    public void pourMilk() {
        refrigerator.orderFood();
    }

    public void loadDishes() {
        dishwasher.doDishes();
    }

    public void doKitchenWork() {
        System.out.println("Doing kitchen work");
    }
}
