package br.com.padroesdeprojeto.strategy.model.ducks;

import br.com.padroesdeprojeto.strategy.model.attributes.fly.FlyNoWay;
import br.com.padroesdeprojeto.strategy.model.attributes.quack.MuteQuack;

public class PlasticDuck extends Duck {

    public PlasticDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I´am a plastic duck");
    }
}
