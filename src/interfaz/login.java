/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import parcial.Parcial;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    Parcial conecto;
    
    PreparedStatement ps;
    ResultSet rs;
    
    private static com.mysql.jdbc.Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/pañalera"; 
    public login() {
        initComponents();
    }
    public Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName(driver);
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, pass);
            if(conn != null){
                System.out.println("La conexion se establecio bien con la DB");
            }  
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println("Error al conectar con la DB " + e);
        }
        return conn;
    }
    public void desconectar(){
        conn = null;
        if (conn == null) {
            System.out.println("Se desconecto de la DB");
        }
    }
     public void borrarCajas(){
        cajanombre.setText(null);
        cajaestrato.setText(null);
        cajaemail.setText(null);        
        cajacontraseña.setText(null);        
        cajapuntos.setText(null);                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jllogo = new javax.swing.JLabel();
        cajanombre = new javax.swing.JTextField();
        cajaestrato = new javax.swing.JTextField();
        cajaemail = new javax.swing.JTextField();
        cajacontraseña = new javax.swing.JTextField();
        cajapuntos = new javax.swing.JTextField();
        bconectar = new javax.swing.JButton();
        benviar = new javax.swing.JButton();
        bdesconectar = new javax.swing.JButton();
        jlfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        jLabel3.setText("Estrato");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 20));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, 20));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel6.setText("Puntos acumulados");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 150, 20));

        jllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b3663e41-db57-426a-a483-78d930e0503c_200x200.png"))); // NOI18N
        getContentPane().add(jllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 200, 160));
        getContentPane().add(cajanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 210, -1));
        getContentPane().add(cajaestrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 210, -1));
        getContentPane().add(cajaemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 210, -1));
        getContentPane().add(cajacontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 210, -1));
        getContentPane().add(cajapuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 210, -1));

        bconectar.setText("Conectar");
        bconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconectarActionPerformed(evt);
            }
        });
        getContentPane().add(bconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        benviar.setText("Enviar");
        benviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benviarActionPerformed(evt);
            }
        });
        getContentPane().add(benviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        bdesconectar.setText("Desconectar");
        bdesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdesconectarActionPerformed(evt);
            }
        });
        getContentPane().add(bdesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jlfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo-infantil-arco-iris-sol-nubes-cometas-globos-lugar-texto-ilustracion_118124-3484.jpg"))); // NOI18N
        getContentPane().add(jlfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconectarActionPerformed
        conecto = new Parcial();
        Connection reg = conecto.getConnection();  
    }//GEN-LAST:event_bconectarActionPerformed
    

    private void benviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benviarActionPerformed
         Connection conn = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("INSERT INTO datos(nombre, estrato, email, contraseña, puntos, fechareg) VALUES(?,?,?,?,?,?)");
            ps.setString(1, cajanombre.getText());
            ps.setString(2, cajaestrato.getText());
            ps.setString(3, cajaemail.getText());     
            ps.setString(4, cajacontraseña.getText());
            ps.setString(5, cajapuntos.getText());
            ps.setDate(6, Date.valueOf(LocalDate.now()));

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Los datos fueron enviados correctamente");
                borrarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Los datos no fueron enviados");
            }
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_benviarActionPerformed

    private void bdesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdesconectarActionPerformed
        conecto.desconectar();
    }//GEN-LAST:event_bdesconectarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bconectar;
    private javax.swing.JButton bdesconectar;
    private javax.swing.JButton benviar;
    private javax.swing.JTextField cajacontraseña;
    private javax.swing.JTextField cajaemail;
    private javax.swing.JTextField cajaestrato;
    private javax.swing.JTextField cajanombre;
    private javax.swing.JTextField cajapuntos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlfondo;
    private javax.swing.JLabel jllogo;
    // End of variables declaration//GEN-END:variables
}
