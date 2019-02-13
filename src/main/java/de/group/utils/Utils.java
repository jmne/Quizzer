package de.group.utils;

import java.util.ArrayList;

public class Utils {

    public Utils(){


    }

    public static ArrayList<String> getAnswersPacked(){

        ArrayList<String> al = Main.control.getAnswersByID(Main.control.getRandomQuestionID());
        if(al.get(3) != null){

            return al;

        }

        return null;
    }

}
