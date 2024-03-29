/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

package src.main.group.utils;

import src.main._private.sql;
import src.main.group.database.DatabaseConnector;
import src.main.group.database.QueryResult;
import src.main.group.handlers.PasswordMD5;

import javax.swing.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Control {
    //Anbindung an die Datenbank
    public DatabaseConnector connector;

    //ID-Nummer des aktuellen Spielers
    private String aktuelleSpielerID;

    //Statistikdaten
    private int korrekteBearbeitungenGesamt, bearbeitungenGesamt;

    public Control() {

        //Aktuellen Nutzer initialisieren.
        aktuelleSpielerID = null;
        korrekteBearbeitungenGesamt = 0;
        bearbeitungenGesamt = 0;

        //Verbindung zur Datenbank aufbauen.
        connector = new DatabaseConnector(sql.d, sql.p, sql.b, sql.u, sql.pw);
        if (connector.getErrorMessage() != null) {
            JOptionPane.showMessageDialog(null, "Verbindung zur Datenbank nicht möglich. \n" + connector.getErrorMessage(), "Fehlermeldung", JOptionPane.ERROR_MESSAGE, null);
            System.exit(0);
        }


    }

    public void anmelden(String pBenutzer, String pPasswort) throws NoSuchAlgorithmException {
        //ID fuer den Benutzer ermitteln.
        connector.executeStatement("SELECT BenutzerID FROM benutzer WHERE Username='" + pBenutzer + "' AND Passwort = '" + PasswordMD5.create(pPasswort) + "'");
        QueryResult result = connector.getCurrentQueryResult();

        //Ueberpruefen, ob Anmeldung erfolgreich war.
        if (result.getRowCount() == 1) {
            aktuelleSpielerID = result.getData()[0][0];

            //SQL-Anweisung: Statistische Daten aus der DB laden.
            String anweisung =
                    "SELECT SUM(hatBearbeitet.anzahlBearbeitungen), SUM(hatBearbeitet.anzahlKorrekteBearbeitungen) " +
                            "FROM hatBearbeitet " +
                            "WHERE hatBearbeitet.SpielerID = " + aktuelleSpielerID;
            connector.executeStatement(anweisung);
            result = connector.getCurrentQueryResult();

            if (result.getData()[0][0] != null) {
                bearbeitungenGesamt = Integer.parseInt(result.getData()[0][0]);
                korrekteBearbeitungenGesamt = Integer.parseInt(result.getData()[0][1]);
            }

        }
    }

    public boolean istAngemeldet() {
        return aktuelleSpielerID != null;
    }


    public int gibRichtigeBearbeitungenGesamt() {
        return korrekteBearbeitungenGesamt;
    }

    public int gibBearbeitungenGesamt() {
        return bearbeitungenGesamt;
    }

    public int getRandomQuestionID() {

        connector.executeStatement("SELECT * FROM fragen ORDER BY Rand() Limit 1");

        QueryResult result = connector.getCurrentQueryResult();

        Integer r = Integer.parseInt(result.getData()[0][0]);

        if (r > -1)


            return r;
        return 0;
    }

    public ArrayList<String> getQuestionByID(int ID) {

        connector.executeStatement("SELECT FrageID, Frage, kategorie.Name Kategorie, A1, A2, A3, A4, KorrekteAntwort, Bearbeitet, Richtig " +
                "FROM fragen f LEFT OUTER JOIN kategorie ON f.Kategorie = kategorie.Zahl WHERE f.FrageID=" + ID);

        QueryResult result = connector.getCurrentQueryResult();

        ArrayList<String> ql = new ArrayList<>();


        if (result.getData()[0][0] != null &&
                result.getData()[0][1] != null &&
                result.getData()[0][2] != null &&
                result.getData()[0][3] != null &&
                result.getData()[0][4] != null &&
                result.getData()[0][5] != null &&
                result.getData()[0][6] != null &&
                result.getData()[0][7] != null &&
                result.getData()[0][8] != null &&
                result.getData()[0][9] != null) {

            ql.add(result.getData()[0][0]);
            ql.add(result.getData()[0][1]);
            ql.add(result.getData()[0][2]);
            ql.add(result.getData()[0][3]);
            ql.add(result.getData()[0][4]);
            ql.add(result.getData()[0][5]);
            ql.add(result.getData()[0][6]);
            ql.add(result.getData()[0][7]);
            ql.add(result.getData()[0][8]);
            ql.add(result.getData()[0][9]);

            return ql;

        }

        return null;

    }

}


