/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.infosys.aso.hartigehap.bestellen.datestore;

/**
 *
 * @author Alex de Vogel
 */
import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class DataStore {

    Connection con; //Interface java.sql package
    Statement stmt; //Interface java.sql package

    ResultSet rs; //Interface java.sql package

    public DataStore() {
        /* Functie aanroepen */
        connect();
    }

    /**
     *
     */
    public void connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hartigehap", "root", "");

            //Succes melding als connectie naar MySQL database is gelukt
            if (!con.isClosed()) {
                System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
            }
        } catch (SQLException e) {
            System.err.println("Melding: " + e.getMessage());
        }
    }

    /**
     *
     * @param Query
     * @return ResultSet
     */
    public ResultSet dbQuery(String Query) {
        try {
            // stmt initialiseren  
            stmt = con.createStatement();

            // uitvoeren van het sql statement zoals opgeslagen in queryTekst
            // het resultaat wordt opgeslagen in de variabele recordset rs
            rs = stmt.executeQuery(Query);

            while (rs.next()) {
               System.out.println(rs.getString("Naam"));
            }
        } catch (SQLException e) {
            System.err.println("Melding: " + e.getMessage());
        }

        return null;
    }

}