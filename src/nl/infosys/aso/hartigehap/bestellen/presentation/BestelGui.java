/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.infosys.aso.hartigehap.bestellen.presentation;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import nl.infosys.aso.hartigehap.bestellen.businesslogic.BestelManager;

/**
 *
 * @author Sander van Belleghem
 */

public class BestelGui extends javax.swing.JFrame {

    /**
     * 
     */
    private BestelManager BestelManagerObj;
    
    
    /**
     * Creates new form BestelGui
     * 
     * @param BestelManager
     */
    public BestelGui(BestelManager BestelManager) {
        this.BestelManagerObj = BestelManager;
        
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Paneel = new javax.swing.JPanel();
        Label = new javax.swing.JLabel();
        InputField = new javax.swing.JTextField();
        BestelButton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("de Hartige Hap");

        Label.setText("Barcode:");

        InputField.setColumns(15);
        InputField.setToolTipText("");

        BestelButton.setText("Bestel");
        BestelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BestelButtonActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setText("Bestellen");

        javax.swing.GroupLayout PaneelLayout = new javax.swing.GroupLayout(Paneel);
        Paneel.setLayout(PaneelLayout);
        PaneelLayout.setHorizontalGroup(
            PaneelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(PaneelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BestelButton)
                    .addGroup(PaneelLayout.createSequentialGroup()
                        .addComponent(Label)
                        .addGap(18, 18, 18)
                        .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaneelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        PaneelLayout.setVerticalGroup(
            PaneelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(62, 62, 62)
                .addGroup(PaneelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label))
                .addGap(18, 18, 18)
                .addComponent(BestelButton)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Paneel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Paneel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Actie die uitgevoerd wordt wanneer op de bestel knop geklikt wordt.
     * @param evt 
     */
    private void BestelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BestelButtonActionPerformed
        if(InputField.getText().length() < 1){
            JOptionPane.showMessageDialog(this, "Incorrecte waarde ingevoerd.", "Oeps", JOptionPane.PLAIN_MESSAGE);
        } else {
            // Data versturen naar main klasse voor database afhandeling
            BestelManagerObj.plaatsBestelling(InputField.getText());
        }
    }//GEN-LAST:event_BestelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BestelButton;
    private javax.swing.JTextField InputField;
    private javax.swing.JLabel Label;
    private javax.swing.JPanel Paneel;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
