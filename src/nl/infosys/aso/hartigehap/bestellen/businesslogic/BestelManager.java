/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.infosys.aso.hartigehap.bestellen.businesslogic;

import nl.infosys.aso.hartigehap.bestellen.datestore.DataStore;
import nl.infosys.aso.hartigehap.bestellen.domain.Drank;
//import nl.infosys.aso.hartigehap.bestellen.domain.Gerecht;
//import nl.infosys.aso.hartigehap.bestellen.domain.Bestelling;

/**
 *
 * @author Sander van Belleghem
 */
public class BestelManager {

    public BestelManager() {
        Drank d1 = new Drank();
    }

    public void plaatsBestelling(String barcode) {
        DataStore datastore = new DataStore();

        if (barcode.length() < 1) {
            System.out.println("kan niet");
        } else {
            System.out.println("Barcode: " + barcode);
            datastore.dbQuery("SELECT * FROM `drank`, `gerecht` WHERE `drank`.`ID` = '"+ barcode +"' OR `gerecht`.`ID` = '"+ barcode +"'");
        }
//        datastore.dbquery("105");

    }
}
