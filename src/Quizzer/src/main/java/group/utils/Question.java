package group.utils;

import java.util.ArrayList;

class Question {

    private String id, frage, category, a1,a2,a3,a4,richtigA;



    Question(){

        ArrayList<String> al = Main.control.getQuestionByID(Main.control.getRandomQuestionID());
        if(al.get(0) != null &&
                al.get(1) != null &&
                al.get(2) != null &&
                al.get(3) != null &&
                al.get(4) != null &&
                al.get(5) != null&&
                al.get(6) != null&&
                al.get(7) != null&&
                al.get(8) != null&&
                al.get(9) != null){

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

    private void setId(String id) {
        this.id = id;
    }


    private void setA1(String a1) {
        this.a1 = a1;
    }

    private void setA2(String a2) {
        this.a2 = a2;
    }

    private void setA3(String a3) {
        this.a3 = a3;
    }

    private void setA4(String a4) {
        this.a4 = a4;
    }

    private void setFrage(String frage) {
        this.frage = frage;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    private void setRichtigA(String richtigA) {
        this.richtigA = richtigA;
    }

    //Getter

    private String getId() {
        return id;
    }

    private String getA1() {
        return a1;
    }

    private String getA2() {
        return a2;
    }

    private String getA3() {
        return a3;
    }

    private String getA4() {
        return a4;
    }

    private String getFrage() {
        return frage;
    }

    private String getRichtigA() {
        return richtigA;
    }

    private String getCategory() {
        return category;
    }

}
