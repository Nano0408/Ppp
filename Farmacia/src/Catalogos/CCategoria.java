package Catalogos;

import java.io.Serializable;
import java.util.ArrayList;
import Farmaceuticas.*;

public class CCategoria implements Serializable {

    private ArrayList<Categoria> categorias = new ArrayList<>();

    /**
     * Constructor por omision
     */
    public CCategoria() {
    }

    /**
     * Constructor parametrizado
     *
     * @param categorias
     */
    public CCategoria(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    /**
     * Metodo get para atributo categorias
     *
     * @return ArrayList
     */
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    /**
     * Metodo set para atributo categorias
     *
     * @param categorias
     */
    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    /**
     * Metodo para agregar una nueva categoria
     *
     * @param nueva
     */
    public void agregar(Categoria nueva) {
        if (!this.existe(nueva)) {
            this.categorias.add(nueva);
            System.out.println(">> GUARDADO EXITOSO <<");
        } else {
            System.out.println("ERROR: La informacion que desea agregar ya ha sido registrada.");
        }
    }

    /**
     * Metodo para eliminar una nueva categoria
     *
     * @param categoria
     */
    public void eliminar(Categoria categoria) {
        if (this.existe(categoria)) {
            this.categorias.remove(categoria);
            System.out.println(">> ELIMINACION EXITOSA <<");
        } else {
            System.out.println("ERROR: La informacion que desea elminar no ha sido encontrada.");
        }
    }

    /**
     * Metodo que retorna la categoria referida con nombre
     *
     * @param nombre
     * @return Categoria
     */
    public Categoria consulta(String nombre) {
        for (Categoria c : this.categorias) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Metodo que verifica si una Categoria existe en el catalogo
     *
     * @param elemento
     * @return boolean
     */
    public boolean existe(Categoria elemento) {
        if (!this.categorias.contains(elemento)) {
            return false;
        }
        return true;
    }
}
