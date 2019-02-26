/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

package src.main.group.utils;

import java.util.ArrayList;

class Question {

    private String id, frage, category, a1, a2, a3, a4, richtigA;


    Question() {

        ArrayList<String> al = Main.control.getQuestionByID(Main.control.getRandomQuestionID());
        if (al.get(0) != null &&
                al.get(1) != null &&
                al.get(2) != null &&
                al.get(3) != null &&
                al.get(4) != null &&
                al.get(5) != null &&
                al.get(6) != null &&
                al.get(7) != null &&
                al.get(8) != null &&
                al.get(9) != null) {

            setId(al.get(0));
            setFrage(al.get(1));
            setCategory(al.get(2));
            setA1(al.get(3));
            setA2(al.get(4));
            setA3(al.get(5));
            setA4(al.get(6));
            setRichtigA(al.get(7));

        }


    }

    //Setter

    String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    String getA1() {
        return a1;
    }

    private void setA1(String a1) {
        this.a1 = a1;
    }

    String getA2() {
        return a2;
    }

    private void setA2(String a2) {
        this.a2 = a2;
    }

    String getA3() {
        return a3;
    }

    private void setA3(String a3) {
        this.a3 = a3;
    }

    //Getter

    String getA4() {
        return a4;
    }

    private void setA4(String a4) {
        this.a4 = a4;
    }

    String getFrage() {
        return frage;
    }

    private void setFrage(String frage) {
        this.frage = frage;
    }

    String getRichtigA() {
        return richtigA;
    }

    private void setRichtigA(String richtigA) {
        this.richtigA = richtigA;
    }

    String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

}
