package Cliente;

import java.util.ArrayList;
import Farmaceuticas.*;
import java.io.Serializable;

public class Carrito implements Serializable {

    private ArrayList<Producto> productos = new ArrayList<>();
    private double total;

    /**
     * Contructor por omision
     */
    public Carrito() {
        this.total = 0;
    }

    /**
     * Metodo que verifica si el carrito esta vacio
     *
     * @return boolean
     */
    public boolean esVacio() {
        return this.productos.isEmpty();
    }

    /**
     * Metod get para atributo productos
     *
     * @return ArrayList
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     * Metod set para atributo productos
     *
     * @param productos
     */
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Metod get para atributo total
     *
     * @return double
     */
    public double getTotal() {
        return total;
    }

    /**
     * Metod set para atributo total
     *
     * @param total
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Metodo para agregar un nuevo producto al carrito
     *
     * @param nuevo
     */
    public void agregarProducto(Producto nuevo) {
        if (nuevo.isEstado() && nuevo.isExistente()) {
            this.productos.add(nuevo);
            this.total += nuevo.getPrecio();
            System.out.println("PRODUCTO AGREGADO AL CARRITO DE COMPRAS");
        } else {
            System.out.println("ERROR: El producto que deseas agregar se encuentra inactivo o es inexistente");
        }

    }

    /**
     * Metodo para eliminar un producto del carrito
     *
     * @param elemento
     */
    public void eliminarProducto(Producto elemento) {
        if (this.productos.contains(elemento)) {
            this.productos.remove(elemento);
            this.total -= elemento.getPrecio();
            System.out.println("PRODUCTO ELIMINADO DEL CARRITO DE COMPRAS");
        } else {
            System.out.println("ERROR: El producto que desea eliminar no existe en el carrito.");
        }
    }

    /**
     * Metodo que verifica si existe un producto referido con la clave
     *
     * @param clave
     * @return boolean
     */
    public boolean existe(String clave) {
        for (Producto p : this.productos) {
            if (p.getClave().equalsIgnoreCase(clave)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que retorna el producto referido con clave
     *
     * @param clave
     * @return Producto
     */
    public Producto obtener(String clave) {
        for (Producto p : this.productos) {
            if (p.getClave().equalsIgnoreCase(clave)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String cadena = "\t PRODUCTOS EN CARRITO DE COMPRAS\n";
        if (this.productos.isEmpty()) {
            return "\t EL CARRITO SE ENCUENTRA VACIO";
        }
        for (Producto p : this.productos) {
            cadena += "Informacion: "+p.getDescripcion() + " " + p.getClave() + " " + p.getPrecio() + "\n";
        }
        cadena += "Total: $" + this.total;
        return cadena;
    }
}
