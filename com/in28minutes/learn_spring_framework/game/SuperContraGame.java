package com.in28minutes.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole{

    public void up(){
        System.out.println("up");
    }

    public void down(){
        System.out.println("dodge");
    }

    public void right(){
        System.out.println("move");
    }

    public void left(){
        System.out.println("Shoot a bullet");
    }
    
}
