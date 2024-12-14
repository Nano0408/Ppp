package Farmaceuticas;

import java.io.Serializable;

public class Producto implements Serializable {

    private String descripcion, categoria, caducidad, clave;
    private int cantidad;
    private boolean existente, estado;
    private double precio;
    private CasaFabricante fabricante;

    /**
     * Constructor de clase
     *
     * @param descripcion
     * @param categoria
     * @param caducidad
     * @param cantidad
     * @param precio
     * @param fabricante
     */
    public Producto(String descripcion, String categoria, String caducidad, int cantidad, double precio, CasaFabricante fabricante) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.caducidad = caducidad;
        this.cantidad = cantidad;
        this.existente = true;
        this.estado = true;
        this.precio = precio;
        this.fabricante = fabricante;
        this.generarClave();
    }

    /**
     * Metodo get para atributo descripcion
     *
     * @return String
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo set para atributo descripcion
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo get para atributo categoria
     *
     * @return String
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Metodo set para atributo categoria
     *
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo get para atributo caducidad
     *
     * @return String
     */
    public String getCaducidad() {
        return caducidad;
    }

    /**
     * Metodo set para atributo caducidad
     *
     * @param caducidad
     */
    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    /**
     * Metodo get para atributo clave
     *
     * @return String
     */
    public String getClave() {
        return clave;
    }

    /**
     * Metodo set para atributo clave
     *
     * @param clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Metodo get para atributo cantidad
     *
     * @return int
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo set para atributo cantidad
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo get para atributo existente
     *
     * @return boolean
     */
    public boolean isExistente() {
        return existente;
    }

    /**
     * Metodo set para atributo existente
     *
     * @param existente
     */
    public void setExistente(boolean existente) {
        this.existente = existente;
    }

    /**
     * Metodo get para atributo estado
     *
     * @return boolean
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Metodo set para atributo estado
     *
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Metodo get para atributo precio
     *
     * @return double
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo set para atributo precio
     *
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo get para atributo fabricante
     *
     * @return CasaFabricante
     */
    public CasaFabricante getFabricante() {
        return fabricante;
    }

    /**
     * Metodo set para atributo fabricante
     *
     * @param fabricante
     */
    public void setFabricante(CasaFabricante fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Metodo que genera una clave para el producto
     * Se genera el codigo alfanumerico de los productos existentes o agregados en el inventario de 10 digitos alazar por el metodo de math.random
     */
    public void generarClave() {
        String alfaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";
        StringBuilder builder = new StringBuilder(10);//Es una alternativa de string class que crea un secuencia de caracteres 
        for (int m = 0; m < 10; m++) {
            int myindex = (int) (alfaNumeric.length() * Math.random());
            builder.append(alfaNumeric.charAt(myindex));
        }
        this.clave = builder.toString();
    }

    /**
     * Metodo toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Nombre: " + descripcion + ", Categoria: " + categoria + ", Caducidad: " + caducidad + ", Clave: " + clave + 
                ", Cantidad: " + cantidad + ", Existente: " + existente + ", Estado: " + estado + ", Precio: " + precio + ", Fabricante{" + fabricante.toString() + '}';
    }
}
