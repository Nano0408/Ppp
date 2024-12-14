package InterfacesUsuario;

import Cliente.Paquete;
import Servidor.Controlador;
import Usuarios.Cliente;
import Usuarios.Empleado;
import Usuarios.Usuario;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    private Controlador myControlador;
    private Paquete myPaquete;
    private Usuario myUsuario;
    private Registro myRegistro;

    /**
     * Constructor de clase
     *
     * @param myControlador
     */
    public Inicio(Controlador myControlador) {
        initComponents();
        this.myControlador = myControlador;
        this.myControlador.leer();
        this.myPaquete = this.myControlador.getMiPaquete();
        this.setLocationRelativeTo(null);
        this.contra.setText("");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icono = new javax.swing.JLabel();
        nick = new javax.swing.JLabel();
        contrasena = new javax.swing.JLabel();
        inicio = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        nickIn = new javax.swing.JTextField();
        registro = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconuser.png"))); // NOI18N
        getContentPane().add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 220));

        nick.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        nick.setText("Usuario:");
        getContentPane().add(nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 40));

        contrasena.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        contrasena.setText("Contraseña:");
        getContentPane().add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 40));

        inicio.setFont(new java.awt.Font("SansSerif", 0, 28)); // NOI18N
        inicio.setText("Inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 140, 40));

        contra.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        contra.setText("jPasswordField1");
        contra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActionPerformed(evt);
            }
        });
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 150, 40));

        nickIn.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        nickIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nickIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickInActionPerformed(evt);
            }
        });
        getContentPane().add(nickIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 190, 40));

        registro.setBackground(new java.awt.Color(255, 255, 255));
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registericon.png"))); // NOI18N
        registro.setBorder(null);
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 40, 50));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        boolean verificada = !this.nickIn.getText().trim().equals("") && !this.contra.getText().trim().equals(""); //Metodo para ocultar contraseña
        if (verificada) {
            Cliente c = this.buscarCliente(this.nickIn.getText().trim(), this.contra.getText().trim()); //Metodo para ocultar contraseña
            Empleado e = this.buscarEmpleado(this.nickIn.getText().trim(), this.contra.getText().trim()); //Metodo para ocultar contraseña
            if (c != null) {
                if (c.isEstado()) {
                    System.out.println("Accesando a la cuenta de cliente.....");
                    this.setVisible(false);
                    new Compra(this.myPaquete, c).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "EL CLIENTE SOLICITADO ESTA INACTIVADO", "INICIO DE SESION", 0);
                }
            } else if (e != null) {
                if (e.isEstado()) {
                    System.out.println("Accesando a la cuenta de empleado.....");
                    new Edicion(this.myPaquete).setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "EL EMPLEADO SOLICITADO ESTA INACTIVADO", "INICIO DE SESION", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE LOCALIZO EL PERFIL RELACIONADO A LA INFORMACION INGRESADA", "INICIO DE SESION", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "LA INFORMACION INGRESADA NO PERMITE EL INICIO DE SESION", "INICIO DE SESION", 0);
        }
    }//GEN-LAST:event_inicioActionPerformed

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        new Registro(this.myPaquete).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registroActionPerformed

    private void nickInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nickInActionPerformed

    private void contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraActionPerformed
    /**
     * Metodo que busca la informacion de interfaz en catalogo clientes
     *
     * @param nick
     * @param pass
     * @return Cliente
     */
    public Cliente buscarCliente(String nick, String pass) {
        for (Cliente c : this.myPaquete.getClientes().getClientes()) {
            if (c.getNickname().equals(nick) && c.getPassword().equals(pass)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Metodo que busca la informacion de interfaz en catalogo empleados
     *
     * @param nick
     * @param pass
     * @return Empleado
     */
    public Empleado buscarEmpleado(String nick, String pass) {
        for (Empleado e : this.myPaquete.getEmpleados().getEmpleados()) {
            if (e.getNickname().equals(nick) && e.getPassword().equals(pass)) {
                return e;
            }
        }
        return null;
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio(new Controlador(new Paquete())).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contra;
    private javax.swing.JLabel contrasena;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel nick;
    private javax.swing.JTextField nickIn;
    private javax.swing.JButton registro;
    // End of variables declaration//GEN-END:variables
}
