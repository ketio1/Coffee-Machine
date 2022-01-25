package machine;

import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();


            if ("buy".equals(action)) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String num = scanner.next();
                if ("1".equals(num)) {
                    if (water >= 250 && beans >= 16 && cups >= 1) {
                        water -= 250;
                        beans -= 16;
                        money += 4;
                        cups -= 1;
                        System.out.println("I have enough resources, making you a coffee! ");
                    } else if (water < 250) {
                        System.out.println("Sorry, not enough water!");
                    } else if (beans < 16) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (cups < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                }
                else if ("2".equals(num)) {
                    if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        money += 7;
                        cups -= 1;
                        System.out.println("I have enough resources, making you a coffee! ");
                    } else if (water < 350) {
                        System.out.println("Sorry, not enough water!");
                    } else if (beans < 75) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (milk < 75) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (cups < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                }
                else if ("3".equals(num)) {
                    if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        money += 6;
                        cups -= 1;
                        System.out.println("I have enough resources, making you a coffee! ");
                    } else if (water < 200) {
                        System.out.println("Sorry, not enough water!");
                    } else if (beans < 100) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (milk < 12) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (cups < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                } else if ("back".equals(num)) {
                    continue;
                }


            } else if ("fill".equals(action)) {

                System.out.println("Write how many ml of water you want to add: ");
                int fillWater = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int fillMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int fillBeans = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                int fillCups = scanner.nextInt();
                water += fillWater;
                milk += fillMilk;
                beans += fillBeans;
                cups += fillCups;
            } else if ("take".equals(action)) {
                System.out.println("I gave you $" + money);
                System.out.println();
                money = 0;
            } else if ("remaining".equals(action)) {
                display(water, milk, beans, cups, money);
            } else if ("exit".equals(action)) {
                break;
            }


        }
    }

    public static void display(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
}
