/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

package src.main.group.handlers;

public enum GameState {
    LOGIN, MENU, SETTINGS, INGAME, END, STATISTIC;

    private static GameState state;

    public static boolean isState(GameState state) {
        return GameState.state == state;
    }

    public static GameState getState() {
        return state;
    }

    public static void setState(GameState state) {
        GameState.state = state;
    }
}
