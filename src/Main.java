import java.util.Scanner;
public class Main {
    static CoffeeMachine finalMachine = new CoffeeMachine(250, 0, 16, 1, 0);
    private static int startWater = finalMachine.startWater;
    private static int startMilk = finalMachine.startMilk;
    private static int startBeans = finalMachine.startBeans;
    private static int startCups = finalMachine.startCups;
    private static int startMoney = finalMachine.startMoney;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String typeOfAction = scanner.next();
        while (!typeOfAction.equals("exit")) {
            switch (typeOfAction) {
                case "buy":
                    Main.buyCoffee();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    typeOfAction = scanner.next();
                    break;
                case "fill":
                    Main.fillMachine();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    typeOfAction = scanner.next();
                    break;

                case "take":
                    Main.takeCash();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    typeOfAction = scanner.next();
                    break;

                case "remaining":
                    Main.remainingStaff();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    typeOfAction = scanner.next();
                    break;
            }
        }
    }

    public static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner scanner = new Scanner(System.in);
        String typeOfCoffee = scanner.next();
        switch (typeOfCoffee) {
            case "1": // покупка эспрессо
                if (CoffeeMachine.ESPRESSO_WATER <= startWater && CoffeeMachine.ESPRESSO_BEANS <= startBeans) {
                    System.out.println("I have enough resources, making you a coffee!");
                    Main.startWater -= CoffeeMachine.ESPRESSO_WATER;
                    Main.startBeans -= CoffeeMachine.ESPRESSO_BEANS;
                    Main.startMoney += CoffeeMachine.ESPRESSO_PRICE;
                    Main.startCups -= 1;
                } else if (CoffeeMachine.ESPRESSO_WATER > startWater) {
                    System.out.println("Sorry, not enough water!");
                } else if (CoffeeMachine.ESPRESSO_BEANS > startBeans) {
                    System.out.println("Sorry, not enough beans!");
                }
            break;

            case "2": // покупка латте
                if (CoffeeMachine.LATTE_WATER <= startWater && CoffeeMachine.LATTE_BEANS <= startBeans && CoffeeMachine.LATTE_MILK <= startMilk) {
                    System.out.println("I have enough resources, making you a coffee!");
                    Main.startWater -= CoffeeMachine.LATTE_WATER;
                    Main.startMilk -= CoffeeMachine.LATTE_MILK;
                    Main.startBeans -= CoffeeMachine.LATTE_BEANS;
                    Main.startMoney += CoffeeMachine.LATTE_PRICE;
                    Main.startCups -= 1;
                } else if (CoffeeMachine.LATTE_WATER > startWater) {
                    System.out.println("Sorry, not enough water!");
                } else if (CoffeeMachine.LATTE_BEANS > startBeans) {
                    System.out.println("Sorry, not enough beans!");
                } else if (CoffeeMachine.LATTE_MILK > startMilk) {
                    System.out.println("Sorry, not enough milk!");
                }
            break;

            case "3": // покупка капучино
                if (CoffeeMachine.CAPPUCCINO_WATER <= startWater && CoffeeMachine.CAPPUCCINO_BEANS <= startBeans && CoffeeMachine.CAPPUCCINO_MILK <= startMilk) {
                    System.out.println("I have enough resources, making you a coffee!");
                    Main.startWater -= CoffeeMachine.CAPPUCCINO_WATER;
                    Main.startMilk -= CoffeeMachine.CAPPUCCINO_MILK;
                    Main.startBeans -= CoffeeMachine.CAPPUCCINO_BEANS;
                    Main.startMoney += CoffeeMachine.CAPPUCCINO_PRICE;
                    Main.startCups -= 1;
                } else if (CoffeeMachine.CAPPUCCINO_WATER > startWater) {
                    System.out.println("Sorry, not enough water!");
                } else if (CoffeeMachine.CAPPUCCINO_BEANS > startBeans) {
                    System.out.println("Sorry, not enough beans!");
                } else if (CoffeeMachine.CAPPUCCINO_MILK > startMilk) {
                    System.out.println("Sorry, not enough milk!");
                }
            break;

            case "back": //возврат
                break;
        }
    }

    public static void fillMachine() { // заполнение машины ингредиентами
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int fillWater = scanner.nextInt();
        startWater = startWater + fillWater;
        System.out.println("Write how many ml of milk you want to add:");
        int fillMilk = scanner.nextInt();
        startMilk = startMilk + fillMilk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int fillBeans = scanner.nextInt();
        startBeans = startBeans + fillBeans;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int fillCups = scanner.nextInt();
        startCups = startCups + fillCups;
    }

    public static void takeCash() { // выдача заработанного
        System.out.println("I gave you $ " + startMoney);
        startMoney = 0;
    }

    public static void remainingStaff() { // проверка остатка
        System.out.println("The coffee machine has:");
        System.out.println(startWater + " ml of water");
        System.out.println(startMilk + " ml of milk");
        System.out.println((startBeans) + " g of coffee beans");
        System.out.println(startCups + " disposable cups");
        System.out.println("$" + startMoney + " of money");
    }

}
