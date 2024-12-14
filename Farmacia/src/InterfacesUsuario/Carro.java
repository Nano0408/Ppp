package InterfacesUsuario;

import Cliente.Carrito;
import Cliente.Factura;
import Cliente.Paquete;
import Farmaceuticas.*;
import Usuarios.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Carro extends javax.swing.JFrame {

    private Carrito carrito;
    private Cliente cliente;
    private final DecimalFormat formateador = new DecimalFormat("######.##");
    private Paquete myPaquete;
    private Enlace myEnlace;
    private Stack<Formato> formatos = new Stack<>();

    /**
     * Constructor de clase
     *
     * @param carrito
     * @param cliente
     * @param p
     */
    public Carro(Carrito carrito, Cliente cliente, Paquete p) {
        this.carrito = carrito;
        this.cliente = cliente;
        this.myPaquete = p;
        initComponents();
        this.cargarFormato();
        this.total.setText(formateador.format(this.carrito.getTotal()));
        this.setResizable(false);
    }

    /**
     * Metodo que formatea la informacion del carrito para mostrarla
     */
    public void cargarFormato() {
        ArrayList<Producto> aux = this.carrito.getProductos();
        Formatos format = new Formatos();
        for (int i = 0; i < aux.size(); i++) {
            if (!format.existe(aux.get(i).getClave())) {
                format.agregar(new Formato(0, aux.get(i)));
            }
        }
        aux.forEach(p -> {
            for (int j = 0; j < format.size(); j++) {
                if (p.getClave().equals(format.get(j).getProducto().getClave())) {
                    format.get(j).aumentar();
                }
            }
        });
        for (Formato f : format.getMysFormatos()) {
            this.formatos.addElement(f);
        }
        this.cargarAVista();
    }

    /**
     * Metodo que cargar la informacion de los formatos a la interfaz
     */
    public void cargarAVista() {
        while (!this.formatos.isEmpty()) {
            Formato p = this.formatos.pop();
            this.info.append("x" + p.contador + " " + p.getProducto().getDescripcion() + " " + p.getProducto().getClave() + " $" + p.getProducto().getPrecio() + "c/u \n");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menCarro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        menTotal = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        pagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menCarro.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        menCarro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menCarro.setText("Carro de compras");
        getContentPane().add(menCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 340, 70));

        info.setEditable(false);
        info.setColumns(20);
        info.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        info.setRows(5);
        info.setBorder(null);
        jScrollPane1.setViewportView(info);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 380));

        menTotal.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        menTotal.setText("Total:");
        getContentPane().add(menTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 80, 30));

        total.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total.setBorder(null);
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 100, -1));

        pagar.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        pagar.setText("Pagar");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });
        getContentPane().add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        if (this.carrito.getTotal() != 0) {
            this.myPaquete.getFacturas().add(new Factura(this.carrito, this.cliente));
            this.myEnlace = new Enlace(this.myPaquete);
            this.myEnlace.enlazar();
            System.exit(0);
            JOptionPane.showMessageDialog(null, "SE HA NOTIFICADO AL SERVIDOR DE LA COMPRA REALIZADA", "NOTIFICACION", 0);
        } else {
            System.out.println("El carrito esta vacio");
            this.setVisible(false);
        }
    }//GEN-LAST:event_pagarActionPerformed
    private class Formato {

        private int contador;
        private Producto producto;

        /**
         * Contructor de clase Formato
         *
         * @param contador
         * @param producto
         */
        public Formato(int contador, Producto producto) {
            this.contador = contador;
            this.producto = producto;
        }

        /**
         * Metodo que aumenta en una unidad el atributo contador
         */
        public void aumentar() {
            this.contador++;
        }

        /**
         * Metodo get de atributo contador
         *
         * @return int
         */
        public int getContador() {
            return contador;
        }

        /**
         * Metodo set de atributo contador
         *
         * @param contador
         */
        public void setContador(int contador) {
            this.contador = contador;
        }

        /**
         * Metodo get para atributo producto
         *
         * @return Producto
         */
        public Producto getProducto() {
            return producto;
        }

        /**
         * Metodo set para atributo Producto
         *
         * @param producto
         */
        public void setProducto(Producto producto) {
            this.producto = producto;
        }
    }

    public class Formatos {

        private ArrayList<Formato> mysFormatos = new ArrayList<>();

        /**
         * Metodo agregra para atributo mysFormatis
         *
         * @param f
         */
        public void agregar(Formato f) {
            this.mysFormatos.add(f);
        }

        /**
         * Metodo get para unico atributo
         *
         * @return
         */
        public ArrayList<Formato> getMysFormatos() {
            return mysFormatos;
        }

        /**
         * Metodo set para unico atributo
         *
         * @param mysFormatos
         */
        public void setMysFormatos(ArrayList<Formato> mysFormatos) {
            this.mysFormatos = mysFormatos;
        }

        /**
         * Metodo que verifica si un producto ya ha sido agregado en un formato
         *
         * @param clave
         * @return boolean
         */
        public boolean existe(String clave) {
            for (Formato f : this.mysFormatos) {
                if (f.getProducto().getClave().equalsIgnoreCase(clave)) {
                    return true;
                }
            }
            return false;
        }

        /**
         * Metodo que retornla la longitud del unico atributo
         *
         * @return int
         */
        public int size() {
            return this.mysFormatos.size();
        }

        /**
         * Metodo que retorna el elemento almacenado en el indice especificado
         *
         * @param i
         * @return Formato
         */
        public Formato get(int i) {
            return this.mysFormatos.get(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea info;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel menCarro;
    private javax.swing.JLabel menTotal;
    private javax.swing.JButton pagar;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
