/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.views.panels;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Sistemas-05
 */
public class PnlCalculator extends javax.swing.JPanel {

    /**
     * Creates new form PnlCalculator
     */
    public PnlCalculator() {
        initComponents();
    }

    public JButton getBtnCalc() {
        return btnCalc;
    }

    public JButton getBtnNew() {
        return btnNew;
    }

    public JTextField getTxtNumber1() {
        return txtNumber1;
    }

    public JTextField getTxtNumber2() {
        return txtNumber2;
    }

    public JTextField getTxtResult() {
        return txtResult;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnCalc = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumber1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumber2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnCalc.setText("Calcular");
        jPanel1.add(btnCalc);

        btnNew.setText("Nuevo");
        jPanel1.add(btnNew);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Numero 1:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(txtNumber1, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Numero 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(txtNumber2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Resultado:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(txtResult, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
