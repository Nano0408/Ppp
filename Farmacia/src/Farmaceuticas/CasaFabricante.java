package Farmaceuticas;

import java.io.Serializable;

public class CasaFabricante implements Serializable {

    private String nombre, pais;

    /**
     * Constructor de clase
     *
     * @param nombre
     * @param pais
     */
    public CasaFabricante(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    /**
     * Metodo get para atributo nombre
     *
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set para atributo nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get para atributo pais
     *
     * @return String
     */
    public String getPais() {
        return pais;
    }

    /**
     * Metodo set para atributo pais
     *
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Metodo toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " | Pais de origen: " + this.pais;
    }
}
