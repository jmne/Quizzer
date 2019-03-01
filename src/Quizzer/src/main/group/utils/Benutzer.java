/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

package src.main.group.utils;

import src.main.group.database.DatabaseConnector;
import src.main.group.database.QueryResult;
import src.main.group.handlers.PasswordMD5;

import java.security.NoSuchAlgorithmException;

/**
 * Dies ist die Verwaltung der Benutzer für das Quizspiel von Gruppe 2.
 *
 * @author Kevin Baier
 * @version 1.4
 */
public class Benutzer {

    private String username, email, passwort, benutzerID;
    private boolean angemeldet;

    /**
     * Konstruktor der Klasse Benutzer.
     */
    public Benutzer() {

        /**
         * Vielleicht ändern!!
         */

        angemeldet = false;

    }

    public boolean isAngemeldet() {
        return angemeldet;
    }

    public void setAngemeldet(boolean angemeldet) {
        this.angemeldet = angemeldet;
    }

    /**
     * Getter für den String username.
     *
     * @return String username.
     */
    public String getUsername() {
        {
            return username;
        }
    }

    /**
     * Setter für den String username.
     *
     * @param String temp auf den im Verlauf der Methode der String username gesetzt wird.
     */
    public void setUsername(String temp) {
        username = temp;
    }

    /**
     * Getter für den String email.
     *
     * @return String email.
     */
    public String getEmail() {
        if(angemeldet)
        {
            return email;
        }
    }

    /**
     * Setter für den String email.
     *
     * @param String temp auf den im Verlauf der Methode der String email gesetzt wird.
     */
    public void setEmail(String temp) {
        email = temp;
    }

    /**
     * Getter für den String passwort.
     *
     * @return String passwort.
     */
    public String getPasswort() {
        if(angemeldet)
        {
            return passwort;
        }
    }

    /**
     * Setter für den String passwort.
     *
     * @param String temp auf den im Verlauf der Methode der String passwort gesetzt wird.
     */
    public void setPasswort(String temp) {
        passwort = temp;
    }

    /**
     * Getter für den String benutzerID.
     *
     * @return String benutzerID.
     */
    public String getBenutzerID() {
        if(angemeldet)
        {
            return benutzerID;
        }
    }

    /**
     * Setter für den String benutzerID.
     *
     * @param String temp auf den im Verlauf der Methode der String benutzerID gesetzt wird.
     */
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
     * @param pConnect  Hier muss die Verbindung mit der SQL-Dateenbank übergeben werden mit einem Objekt der
     *                  Klasse DatabaseConnector.
     * @return Gibt true zurÜck, wenn der Benutzer erfolgreich angemeldet wurde und false, wenn er nicht angemeldet
     * werden konnte.
     */
    public boolean loginBenutzer(String pUsername, String pPasswort, DatabaseConnector pConnect) throws NoSuchAlgorithmException {
        passwort = PasswordMD5.create(pPasswort);
        pConnect.executeStatement("SELECT BenutzerID FROM benutzer WHERE Username='" + pUsername + "' AND Passwort = '" + passwort + "'");
        QueryResult result = pConnect.getCurrentQueryResult();
        if (result.getRowCount() == 1) {
            benutzerID = result.getData()[0][0];
            pConnect.executeStatement("SELECT Email FROM benutzer WHERE Username='" + pUsername + "' AND Passwort = '" + passwort + "'");
            result = pConnect.getCurrentQueryResult();
            email = result.getData()[0][0];
            username = pUsername;
            angemeldet = true;
            return true;
        } else {
            pConnect.executeStatement("SELECT BenutzerID FROM benutzer WHERE Email='" + pUsername + "' AND Passwort = '" + passwort + "'");
            result = pConnect.getCurrentQueryResult();
            if (result.getRowCount() == 1) {
                benutzerID = result.getData()[0][0];
                pConnect.executeStatement("SELECT Username FROM benutzer WHERE Email='" + pUsername + "' AND Passwort = '" + passwort + "'");
                result = pConnect.getCurrentQueryResult();
                username = result.getData()[0][0];
                email = pUsername;
                angemeldet = true;
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
     * @param pEmail    Die E-Mailadresse des zu erstellenden Benutzers.
     * @param pPasswort Das Passwort des zu erstellenden Benutzers.
     * @param pConnect  Hier muss die Verbindung mit der SQL-Dateenbank übergeben werden mit einem Objekt der
     *                  Klasse DatabaseConnector.
     * @return Gibt true zurÜck, wenn der Benutzer erfolgreich erstellt wurde und false, wenn er nicht erstellt
     * werden konnte.
     */
    public boolean createBenutzer(String pUsername, String pEmail, String pPasswort, DatabaseConnector pConnect) throws NoSuchAlgorithmException {
        pConnect.executeStatement("INSERT INTO benutzer (Username, Email, Passwort) VALUES ('" + pUsername + "', '" + pEmail + "', '" + pPasswort + "')");
        if (pConnect.getErrorMessage() == null) {
            pConnect.executeStatement("SELECT BenutzerID FROM benutzer WHERE Username='" + pUsername + "' AND Passwort = '" + pPasswort + "'");
            QueryResult result = pConnect.getCurrentQueryResult();
            benutzerID = result.getData()[0][0];
            username = pUsername;
            email = pEmail;
            passwort = PasswordMD5.create(pPasswort);
            return true;
        }

        return false;
    }
}
