/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

package src.main;

import src.main.group.handlers.GameState;
import src.main.group.ngui.LoginUI;
import src.main.group.utils.Benutzer;
import src.main.group.utils.Control;

public class Main {

    public static Benutzer user;
    public static Control control;

    public static void main(String[] args) {

        GameState.setState(GameState.LOGIN);

        control = new Control();
        user = new Benutzer();

        LoginUI ui = new LoginUI();

       /* startbild jFrame = new startbild();
        jFrame.setVisible(true);
        jFrame.setTitle("Quizzer - Masse statt Klasse");
        */


    }

}