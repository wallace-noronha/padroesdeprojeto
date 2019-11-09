package br.com.padroesdeprojeto.strategy.model.attributes.quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Mute...........");
    }
}
