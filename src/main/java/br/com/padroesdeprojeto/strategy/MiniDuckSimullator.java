package br.com.padroesdeprojeto.strategy;

import br.com.padroesdeprojeto.strategy.model.ducks.Duck;
import br.com.padroesdeprojeto.strategy.model.attributes.fly.FlyWithRockets;
import br.com.padroesdeprojeto.strategy.model.ducks.MallardDuck;
import br.com.padroesdeprojeto.strategy.model.ducks.ModelDuck;
import br.com.padroesdeprojeto.strategy.model.ducks.PlasticDuck;

public class MiniDuckSimullator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();


        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithRockets());
        modelDuck.performFly();

        Duck plasticDuck = new PlasticDuck();
        plasticDuck.display();
        plasticDuck.performQuack();
        plasticDuck.performFly();
    }
}
