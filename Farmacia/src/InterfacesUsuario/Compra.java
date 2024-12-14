package InterfacesUsuario;

import Catalogos.CProducto;
import Cliente.Carrito;
import Cliente.Paquete;
import Farmaceuticas.Producto;
import Usuarios.Cliente;
import Usuarios.Enlace;
import javax.swing.JOptionPane;

public class Compra extends javax.swing.JFrame {

    private Paquete myPaquete;
    private Carrito myCarrito = new Carrito();
    private Cliente myCliente;
    private VistaCatalogo myVista;
    private Carro myCarro;
    private Enlace myEnlace;

    /**
     * Constructor de clase
     *
     * @param myPaquete
     * @param cliente
     */
    public Compra(Paquete myPaquete, Cliente cliente) {
        initComponents();
        this.myCliente = cliente;
        this.myPaquete = myPaquete;
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carrito = new javax.swing.JButton();
        catalogo = new javax.swing.JButton();
        claveEliminar = new javax.swing.JTextField();
        claveAgregar = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-de-compras.png"))); // NOI18N
        carrito.setBorder(null);
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });
        getContentPane().add(carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 0, 40, 30));

        catalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/catalog_icon_215654.png"))); // NOI18N
        catalogo.setBorder(null);
        catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogoActionPerformed(evt);
            }
        });
        getContentPane().add(catalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 30));

        claveEliminar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        claveEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        claveEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(claveEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 160, 40));

        claveAgregar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        claveAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(claveAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 160, 40));

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1492790846-9cancel_84247.png"))); // NOI18N
        botonEliminar.setBorder(null);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 40));

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1904677-add-addition-calculate-charge-create-new-plus_122527.png"))); // NOI18N
        botonAgregar.setBorder(null);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, 40));

        mensaje.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        mensaje.setText("Ingresa la clave del producto");
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 260, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void claveEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveEliminarActionPerformed

    private void catalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogoActionPerformed
        if (this.myPaquete.getProductos().getProductos().isEmpty()) {
            System.out.println("Actualmente no se han registrado productos");
            System.exit(0);
        } else {
            this.cargarProductos();

        }
    }//GEN-LAST:event_catalogoActionPerformed

    private void carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoActionPerformed
        if (this.myPaquete.getProductos().getProductos().isEmpty()) {
            System.out.println("Actualmente no se han registrado productos");
            System.exit(0);
        } else {
            this.myCarro = new Carro(this.myCarrito, this.myCliente, this.myPaquete);
            this.myCarro.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_carritoActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if (this.myPaquete.getProductos().getProductos().isEmpty()) {
            System.out.println("Actualmente no se han registrado productos");
            System.exit(0);
        } else {
            boolean verifi = !this.claveAgregar.getText().trim().equals("");
            if (verifi) {
                this.agregarProducto(this.claveAgregar.getText().trim());
            } else {
                JOptionPane.showMessageDialog(null, "LA INFORMACION INGRESADA ES VACIA", "AGREGAR PRODUCTO", 0);
            }
        }
        System.out.println(this.myCarrito.toString()+"\n");
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (this.myPaquete.getProductos().getProductos().isEmpty()) {
            System.out.println("Actualmente no se han registrado productos");
            System.exit(0);
        } else {
            String cadena = this.claveEliminar.getText().trim();
            boolean verifi = !cadena.equals("");
            if (verifi) {
                this.eliminarProducto(this.claveEliminar.getText().trim());
            } else {
                JOptionPane.showMessageDialog(null, "LA INFORMACION INGRESADA ES VACIA", "ELIMINAR PRODUCTO", 0);
            }
        }
         System.out.println(this.myCarrito.toString()+"\n");
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.myEnlace = new Enlace(this.myPaquete);
        this.myEnlace.enlazar();
    }//GEN-LAST:event_formWindowClosing
    /**
     * Metodo eliminar producto del carrito
     *
     * @param clave
     */
    public void eliminarProducto(String clave) {
        if (this.myCarrito.existe(clave)) {
            Producto p = this.myCarrito.obtener(clave);
            this.myCarrito.eliminarProducto(p);
            this.myPaquete.getProductos().consulta(clave).setCantidad(this.myPaquete.getProductos().consulta(clave).getCantidad() + 1);
            this.claveEliminar.setText("");
            if (p.getCantidad() > 0) {
                this.myPaquete.getProductos().consulta(clave).setExistente(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "EL PRODUCTO REFERIDO CON LA CLAVE INGRESADA NO FUE ENCONTRADO", "ELIMINAR PRODUCTO", 0);
            this.claveEliminar.setText("");
        }
    }

    /**
     * Metodo que carga el carrito de compras
     */
    public void cargarProductos() {
        CProducto cp = this.myPaquete.getProductos();
        new VistaCatalogo("Productos", cp).setVisible(true);
    }

    /**
     * Metodo agregar producto
     *
     * @param clave
     */
    public void agregarProducto(String clave) {
        Producto p = this.myPaquete.getProductos().consulta(clave);
        if (this.myPaquete.getProductos().existe(p) && p.getCantidad() > 0) {
            this.myCarrito.agregarProducto(p);
            this.myPaquete.getProductos().consulta(clave).setCantidad(p.getCantidad() - 1);
            this.claveAgregar.setText("");
            if (this.myCarrito.obtener(clave).getCantidad() == 0) {
                this.myPaquete.getProductos().consulta(clave).setExistente(false);

            }
        } else {
            JOptionPane.showMessageDialog(null, "EL PRODUCTO REFERIDO CON LA CLAVE INGRESADA NO FUE ENCONTRADO", "AGREGAR PRODUCTO", 0);
             this.claveAgregar.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton carrito;
    private javax.swing.JButton catalogo;
    private javax.swing.JTextField claveAgregar;
    private javax.swing.JTextField claveEliminar;
    private javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables
}
