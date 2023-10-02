/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uni.aed.gui;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import uni.aed.doublelinkedlist.DoubleLinkedList;
import uni.aed.linkedlist.SingleLinkedList;

/**
 *
 * @author mitch
 */
public class FrmLinkedList extends javax.swing.JFrame {
    
    private final String CADENA_VACIA = "";
    
    
    private final DefaultListModel modelListInitial = new DefaultListModel();
    private final DefaultListModel modelListOperations = new DefaultListModel();
    private SingleLinkedList list;
    private DoubleLinkedList doublelinkedlist;
    private int typeLinkedList = 0;
    ImageIcon iconBateman;
    ImageIcon iconNotFound;

    /**
     * Creates new form FrmLinkedList
     */
    public FrmLinkedList() {
        initComponents();
        list = new SingleLinkedList();
        doublelinkedlist = new DoubleLinkedList();
        lstInitial.setModel(modelListInitial);
        lstOperations.setModel(modelListOperations);
        iconBateman = new ImageIcon("C:\\Users\\mitch\\OneDrive\\Documentos\\NetBeansProjects\\uni.aed_SortProjectTarea_jar_1.0-SNAPSHOT\\src\\main\\resources\\images\\patrickBateman.png");
        iconNotFound = new ImageIcon("C:\\Users\\mitch\\OneDrive\\Documentos\\NetBeansProjects\\uni.aed_SortProjectTarea_jar_1.0-SNAPSHOT\\src\\main\\resources\\images\\icons8-not-found-64.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTypeValues = new javax.swing.ButtonGroup();
        btnGroupAdd = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtValue = new javax.swing.JTextField();
        rbtnUniqueValues = new javax.swing.JRadioButton();
        rbtnAllowDuplicates = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        rbtnAddLast = new javax.swing.JRadioButton();
        rbtnAddFirst = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstOperations = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstInitial = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        cboxTypeLinkedList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operations with LinkedList");

        txtValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValueKeyTyped(evt);
            }
        });

        btnGroupTypeValues.add(rbtnUniqueValues);
        rbtnUniqueValues.setSelected(true);
        rbtnUniqueValues.setText("Valores únicos");

        btnGroupTypeValues.add(rbtnAllowDuplicates);
        rbtnAllowDuplicates.setText("Permite duplicados");

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-añadir-32.png"))); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-basura-llena-32.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-visible-32.png"))); // NOI18N
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegister)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnDisplay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDisplay)
                    .addComponent(btnDelete)
                    .addComponent(btnRegister))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGroupAdd.add(rbtnAddLast);
        rbtnAddLast.setSelected(true);
        rbtnAddLast.setText("Add Last");

        btnGroupAdd.add(rbtnAddFirst);
        rbtnAddFirst.setText("Add First");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-escoba-32.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(rbtnUniqueValues, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(rbtnAllowDuplicates)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(rbtnAddLast, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(rbtnAddFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnUniqueValues)
                            .addComponent(rbtnAllowDuplicates))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnAddLast)
                                    .addComponent(rbtnAddFirst)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lstOperations.setBorder(javax.swing.BorderFactory.createTitledBorder("Operational List"));
        jScrollPane2.setViewportView(lstOperations);

        lstInitial.setBorder(javax.swing.BorderFactory.createTitledBorder("Initial List"));
        jScrollPane3.setViewportView(lstInitial);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(354, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
        );

        jLabel1.setText("jLabel1");

        cboxTypeLinkedList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SingleLinkedList", "DoubleLinkedList", "CircularLinkedList" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(cboxTypeLinkedList, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboxTypeLinkedList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValueKeyTyped
        
        int key =evt.getKeyChar();
        boolean numero=key>=48 && key<=57;
        if(!numero)
            evt.consume();
    }//GEN-LAST:event_txtValueKeyTyped

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        registrar();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        modelListOperations.removeAllElements();
        
        
        if (list.getHead() == null && doublelinkedlist == null){
            JOptionPane.showMessageDialog(rootPane, "La lista esta vacía", 
                    "ERROR", JOptionPane.ERROR_MESSAGE,iconNotFound);
            return ;
        }
        switch(cboxTypeLinkedList.getSelectedIndex()){
            case 0 -> {
                modelListOperations.addElement(list.toString());
                System.out.println("Se usa un SingleLinkedList");
            }
            case 1 -> {
                modelListOperations.addElement(doublelinkedlist.toString());
                System.out.println("Se usa un DoubleLinkedList");
            } 
        }
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        modelListInitial.removeAllElements();
        modelListOperations.removeAllElements();
        list.clear();
        doublelinkedlist.clear();
        txtValue.setText(CADENA_VACIA);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registrar() {
        
        Integer value;
        try {
            value = Integer.parseInt(txtValue.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "La lista esta vacía", 
                    "ERROR", JOptionPane.ERROR_MESSAGE,iconNotFound);
            txtValue.selectAll();
            txtValue.requestFocus();
            value = null;
            return ;
        }
        
        if (rbtnUniqueValues.isSelected()){
            if (!modelListInitial.contains(txtValue.getText())){
                //modelListInitial.addElement(txtValue.getText());
                if (rbtnAddLast.isSelected()){
                    
                    modelListInitial.addElement(txtValue.getText());
                    switch(cboxTypeLinkedList.getSelectedIndex()){
                        
                        case 0 -> {
                            list.addLast(Integer.parseInt(txtValue.getText()));
                            System.out.println("Se usa un SingleLinkedList");
                        }
                        
                        case 1 -> {
                            doublelinkedlist.addLast(Integer.parseInt(txtValue.getText()));
                            System.out.println("Se usa un DoubleLinkedList");
                        } 
                    }
                }
                if (rbtnAddFirst.isSelected()){
                    modelListInitial.add(0, txtValue.getText());
                    switch(cboxTypeLinkedList.getSelectedIndex()){
                        
                        case 0 -> {
                            list.addFirst(Integer.parseInt(txtValue.getText()));
                            System.out.println("Se usa un SingleLinkedList");
                        }
                        
                        case 1 -> {
                            doublelinkedlist.addFirt(Integer.parseInt(txtValue.getText()));
                            System.out.println("Se usa un DoubleLinkedList");
                        } 
                    }
                }    
            }
            
            txtValue.setText("");
        }
                
        if (rbtnAllowDuplicates.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Funcionalidad pendiente de implementación");
            return;
        }  
    }
    
    private void delete(){
        String value = txtValue.getText();
        if (!modelListInitial.contains(value)){
            JOptionPane.showMessageDialog(rootPane, "El elemento no se encuentra en la lista", 
                    "ERROR", JOptionPane.ERROR_MESSAGE,iconNotFound);
            return ;
        }
        
        Integer intValue = Integer.parseInt(value);
        
        
        switch(cboxTypeLinkedList.getSelectedIndex()){
            case 0 -> {
                list.remove(intValue);
                System.out.println("Se usa un SingleLinkedList");
        }
            case 1 -> {
                doublelinkedlist.remove(intValue);
                System.out.println("Se usa un DoubleLinkedList");
                System.out.println(doublelinkedlist.toString());
            } 
        }
        modelListInitial.removeElement(value);
        
    }
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
            java.util.logging.Logger.getLogger(FrmLinkedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLinkedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLinkedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLinkedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLinkedList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.ButtonGroup btnGroupAdd;
    private javax.swing.ButtonGroup btnGroupTypeValues;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cboxTypeLinkedList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstInitial;
    private javax.swing.JList<String> lstOperations;
    private javax.swing.JRadioButton rbtnAddFirst;
    private javax.swing.JRadioButton rbtnAddLast;
    private javax.swing.JRadioButton rbtnAllowDuplicates;
    private javax.swing.JRadioButton rbtnUniqueValues;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}