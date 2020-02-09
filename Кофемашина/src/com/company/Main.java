package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Выберите производителя кофемашины");
        System.out.println("1. Bosch");
        System.out.println("2. Philips");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        while (menu != 2 && menu != 1) {
            System.out.println("Некорректный ввод, попробуйте еще раз");
            menu = sc.nextInt();
        }
            switch (menu) {
                case 1:
                    System.out.println("Отличный выбор!");
                    CoffeeMachine machineBosch = new MachineBosch();
                    test(machineBosch);
                    break;

                case 2:
                    System.out.println("Отличный выбор!");
                    CoffeeMachine machinePhilips = new MachinePhilips();
                    test(machinePhilips);
                    break;

                /*default:
                    System.out.println("Некорректный выбор");
                    break;*/
            }
    }
    public static void test (CoffeeMachine machine) {
        int fExit = 0;
        do {
            System.out.println();
            System.out.println("Выберите пункт меню");
            System.out.println("1. Показать текущий объем воды и кофе");
            System.out.println("2. Приготовить 'Американо'");
            System.out.println("3. Приготовить 'Эспрессо'");
            System.out.println("4. Приготовить 'Двойной эспрессо'");
            System.out.println("5. Заполнить бак с водой");
            System.out.println("6. Заполнить бак с кофе");
            System.out.println("7. Информация");
            System.out.println("8.Выключить машину");
            Scanner sc = new Scanner(System.in);
            int menu1 = sc.nextInt();
            switch (menu1) {
                case 1:
                    machine.showTank();
                    break;
                case 2:
                    machine.getAmericana();
                    break;
                case 3:
                    machine.getEspresso();
                    break;
                case 4:
                    machine.getDoubleEspresso();
                    break;
                case 5:
                    machine.fillWater();
                    break;
                case 6:
                    machine.fillCoffee();
                    break;
                case 7:
                    machine.info();
                    break;
                case 8:
                    System.out.println("СПАСИБО!");
                    fExit = 1;
                    break;
                default:
                    System.out.println("Некорректный выбор");
                    break;
            }
        } while (fExit != 1);
    }
}
