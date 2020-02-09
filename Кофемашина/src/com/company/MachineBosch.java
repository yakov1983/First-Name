package com.company;

public class MachineBosch extends CoffeeMachine  implements CoffeeMachineImpl{
    public MachineBosch() {
        super(2400, 500);
    }

    @Override
    public int fillWater() {
        this.water = 2400;
        return this.water;
    }

    @Override
    public int fillCoffee() {
        this.coffee = 500;
        return this.coffee;
    }

    @Override
    public void info() {
        System.out.println("Вы используете кофемашину марки Bosch");
        System.out.println("вместимость бака для воды составляет 2.4 литра");
        System.out.println("вместимость бака для кофе составляет 500 граммов");
    }
}
