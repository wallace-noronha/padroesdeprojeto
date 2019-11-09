package br.com.padroesdeprojeto.strategy.model.attributes.fly;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can´t fly");
    }

}
