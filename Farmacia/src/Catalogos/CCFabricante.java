package Catalogos;

import java.io.Serializable;
import java.util.ArrayList;
import Farmaceuticas.*;

public class CCFabricante implements Serializable {

    private ArrayList<CasaFabricante> casas = new ArrayList<>();

    /**
     * Constructor por omision
     */
    public CCFabricante() {
    }

    /**
     * Constructor parametrizado
     *
     * @param casas
     */
    public CCFabricante(ArrayList<CasaFabricante> casas) {
        this.casas = casas;
    }

    /**
     * Metodo get para atributo casas
     *
     * @return ArrayList
     */
    public ArrayList<CasaFabricante> getCasas() {
        return casas;
    }

    /**
     * Metodo set para atributo casas
     *
     * @param casas
     */
    public void setCasas(ArrayList<CasaFabricante> casas) {
        this.casas = casas;
    }

    /**
     * Metodo que agrega una nueva casa al catalogo
     *
     * @param nueva
     */
    public void agregar(CasaFabricante nueva) {
        if (!this.existe(nueva)) {
            this.casas.add(nueva);
            System.out.println(">> GUARDADO EXITOSO <<");
        } else {
            System.out.println("ERROR: La informacion que desea agregar ya ha sido registrada.");
        }
    }

    /**
     * Metodo que elimina una casa del catalogo
     *
     * @param casa
     */
    public void eliminar(CasaFabricante casa) {
        if (this.existe(casa)) {
            this.casas.remove(casa);
            System.out.println(">> ELIMINACION EXITOSA <<");
        } else {
            System.out.println("ERROR: La informacion que desea elminar no ha sido encontrada.");
        }
    }

    /**
     * Metodo que retorna la casa referida con nombre
     *
     * @param nombre
     * @return CasaFabricante
     */
    public CasaFabricante consulta(String nombre) {
        for (CasaFabricante cf : this.casas) {
            if (cf.getNombre().equalsIgnoreCase(nombre)) {
                return cf;
            }
        }
        return null;
    }

    /**
     * Metodo que verifica si existe una casa en el catalogo
     *
     * @param elemento
     * @return boolean
     */
    public boolean existe(CasaFabricante elemento) {
        if (!this.casas.contains(elemento)) {
            return false;
        }
        return true;
    }
}
