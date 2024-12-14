package Catalogos;

import java.io.Serializable;
import java.util.ArrayList;
import Farmaceuticas.*;

public class CProducto implements Serializable {

    private ArrayList<Producto> productos = new ArrayList<>();

    /**
     * Constructor por omision
     */
    public CProducto() {
    }

    /**
     * Constructor parametrizado
     *
     * @param productos
     */
    public CProducto(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Metodo get para atributo productos
     *
     * @return ArrayList
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     * Metodo set para atributo productos
     *
     * @param productos
     */
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Metodo que agrega un nuevo producto al catalogo
     *
     * @param nuevo
     */
    public void agregar(Producto nuevo) {
        if (!this.existe(nuevo)) {
            this.productos.add(nuevo);
            System.out.println(">> GUARDADO EXITOSO <<");
        } else {
            System.out.println("ERROR: La informacion que desea agregar ya ha sido registrada.");
        }
    }

    /**
     * Metodo que elimina un producto del catalogo
     *
     * @param producto
     */
    public void eliminar(Producto producto) {
        if (this.existe(producto)) {
            this.productos.remove(producto);
            System.out.println(">> ELIMINACION EXITOSA <<");
        } else {
            System.out.println("ERROR: La informacion que desea elminar no ha sido encontrada.");
        }
    }

    /**
     * Metodo que retorna el producto referido con clave
     *
     * @param clave
     * @return Producto
     */
    public Producto consulta(String clave) {
        for (Producto p : this.productos) {
            if (p.getClave().equalsIgnoreCase(clave)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Metodo que verifica si una clave existe en el catalogo
     *
     * @param clave
     * @return boolean
     */
    public boolean existeClave(String clave) {
        for (Producto p : this.productos) {
            if (p.getClave().equalsIgnoreCase(clave)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que verifica si un producto existe en el catalogo
     *
     * @param elemento
     * @return boolean
     */
    public boolean existe(Producto elemento) {
        if (!this.productos.contains(elemento)) {
            return false;
        }
        return true;
    }
}
