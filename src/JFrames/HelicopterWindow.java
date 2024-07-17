/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import classes.Strength;
import classes.SuperDefence;
import interfaces.Observable;
import interfaces.Observer;
import java.awt.Color;
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
        setLookAndFeel();
        initComponents();
        ((JSpinner.DefaultEditor)spinnerSoldierCount.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor)SpinnerAmmoCount.getEditor()).getTextField().setEditable(false);
        setVisible(true);
    }

    
    @Override
    public void setAreaClear(boolean isClear) {
        if(isClear) {
           lblAreaClear.setText("Area Cleared");
           lblAreaClear.setBackground(Color.GREEN);
        } else {
            lblAreaClear.setText("Area Not Cleared");
            lblAreaClear.setBackground(Color.RED);
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        lblAreaClear.setBackground(java.awt.Color.red);
        lblAreaClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreaClear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAreaClear.setText("Area Not Cleared");
        lblAreaClear.setOpaque(true);

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

        txtaMessagesDisplay.setEditable(false);
        txtaMessagesDisplay.setColumns(20);
        txtaMessagesDisplay.setRows(5);
        jScrollPane1.setViewportView(txtaMessagesDisplay);

        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Fuel (%)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLaserOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMissileOp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSoldierCount))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(SpinnerAmmoCount)))
                    .addComponent(cbPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtTypeMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sliderFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLaserOp, btnMissileOp, btnShoot});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sliderFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot)
                            .addComponent(btnMissileOp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLaserOp)
                            .addComponent(cbPosition))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTypeMessages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoldierCount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLaserOp, btnMissileOp, btnShoot});

        ((JSpinner.DefaultEditor) spinnerSoldierCount.getEditor()).getTextField().setEditable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String text = txtTypeMessages.getText(); 
        if (!text.equals("")) {
            String msg = getDefenceName() + " : " + getMsgId()+ " : " + text;
            getMainController().informController(msg);
            txtaMessagesDisplay.append(msg + "\n");
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

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        
        decreaseAmmoCount();
        SpinnerAmmoCount.setValue(getAmmoCount());
    }//GEN-LAST:event_btnShootActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerAmmoCount;
    private javax.swing.JButton btnLaserOp;
    private javax.swing.JButton btnMissileOp;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JCheckBox cbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAreaClear;
    private javax.swing.JLabel lblSoldierCount;
    private javax.swing.JSlider sliderFuelAmount;
    private javax.swing.JSpinner spinnerSoldierCount;
    private javax.swing.JTextField txtTypeMessages;
    private javax.swing.JTextArea txtaMessagesDisplay;
    // End of variables declaration//GEN-END:variables

    


}
