package br.com.padroesdeprojeto.strategy.model.ducks;

import br.com.padroesdeprojeto.strategy.model.attributes.fly.FlyWithWings;
import br.com.padroesdeprojeto.strategy.model.attributes.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real mallardDuck...");
    }
}
