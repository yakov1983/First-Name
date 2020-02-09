package com.company;

public class MachinePhilips extends CoffeeMachine implements CoffeeMachineImpl{
    public MachinePhilips() {

        super(1800, 250);
    }

    @Override
    public int fillWater() {
        this.water = 1800;
        return this.water;
    }

    @Override
    public int fillCoffee() {
        this.coffee = 250;
        return this.coffee;
    }

    @Override
    public void info() {
        System.out.println("Вы используете кофемашину марки Philips");
        System.out.println("вместимость бака для воды составляет 1.8 литра");
        System.out.println("вместимость бака для кофе составляет 250 граммов");
    }




}
