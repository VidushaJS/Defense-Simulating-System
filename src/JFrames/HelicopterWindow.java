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
public class HelicopterWindow extends SuperDefence implements Observer {
    
    public HelicopterWindow(Observable mainController, int soldierCount, int ammoCount) {
        super(mainController, "Helicopter", soldierCount, ammoCount);
        initComponents();
        setLookAndFeel();
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
        return sliderFuelAmount.getValue();
    }
    
    
    @Override
    public void sendMessage(String msg) {
        txtaMessagesDisplay.append(msg + "\n");
    }
    
    
    private boolean isPositionEnabled() {
        return cbPosition.isSelected();
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
                    btnMissileOp.setEnabled(false);
                    btnLaserOp.setEnabled(false);
                    break;

                case MEDIUM:
                    btnShoot.setEnabled(true);
                    btnMissileOp.setEnabled(false);
                    btnLaserOp.setEnabled(false);
                    break;

                case HIGH:
                    btnShoot.setEnabled(true);
                    btnMissileOp.setEnabled(false);
                    btnLaserOp.setEnabled(false);
                    break;

                case STRONG:
                    btnShoot.setEnabled(true);
                    btnMissileOp.setEnabled(true);
                    btnLaserOp.setEnabled(false);
                    break;

                case CLOSED:
                    btnShoot.setEnabled(true);
                    btnMissileOp.setEnabled(true);
                    btnLaserOp.setEnabled(true);
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
        spinnerSoldierCount = new javax.swing.JSpinner();
        SpinnerAmmoCount = new javax.swing.JSpinner();
        cbPosition = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMessagesDisplay = new javax.swing.JTextArea();
        txtTypeMessages = new javax.swing.JTextField();
        btnShoot = new javax.swing.JButton();
        btnLaserOp = new javax.swing.JButton();
        btnMissileOp = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        sliderFuelAmount = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter");
        setResizable(false);

        lblAreaClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAreaClear.setText("Area Not Cleared");

        lblSoldierCount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSoldierCount.setText("Soldier Count");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ammo Count");

        spinnerSoldierCount.setModel(new SpinnerNumberModel(getSoldierCount(), 1, getSoldierCount(), 1));
        spinnerSoldierCount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinnerSoldierCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerSoldierCountStateChanged(evt);
            }
        });

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

        btnLaserOp.setText("Laser Operation");
        btnLaserOp.setEnabled(false);

        btnMissileOp.setText("Missile Operation");
        btnMissileOp.setEnabled(false);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        sliderFuelAmount.setMajorTickSpacing(20);
        sliderFuelAmount.setMinorTickSpacing(10);
        sliderFuelAmount.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderFuelAmount.setPaintLabels(true);
        sliderFuelAmount.setPaintTicks(true);
        sliderFuelAmount.setValue(100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(174, 174, 174)
                                    .addComponent(lblSoldierCount)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnLaserOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnMissileOp)
                                    .addGap(118, 118, 118)))
                            .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTypeMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(40, 40, 40)
                .addComponent(sliderFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sliderFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSoldierCount))))
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
                                    .addComponent(btnMissileOp))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnLaserOp)
                                    .addComponent(cbPosition))))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTypeMessages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        ((JSpinner.DefaultEditor) spinnerSoldierCount.getEditor()).getTextField().setEditable(false);

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
            btnMissileOp.setEnabled(false);
            btnLaserOp.setEnabled(false);
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
            //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.WindowsClassicLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HelicopterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelicopterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelicopterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelicopterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelicopterWindow(null, 4, 5).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerAmmoCount;
    private javax.swing.JButton btnLaserOp;
    private javax.swing.JButton btnMissileOp;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JCheckBox cbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAreaClear;
    private javax.swing.JLabel lblSoldierCount;
    private javax.swing.JSlider sliderFuelAmount;
    private javax.swing.JSpinner spinnerSoldierCount;
    private javax.swing.JTextField txtTypeMessages;
    private javax.swing.JTextArea txtaMessagesDisplay;
    // End of variables declaration//GEN-END:variables

    


}
