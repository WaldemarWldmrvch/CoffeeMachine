public class CoffeeMachine {
    int startWater;
    int startMilk;
    int startBeans;
    int startCups;
    int startMoney;
    public static final int ESPRESSO_WATER = 250;
    public static final int ESPRESSO_BEANS = 16;
    public static final int ESPRESSO_PRICE = 4;
    public static final int LATTE_WATER = 350;
    public static final int LATTE_MILK = 75;
    public static final int LATTE_BEANS = 20;
    public static final int LATTE_PRICE = 7;
    public static final int CAPPUCCINO_WATER = 200;
    public static final int CAPPUCCINO_MILK = 100;
    public static final int CAPPUCCINO_BEANS = 12;
    public static final int CAPPUCCINO_PRICE = 6;

    public CoffeeMachine(int startWater, int startMilk, int startBeans, int startCups, int startMoney) {
        this.startWater = startWater;
        this.startMilk = startMilk;
        this.startBeans = startBeans;
        this.startCups = startCups;
        this.startMoney = startMoney;
    }
}
