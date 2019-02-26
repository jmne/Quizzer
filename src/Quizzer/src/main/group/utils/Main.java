/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

package src.main.group.utils;

import src.main.group.handlers.GameState;

import java.util.concurrent.TimeUnit;

public class Main {

    public static Control control;

    public static void main(String[] args) {

        GameState.setState(GameState.MENU);

        control = new Control();

        Question q = new Question();
        System.out.println("Zufällige Frage:");
        System.out.println("ID: " + q.getId());
        System.out.println("Kategorie: " + q.getCategory());
        System.out.println("Frage: " + q.getFrage());
        System.out.println("Antwort 1: " + q.getA1());
        System.out.println("Antwort 2: " + q.getA2());
        System.out.println("Antwort 3: " + q.getA3());
        System.out.println("Antwort 4: " + q.getA4());

        try {
            TimeUnit.SECONDS.sleep(7);

            System.out.println("Richtige Antwort ist: " + q.getRichtigA());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}