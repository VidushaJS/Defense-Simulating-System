/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import classes.Strength;
import classes.SuperDefence;
import interfaces.Observable;
import interfaces.Observer;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Vidusha
 */
public class SubmarineWindow extends SuperDefence implements Observer {

    private int oxigenAmount;
    
    public SubmarineWindow(Observable mainController, int soldierCount, int ammoCount) {
        super(mainController, "Submarine",soldierCount, ammoCount);
        initComponents();
        setLookAndFeel();
        oxigenAmount = 100;
        ((JSpinner.DefaultEditor)spinnerSoldierCount.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor)SpinnerAmmoCount.getEditor()).getTextField().setEditable(false);
        setVisible(true);
    }
    
    @Override
    public void setAreaClear(boolean isClear) {
        if(isClear) {
           lblAreaClear.setText("Area Cleared");
        } else {
            lblAreaClear.setText("Area Not Cleared");
        }
    }
    
    @Override
    public int getFuelAmount() {
        return sliderFuel.getValue();
    }
    
    
    private boolean isPositionEnabled() {
        return cbPosition.isSelected();
    }
    
    public int getOxigenAmount() {
        return oxigenAmount;
    }
    
    
    @Override
    public void setStrengthLevel(Strength strength) {
        
        setStrength(strength);
        
        if (isPositionEnabled()) {
            activateWeapons();
        }
        
    }
    
    
    private void activateWeapons() {
       
        Strength strength = getStrength();
        
        switch (strength) {
            case LOW:
                btnShoot.setEnabled(false);
                btnSonarOp.setEnabled(false);
                btnTmhkMissile.setEnabled(false);
                btnTridentMissile.setEnabled(false);
                break;

            case MEDIUM:
                btnShoot.setEnabled(true);
                btnSonarOp.setEnabled(false);
                btnTmhkMissile.setEnabled(false);
                btnTridentMissile.setEnabled(false);
                break;

            case HIGH:
                btnShoot.setEnabled(true);
                btnSonarOp.setEnabled(true);
                btnTmhkMissile.setEnabled(false);
                btnTridentMissile.setEnabled(false);
                break;

            case STRONG:
                btnShoot.setEnabled(true);
                btnSonarOp.setEnabled(true);
                btnTmhkMissile.setEnabled(true);
                btnTridentMissile.setEnabled(false);
                break;

            case CLOSED:
                btnShoot.setEnabled(true);
                btnSonarOp.setEnabled(true);
                btnTmhkMissile.setEnabled(true);
                btnTridentMissile.setEnabled(true);
                break;
        }
    }
    
    
    private void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainControllerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainControllerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainControllerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainControllerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAreaClear = new javax.swing.JLabel();
        lblSoldierCount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SpinnerAmmoCount = new javax.swing.JSpinner();
        cbPosition = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMessagesDisplay = new javax.swing.JTextArea();
        txtTypeMessages = new javax.swing.JTextField();
        btnShoot = new javax.swing.JButton();
        btnTmhkMissile = new javax.swing.JButton();
        btnSonarOp = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        sliderFuel = new javax.swing.JSlider();
        btnTridentMissile = new javax.swing.JButton();
        sliderO2 = new javax.swing.JSlider();
        spinnerSoldierCount = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submarine");
        setResizable(false);

        lblAreaClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAreaClear.setText("Area Not Cleared");

        lblSoldierCount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSoldierCount.setText("Soldier Count");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ammo Count");

        SpinnerAmmoCount.setModel(new SpinnerNumberModel(getAmmoCount(), 0, getAmmoCount(), 1));
        SpinnerAmmoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerAmmoCountStateChanged(evt);
            }
        });

        cbPosition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPosition.setText("Position");
        cbPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPositionActionPerformed(evt);
            }
        });

        txtaMessagesDisplay.setColumns(20);
        txtaMessagesDisplay.setRows(5);
        jScrollPane1.setViewportView(txtaMessagesDisplay);

        txtTypeMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeMessagesActionPerformed(evt);
            }
        });

        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);

        btnTmhkMissile.setText("Tomahawk Missile");
        btnTmhkMissile.setEnabled(false);

        btnSonarOp.setText("Sonar Operation");
        btnSonarOp.setEnabled(false);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        sliderFuel.setMajorTickSpacing(20);
        sliderFuel.setMinorTickSpacing(10);
        sliderFuel.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderFuel.setPaintLabels(true);
        sliderFuel.setPaintTicks(true);
        sliderFuel.setValue(100);

        btnTridentMissile.setText("Trident-2 Missile");
        btnTridentMissile.setEnabled(false);

        sliderO2.setMajorTickSpacing(10);
        sliderO2.setMinorTickSpacing(1);
        sliderO2.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderO2.setPaintLabels(true);
        sliderO2.setPaintTicks(true);
        sliderO2.setValue(100);

        spinnerSoldierCount.setModel(new SpinnerNumberModel(getSoldierCount(), 1, getSoldierCount(), 1));
        spinnerSoldierCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerSoldierCountStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTypeMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174)
                                .addComponent(lblSoldierCount))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTmhkMissile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(btnTridentMissile, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSonarOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spinnerSoldierCount)))
                .addGap(29, 29, 29)
                .addComponent(sliderFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(sliderO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSoldierCount)
                                    .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnShoot)
                                    .addComponent(btnSonarOp))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTmhkMissile)
                                    .addComponent(cbPosition)
                                    .addComponent(btnTridentMissile))))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTypeMessages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderFuel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sliderO2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTypeMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeMessagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeMessagesActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String text = txtTypeMessages.getText(); 
        if (!text.equals("")) {
            String msg = getDefenceName() + " : " + getMsgId()+ " : " + text;
            getMainController().informController(msg);
            txtTypeMessages.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a message to send"
                    , "Alert!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void spinnerSoldierCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSoldierCountStateChanged
        setSoldierCount(Integer.parseInt(spinnerSoldierCount.getValue().toString()));
    }//GEN-LAST:event_spinnerSoldierCountStateChanged

    private void SpinnerAmmoCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerAmmoCountStateChanged
        setAmmoCount(Integer.parseInt(SpinnerAmmoCount.getValue().toString()));
    }//GEN-LAST:event_SpinnerAmmoCountStateChanged

    private void cbPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPositionActionPerformed
        
        if (isPositionEnabled()) {
            activateWeapons();
        } else {
            btnShoot.setEnabled(false);
            btnSonarOp.setEnabled(false);
            btnTmhkMissile.setEnabled(false);
            btnTridentMissile.setEnabled(false);
        }        
    }//GEN-LAST:event_cbPositionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SubmarineWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmarineWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmarineWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmarineWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmarineWindow(null, 7, 10).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerAmmoCount;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonarOp;
    private javax.swing.JButton btnTmhkMissile;
    private javax.swing.JButton btnTridentMissile;
    private javax.swing.JCheckBox cbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAreaClear;
    private javax.swing.JLabel lblSoldierCount;
    private javax.swing.JSlider sliderFuel;
    private javax.swing.JSlider sliderO2;
    private javax.swing.JSpinner spinnerSoldierCount;
    private javax.swing.JTextField txtTypeMessages;
    private javax.swing.JTextArea txtaMessagesDisplay;
    // End of variables declaration//GEN-END:variables

    

    
}
