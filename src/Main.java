import machineSimulator.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Coffee Machine Simulator !!");
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> menu = new ArrayList<>();
        menu.add("Espresso");
        menu.add("Latte");
        menu.add("Cappuccino");

        ArrayList<String> services = new ArrayList<>();
        services.add("buy");
        services.add("fill");
        services.add("take");
        services.add("show");
        services.add("fillMachine");
        services.add("exit");


        while(true) {
            String coffeeName = null;
            System.out.println("PLease make your choice of coffee love with the menu as following !!!");
            for (String ele : menu) {
                System.out.println(ele);
            }
            coffeeName = sc.nextLine();

            String service = null;
            System.out.println("PLease make your choice of service with the following list !!!");
            for (String ele : services) {
                System.out.println(ele);
            }
            service = sc.nextLine();
            if (!menu.contains(coffeeName)) {
                System.out.println("coffeeName" + " coffee is not avialable. Please select from the menu !!!");
                System.out.println("-----------------------------------------------------------------");
            } else if (!services.contains(service)) {
                System.out.println("service" + " service is not avialable. Please select from the menu !!!");
                System.out.println("-----------------------------------------------------------------");
            } else {
                Espresso espresso = new Espresso();
                Latte latte = new Latte();
                Cappuccino cappuccino = new Cappuccino();
                CoffeeOutput bill = new CoffeeOutput();
                if(service.equals("buy")){
                    if(coffeeName.equals("Espresso")){
                        if(coffeeMachine.getWater()<espresso.getWater()){
                            System.out.println("Ingreadiant is not available Sorry Please choose other one !!!");
                            System.out.println("-----------------------------------------------------------------");
                        } else if (coffeeMachine.getMilk()< espresso.getMilk()) {
                            System.out.println("Ingreadiant is not available Sorry Please choose other one !!!");
                            System.out.println("-----------------------------------------------------------------");
                        } else if (coffeeMachine.getCoffeeBeans()<espresso.getBeans()) {
                            System.out.println("Ingreadiant is not available Sorry Please choose other one !!!");
                            System.out.println("-----------------------------------------------------------------");
                        }else{
                            coffeeMachine.setWater(coffeeMachine.getWater()-espresso.getWater());
                            coffeeMachine.setMilk(coffeeMachine.getMilk()- espresso.getMilk());
                            coffeeMachine.setCoffeeBeans(coffeeMachine.getCoffeeBeans()- espresso.getBeans());

                            bill.setNameOfCoffee(coffeeName);
                            bill.setWater(espresso.getWater());
                            bill.setMilk(espresso.getMilk());
                            bill.setCoffeeBeans(espresso.getBeans());
                            bill.setPrice(espresso.getPrice());
                            System.out.println("Your coffee is ready now you can enjoy your coffee !!!");
                            System.out.println(bill);
                            System.out.println("-----------------------------------------------------------------");
                            System.out.println();
                        }
                    } else if (coffeeName.equals("Latte")) {
                        if(coffeeMachine.getWater()<latte.getWater()){
                            System.out.println("Ingreadiant is not available Sorry Please choose other one !!!");
                            System.out.println("-----------------------------------------------------------------");
                        } else if (coffeeMachine.getMilk()< latte.getMilk()) {
                            System.out.println("Ingreadiant is not available Sorry Please choose other one !!!");
                            System.out.println("-----------------------------------------------------------------");
                        } else if (coffeeMachine.getCoffeeBeans()<latte.getBeans()) {
                            System.out.println("Ingreadiant is not available Sorry Please choose other one !!!");
                            System.out.println("-----------------------------------------------------------------");
                        }else{
                            coffeeMachine.setWater(coffeeMachine.getWater()-latte.getWater());
                            coffeeMachine.setMilk(coffeeMachine.getMilk()- latte.getMilk());
                            coffeeMachine.setCoffeeBeans(coffeeMachine.getCoffeeBeans()- latte.getBeans());

                            bill.setNameOfCoffee(coffeeName);
                            bill.setWater(latte.getWater());
                            bill.setMilk(latte.getMilk());
                            bill.setCoffeeBeans(latte.getBeans());
                            bill.setPrice(latte.getPrice());
                            System.out.println("Your coffee is ready now you can enjoy your coffee !!!");
                            System.out.println(bill);
                            System.out.println("-----------------------------------------------------------------");
                            System.out.println();
                        }
                    } else if (coffeeName.equals("Cappuccino")) {
                        if(coffeeMachine.getWater()<cappuccino.getWater()){
                            System.out.println("Ingreadiant is not available Sorry Please choose other one !!!");
                            System.out.println("-----------------------------------------------------------------");
                        } else if (coffeeMachine.getMilk()< cappuccino.getMilk()) {
                            System.out.println("Ingreadiant is not available Sorry Please choose other one !!!");
                            System.out.println("-----------------------------------------------------------------");
                        } else if (coffeeMachine.getCoffeeBeans()<cappuccino.getBeans()) {
                            System.out.println("Ingreadiant is not available Sorry Please choose other one !!!");
                            System.out.println("-----------------------------------------------------------------");
                        }else {
                            coffeeMachine.setWater(coffeeMachine.getWater() - cappuccino.getWater());
                            coffeeMachine.setMilk(coffeeMachine.getMilk() - cappuccino.getMilk());
                            coffeeMachine.setCoffeeBeans(coffeeMachine.getCoffeeBeans() - cappuccino.getBeans());

                            bill.setNameOfCoffee(coffeeName);
                            bill.setWater(cappuccino.getWater());
                            bill.setMilk(cappuccino.getMilk());
                            bill.setCoffeeBeans(cappuccino.getBeans());
                            bill.setPrice(cappuccino.getPrice());
                            System.out.println("Your coffee is ready now you can enjoy your coffee !!!");
                            System.out.println(bill);
                            System.out.println("-----------------------------------------------------------------");
                            System.out.println();
                        }
                    }
                } else if (service.equals("fill")) {
                    System.out.println("Please enter water Quantity : ");
                    Integer water = sc.nextInt();
                    System.out.println("Please enter milk Quantity : ");
                    Integer milk = sc.nextInt();
                    System.out.println("Please enter the coffeBean Quantity : ");
                    Integer coffeeBean = sc.nextInt();

                    bill.setWater(water);
                    bill.setMilk(milk);
                    bill.setCoffeeBeans(coffeeBean);
                    bill.setNameOfCoffee(coffeeName);
                    Integer price = 0;
                    if(coffeeName.equals("Espresso")){
                        bill.setPrice(espresso.getPrice());
                    } else if (coffeeName.equals("Latte")) {
                        bill.setPrice(latte.getPrice());
                    } else if (coffeeName.equals("Cappuccino")) {
                        bill.setPrice(cappuccino.getPrice());
                    }
                    System.out.println("Your coffee is ready now you can enjoy your coffee !!!");
                    System.out.println(bill);
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println();
                } else if (service.equals("take")) {
                    if(coffeeName.equals("Espresso")){
                        coffeeMachine.setMoneyBox(coffeeMachine.getMoneyBox()+ espresso.getPrice());
                    } else if (coffeeName.equals("Latte")) {
                        coffeeMachine.setMoneyBox(coffeeMachine.getMoneyBox()+ latte.getPrice());
                    } else if (coffeeName.equals("Cappuccino")) {
                        coffeeMachine.setMoneyBox(coffeeMachine.getMoneyBox()+ cappuccino.getPrice());
                    }
                    System.out.println("Thank you for paying the bill , Have a Good Day !!!!");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println();
                } else if (service.equals("show")) {
                    RemainingIngrediant rI = new RemainingIngrediant();
                    rI.setWater(coffeeMachine.getWater());
                    rI.setMilk(coffeeMachine.getMilk());
                    rI.setCoffeeBeans(coffeeMachine.getCoffeeBeans());
                    rI.setMoneyBox(coffeeMachine.getMoneyBox());
                    System.out.println(rI);
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println();
                }else if(service.equals("fillMachine")){
                    System.out.println("Please fill the water : ");
                    coffeeMachine.setWater(sc.nextInt());
                    System.out.println("Please fill the milk : ");
                    coffeeMachine.setMilk(sc.nextInt());
                    System.out.println("Please fill the coffeeBeans : ");
                    coffeeMachine.setCoffeeBeans(sc.nextInt());
                    System.out.println("Thank you for filling the Ingrediant. Now we can work properly and Makes Customer Happy !!!");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println();
                } else if (service.equals("exit")) {
                    break;
                }

            }
        }
    }
}