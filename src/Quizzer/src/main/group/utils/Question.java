/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

package src.main.group.utils;

import src.main.Main;
import src.main.group.database.DatabaseConnector;
import src.main.group.database.QueryResult;

import java.util.ArrayList;

public class Question {

    private String id, frage, category, a1, a2, a3, a4, richtigA;
    private String lastQuestionID;


    public Question() {
        randomQuestion();
    }

    private void randomQuestion() {
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
            lastQuestionID = al.get(0);
        }
    }


    private int intID(String pBenutzerID, DatabaseConnector pConnect) {
        int frageID = 0, anzahl = 0;
        int percentage = 1;
        pConnect.executeStatement("SELECT FrageID, processed, correct FROM fStats WHERE BenutzerID='" + pBenutzerID + "' AND processed >= 5");
        QueryResult result = pConnect.getCurrentQueryResult();
        anzahl = result.getRowCount();
        if (anzahl != 0) {
            for (int i = 0; i <= anzahl; i++) {
                int tempID = Integer.parseInt(result.getData()[i][0]);
                int temp = Integer.parseInt(result.getData()[i][2]) / Integer.parseInt(result.getData()[i][1]);
                if (temp < percentage) {
                    percentage = temp;
                    frageID = tempID;
                }

            }
        } else {
            return 0;
        }

        return frageID;
    }

    public boolean submit(boolean richtig) {
        DatabaseConnector pConnect = Main.control.connector;
        String pBenutzerID = Main.user.benutzerID;
        int pFrageID = Integer.parseInt(this.id);

        pConnect.executeStatement("SELECT Bearbeitet, Richtig FROM fragen WHERE FrageID='" + pFrageID + "'");
        QueryResult result = pConnect.getCurrentQueryResult();
        int pBearbeitet = Integer.parseInt(result.getData()[0][0]) + 1;
        int pRichtig = Integer.parseInt(result.getData()[0][1]) + 1;
        if (richtig) {
            pConnect.executeStatement("UPDATE fragen SET Bearbeitet='" + pBearbeitet + "', Richtig='" + pRichtig + "' WHERE FrageID = '" + pFrageID + "'");
        } else {
            pConnect.executeStatement("UPDATE fragen SET Bearbeitet='" + pBearbeitet + "' WHERE FrageID = '" + pFrageID + "'");
        }

        if (pConnect.getErrorMessage() != null) {
            return false;
        }

        pConnect.executeStatement("SELECT BFragen, RFragen FROM statistiken WHERE BenutzerID='" + pBenutzerID + "'");
        result = pConnect.getCurrentQueryResult();

        if (result.getRowCount() == 0) {
            pConnect.executeStatement("INSERT INTO statistiken(BenutzerID, BFragen, RFragen) VALUES ('" + pBenutzerID + "', '1', '1')");
        } else {

            int pB = Integer.parseInt(result.getData()[0][0]) + 1;
            int pR = Integer.parseInt(result.getData()[0][1]);
            if (richtig) {
                pR = pR + 1;
            }
            System.out.println(Integer.parseInt(result.getData()[0][0]) + "" + Integer.parseInt(result.getData()[0][1]));

            pConnect.executeStatement("UPDATE statistiken SET BFragen=" + pB + ",RFragen=" + pR + " WHERE BenutzerID='" + pBenutzerID + "'");

        }
        if (pConnect.getErrorMessage() != null) {
            return false;
        }

        pConnect.executeStatement("SELECT processed, correct FROM fStats WHERE FrageID='" + pFrageID + "' AND BenutzerID='" + pBenutzerID + "'");
        result = pConnect.getCurrentQueryResult();
        if (result.getRowCount() != 0) {
            int pProcessed = Integer.parseInt(result.getData()[0][0]);
            int pCorrect = Integer.parseInt(result.getData()[0][1]);
            if (richtig) {
                pConnect.executeStatement("UPDATE fStats SET processed='" + pProcessed + "', correct='" + pCorrect + "' WHERE FrageID='" + pFrageID + "' AND BenutzerID='" + pBenutzerID + "'");
            } else {
                pConnect.executeStatement("UPDATE fStats SET processed='" + pProcessed + "' WHERE FrageID='" + pFrageID + "' AND BenutzerID='" + pBenutzerID + "'");
            }

        } else {
            if (richtig) {
                pConnect.executeStatement("INSERT INTO fStats(BenutzerID, FrageID, processed, correct) VALUES ('" + pBenutzerID + "', '" + pFrageID + "', '1', '1')");
            } else {
                pConnect.executeStatement("INSERT INTO fStats(BenutzerID, FrageID, processed, correct) VALUES ('" + pBenutzerID + "', '" + pFrageID + "', '1', '0')");
            }
        }

        if (pConnect.getErrorMessage() != null) {
            return false;
        }

        return true;
    }

    //Setter

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getA1() {
        return a1;
    }

    private void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    private void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    private void setA3(String a3) {
        this.a3 = a3;
    }

    //Getter

    public String getA4() {
        return a4;
    }

    private void setA4(String a4) {
        this.a4 = a4;
    }

    public String getFrage() {
        return frage;
    }

    private void setFrage(String frage) {
        this.frage = frage;
    }

    public String getRichtigA() {
        return richtigA;
    }

    private void setRichtigA(String richtigA) {
        this.richtigA = richtigA;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

}
