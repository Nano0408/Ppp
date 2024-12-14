package Cliente;

import Usuarios.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Factura implements Serializable {

    private Carrito myCarrito;
    private Usuario myUsuario;
    private int dia, mes, anio;

    /**
     * Constructor de clase
     *
     * @param myCarrito
     * @param myUsuario
     */
    public Factura(Carrito myCarrito, Usuario myUsuario) {
        this.myCarrito = myCarrito;
        this.myUsuario = myUsuario;
        Calendar datos = new GregorianCalendar();
        this.anio = datos.get(Calendar.YEAR);
        this.mes = datos.get(Calendar.MONTH);
        this.dia = datos.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Metodo get para atributo myCarrito
     *
     * @return Carrito
     */
    public Carrito getMyCarrito() {
        return myCarrito;
    }

    /**
     * Metodo set para atributo myCarrito
     *
     * @param myCarrito
     */
    public void setMyCarrito(Carrito myCarrito) {
        this.myCarrito = myCarrito;
    }

    /**
     * Metodo get para atributo myUsuario
     *
     * @return Usuario
     */
    public Usuario getMyUsuario() {
        return myUsuario;
    }

    /**
     * Metodo set para atributo myUsuario
     *
     * @param myUsuario
     */
    public void setMyUsuario(Usuario myUsuario) {
        this.myUsuario = myUsuario;
    }

    /**
     * Metodo get para atributo dia
     *
     * @return
     */
    public int getDia() {
        return dia;
    }

    /**
     * Metodo set para atributo dia
     *
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Metodo get para atributo mes
     *
     * @return
     */
    public int getMes() {
        return mes;
    }

    /**
     * Metodo set para atributo mes
     *
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Metodo get para atributo anio
     *
     * @return
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Metodo set para atributo anio
     *
     * @param anio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Metodo get para atributo fecha
     *
     * @return
     */
    public String getFecha() {
        return this.dia + "/" + (this.mes + 1) + "/" + this.anio;
    }

    /**
     * Metodo toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Nombre de Cliente: " + myUsuario.getNombre() + " " + myUsuario.getApellidos() + "| Total $" + this.myCarrito.getTotal() + "| Fecha: " + this.getFecha();
    }
}
