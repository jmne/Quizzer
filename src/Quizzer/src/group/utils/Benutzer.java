package src.group.utils;

import src.group.database.DatabaseConnector;
import src.group.database.QueryResult;

public class Benutzer {

    private String username, email, passwort, benutzerID;

    public Benutzer() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String temp) {
        username = temp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String temp) {
        email = temp;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String temp) {
        passwort = temp;
    }

    public String getBenutzerID() {
        return benutzerID;
    }

    public void setBenutzerID(String temp) {
        benutzerID = temp;
    }

    public boolean loginBenutzer(String pUsername, String pPasswort, DatabaseConnector pConnect) {
        pConnect.executeStatement("SELECT BenutzerID FROM benutzer WHERE Username='" + pUsername + "' AND Passwort = '" + pPasswort + "'");
        QueryResult result = pConnect.getCurrentQueryResult();
        if (result.getRowCount() == 1) {
            benutzerID = result.getData()[0][0];
            pConnect.executeStatement("SELECT Email FROM benutzer WHERE Username='" + pUsername + "' AND Passwort = '" + pPasswort + "'");
            result = pConnect.getCurrentQueryResult();
            email = result.getData()[0][0];
            username = pUsername;
            passwort = pPasswort;
            return true;
        } else {
            pConnect.executeStatement("SELECT BenutzerID FROM benutzer WHERE Email='" + pUsername + "' AND Passwort = '" + pPasswort + "'");
            result = pConnect.getCurrentQueryResult();
            if (result.getRowCount() == 1) {
                benutzerID = result.getData()[0][0];
                pConnect.executeStatement("SELECT Username FROM benutzer WHERE Email='" + pUsername + "' AND Passwort = '" + pPasswort + "'");
                result = pConnect.getCurrentQueryResult();
                username = result.getData()[0][0];
                email = pUsername;
                passwort = pPasswort;
                return true;
            }
        }

        return false;
    }

    public boolean createBenutzer(String pUsername, String pEmail, String pPasswort, DatabaseConnector pConnect) {
        pConnect.executeStatement("INSERT INTO benutzer (Username, Email, Passwort) VALUES ('" + pUsername + "', '" + pEmail + "', '" + pPasswort + "')");
        if (pConnect.getErrorMessage() == null) {
            pConnect.executeStatement("SELECT BenutzerID FROM benutzer WHERE Username='" + pUsername + "' AND Passwort = '" + pPasswort + "'");
            QueryResult result = pConnect.getCurrentQueryResult();
            benutzerID = result.getData()[0][0];
            username = pUsername;
            email = pEmail;
            passwort = pPasswort;
            return true;
        }

        return false;
    }
}
