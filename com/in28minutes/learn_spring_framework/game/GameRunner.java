package com.in28minutes.learn_spring_framework.game;

public class GameRunner {

    //MarioGame game;
    private GamingConsole game;

    public GameRunner(GamingConsole game){
        this.game=game;
    }

    public void run(){
        System.out.println("Running Game is "+ game);
        game.up();
        game.down();
        game.right();
        game.left();
    }


    
}
