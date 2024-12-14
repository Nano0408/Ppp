package Farmaceuticas;

import java.io.Serializable;

public class Categoria implements Serializable {

    private String nombre, caracteristicas;
    private boolean estado;

    /**
     * Constructor de clase
     *
     * @param nombre
     * @param caracteristicas
     */
    public Categoria(String nombre, String caracteristicas) {
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.estado = true;
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
     * Metodo get para atributo caracteristicas
     *
     * @return String
     */
    public String getCaractteristicas() {
        return caracteristicas;
    }

    /**
     * Metodo set para atributo caracteristicas
     *
     * @param caractteristicas
     */
    public void setCaractteristicas(String caractteristicas) {
        this.caracteristicas = caractteristicas;
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
}
