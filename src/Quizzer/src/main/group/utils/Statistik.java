/*
 * Copyright (c) 2019 | Jan M. (@jncdt)
 */

package src.main.group.utils;

import src.main.group.database.DatabaseConnector;
import src.main.group.database.QueryResult;

public class Statistik {

    public String[] stats;

    public Statistik() {
        stats = new String[2];
        //stats = getStats(Main.user.benutzerID, Main.control.connector);

    }

    public String[] getStats(String pBenutzerID, DatabaseConnector pConnect) {
        QueryResult result = pConnect.getCurrentQueryResult();

        pConnect.executeStatement("SELECT BFragen, RFragen FROM statistiken WHERE BenutzerID='" + pBenutzerID + "'");


        stats[0] = "12";
        stats[1] = "7";
        if (result.getRowCount() > 0 && pConnect.getErrorMessage() == null) {
            stats[0] = result.getData()[0][0]; //Bearbeitete Fragen
            stats[1] = result.getData()[0][1]; //Richtige Fragen
        }

        return stats;
    }
}
