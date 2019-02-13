package group.utils;

import java.util.ArrayList;

public class Question {

    private int id;
    private String frage;
    private String category;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String richtigA;



    public Question(){

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

           // setId(al.get(0));

        }


    }

    //Setter

    public void setId(int id) {
        this.id = id;
    }


    public void setA1(String a1) {
        this.a1 = a1;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public void setFrage(String frage) {
        this.frage = frage;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRichtigA(String richtigA) {
        this.richtigA = richtigA;
    }

    //Getter

    public int getId() {
        return id;
    }

    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }

    public String getA4() {
        return a4;
    }

    public String getFrage() {
        return frage;
    }

    public String getRichtigA() {
        return richtigA;
    }

    public String getCategory() {
        return category;
    }

}
