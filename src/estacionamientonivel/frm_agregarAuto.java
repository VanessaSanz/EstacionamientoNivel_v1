/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estacionamientonivel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author vanes
 */
public class frm_agregarAuto extends javax.swing.JFrame {

    public static LinkedList contenedorPension = new LinkedList();
    public static LinkedList contenedorLugares = new LinkedList();
    public int buscar;
    
    public frm_agregarAuto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void tiempo(){
          Timer timer = new Timer(1000, e -> {
            Date date = new Date();

            SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm:ss a");
            String formattedTime = timeFormatter.format(date);
            txt_hora.setText(formattedTime);

            
        });
        timer.start();
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_propietario = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        txt_color = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        jdate_fecha = new com.toedter.calendar.JDateChooser();
        sp_lugar = new javax.swing.JSpinner();
        cb_tipo = new javax.swing.JComboBox<>();
        cb_marca = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btn_tabla = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar auto");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Menu");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, -1));

        jLabel1.setText("Placa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel1.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 190, 40));

        jLabel2.setText("Propietario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel3.setText("Agregar auto (Pensión)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel5.setText("Direccion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel6.setText("Tipo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel7.setText("Marca");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel8.setText("Modelo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        jLabel9.setText("Color");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel10.setText("Hora");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        jLabel11.setText("Fehca");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jLabel12.setText("Lugar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 40, 20));

        txt_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_propietarioActionPerformed(evt);
            }
        });
        jPanel1.add(txt_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 212, 190, 30));
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 262, 190, 30));
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 190, 30));
        jPanel1.add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 180, 30));
        jPanel1.add(txt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 180, 30));
        jPanel1.add(txt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 180, 30));
        jPanel1.add(jdate_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 180, 30));

        sp_lugar.setModel(new javax.swing.SpinnerNumberModel(0, 0, 8, 1));
        jPanel1.add(sp_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 70, 30));

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Pick up", "Moto" }));
        jPanel1.add(cb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 190, 30));

        cb_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "BMW", "Cadilac", "Chevrolet", "Chrysler", "Dodge", "Ferrari", "Fiat", "Ford", "Honda", "Hyundai", "Jeep", "Kia", "Mazda", "Mercedes Benz", "Nissan", "Ram", "Renault", "Susuki", "Tesla", "Toyota", "Volkswagen", "Volvo" }));
        jPanel1.add(cb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 190, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 680, 20));

        btn_tabla.setText("Mostrar datos");
        jPanel1.add(btn_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 575, 360, 30));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 100, 30));

        btn_modificar.setText("Modificar");
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 100, 30));

        btn_eliminar.setText("Eliminar");
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 530, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_propietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_propietarioActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // Codigo boton guardar
        String placa=txt_placa.getText();
        String propietario=txt_propietario.getText();
        int telefono=Integer.parseInt(txt_telefono.getText());
        String direcc=txt_direccion.getText();
        String tipo=cb_tipo.getSelectedItem().toString();
        String marca=cb_marca.getSelectedItem().toString();
        int modelo=Integer.parseInt(txt_modelo.getText());
        String color=txt_color.getText();
        String hora=txt_hora.getText();
        String fecha=((JTextField)jdate_fecha.getDateEditor().getUiComponent()).getText();
        int lugar=Integer.parseInt(sp_lugar.getValue().toString());
       
        
        class_auto auto=new class_auto(placa, tipo, marca, modelo, color, hora, fecha, propietario, telefono, direcc, lugar, "Ocupado");
        contenedorPension.add(auto);

        class_auto lugares=new class_auto(lugar, "Ocupado");
        contenedorLugares.add(lugares);
        
        JOptionPane.showMessageDialog(null, "Auto registrado");
        
        
        
        
        txt_placa.setText("");
        txt_propietario.setText("");
        txt_telefono.setText("");
        txt_direccion.setText("");
        txt_modelo.setText("");
        txt_color.setText("");
        jdate_fecha.setCalendar(null);
        sp_lugar.setValue(1);
    }//GEN-LAST:event_btn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_agregarAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_agregarAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_agregarAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_agregarAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_agregarAuto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_tabla;
    private javax.swing.JComboBox<String> cb_marca;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jdate_fecha;
    private javax.swing.JSpinner sp_lugar;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_propietario;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
