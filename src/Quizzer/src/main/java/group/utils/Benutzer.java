package group.utils;

import group.database.DatabaseConnector;
import group.database.QueryResult;

public class Benutzer {

    private String username, email, passwort, benutzerID;
    public Benutzer()
    {

    }

    public String getUsername()
    {
        return username;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPasswort()
    {
        return passwort;
    }

    public String getBenutzerID()
    {
        return benutzerID;
    }

    public void setUsername(String temp)
    {
        username = temp;
    }

    public void setEmail(String temp)
    {
        email = temp;
    }

    public void setPasswort(String temp)
    {
        passwort = temp;
    }

    public void setBenutzerID(String temp)
    {
        benutzerID = temp;
    }

    public boolean loginBenutzer(String pUsername, String pPasswort, DatabaseConnector pConnect)
    {
        pConnect.executeStatement("SELECT BenutzerID FROM benutzer WHERE Username='" + pUsername + "' AND Passwort = '" + pPasswort + "'");
        QueryResult result = pConnect.getCurrentQueryResult();
        if (result.getRowCount() == 1)
        {
            benutzerID = result.getData()[0][0];
            return true;
        }
        else
        {
            pConnect.executeStatement("SELECT BenutzerID FROM benutzer WHERE Email='" + pUsername + "' AND Passwort = '" + pPasswort + "'");
            result = pConnect.getCurrentQueryResult();
            if (result.getRowCount() == 1)
            {
                benutzerID = result.getData()[0][0];
                return true;
            }
        }

        return false;
    }

    public boolean createBenutzer(String pUsername, String pEmail, String pPassswort, DatabaseConnector pConnect)
    {
        pConnect.executeStatement("INSERT INTO benutzer (Username, Email, Passwort) VALUES ('"+ pUsername +"', '"+ pEmail +"', '"+ pPassswort +"')");
        if (pConnect.getErrorMessage()==null)
        {
            return true;
        }

        return false;
    }
}
