package com.company;

public abstract class CoffeeMachine  implements CoffeeMachineImpl{
    protected int water;
    protected int coffee;

    public CoffeeMachine(int water, int coffee) {
        this.water = water;
        this.coffee = coffee;
    }

    public void getAmericana() {
        if (this.water >= 100 && this.coffee >= 10) {
            this.water -= 100;
            this.coffee -= 10;
            System.out.println("Кофе готов");
        } else if (this.water < 100 && this.coffee < 10) {
            System.out.println("Заполните бак с водой");
            System.out.println("Заполните бак с кофе");
        } else if (this.water < 100) {
            System.out.println("Заполните бак с водой");
        } else {
            System.out.println("Заполните бак с кофе");
        }
    }
    public void getEspresso() {
        if (this.water >= 80 && this.coffee >= 15) {
            this.water -= 80;
            this.coffee -= 15;
            System.out.println("Кофе готов");
        } else if (this.water < 80 && this.coffee < 15) {
            System.out.println("Заполните бак с водой");
            System.out.println("Заполните бак с кофе");
        } else if (this.water < 80) {
            System.out.println("Заполните бак с водой");
        } else {
            System.out.println("Заполните бак с кофе");
        }
    }
    public void getDoubleEspresso() {
        if (this.water >= 130 && this.coffee >= 27) {
            this.water -= 130;
            this.coffee -= 27;
            System.out.println("Кофе готов");
        } else if (this.water < 130 && this.coffee < 27) {
            System.out.println("Заполните бак с водой");
            System.out.println("Заполните бак с кофе");
        } else  if (this.coffee < 27) {
            System.out.println("Заполните бак с кофе");
        } else {
            System.out.println("Заполните бак с водой");
        }

    }
    public int fillWater() {
        this.water = 0;
        return this.water;
    }


    public int fillCoffee() {
        this.coffee = 0;
        return this.coffee;
    }

    public void showTank() {
        System.out.print("В резервуаре ");
        System.out.print(this.water);
        System.out.println(" воды");
        System.out.print("В резервуаре ");
        System.out.print(this.coffee);
        System.out.println(" кофе");
    }
     public void info() {

    }
}
