package InterfacesUsuario;
import Cliente.Paquete;
import Servidor.Controlador;
import Usuarios.Cliente;
import Usuarios.Empleado;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    private Paquete myPaquete;

    /**
     * Constructor de clase
     *
     * @param paquete
     */
    public Registro(Paquete paquete) {
        this.myPaquete = paquete;
        initComponents();
        this.setResizable(false);
    }

    /**
     * Metodo que verifica que la informacion capturada por la interfaz sea
     * correcta
     *
     * @return boolean
     */
    public boolean verificarInformacion() {
        boolean verificado = true;
        verificado &= !this.nombreIn.getText().trim().equals("");
        verificado &= !this.apellidoIn.getText().trim().equals("");
        verificado &= !this.nickIn.getText().trim().equals("");
        verificado &= !this.ciudadIn.getText().trim().equals("");
        verificado &= !this.direccionIn.getText().trim().equals("");
        verificado &= !this.telefonoIn.getText().trim().equals("");
        verificado &= !this.correoIn.getText().trim().equals("");
        verificado &= this.telefonoIn.getText().trim().matches("[+-]?\\d*(\\.\\d+)?"); //el formato de fecha es dia, mes y año
        verificado &= this.telefonoIn.getText().trim().length() == 8; //La cantiad de digitos que debe de tener le numero para cumplir con los 8 digitos de numero en Costa Rica
        verificado &= this.correoIn.getText().trim().contains("@gmail.com"); //formato especifico de correo para su correcto uso
        return verificado && this.verificarRadios();
    }

    /**
     * Metodo que verifica que los JRadioButtons sean marcados correctamente
     *
     * @return boolean
     */
    public boolean verificarRadios() {
        if (this.esCliente.isSelected() && !this.esEmpleado.isSelected()) {
            return true;
        }
        if (!this.esCliente.isSelected() && this.esEmpleado.isSelected()) {
            return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensajeR = new javax.swing.JLabel();
        nombreM = new javax.swing.JLabel();
        apellidoM = new javax.swing.JLabel();
        nickM = new javax.swing.JLabel();
        contraM = new javax.swing.JLabel();
        ciudadM = new javax.swing.JLabel();
        direccionM = new javax.swing.JLabel();
        telefonoM = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        nombreIn = new javax.swing.JTextField();
        apellidoIn = new javax.swing.JTextField();
        nickIn = new javax.swing.JTextField();
        contraIn = new javax.swing.JTextField();
        ciudadIn = new javax.swing.JTextField();
        direccionIn = new javax.swing.JTextField();
        telefonoIn = new javax.swing.JTextField();
        correoIn = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        login = new javax.swing.JButton();
        esCliente = new javax.swing.JRadioButton();
        esEmpleado = new javax.swing.JRadioButton();
        menTip = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeR.setFont(new java.awt.Font("SansSerif", 0, 28)); // NOI18N
        mensajeR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeR.setText("REGISTRO DE USUARIOS");
        getContentPane().add(mensajeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 360, 70));

        nombreM.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nombreM.setText("Nombre/s");
        getContentPane().add(nombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        apellidoM.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        apellidoM.setText("Apellidos");
        getContentPane().add(apellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        nickM.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nickM.setText("Nombre de usuario");
        getContentPane().add(nickM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        contraM.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        contraM.setText("Contraseña");
        getContentPane().add(contraM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        ciudadM.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        ciudadM.setText("Ciudad");
        getContentPane().add(ciudadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        direccionM.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        direccionM.setText("Direccion");
        getContentPane().add(direccionM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        telefonoM.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        telefonoM.setText("Telefono");
        getContentPane().add(telefonoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        correo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        correo.setText("Correo");
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        nombreIn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nombreIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 94, 94)));
        getContentPane().add(nombreIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 250, -1));

        apellidoIn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        apellidoIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 94, 94)));
        getContentPane().add(apellidoIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 250, -1));

        nickIn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nickIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 94, 94)));
        getContentPane().add(nickIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 180, -1));

        contraIn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        contraIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 94, 94)));
        getContentPane().add(contraIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 240, -1));

        ciudadIn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        ciudadIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 94, 94)));
        getContentPane().add(ciudadIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 240, -1));

        direccionIn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        direccionIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 94, 94)));
        getContentPane().add(direccionIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 240, -1));

        telefonoIn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        telefonoIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 94, 94)));
        getContentPane().add(telefonoIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 240, -1));

        correoIn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        correoIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 94, 94)));
        getContentPane().add(correoIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 240, -1));

        registrar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginicon.png"))); // NOI18N
        login.setBorder(null);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 40, -1));

        esCliente.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        esCliente.setText("Cliente");
        getContentPane().add(esCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        esEmpleado.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        esEmpleado.setText("Empleado");
        getContentPane().add(esEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        menTip.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        menTip.setText("Tipo de cuenta");
        getContentPane().add(menTip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (this.verificarInformacion()) {
            String nombre, apellidos, nickname, password, ciudad, direccion, telefono, correo;
            nombre = this.nombreIn.getText().trim();
            apellidos = this.apellidoIn.getText().trim();
            nickname = this.nickIn.getText().trim();
            password = this.contraIn.getText().trim();
            ciudad = this.ciudadIn.getText().trim();
            direccion = this.direccionIn.getText().trim();
            telefono = this.telefonoIn.getText().trim();
            correo = this.correoIn.getText().trim();
            if (this.esCliente.isSelected()) {
                System.out.println("INICIANDO SESION");
                Cliente c = new Cliente(nombre, apellidos, nickname, password, ciudad, direccion, telefono, correo);
                this.myPaquete.getClientes().agregar(c);
                new Compra(this.myPaquete, c).setVisible(true);
            } else if (this.esEmpleado.isSelected()) {
                System.out.println("INICIANDO SESION");
                Empleado c = new Empleado(nombre, apellidos, nickname, password, ciudad, direccion, telefono, correo);
                this.myPaquete.getEmpleados().agregar(c);
                new Edicion(this.myPaquete).setVisible(true);
            }
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "LA INFORMACION INGRESADA NO PERMITE REALIZAR EL REGISTRO", "REGISTRO DE USUARIOS", 0);
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        new Inicio(new Controlador(this.myPaquete)).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoIn;
    private javax.swing.JLabel apellidoM;
    private javax.swing.JTextField ciudadIn;
    private javax.swing.JLabel ciudadM;
    private javax.swing.JTextField contraIn;
    private javax.swing.JLabel contraM;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField correoIn;
    private javax.swing.JTextField direccionIn;
    private javax.swing.JLabel direccionM;
    private javax.swing.JRadioButton esCliente;
    private javax.swing.JRadioButton esEmpleado;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton login;
    private javax.swing.JLabel menTip;
    private javax.swing.JLabel mensajeR;
    private javax.swing.JTextField nickIn;
    private javax.swing.JLabel nickM;
    private javax.swing.JTextField nombreIn;
    private javax.swing.JLabel nombreM;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField telefonoIn;
    private javax.swing.JLabel telefonoM;
    // End of variables declaration//GEN-END:variables
}
