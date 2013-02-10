package com.lima.tibere.robo.comando;

public class Andar implements Comando {

    private static Comando instance;

    private Andar() {
    }

    public static Comando getInstance() {
        if (instance == null) {
            instance = new Andar();
        }
        return instance;
    }

    @Override
    public void play() {
        System.out.println("Andar");
    }
}
