package InterfacesUsuario;

import Cliente.*;
import Farmaceuticas.*;
import Usuarios.Cliente;
import Usuarios.Empleado;
import Usuarios.Enlace;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Edicion extends javax.swing.JFrame {

    private Paquete myPaquete;
    private ArrayList<VistaCatalogo> misCatalogos = new ArrayList<>();
    private int eleccion = 0, inActivar = 0;
    private Enlace myEnlace;

    /**
     * Constructor de clase
     *
     * @param myPaquete
     */
    public Edicion(Paquete myPaquete) {
        this.myPaquete = myPaquete;
        initComponents();
        this.visualizarP(false);
        this.visualizarC(false);
        this.visualizarF(false);
        this.mensajeAcoIn.setVisible(false);
        this.jTextField12.setVisible(false);
        this.visualizarEli(false);
        this.visualizarinAcitva(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarProducto = new javax.swing.JButton();
        agregarCategoria = new javax.swing.JButton();
        agregarFabricante = new javax.swing.JButton();
        eliminarProducto = new javax.swing.JButton();
        eliminarCategoria = new javax.swing.JButton();
        eliminarFabricante = new javax.swing.JButton();
        inactivarCategoria = new javax.swing.JButton();
        inactivarUsuario = new javax.swing.JButton();
        verCatalogos = new javax.swing.JButton();
        activarCategoria = new javax.swing.JButton();
        activarUsuario = new javax.swing.JButton();
        incativarProducto = new javax.swing.JButton();
        activarProducto = new javax.swing.JButton();
        facturas = new javax.swing.JButton();
        categoriaP = new javax.swing.JLabel();
        caducidadP = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        precioP = new javax.swing.JLabel();
        nombreFabricante = new javax.swing.JLabel();
        paisFabricante = new javax.swing.JLabel();
        nombreP = new javax.swing.JLabel();
        guardarP = new javax.swing.JButton();
        nombreC = new javax.swing.JLabel();
        caracteristicasC = new javax.swing.JLabel();
        guardarC = new javax.swing.JButton();
        nombreFabri = new javax.swing.JLabel();
        paisFabri = new javax.swing.JLabel();
        guardarF = new javax.swing.JButton();
        mensajeAcoIn = new javax.swing.JLabel();
        mensajeEliminar = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        aplicar = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarProducto.setText("Agregar Producto");
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(agregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        agregarCategoria.setText("Agregar Categoria");
        agregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(agregarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        agregarFabricante.setText("Agregar Fabricante");
        agregarFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarFabricanteActionPerformed(evt);
            }
        });
        getContentPane().add(agregarFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        eliminarProducto.setText("Eliminar producto");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        eliminarCategoria.setText("Eliminar Categoria");
        eliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        eliminarFabricante.setText("Eliminar Fabricante");
        eliminarFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFabricanteActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        inactivarCategoria.setText("Inactivar Categoria");
        inactivarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactivarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(inactivarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        inactivarUsuario.setText("Inactivar Usuario");
        inactivarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactivarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(inactivarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        verCatalogos.setText("Ver Catalogos");
        verCatalogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCatalogosActionPerformed(evt);
            }
        });
        getContentPane().add(verCatalogos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        activarCategoria.setText("Activar Categoria");
        activarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(activarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        activarUsuario.setText("Activar Usuario");
        activarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(activarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        incativarProducto.setText("Inactivar Producto");
        incativarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incativarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(incativarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        activarProducto.setText("Activar Producto");
        activarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(activarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        facturas.setText("Ver Facturas");
        facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturasActionPerformed(evt);
            }
        });
        getContentPane().add(facturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        categoriaP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        categoriaP.setText("Categoria");
        getContentPane().add(categoriaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        caducidadP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caducidadP.setText("Caducidad");
        getContentPane().add(caducidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        cantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cantidad.setText("Cantidad");
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        precioP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        precioP.setText("Precio");
        getContentPane().add(precioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        nombreFabricante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreFabricante.setText("Nombre de Fabricante");
        getContentPane().add(nombreFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        paisFabricante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        paisFabricante.setText("Pais Fabricante");
        getContentPane().add(paisFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        nombreP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreP.setText("Nombre");
        getContentPane().add(nombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        guardarP.setText("Guardar");
        guardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPActionPerformed(evt);
            }
        });
        getContentPane().add(guardarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        nombreC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreC.setText("Nombre de Categoria");
        getContentPane().add(nombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        caracteristicasC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caracteristicasC.setText("Caracteristicas");
        getContentPane().add(caracteristicasC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        guardarC.setText("Guardar");
        guardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCActionPerformed(evt);
            }
        });
        getContentPane().add(guardarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        nombreFabri.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreFabri.setText("Nombre del Fabricante");
        getContentPane().add(nombreFabri, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        paisFabri.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        paisFabri.setText("Pais del Fabricante");
        getContentPane().add(paisFabri, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        guardarF.setText("Guardar");
        guardarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFActionPerformed(evt);
            }
        });
        getContentPane().add(guardarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        mensajeAcoIn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mensajeAcoIn.setText("Ingresa el nickname del usuario");
        getContentPane().add(mensajeAcoIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 280, -1));

        mensajeEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mensajeEliminar.setText("Ingresa el nombre a eliminar");
        getContentPane().add(mensajeEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 260, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 220, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 220, -1));

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 220, -1));

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 220, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 90, -1));

        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 150, -1));

        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 150, -1));

        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 160, -1));

        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 160, -1));

        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 160, -1));

        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 160, -1));

        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 150, -1));

        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 150, -1));

        aplicar.setText("Aplicar");
        aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarActionPerformed(evt);
            }
        });
        getContentPane().add(aplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        mensaje.setFont(new java.awt.Font("SansSerif", 0, 28)); // NOI18N
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje.setText("Opciones de Administrador");
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 350, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarCategoriaActionPerformed
        this.mensajeAcoIn.setText("Ingresa el nombre de la categoria");
        this.visualizarinAcitva(true);
        this.inActivar = 4;
    }//GEN-LAST:event_activarCategoriaActionPerformed

    private void inactivarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactivarCategoriaActionPerformed
        this.mensajeAcoIn.setText("Ingresa el nombre de la categoria");
        this.visualizarinAcitva(true);
        this.inActivar = 1;
    }//GEN-LAST:event_inactivarCategoriaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoActionPerformed
        this.visualizarP(true);
        this.limpiar();

    }//GEN-LAST:event_agregarProductoActionPerformed
    /**
     * Metodo que visibiliza los atributos de clase contenidos
     *
     * @param o
     */
    public void visualizarEli(boolean o) {
        this.mensajeEliminar.setVisible(o);
        this.jTextField13.setVisible(o);
        this.aplicar.setVisible(o);
    }

    /**
     * Metodo que visibiliza los atributos de clase contenidos
     *
     * @param o
     */
    public void visualizarinAcitva(boolean o) {
        this.mensajeAcoIn.setVisible(o);
        this.jTextField12.setVisible(o);
        this.aplicar.setVisible(o);
    }
    private void guardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPActionPerformed
        if (this.vefiricarInfoRP()) {
            String nombre = jTextField1.getText();
            String cat = jTextField2.getText();
            String cad = jTextField3.getText();
            int cantidad = Integer.parseInt(jTextField4.getText());
            double precio = Double.parseDouble(jTextField5.getText());
            String nomFab = jTextField6.getText();
            String pais = jTextField7.getText();
            this.myPaquete.getProductos().agregar(new Producto(nombre, cat, cad, cantidad, precio, new CasaFabricante(nomFab, pais)));
            this.visualizarP(false);
        } else {
            System.out.println("LA INFORMACION INGRESADA NO CUMPLE LAS CARACTERISTICAS DESEADAS");
            this.limpiar();
        }
    }//GEN-LAST:event_guardarPActionPerformed

    private void agregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCategoriaActionPerformed
        this.visualizarC(true);
    }//GEN-LAST:event_agregarCategoriaActionPerformed

    private void agregarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarFabricanteActionPerformed
        this.visualizarF(true);
    }//GEN-LAST:event_agregarFabricanteActionPerformed

    private void guardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCActionPerformed
        boolean verificada = !this.jTextField8.getText().trim().equals("") && !this.jTextField9.getText().trim().equals("");
        if (verificada) {
            this.myPaquete.getCategorias().agregar(new Categoria(this.jTextField8.getText().trim(), this.jTextField9.getText().trim()));
            this.visualizarC(false);
        } else {
            System.out.println("ERROR: La informacion ingresada no cumple las carasteristicas deseadas");
        }
    }//GEN-LAST:event_guardarCActionPerformed

    private void guardarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFActionPerformed
        boolean verificada = !this.jTextField10.getText().trim().equals("") && !this.jTextField11.getText().trim().equals("");
        if (verificada) {
            this.visualizarF(false);
            this.myPaquete.getFabricantes().agregar(new CasaFabricante(this.jTextField10.getText().trim(), this.jTextField11.getText().trim()));
        } else {
            System.out.println("ERROR: La informacion ingresada no cumple las carasteristicas deseadas");
        }
    }//GEN-LAST:event_guardarFActionPerformed

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        this.mensajeEliminar.setText("Ingrese la clave del producto");
        this.visualizarEliminar(true);
        this.eleccion = 1;
    }//GEN-LAST:event_eliminarProductoActionPerformed

    private void eliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCategoriaActionPerformed
        this.mensajeEliminar.setText("Ingrese el nombre de la categoria");
        this.visualizarEliminar(true);
        this.eleccion = 2;
    }//GEN-LAST:event_eliminarCategoriaActionPerformed

    private void eliminarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFabricanteActionPerformed
        this.mensajeEliminar.setText("Ingrese el nombre del fabricante");
        this.visualizarEliminar(true);
        this.eleccion = 3;
    }//GEN-LAST:event_eliminarFabricanteActionPerformed
    /**
     * Metodo que visibiliza los atributos de clase contenidos
     *
     * @param o
     */
    public void visualizarEliminar(boolean o) {
        this.aplicar.setVisible(o);
        this.mensajeEliminar.setVisible(o);
        this.jTextField13.setVisible(o);
    }
    private void aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarActionPerformed
        String cadena = this.jTextField12.getText().trim();
        String cadena1 = this.jTextField13.getText().trim();
        if (!cadena1.equals("")) {
            if (this.eleccion != 0) {
                switch (this.eleccion) {
                    case 1:
                        Producto p = this.myPaquete.getProductos().consulta(cadena1);
                        if (p != null) {
                            this.myPaquete.getProductos().eliminar(this.myPaquete.getProductos().consulta(cadena1));
                        } else {
                            JOptionPane.showMessageDialog(null, "\tLA ACCION HA SIDO ABORTADA" + "\n(NO SE HA LOCALIZADO AL OBJETO REFERIDO)", "CONTROL DE ACCIONES", 0);
                        }
                        break;
                    case 2:
                        Categoria c = this.myPaquete.getCategorias().consulta(cadena1);
                        System.out.println(c == null);
                        if (c != null) {
                            this.myPaquete.getCategorias().eliminar(this.myPaquete.getCategorias().consulta(cadena1));
                        } else {
                            JOptionPane.showMessageDialog(null, "\tLA ACCION HA SIDO ABORTADA" + "\n(NO SE HA LOCALIZADO AL OBJETO REFERIDO)", "CONTROL DE ACCIONES", 0);
                        }
                        break;
                    case 3:
                        CasaFabricante cf = this.myPaquete.getFabricantes().consulta(cadena1);
                        if (cf != null) {
                            this.myPaquete.getFabricantes().eliminar(this.myPaquete.getFabricantes().consulta(cadena1));
                        } else {
                            JOptionPane.showMessageDialog(null, "\tLA ACCION HA SIDO ABORTADA" + "\n(NO SE HA LOCALIZADO AL OBJETO REFERIDO)", "CONTROL DE ACCIONES", 0);
                        }
                        break;
                }
                this.visualizarEli(true);
            }
        } else if (!cadena.equals("")) {
            if (this.inActivar != 0) {
                switch (this.inActivar) {
                    case 1:
                        Categoria c = this.myPaquete.getCategorias().consulta(cadena);
                        if (c != null) {
                            this.myPaquete.getCategorias().consulta(cadena).setEstado(false);
                            System.out.println(">>INACTIVACION DE CATEOGRIA EXITOSA<<");
                        } else {
                            JOptionPane.showMessageDialog(null, "\tLA ACCION HA SIDO ABORTADA" + "\n(NO SE HA LOCALIZADO AL OBJETO REFERIDO)", "CONTROL DE ACCIONES", 0);
                        }
                        break;
                    case 2:
                        Cliente c1 = (Cliente) this.myPaquete.getClientes().consulta(cadena);
                        Empleado e = (Empleado) this.myPaquete.getEmpleados().consulta(cadena);
                        boolean desactivado = false;
                        if (c1 != null) {
                            if (this.validarIn_Activacion(c1)){
                            }else 
                             this.myPaquete.getClientes().desactivar(c1);
                                desactivado = true;
                        }
                        if (e != null) {
                            this.myPaquete.getEmpleados().desactivar(e);
                            desactivado = true;
                        }
                        if (!desactivado) {
                            JOptionPane.showMessageDialog(null, "\tLA ACCION HA SIDO ABORTADA" + "\n(NO SE HA LOCALIZADO AL OBJETO REFERIDO)", "CONTROL DE ACCIONES", 0);
                        }

                        break;
                    case 3:
                        Producto p = this.myPaquete.getProductos().consulta(cadena);
                        if (p != null) {
                            this.myPaquete.getProductos().consulta(cadena).setEstado(false);
                            System.out.println(">>INACTIVACION DE PRODUCTO EXITOSA<<");
                        } else {
                            JOptionPane.showMessageDialog(null, "\tLA ACCION HA SIDO ABORTADA" + "\n(NO SE HA LOCALIZADO AL OBJETO REFERIDO)", "CONTROL DE ACCIONES", 0);
                        }
                        break;
                    case 4:
                        Categoria c2 = this.myPaquete.getCategorias().consulta(cadena);
                        if (c2 != null) {
                            this.myPaquete.getCategorias().consulta(cadena).setEstado(true);
                            System.out.println(">>ACTIVACION DE CATEOGRIA EXITOSA<<");
                        } else {
                            JOptionPane.showMessageDialog(null, "\tLA ACCION HA SIDO ABORTADA" + "\n(NO SE HA LOCALIZADO AL OBJETO REFERIDO)", "CONTROL DE ACCIONES", 0);
                        }
                        break;
                    case 5:
                        Cliente cD = (Cliente) this.myPaquete.getClientes().consulta(cadena);
                        Empleado eD = (Empleado) this.myPaquete.getEmpleados().consulta(cadena);
                        boolean activado = false;
                        if (cD != null) {
                            this.myPaquete.getClientes().activar(cD);
                            activado = true;
                        }
                        if (eD != null) {
                            this.myPaquete.getEmpleados().activar(eD);
                            activado = true;
                        }
                        if (!activado) {
                            JOptionPane.showMessageDialog(null, "\tLA ACCION HA SIDO ABORTADA" + "\n(NO SE HA LOCALIZADO AL OBJETO REFERIDO)", "CONTROL DE ACCIONES", 0);
                        }
                        break;
                    case 6:
                        Producto pA = this.myPaquete.getProductos().consulta(cadena);
                        if (pA != null) {
                            this.myPaquete.getProductos().consulta(cadena).setEstado(true);
                            System.out.println(">>ACTIVACION DE PRODUCTO EXITOSA<<");
                        } else {
                            JOptionPane.showMessageDialog(null, "\tLA ACCION HA SIDO ABORTADA" + "\n(NO SE HA LOCALIZADO AL OBJETO REFERIDO)", "CONTROL DE ACCIONES", 0);
                        }
                        break;
                }
            }
        } else {
            System.out.println("ERROR La informacion ingresada no cumple con las caracteristicas requeridas");
        }
        this.limpiar();
        this.visualizarinAcitva(false);
        this.visualizarEliminar(false);
    }//GEN-LAST:event_aplicarActionPerformed

    private void inactivarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactivarUsuarioActionPerformed
        this.mensajeAcoIn.setText("Ingresa el nombre del usuario");
        this.visualizarinAcitva(true);
        this.inActivar = 2;
    }//GEN-LAST:event_inactivarUsuarioActionPerformed

    private void incativarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incativarProductoActionPerformed
        this.mensajeAcoIn.setText("Ingresa la clave del producto");
        this.visualizarinAcitva(true);
        this.inActivar = 3;
    }//GEN-LAST:event_incativarProductoActionPerformed

    private void activarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarUsuarioActionPerformed
        this.mensajeAcoIn.setText("Ingresa el nombre del usuario");
        this.visualizarinAcitva(true);
        this.inActivar = 5;
    }//GEN-LAST:event_activarUsuarioActionPerformed

    private void activarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarProductoActionPerformed
        this.mensajeAcoIn.setText("Ingresa la clave del producto");
        this.visualizarinAcitva(true);
        this.inActivar = 6;
    }//GEN-LAST:event_activarProductoActionPerformed

    private void facturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturasActionPerformed
        this.cerrarCatalogos();
        VistaCatalogo c = new VistaCatalogo("Facturas", this.myPaquete.getFacturas());
        c.setVisible(true);
        if (this.myPaquete.getFacturas().isEmpty()) {
            System.out.println("No se encontraron facturas en este momento");
            c.setVisible(false);
        }

    }//GEN-LAST:event_facturasActionPerformed

    private void verCatalogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCatalogosActionPerformed
        if (this.misCatalogos.size() == 0) {
            System.out.println("Los catalogos no han sido cargados");
        } else {
            this.cerrarCatalogos();
        }
        VistaCatalogo c = new VistaCatalogo(this.myPaquete);
        this.misCatalogos = c.cargarTodoslosCatalogos();
        for (VistaCatalogo vc : misCatalogos)
            vc.setVisible(true);
    }//GEN-LAST:event_verCatalogosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.myEnlace = new Enlace(this.myPaquete);
        this.myEnlace.enlazar();
    }//GEN-LAST:event_formWindowClosing
    /**
     * Metodo que cierra los catalogos
     */
    public void cerrarCatalogos() {
        for (VistaCatalogo vc : misCatalogos) {
            vc.setVisible(false);
        }
    }

    /**
     * Metodo que visibiliza los atributos de clase contenidos
     *
     * @param o
     */
    public void visualizarF(boolean o) {
        this.nombreFabri.setVisible(o);
        this.paisFabri.setVisible(o);
        this.jTextField10.setVisible(o);
        this.jTextField11.setVisible(o);
        this.guardarF.setVisible(o);
    }

    /**
     * Metodo que visibiliza los atributos de clase contenidos
     *
     * @param o
     */
    public void visualizarC(boolean o) {
        this.caracteristicasC.setVisible(o);
        this.nombreC.setVisible(o);
        this.jTextField8.setVisible(o);
        this.jTextField9.setVisible(o);
        this.guardarC.setVisible(o);
    }

    /**
     * Metodo que verifica que la informacion ingresada en el registro de
     * productos sea correcta
     *
     * @return boolean
     */
    public boolean vefiricarInfoRP() {
        boolean valida = true;
        valida &= !this.jTextField1.getText().trim().equalsIgnoreCase("");

        valida &= this.validarFecha(this.jTextField3.getText().trim());
        valida &= this.jTextField4.getText().trim().matches("[+-]?\\d*(\\.\\d+)?");
        valida &= this.precioValido(this.jTextField5.getText());
        String n = this.jTextField6.getText().trim();
        String p = this.jTextField7.getText().trim();
        CasaFabricante cf = new CasaFabricante(n, p);
        valida &= !n.trim().equals("");
        valida &= !p.trim().equals("");
        valida &= this.myPaquete.getFabricantes().existe(this.myPaquete.getFabricantes().consulta(n));
        String categoria = this.jTextField2.getText().trim();
        Categoria c = this.myPaquete.getCategorias().consulta(categoria);
        valida &= !categoria.equalsIgnoreCase("") && this.myPaquete.getCategorias().existe(c);
        if (valida) {
            if (c.isEstado()) {
                valida &= true;
            } else {
                System.out.println("ERROR: LA CATEGORIA SOLICITADA SE ENCUENTRA INACTIVA");
                return false;
            }
        } else {
            return false;
        }
        return valida;
    }

    /**
     * Metodo que limpia la informacion de todos los campos de a interfaz
     */
    public void limpiar() {
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        this.jTextField6.setText("");
        this.jTextField7.setText("");
        this.jTextField8.setText("");
        this.jTextField9.setText("");
        this.jTextField10.setText("");
        this.jTextField11.setText("");
        this.jTextField12.setText("");
        this.jTextField13.setText("");
    }

    /**
     * Metodo que visibiliza los atributos de clase contenidos
     *
     * @param o
     */
    public void visualizarP(boolean o) {
        this.jTextField1.setVisible(o);
        this.jTextField2.setVisible(o);
        this.jTextField3.setVisible(o);
        this.jTextField4.setVisible(o);
        this.jTextField5.setVisible(o);
        this.jTextField6.setVisible(o);
        this.jTextField7.setVisible(o);
        this.nombreP.setVisible(o);
        this.caducidadP.setVisible(o);
        this.cantidad.setVisible(o);
        this.categoriaP.setVisible(o);
        this.precioP.setVisible(o);
        this.nombreFabricante.setVisible(o);
        this.paisFabricante.setVisible(o);
        this.guardarP.setVisible(o);
    }

    /**
     * Metodo que verifica que la fecha ingresada sea correcta en formato y
     * coherencia
     *
     * @param fecha
     * @return boolean
     */
    public boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    /**
     * Metodo que verifica que el precio ingresado en interfaz sea correcto
     *
     * @param cadena
     * @return boolean
     */
    public boolean precioValido(String cadena) {
        if (cadena.contains(".")) {
            String[] arr = cadena.trim().split(".");
            if (arr.length == 2) {
                return arr[0].matches("[+-]?\\d*(\\.\\d+)?") && arr[1].matches("[+-]?\\d*(\\.\\d+)?");
            } else {
                return false;
            }
        } else {
            return cadena.matches("[+-]?\\d*(\\.\\d+)?");
        }
    }

    /**
     * Metodo que veririca si es posible desactivar a un usuario
     *
     * @param us
     * @return boolean
     */
    public boolean validarIn_Activacion(Cliente us) {
        boolean verifica = false;
        Calendar fecha = new GregorianCalendar();
        int mes = fecha.get(Calendar.MONTH);
        for (Factura f : this.myPaquete.getFacturas()) {
            if (us.getNombre().equalsIgnoreCase(f.getMyUsuario().getNombre())) {
                if (f.getMes() == mes) {
                    System.out.println("ESTE USUARIO NO PUEDE SER INACTIVADO, PORQUE HA FACTURADO RECIENTEMENTE");
                    break;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activarCategoria;
    private javax.swing.JButton activarProducto;
    private javax.swing.JButton activarUsuario;
    private javax.swing.JButton agregarCategoria;
    private javax.swing.JButton agregarFabricante;
    private javax.swing.JButton agregarProducto;
    private javax.swing.JButton aplicar;
    private javax.swing.JLabel caducidadP;
    private javax.swing.JLabel cantidad;
    private javax.swing.JLabel caracteristicasC;
    private javax.swing.JLabel categoriaP;
    private javax.swing.JButton eliminarCategoria;
    private javax.swing.JButton eliminarFabricante;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JButton facturas;
    private javax.swing.JButton guardarC;
    private javax.swing.JButton guardarF;
    private javax.swing.JButton guardarP;
    private javax.swing.JButton inactivarCategoria;
    private javax.swing.JButton inactivarUsuario;
    private javax.swing.JButton incativarProducto;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel mensajeAcoIn;
    private javax.swing.JLabel mensajeEliminar;
    private javax.swing.JLabel nombreC;
    private javax.swing.JLabel nombreFabri;
    private javax.swing.JLabel nombreFabricante;
    private javax.swing.JLabel nombreP;
    private javax.swing.JLabel paisFabri;
    private javax.swing.JLabel paisFabricante;
    private javax.swing.JLabel precioP;
    private javax.swing.JButton verCatalogos;
    // End of variables declaration//GEN-END:variables
}
