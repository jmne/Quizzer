package src.main.group.utils;

import src.main.group.database.DatabaseConnector;
import src.main.group.database.QueryResult;

/**
 * Dies ist die Verwaltung der Benutzer für das Quizspiel von Gruppe 2.
 *
 * @author Kevin Baier
 * @version 1.0
 */
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

    /**
     * Diese Methode überprüft ob ein Benutzer mit den gegebenen Anmeldedaten existiert, wenn ja werden
     * die Daten in den Strings der Klasse gepeichert. Wenn nein, wird false zurückgegeben.
     *
     * @param pUsername Der Benutzername des anzumeldenden Benutzers. Alternativ kann auch die E-Mail Adresse
     *                  angegeben werden.
     * @param pPasswort Das Passwort des anzumeldenden Benutzers.
     * @param pConnect Hier muss die Verbindung mit der SQL-Dateenbank übergeben werden mit einem Objekt der
     *                 Klasse DatabaseConnector.
     * @return Gibt true zurÜck, wenn der Benutzer erfolgreich angemeldet wurde und false, wenn er nicht angemeldet
     *         werden konnte.
     */
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

    /**
     * Diese Methode erstellt einen mit den angegebenen Daten einen Benutzer. Existiert bereits ein Benutzer mit
     * demselben Namen oder E-Mailadresse, kann der Benutzer nicht erstellt werden. Ob die Benutzererstellung
     * erfolgreich war, wird mit der Rückgabe eines Boolean sichergestellt.
     *
     * @param pUsername Der Benutzername des zu erstellenden Benutzers.
     * @param pEmail Die E-Mailadresse des zu erstellenden Benutzers.
     * @param pPasswort Das Passwort des zu erstellenden Benutzers.
     * @param pConnect Hier muss die Verbindung mit der SQL-Dateenbank übergeben werden mit einem Objekt der
     *                 Klasse DatabaseConnector.
     * @return Gibt true zurÜck, wenn der Benutzer erfolgreich erstellt wurde und false, wenn er nicht erstellt
     *         werden konnte.
     */
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
