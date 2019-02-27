/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

package src.main.group.utils;

import src.main.group.handlers.GameState;

public class Main {

    public static Benutzer user;
    public static Control control;

    public static void main(String[] args) {

        GameState.setState(GameState.MENU);

        control = new Control();
        user = new Benutzer();


        login l = new login();



    }

}