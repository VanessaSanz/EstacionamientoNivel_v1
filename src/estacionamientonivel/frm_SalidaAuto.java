
package estacionamientonivel;

import java.util.Scanner;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vanes
 */
public class frm_SalidaAuto extends javax.swing.JFrame {

    Icon ticket;
    
    private DefaultTableModel modelo;
    int contador=0;
     public int buscar;
    
    public frm_SalidaAuto() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    public void CargarInterfaz(){
        String datos[][]={};
        String columna[]={"Placa","Propietario","Telefono","Direccion","Tipo","Marca","Modelo","Color","Hora","Fecha","Lugar","Disponibilidad"};
        modelo=new DefaultTableModel(datos,columna);
        tb_salida.setModel(modelo);
    }
    
    public void CargarDatos(){
        class_auto auto;
        for(int i=0; i<frm_agregarAuto.contenedorPension.size(); i++){
            auto=(class_auto)frm_agregarAuto.contenedorPension.get(i);
            modelo.insertRow(contador,new Object[]{});
            modelo.setValueAt(auto.getPlaca(),contador, 0);
            modelo.setValueAt(auto.getPropietario(),contador, 1);
            modelo.setValueAt(auto.getTelefono(),contador, 2);
            modelo.setValueAt(auto.getDireccion(),contador, 3);
            modelo.setValueAt(auto.getTipo(),contador, 4);
            modelo.setValueAt(auto.getMarca(),contador, 5);
            modelo.setValueAt(auto.getModelo(),contador, 6);
            modelo.setValueAt(auto.getColor(),contador, 7);
            modelo.setValueAt(auto.getHora(),contador, 8);
            modelo.setValueAt(auto.getFecha(),contador, 9);
            modelo.setValueAt(auto.getLugar(),contador, 10);
            modelo.setValueAt(auto.getDisponibolidad(),contador, 11);
            
        }
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
        btn_menu = new javax.swing.JButton();
        txt_placa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_entrada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_salida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tiempo = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        btn_pagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_salida = new javax.swing.JTable();
        txt_fecha = new javax.swing.JTextField();
        txt_lugat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu.setBackground(new java.awt.Color(255, 204, 255));
        btn_menu.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btn_menu.setText("Regresar");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 19, -1, 40));
        jPanel1.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 170, 40));

        jLabel4.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jLabel4.setText("Placa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_entradaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Salida");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        txt_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salidaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 150, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("HH:MM:SS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        Tiempo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Tiempo.setForeground(new java.awt.Color(102, 0, 0));
        Tiempo.setText("El tiempo transcurrido es: \" horas\" :\" minutos \" : \" segundos\"");
        jPanel2.add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        btn_calcular.setBackground(new java.awt.Color(255, 204, 255));
        btn_calcular.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        jPanel2.add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, 30));

        btn_pagar.setBackground(new java.awt.Color(255, 204, 255));
        btn_pagar.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btn_pagar.setText("Pagar");
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 100, 30));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Entrada");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("$15 x hora");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));
        jPanel2.add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 252, 60, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 510, 340));

        tb_salida.setBackground(new java.awt.Color(204, 204, 204));
        tb_salida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IHora", "Fecha", "Placa", "Lugar", "Disponibilidad"
            }
        ));
        tb_salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_salidaMouseClicked(evt);
            }
        });
        tb_salida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_salidaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tb_salida);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, -1));
        jPanel1.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 110, 30));
        jPanel1.add(txt_lugat, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 110, 30));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 102));
        jLabel8.setText("Lugar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 102));
        jLabel9.setText("Fecha");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ftiempo.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        String entradaStr=this.txt_entrada.getText();
        String salidaStr= this.txt_salida.getText();
        
        
        // Parsear las cadenas de entrada a objetos de tiempo
        String[] entradaParts = entradaStr.split(":");
        int entradaHoras = Integer.parseInt(entradaParts[0]);
        int entradaMinutos = Integer.parseInt(entradaParts[1]);
        int entradaSegundos = Integer.parseInt(entradaParts[2]);
        
        String[] salidaParts = salidaStr.split(":");
        int salidaHoras = Integer.parseInt(salidaParts[0]);
        int salidaMinutos = Integer.parseInt(salidaParts[1]);
        int salidaSegundos = Integer.parseInt(salidaParts[2]);
        
        // Calcular la diferencia de tiempo
        int horas = salidaHoras - entradaHoras;
        int minutos = salidaMinutos - entradaMinutos;
        int segundos = salidaSegundos - entradaSegundos;
        
        // Ajustar los valores para que estén en el rango correcto
        if (segundos < 0) {
            segundos += 60;
            minutos--;
        }
        
        if (minutos < 0) {
            minutos += 60;
            horas--;
        }
        
        if (horas < 0) {
            horas += 24;
        }
        
         Tiempo.setText("El tiempo transcurrido es: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    
         
         double total=horas*15;
         txt_costo.setText("$ "+total);
         
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void txt_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_entradaActionPerformed

    private void tb_salidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_salidaMouseClicked
        // TODO add your handling code here:
      int seleccionar = tb_salida.rowAtPoint(evt.getPoint());
      
        
        txt_placa.setText(String.valueOf(tb_salida.getValueAt(seleccionar, 0)));
        txt_entrada.setText(String.valueOf(tb_salida.getValueAt(seleccionar, 1)));
        txt_fecha.setText(String.valueOf(tb_salida.getValueAt(seleccionar, 2)));
        txt_lugat.setText(String.valueOf(tb_salida.getValueAt(seleccionar, 3)));
        
        /*
        modelo.setValueAt(auto.getPlaca(),contador, 0);
            modelo.setValueAt(auto.getPropietario(),contador, 1);
            modelo.setValueAt(auto.getTelefono(),contador, 2);
            modelo.setValueAt(auto.getDireccion(),contador, 3);
            modelo.setValueAt(auto.getTipo(),contador, 4);
            modelo.setValueAt(auto.getMarca(),contador, 5);
            modelo.setValueAt(auto.getModelo(),contador, 6);
            modelo.setValueAt(auto.getColor(),contador, 7);
            modelo.setValueAt(auto.getHora(),contador, 8);
            modelo.setValueAt(auto.getFecha(),contador, 9);
            modelo.setValueAt(auto.getLugar(),contador, 10);
            modelo.setValueAt(auto.getDisponibolidad(),contador, 11);
        */
        
        
    }//GEN-LAST:event_tb_salidaMouseClicked

    private void txt_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salidaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_salidaActionPerformed

    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed
        // Codigo boton pagar boton ticket
        
       JOptionPane.showMessageDialog(null," -----------TICKET----------- "
               +"\n <-----Estacionamiento ParkCar----->"
               +"\n -> Hora de entrada:"+txt_entrada.getText()
               +"\n -> Hora de salida"+txt_salida.getText()
               +"\n -> Fecha actual: "+txt_fecha.getText()
               +"\n -> Placa: "+txt_placa.getText()
               +"\n -> Lugar: "+txt_lugat.getText()
               +"\n -> Costo:"+txt_costo.getText(),"Ticket",JOptionPane.WARNING_MESSAGE,ticket);
       
       

  
       
        
        
    }//GEN-LAST:event_btn_pagarActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // Boton regresar menu
        
    }//GEN-LAST:event_btn_menuActionPerformed

    private void tb_salidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_salidaKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tb_salidaKeyTyped

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
            java.util.logging.Logger.getLogger(frm_SalidaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_SalidaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_SalidaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_SalidaAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_SalidaAuto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tiempo;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_pagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_salida;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_entrada;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_lugat;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_salida;
    // End of variables declaration//GEN-END:variables
}
