/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estacionamientonivel;

import com.google.zxing.oned.CodaBarWriter;
import java.awt.Color;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    private int counter = 0;
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanel4 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        panel_exit = new javax.swing.JPanel();
        lb_exit = new javax.swing.JLabel();
        panel_admin = new javax.swing.JPanel();
        lb_admin = new javax.swing.JLabel();
        panel_usr = new javax.swing.JPanel();
        lb_usr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        panel_entrar = new javax.swing.JPanel();
        lb_entrar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        message = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 270, 530));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_exit.setBackground(new java.awt.Color(255, 255, 255));

        lb_exit.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lb_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_exit.setText("X");
        lb_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_exitLayout = new javax.swing.GroupLayout(panel_exit);
        panel_exit.setLayout(panel_exitLayout);
        panel_exitLayout.setHorizontalGroup(
            panel_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panel_exitLayout.setVerticalGroup(
            panel_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        header.add(panel_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_admin.setBackground(new java.awt.Color(255, 255, 255));

        lb_admin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lb_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_admin.setText("Administrador");
        lb_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_adminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_adminLayout = new javax.swing.GroupLayout(panel_admin);
        panel_admin.setLayout(panel_adminLayout);
        panel_adminLayout.setHorizontalGroup(
            panel_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panel_adminLayout.setVerticalGroup(
            panel_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        header.add(panel_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        panel_usr.setBackground(new java.awt.Color(255, 255, 255));

        lb_usr.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lb_usr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_usr.setText("Usuario");
        lb_usr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_usrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_usrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_usrMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_usrLayout = new javax.swing.GroupLayout(panel_usr);
        panel_usr.setLayout(panel_usrLayout);
        panel_usrLayout.setHorizontalGroup(
            panel_usrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_usr, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panel_usrLayout.setVerticalGroup(
            panel_usrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_usr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        header.add(panel_usr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 130, 60));

        jPanel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

        jLabel1.setText("Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setText("Ingrese su nombre de usuario");
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 390, 50));

        jLabel3.setText("INICIAR SESIÓN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txt_pass.setForeground(new java.awt.Color(204, 204, 204));
        txt_pass.setText("*****");
        txt_pass.setBorder(null);
        txt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_passMousePressed(evt);
            }
        });
        jPanel2.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 390, 50));

        panel_entrar.setBackground(new java.awt.Color(0, 156, 223));
        panel_entrar.setForeground(new java.awt.Color(153, 204, 255));

        lb_entrar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lb_entrar.setForeground(new java.awt.Color(255, 255, 255));
        lb_entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_entrar.setText("Entrar");
        lb_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_entrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_entrarLayout = new javax.swing.GroupLayout(panel_entrar);
        panel_entrar.setLayout(panel_entrarLayout);
        panel_entrarLayout.setHorizontalGroup(
            panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panel_entrarLayout.setVerticalGroup(
            panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(panel_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 140, 60));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 390, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 390, 50));

        message.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanel2.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_adminMouseClicked
        // TODO add your handling code here:
        login_admin abrir=new login_admin();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_lb_adminMouseClicked

    private void lb_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_adminMouseEntered
        // TODO add your handling code here:
        panel_admin.setBackground(Color.lightGray);
        lb_admin.setForeground(Color.black);
    }//GEN-LAST:event_lb_adminMouseEntered

    private void lb_usrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_usrMouseClicked
        // TODO add your handling code here:
        login_usr abrir=new login_usr();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_lb_usrMouseClicked

    private void lb_usrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_usrMouseEntered
        // TODO add your handling code here:
        panel_usr.setBackground(Color.lightGray);
        lb_usr.setForeground(Color.black);
    }//GEN-LAST:event_lb_usrMouseEntered

    private void lb_usrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_usrMouseExited
        // TODO add your handling code here:
        panel_usr.setBackground(Color.white);
        lb_usr.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_usrMouseExited

    private void lb_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_adminMouseExited
        // TODO add your handling code here:
        panel_admin.setBackground(Color.white);
        lb_admin.setForeground(Color.BLACK);
    }//GEN-LAST:event_lb_adminMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
         xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void lb_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitMouseEntered
        // TODO add your handling code here:
        panel_exit.setBackground(Color.red);
        lb_exit.setForeground(Color.white);
    }//GEN-LAST:event_lb_exitMouseEntered

    private void lb_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitMouseExited
        // TODO add your handling code here:
        panel_exit.setBackground(Color.white);
        lb_exit.setForeground(Color.black);
    }//GEN-LAST:event_lb_exitMouseExited

    private void lb_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitMouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_lb_exitMouseClicked

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        // TODO add your handling code here:
        if (txt_usuario.getText().equals("Ingrese su nombre de usuario")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
        if (String.valueOf(txt_pass.getPassword()).isEmpty()) {
            txt_pass.setText("*****");
            txt_pass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMousePressed
        // TODO add your handling code here:
        if (String.valueOf(txt_pass.getPassword()).equals("*****")) {
            txt_pass.setText("");
            txt_pass.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su nombre de usuario");
            txt_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_passMousePressed

    private void lb_entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_entrarMouseEntered
        // TODO add your handling code here:
        panel_entrar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_lb_entrarMouseEntered

    private void lb_entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_entrarMouseExited
        // TODO add your handling code here:
        panel_entrar.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_lb_entrarMouseExited

    private void lb_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_entrarMouseClicked
        // TODO add your handling code here:
         String usuario = txt_usuario.getText();
        String contraseñausuario = new String(txt_pass.getPassword());
        
        //inicio de la auntenticacion del boton
        if (usuario.equals("user") && contraseñausuario.equals("user")) {
            // Credenciales válidas
            JOptionPane.showMessageDialog(this, "Bienvenido al sistema de estacionamiento! ");
            Menu m=new Menu();
            m.setVisible(true);
            dispose();
            
            class_auto rango=new class_auto("Root");
            rango.setRangoLog("Root");
            

        } else {
            
            counter ++;
                    if (counter == 3) {
                JOptionPane.showMessageDialog(this, "Excediste el número de intentos. Espera 10 segundos.");
                //message.setText("Excediste el número de intentos. Espera 10 segundos.");
                lb_entrar.setEnabled(false);
                message.setText("Bloqueado");

                // Esperar 10 segundos antes de habilitar el botón de nuevo
                new Thread(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(10);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    counter = 0;
                    message.setText("Desbloqueado");
                    lb_entrar.setEnabled(true);
                    }).start();
                }
                    else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos. Intento " + counter + " de 3." );
                //message.setText("Usuario o contraseña incorrectos. Intento " + counter + " de 3.");
                   }
            }
    }//GEN-LAST:event_lb_entrarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_admin;
    private javax.swing.JLabel lb_entrar;
    private javax.swing.JLabel lb_exit;
    private javax.swing.JLabel lb_usr;
    private javax.swing.JLabel message;
    private javax.swing.JPanel panel_admin;
    private javax.swing.JPanel panel_entrar;
    private javax.swing.JPanel panel_exit;
    private javax.swing.JPanel panel_usr;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
