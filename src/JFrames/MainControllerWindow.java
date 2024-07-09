/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import classes.Strength;
import interfaces.Observable;
import interfaces.Observer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vidusha
 */
public class MainControllerWindow extends javax.swing.JFrame implements Observable {
    
    private ArrayList<Observer> defenceUnits = new ArrayList<>();

    public MainControllerWindow() {
        initComponents();
        lblOxigen.setVisible(false);
        lblO2Colon.setVisible(false);
        lblO2Amount.setVisible(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void addDefenceUnit(Observer defenceUnit) {
        defenceUnits.add(defenceUnit);
    }
    
    @Override
    public void informController(String msg) {
        txtAreaMessages.append(msg + "\n");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbSelectDefence = new javax.swing.JComboBox<>();
        btnCollectInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSoldierCount = new javax.swing.JLabel();
        lblAmmo = new javax.swing.JLabel();
        lblFuel = new javax.swing.JLabel();
        sliderPosition = new javax.swing.JSlider();
        ckbxAreaClear = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMessages = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        ckbxSendPvt = new javax.swing.JCheckBox();
        btnSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        lblOxigen = new javax.swing.JLabel();
        lblO2Colon = new javax.swing.JLabel();
        lblO2Amount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cbSelectDefence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSelectDefence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence" }));
        cbSelectDefence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbSelectDefenceMouseEntered(evt);
            }
        });
        cbSelectDefence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelectDefenceActionPerformed(evt);
            }
        });

        btnCollectInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCollectInfo.setText("Collect Information");
        btnCollectInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectInfoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Soldier Count  ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Fuel Amount (%)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ammo Amount ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Position");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText(":");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText(":");

        lblSoldierCount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSoldierCount.setText("Test");

        lblAmmo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAmmo.setText("Test");

        lblFuel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFuel.setText("Test");

        sliderPosition.setMajorTickSpacing(20);
        sliderPosition.setMinorTickSpacing(5);
        sliderPosition.setPaintLabels(true);
        sliderPosition.setPaintTicks(true);
        sliderPosition.setValue(0);
        sliderPosition.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPositionStateChanged(evt);
            }
        });

        ckbxAreaClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbxAreaClear.setText("Area Clear");
        ckbxAreaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbxAreaClearActionPerformed(evt);
            }
        });

        txtAreaMessages.setColumns(20);
        txtAreaMessages.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAreaMessages.setRows(5);
        jScrollPane1.setViewportView(txtAreaMessages);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        ckbxSendPvt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbxSendPvt.setText("Send Private");
        ckbxSendPvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbxSendPvtActionPerformed(evt);
            }
        });

        btnSend.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSend.setText("Send");

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        lblOxigen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOxigen.setText("Oxigen (%)");

        lblO2Colon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblO2Colon.setText(":");

        lblO2Amount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblO2Amount.setText("Test");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cbSelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCollectInfo)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 54, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ckbxAreaClear)
                                .addGap(85, 85, 85))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblFuel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                    .addComponent(lblSoldierCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAmmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addComponent(lblOxigen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblO2Colon, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblO2Amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sliderPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ckbxSendPvt)
                                .addGap(47, 47, 47)
                                .addComponent(btnSend))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCollectInfo)
                    .addComponent(ckbxAreaClear))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblO2Colon)
                                .addComponent(lblO2Amount))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(lblSoldierCount)
                                .addComponent(lblOxigen)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(lblFuel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(lblAmmo))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSend)
                                .addComponent(ckbxSendPvt))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckbxAreaClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbxAreaClearActionPerformed
        
        if (ckbxAreaClear.isSelected()) {
            for (Observer defenceUnit : defenceUnits) {
                defenceUnit.setAreaClear(true);
            }
        } else {
            for (Observer defenceUnit : defenceUnits) {
                defenceUnit.setAreaClear(false);
            }
        }
    }//GEN-LAST:event_ckbxAreaClearActionPerformed

    private void cbSelectDefenceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSelectDefenceMouseEntered
        
        if (cbSelectDefence.getItemCount() == 1) {
            for (Observer defenceUnit : defenceUnits) {
                cbSelectDefence.addItem(defenceUnit.getDefenceName());
            }
        }
    }//GEN-LAST:event_cbSelectDefenceMouseEntered

    private void cbSelectDefenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelectDefenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSelectDefenceActionPerformed

    private void ckbxSendPvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbxSendPvtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbxSendPvtActionPerformed

    private void btnCollectInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectInfoActionPerformed
        
        String selectedItem = cbSelectDefence.getSelectedItem().toString();
        
        if (!selectedItem.equals("Select Defence")) {
            Observer selectedDefence = null;
            for (int i = 0; i < defenceUnits.size(); i++) {
                selectedDefence = defenceUnits.get(i);
                if (selectedDefence.getDefenceName().equals(selectedItem)) {
                    break;
                }
            }
            
            lblSoldierCount.setText(String.valueOf(selectedDefence.getSoldierCount()));
            lblFuel.setText(String.valueOf(selectedDefence.getFuelAmount()));
            lblAmmo.setText(String.valueOf(selectedDefence.getAmmoCount()));
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select a defence to continue"
                    , "Alert!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCollectInfoActionPerformed

    private void sliderPositionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPositionStateChanged
        
        int strengthLevel = sliderPosition.getValue();
        
        Strength strength = null;
        
        if (strengthLevel>=80) {
            strength = Strength.CLOSED;
        } else if (strengthLevel>=60) {
            strength = Strength.STRONG;
        } else if (strengthLevel>=40){
            strength = Strength.HIGH;
        } else if (strengthLevel>=20) {
            strength = Strength.MEDIUM;
        } else {
            strength = Strength.LOW;
        }
        
        for(Observer defence : defenceUnits) {
            if (defence.isPositionEnabled()) {
                defence.setStrengthLevel(strength);
            }
        }
    }//GEN-LAST:event_sliderPositionStateChanged


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
            java.util.logging.Logger.getLogger(MainControllerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainControllerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainControllerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainControllerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainControllerWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollectInfo;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox<String> cbSelectDefence;
    private javax.swing.JCheckBox ckbxAreaClear;
    private javax.swing.JCheckBox ckbxSendPvt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel lblAmmo;
    private javax.swing.JLabel lblFuel;
    private javax.swing.JLabel lblO2Amount;
    private javax.swing.JLabel lblO2Colon;
    private javax.swing.JLabel lblOxigen;
    private javax.swing.JLabel lblSoldierCount;
    private javax.swing.JSlider sliderPosition;
    private javax.swing.JTextArea txtAreaMessages;
    // End of variables declaration//GEN-END:variables

    
}
