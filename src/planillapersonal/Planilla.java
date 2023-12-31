/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package planillapersonal;

import javax.swing.JOptionPane;

/**
 *
 * @author angela
 */
public class Planilla extends javax.swing.JFrame {

    Trabajador[] personal=new Trabajador[10];
    int nTrabajadores=0;
    StringBuilder cadena=new StringBuilder("");
            
    public Planilla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trabajadorButtonGroup = new javax.swing.ButtonGroup();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        basicoLabel = new javax.swing.JLabel();
        basicoTextField = new javax.swing.JTextField();
        faltasLabel = new javax.swing.JLabel();
        faltasTextField = new javax.swing.JTextField();
        horasexLabel = new javax.swing.JLabel();
        horasexTextField = new javax.swing.JTextField();
        bonificacionLabel = new javax.swing.JLabel();
        bonificacionTextField = new javax.swing.JTextField();
        consultorRadioButton = new javax.swing.JRadioButton();
        empleadoRadioButton = new javax.swing.JRadioButton();
        agregarButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        mostrarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tasaTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigoLabel.setText("Código");

        nombreLabel.setText("Nombre");

        basicoLabel.setText("Básico");

        faltasLabel.setText("Días de falta");

        horasexLabel.setText("Horas extras");

        bonificacionLabel.setText("Bonificación");

        trabajadorButtonGroup.add(consultorRadioButton);
        consultorRadioButton.setText("Consultor");

        trabajadorButtonGroup.add(empleadoRadioButton);
        empleadoRadioButton.setSelected(true);
        empleadoRadioButton.setText("Empleado");

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        mostrarButton.setText("Mostrar");
        mostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Tasa  de retenciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(empleadoRadioButton)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(consultorRadioButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tasaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(horasexLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bonificacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(horasexTextField)
                                    .addComponent(bonificacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(basicoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(faltasLabel))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigoTextField)
                                    .addComponent(nombreTextField)
                                    .addComponent(basicoTextField)
                                    .addComponent(faltasTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basicoLabel)
                    .addComponent(basicoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faltasLabel)
                    .addComponent(faltasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horasexLabel)
                    .addComponent(horasexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bonificacionLabel)
                    .addComponent(bonificacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tasaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoRadioButton)
                    .addComponent(consultorRadioButton))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton)
                    .addComponent(buscarButton)
                    .addComponent(mostrarButton))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        
        String codigo=codigoTextField.getText();
        String nombre=nombreTextField.getText();
        double basico=Double.parseDouble(basicoTextField.getText());
        
        try{
            if (empleadoRadioButton.isSelected()){
                int diasFalta=Integer.parseInt(faltasTextField.getText());
                int horasExtra=Integer.parseInt(horasexTextField.getText());
                
                if(personal.length>nTrabajadores){
                    personal[nTrabajadores]=new Empleado(codigo,nombre,basico,diasFalta,horasExtra);
                    JOptionPane.showMessageDialog(this, "Trabajador agregado con exito.");
                    
                    double tasa=Double.parseDouble(tasaTextField.getText());
                    personal[nTrabajadores].calcularRetenciones(tasa);
                    personal[nTrabajadores].calcularNeto();
                    
                    nTrabajadores++;
                }
                else{
                    throw new RangoException("Arreglo de trabajadores lleno.");
                }
                            
            }
            else{
                double bonificacion=Double.parseDouble(bonificacionTextField.getText());
                
                if(personal.length>nTrabajadores){
                    personal[nTrabajadores]=new Consultor(codigo,nombre,basico,bonificacion);
                    JOptionPane.showMessageDialog(this, "Trabajador agregado con exito.");
                    
                    double tasa=Double.parseDouble(tasaTextField.getText());
                    personal[nTrabajadores].calcularRetenciones(tasa);
                    personal[nTrabajadores].calcularNeto();
                    
                    nTrabajadores++;
                }
                else{
                    throw new RangoException("Arreglo de trabajadores lleno.");
                }
                
            }
            
            
        }
        
        catch(RangoException e){
            JOptionPane.showMessageDialog(this, e.mostrar());        
        }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void mostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButtonActionPerformed
        cadena.setLength(0);
        
        for(int i=0;i<nTrabajadores;i++){
            if (personal[i] != null) {
                cadena.append("Codigo: ").append(personal[i].getCodigo());
                cadena.append("\nNombre: ").append(personal[i].getNombre());
                cadena.append("\nBasico: ").append(personal[i].getBasico());
                cadena.append("\nRetenciones: ").append(personal[i].getRetenciones());

                if(personal[i] instanceof Empleado){
                    cadena.append("\nDias de falta: ").append(((Empleado)personal[i]).getDiasFaltas());
                }
                else{
                    cadena.append("\nBonificacion: ").append(((Consultor)personal[i]).getBonificacion());
                }

                cadena.append("\nNeto: ").append(personal[i].getNeto());

                cadena.append("\n\n");
            }
        }
        
        JOptionPane.showMessageDialog(this, cadena);
    }//GEN-LAST:event_mostrarButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        cadena.setLength(0);
        boolean seEncuentra=false;
        String codigo=codigoTextField.getText();
        
        for(int i=0;i<nTrabajadores;i++){
            if(codigo.equals(personal[i].getCodigo())){
                seEncuentra=true;
                
                cadena.append("Codigo: ").append(personal[i].getCodigo());
                cadena.append("\nNombre: ").append(personal[i].getNombre());
                cadena.append("\nBasico: ").append(personal[i].getBasico());
                cadena.append("\nRetenciones: ").append(personal[i].getRetenciones());
                cadena.append("\nNeto: ").append(personal[i].getNeto());
                
                JOptionPane.showMessageDialog(this, cadena);
            }
        }
        
       if(seEncuentra==false){
           JOptionPane.showMessageDialog(this, "No se encuentra.");
       }
        
    }//GEN-LAST:event_buscarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JLabel basicoLabel;
    private javax.swing.JTextField basicoTextField;
    private javax.swing.JLabel bonificacionLabel;
    private javax.swing.JTextField bonificacionTextField;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JRadioButton consultorRadioButton;
    private javax.swing.JRadioButton empleadoRadioButton;
    private javax.swing.JLabel faltasLabel;
    private javax.swing.JTextField faltasTextField;
    private javax.swing.JLabel horasexLabel;
    private javax.swing.JTextField horasexTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mostrarButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField tasaTextField;
    private javax.swing.ButtonGroup trabajadorButtonGroup;
    // End of variables declaration//GEN-END:variables
}
