/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estacionamientonivel;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author vanes
 */
public class MenuUsr extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuUsr() {
        initComponents();
        this.setLocationRelativeTo(null);
        tiempo();
    }
    
    public void tiempo(){
          Timer timer = new Timer(1000, e -> {
            Date date = new Date();

            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/mm/yyyy");
            String formattedDate = dateFormatter.format(date);
            lb_fecha.setText(formattedDate);

            SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm:ss a");
            String formattedTime = timeFormatter.format(date);
            lb_hora.setText(formattedTime);

            
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
        jPanel2 = new javax.swing.JPanel();
        lb_fecha = new javax.swing.JLabel();
        lb_hora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_TipoUsuario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_agregarAuto = new javax.swing.JButton();
        btn_hora = new javax.swing.JButton();
        btn_lugar = new javax.swing.JButton();
        btn_salida = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        btn_renovacion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 57, 57));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_fecha.setFont(new java.awt.Font("Rockwell", 0, 19)); // NOI18N
        lb_fecha.setForeground(new java.awt.Color(204, 204, 255));
        lb_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fecha.setText("dd/mm/yyyy");
        jPanel2.add(lb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        lb_hora.setFont(new java.awt.Font("Rockwell", 0, 19)); // NOI18N
        lb_hora.setForeground(new java.awt.Color(204, 204, 255));
        lb_hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hora.setText("hh:mm:ss am");
        jPanel2.add(lb_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fecha");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hora");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Logo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 169, 109));

        lb_TipoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lb_TipoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_TipoUsuario.setText("Usuario");
        jPanel2.add(lb_TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 180, 90, 40));

        jButton1.setText("Manual");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 150, 55));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 240, 660));

        btn_agregarAuto.setBackground(new java.awt.Color(119, 175, 231));
        btn_agregarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconAgregarAuto.png"))); // NOI18N
        btn_agregarAuto.setText("Agregar auto");
        btn_agregarAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregarAuto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_agregarAuto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_agregarAuto.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_agregarAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregarAutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregarAutoMouseExited(evt);
            }
        });
        btn_agregarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarAutoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, 80));

        btn_hora.setBackground(new java.awt.Color(119, 175, 231));
        btn_hora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Hora.png"))); // NOI18N
        btn_hora.setText("Hora/fraccion");
        btn_hora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_hora.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_hora.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_horaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 150, 80));

        btn_lugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lugar.jpg"))); // NOI18N
        btn_lugar.setText("Lugares");
        btn_lugar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_lugar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_lugar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_lugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lugarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 150, 80));

        btn_salida.setBackground(new java.awt.Color(102, 153, 255));
        btn_salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salidaV.png"))); // NOI18N
        btn_salida.setText("Salida vehiculo");
        btn_salida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salida.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_salida.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(btn_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 150, 80));

        btn_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btn_Cerrar.setText("Cerrar secion");
        btn_Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cerrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_Cerrar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 150, 80));

        btn_renovacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/renovacion.png"))); // NOI18N
        btn_renovacion.setText("Renovación");
        btn_renovacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_renovacion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_renovacion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(btn_renovacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 150, 80));

        jLabel6.setFont(new java.awt.Font("Harlow Solid Italic", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Menu");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 180, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoMenu.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarAutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarAutoMouseEntered
        // TODO add your handling code here:
         btn_agregarAuto.setBackground(new Color(119, 119, 231));
    }//GEN-LAST:event_btn_agregarAutoMouseEntered

    private void btn_agregarAutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarAutoMouseExited
        // TODO add your handling code here:
         btn_agregarAuto.setBackground(new Color(119, 175, 231));
    }//GEN-LAST:event_btn_agregarAutoMouseExited

    private void btn_lugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lugarActionPerformed
        // TODO add your handling code here:
        csl_lugar abrir=new csl_lugar();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_lugarActionPerformed

    private void btn_agregarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarAutoActionPerformed
        // TODO add your handling code here:
        frm_agregarAuto abrir=new frm_agregarAuto();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_agregarAutoActionPerformed

    private void btn_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_horaActionPerformed
        // TODO add your handling code here:
        frm_horaFraccion abrir=new frm_horaFraccion();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_horaActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        // TODO add your handling code here:
        login_usr abrir=new login_usr();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Cerrar;
    public javax.swing.JButton btn_agregarAuto;
    public javax.swing.JButton btn_hora;
    public javax.swing.JButton btn_lugar;
    public javax.swing.JButton btn_renovacion;
    public javax.swing.JButton btn_salida;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lb_TipoUsuario;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_hora;
    // End of variables declaration//GEN-END:variables
}
