package Cliente;

import java.io.Serializable;
import Catalogos.*;
import java.util.LinkedList;

public class Paquete implements Serializable {

    private LinkedList<Factura> facturas = new LinkedList<>();
    private CCFabricante fabricantes;
    private CCategoria categorias;
    private CProducto productos;
    private CCliente clientes;
    private CEmpleado empleados;

    /**
     * Constructor de clase
     * @param fabricantes
     * @param categorias
     * @param productos
     * @param clientes
     * @param empleados
     */
    public Paquete(CCFabricante fabricantes, CCategoria categorias, CProducto productos, CCliente clientes, CEmpleado empleados) {
        this.fabricantes = fabricantes;
        this.categorias = categorias;
        this.productos = productos;
        this.clientes = clientes;
        this.empleados = empleados;
    }

    /**
     * Constructor por omision
     */
    public Paquete() {
        this.fabricantes = new CCFabricante();
        this.categorias = new CCategoria();
        this.productos = new CProducto();
        this.clientes = new CCliente();
        this.empleados = new CEmpleado();
    }

    /**
     * Metodo que agrega una nueva factura al LinkedList
     *
     * @param nueva
     */
    public void agregarFactura(Factura nueva) {
        System.out.println("\t FACTURA AGREGADA");
        this.facturas.add(nueva);
    }

    /**
     * Metodo que elimina factura del LinkedList
     *
     * @param factura
     */
    public void eliminarFactura(Factura factura) {
        if (this.facturas.contains(factura)) {
            this.facturas.remove(factura);
        } else {
            System.out.println("ERROR: La informacion que desea eliminar no se encontro.");
        }
    }

    /**
     * Metodo get para atributo facturas
     *
     * @return LinkedList
     */
    public LinkedList<Factura> getFacturas() {
        return facturas;
    }

    /**
     * Metodo set para atributo facturas
     *
     * @param facturas
     */
    public void setFacturas(LinkedList<Factura> facturas) {
        this.facturas = facturas;
    }

    /**
     * Metodo get para atributo fabricantes
     *
     * @return
     */
    public CCFabricante getFabricantes() {
        return fabricantes;
    }

    /**
     * Metodo set para atributo fabricantes
     *
     * @param fabricantes
     */
    public void setFabricantes(CCFabricante fabricantes) {
        this.fabricantes = fabricantes;
    }

    /**
     * Metodo get para atributo categorias
     *
     * @return
     */
    public CCategoria getCategorias() {
        return categorias;
    }

    /**
     * Metodo set para atributo categorias
     *
     * @param categorias
     */
    public void setCategorias(CCategoria categorias) {
        this.categorias = categorias;
    }

    /**
     * Metodo get para atributo productos
     *
     * @return
     */
    public CProducto getProductos() {
        return productos;
    }

    /**
     **Metodo set para atributo productos
     *
     * @param productos
     */
    public void setProductos(CProducto productos) {
        this.productos = productos;
    }

    /**
     * Metodo get para atributo clientes
     *
     * @return
     */
    public CCliente getClientes() {
        return clientes;
    }

    /**
     * Metodo set para atributo clientes
     *
     * @param clientes
     */
    public void setClientes(CCliente clientes) {
        this.clientes = clientes;
    }

    /**
     * Metodo get para atributo empleados
     *
     * @return
     */
    public CEmpleado getEmpleados() {
        return empleados;
    }

    /**
     * Metodo set para atributo empleados
     *
     * @param empleados
     */
    public void setEmpleados(CEmpleado empleados) {
        this.empleados = empleados;
    }

    /**
     * Metodo toString
     *
     * @return String
     */
    public String toString() {
        return "INFORMACION DE CATALOGOS RECIBIDA\n";
    }
}
