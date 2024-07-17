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
    private Strength initialStrength;

    public MainControllerWindow(Strength initialStrength) {
        setLookAndFeel();
        initComponents();
        setInitialStrength(initialStrength);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setInitialStrength(Strength initialStrength) {
        
        this.initialStrength = initialStrength;
        
        switch (initialStrength) {
            case LOW:
                sliderPosition.setValue(10);
                break;
                
            case MEDIUM:
                sliderPosition.setValue(30);
                break;
                
            case HIGH:
                sliderPosition.setValue(50);
                break;
                
            case STRONG:
                sliderPosition.setValue(70);
                break;
                
            case CLOSED:
                sliderPosition.setValue(90);
                break;
                
        }
    }
    
    
    public void addDefenceUnit(Observer defenceUnit) {
        if (defenceUnit != null) {
            defenceUnits.add(defenceUnit);
            defenceUnit.setStrengthLevel(initialStrength);
            cbSelectDefence.addItem(defenceUnit.getDefenceName());
        }
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
        txtTypeMessage = new javax.swing.JTextArea();
        ckbxSendPvt = new javax.swing.JCheckBox();
        btnSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaMsgHistory = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cbSelectDefence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSelectDefence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence" }));

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

        lblAmmo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblFuel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        txtAreaMessages.setEditable(false);
        txtAreaMessages.setColumns(20);
        txtAreaMessages.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAreaMessages.setRows(5);
        jScrollPane1.setViewportView(txtAreaMessages);

        txtTypeMessage.setColumns(20);
        txtTypeMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTypeMessage.setRows(5);
        jScrollPane2.setViewportView(txtTypeMessage);

        ckbxSendPvt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbxSendPvt.setText("Send Private");

        btnSend.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtAreaMsgHistory.setEditable(false);
        txtAreaMsgHistory.setColumns(20);
        txtAreaMsgHistory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAreaMsgHistory.setRows(5);
        jScrollPane3.setViewportView(txtAreaMsgHistory);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Sent Messages");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblFuel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addComponent(lblAmmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(cbSelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCollectInfo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbxAreaClear)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ckbxSendPvt)
                            .addGap(46, 46, 46)
                            .addComponent(btnSend))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(52, 52, 52))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAmmo, lblFuel, lblSoldierCount});

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSoldierCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFuel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(lblAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ckbxSendPvt)
                                    .addComponent(btnSend)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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
            defence.setStrengthLevel(strength);
        }
    }//GEN-LAST:event_sliderPositionStateChanged

    
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
       
        String text = txtTypeMessage.getText(); 
        
        if (!text.equals("")) {
            
            String msg = "Command Center" + " : "+ text;
            
            if (ckbxSendPvt.isSelected()) {
                
                String selectedItem = cbSelectDefence.getSelectedItem().toString();
        
                if (!selectedItem.equals("Select Defence")) {
                    
                    Observer defence = null;
                    for(Observer ob : defenceUnits) {
                        if (ob.getDefenceName().equals(selectedItem)) {
                            defence = ob;
                            break;
                        }
                    }
                    
                    defence.sendMessage(msg);
                    txtAreaMsgHistory.append(selectedItem+" : "+text+"\n");
                    txtTypeMessage.setText(null);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a defence unit to send messages"
                    , "Alert!", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                
                for (Observer defence : defenceUnits) {
                    defence.sendMessage(msg);
                }
                txtAreaMsgHistory.append("Everyone : "+text+"\n");
                txtTypeMessage.setText(null);
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Please enter a message to send"
                    , "Alert!", JOptionPane.INFORMATION_MESSAGE);
        
        }
    }//GEN-LAST:event_btnSendActionPerformed


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
/*    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *
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

        /* Create and display the form *
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainControllerWindow(Strength.LOW).setVisible(true);
            }
        });
    }
*/
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAmmo;
    private javax.swing.JLabel lblFuel;
    private javax.swing.JLabel lblSoldierCount;
    private javax.swing.JSlider sliderPosition;
    private javax.swing.JTextArea txtAreaMessages;
    private javax.swing.JTextArea txtAreaMsgHistory;
    private javax.swing.JTextArea txtTypeMessage;
    // End of variables declaration//GEN-END:variables

    
}
