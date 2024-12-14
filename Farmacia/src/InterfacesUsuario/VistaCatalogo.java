package InterfacesUsuario;

import Catalogos.*;
import Cliente.Factura;
import Cliente.Paquete;
import Farmaceuticas.*;
import Usuarios.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class VistaCatalogo extends javax.swing.JFrame {

    private CCFabricante fabricantes;
    private CCliente clientes;
    private CEmpleado empleados;
    private CProducto productos;
    private String categoria;
    private LinkedList<Factura> facturas;

    /**
     * Constructor de clase
     *
     * @param categoria
     * @param fabricantes
     * @param clientes
     * @param empleados
     * @param productos
     */
    public VistaCatalogo(String categoria, CCFabricante fabricantes, CCliente clientes, CEmpleado empleados, CProducto productos) {
        initComponents();
        this.fabricantes = fabricantes;
        this.clientes = clientes;
        this.empleados = empleados;
        this.productos = productos;
        this.categoria = categoria;
        this.categoria = categoria;
        this.nombreCategoria.setText(this.categoria);
        this.cargarCatalogo();

    }

    /**
     * Constructor de clase
     *
     * @param p
     */
    public VistaCatalogo(Paquete p) {
        initComponents();
        this.fabricantes = p.getFabricantes();
        this.clientes = p.getClientes();
        this.empleados = p.getEmpleados();
        this.productos = p.getProductos();

    }

    /**
     * Constructor de clase
     *
     * @param categoria
     * @param productos
     */
    public VistaCatalogo(String categoria, CProducto productos) {
        initComponents();
        this.categoria = categoria;
        this.productos = productos;
        this.nombreCategoria.setText(this.categoria);
        this.cargarProductos();

    }

    /**
     * Constructor de clase
     *
     * @param categoria
     * @param facturas
     */
    public VistaCatalogo(String categoria, LinkedList<Factura> facturas) {
        initComponents();
        this.categoria = categoria;
        this.nombreCategoria.setText(this.categoria);
        this.facturas = facturas;
        this.cargarFacturas();
    }

    /**
     * Metodo que cargar la informacion de facturas a la interfaz
     */
    public void cargarFacturas() {
        String cadena = "";
        this.facturas = this.sort(facturas);
        //Les dejo esta funcion por si no les parece la actual
        // cadena = this.facturas.stream().map(f -> f.toString() + "\n").reduce(cadena, String::concat);
        Queue<Factura> cola = new LinkedList<Factura>();
        cola.addAll(this.facturas);
        this.informacion.setText(cadena);
        while (!cola.isEmpty()) {
            Factura f = cola.poll();
            if (f != null) {
                cadena += f.toString() + "\n";
            } else {
                break;
            }
        }
        this.informacion.setText(cadena);

    }

    /**
     * Metodo que ordena la coleccion de facturas
     *
     * @param arr
     * @return LinkedList
     */
    public LinkedList<Factura> sort(LinkedList<Factura> arr) {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            Factura key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j).getMyCarrito().getTotal() < key.getMyCarrito().getTotal()) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
        return arr;
    }

    /**
     * Metodo que carga la informacion de todos los catalogos a las interfaces
     *
     * @return ArrayList
     */
    public ArrayList<VistaCatalogo> cargarTodoslosCatalogos() {
        ArrayList<VistaCatalogo> arr = new ArrayList<>();
        if (this.empleados != null && !this.empleados.getEmpleados().isEmpty()) {
            boolean seMuestra = false;
            for (int i = 0; i < this.empleados.getEmpleados().size(); i++) {
                if (this.empleados.getEmpleados().get(i).isEstado()) {
                    seMuestra = true;
                }
            }
            if (seMuestra) {
                arr.add(new VistaCatalogo("EMPLEADOS", null, null, empleados, null));
            }
        }
        if (this.clientes != null && !this.clientes.getClientes().isEmpty()) {
            boolean seMuestra = false;
            for (int i = 0; i < this.clientes.getClientes().size(); i++) {
                if (this.clientes.getClientes().get(i).isEstado()) {
                    seMuestra = true;
                }
            }
            if (seMuestra) {
                arr.add(new VistaCatalogo("CLIENTES", null, clientes, null, null));
            }
        }
        if (this.productos != null && !this.productos.getProductos().isEmpty()) {
            boolean seMuestra = false;
            for (int i = 0; i < this.productos.getProductos().size(); i++) {
                if (this.productos.getProductos().get(i).isEstado() && this.productos.getProductos().get(i).isExistente()) {
                    seMuestra = true;
                }
            }
            if (seMuestra) {
                arr.add(new VistaCatalogo("PRODUCTOS", null, null, null, productos));
            }
        }
        if (this.fabricantes != null && !this.fabricantes.getCasas().isEmpty()) {
            arr.add(new VistaCatalogo("FABRICANTES", fabricantes, null, null, null));
        }
        return arr;
    }

    /**
     * Metodo que carga solo un catalogo a la vez
     */
    public void cargarCatalogo() {
        if (this.empleados != null) {
            this.cargarEmpleados();
        } else if (this.clientes != null) {
            this.cargarClientes();
        } else if (this.productos != null) {
            this.cargarProductos();
        } else if (this.fabricantes != null) {
            this.cargarFabricantes();
        } else {
            System.out.println("NO SE HA PODIDO CARGAR LA INFORMACION DEL CATALOGO");
            System.exit(0);
        }
    }

    /**
     * Metodo que carga el catalogo de empleados
     */
    public void cargarEmpleados() {
        String cadena = "";
        cadena = this.empleados.getEmpleados().stream().map(e -> e.toString() + "\n").reduce(cadena, String::concat);
        this.informacion.setText(cadena);
    }

    /**
     * Metodo que carga el catalogo de clientes
     */
    public void cargarClientes() {
        String cadena = "";
        for (Cliente e : this.clientes.getClientes()) {
            cadena += e.toString() + "\n";
        }
        this.informacion.setText(cadena);
    }

    /**
     * Metodo que carga el catalogo de productos
     */
    public void cargarProductos() {
        String cadena = "";
        for (Producto p : this.productos.getProductos()) {
            if (p.isEstado() && p.isExistente()) {
                cadena += p.toString() + "\n";
            }
        }
        this.informacion.setText(cadena);
    }

    /**
     * Metodo que carga el catalogo de fabricantes
     */
    public void cargarFabricantes() {
        String cadena = "";
        for (CasaFabricante cf : this.fabricantes.getCasas()) {
            cadena += cf.toString() + "\n";
        }
        this.informacion.setText(cadena);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        informacion = new javax.swing.JTextArea();
        nombreCategoria = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informacion.setEditable(false);
        informacion.setColumns(20);
        informacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        informacion.setRows(5);
        jScrollPane1.setViewportView(informacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 370, 390));

        nombreCategoria.setEditable(false);
        nombreCategoria.setBackground(java.awt.SystemColor.controlHighlight);
        nombreCategoria.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        nombreCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreCategoria.setBorder(null);
        nombreCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(nombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 320, 40));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCategoriaActionPerformed

    }//GEN-LAST:event_nombreCategoriaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JTextArea informacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreCategoria;
    // End of variables declaration//GEN-END:variables

}
