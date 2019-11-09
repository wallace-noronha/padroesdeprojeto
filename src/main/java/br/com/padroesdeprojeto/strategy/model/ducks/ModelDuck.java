package br.com.padroesdeprojeto.strategy.model.ducks;

import br.com.padroesdeprojeto.strategy.model.attributes.fly.FlyNoWay;
import br.com.padroesdeprojeto.strategy.model.attributes.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I´am not a duck, i´am a model duck");
    }



}
