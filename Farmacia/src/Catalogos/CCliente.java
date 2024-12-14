package Catalogos;

import Usuarios.*;
import java.io.Serializable;
import java.util.ArrayList;

public class CCliente implements Catalogo, Serializable {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    /**
     * Constructor por omision
     */
    public CCliente() {
    }

    /**
     * Constructor que recibe un ArrayList
     *
     * @param nuevo
     */
    public CCliente(ArrayList<Cliente> nuevo) {
        this.clientes = nuevo;
    }

    /**
     * Metodo que retorna el valor del atributo clientes
     *
     * @return
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Metodo que asigna nuevo valor al atributo clientes
     *
     * @param clientes
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Metodo definido para agregar Usuarios a catalogo
     *
     * @param nuevo
     */
    @Override
    public void agregar(Usuario nuevo) {
        if (!this.existe(nuevo.getNickname(), nuevo)) {
            this.clientes.add((Cliente) nuevo);
            System.out.println(">> GUARDADO EXITOSO <<");
        } else {
            System.out.println("ERROR: Esta informacion de cliente ya ha sido registrada.\n");
        }

    }

    /**
     * Metodo definido para eliminar Usuarios a catalogo
     *
     * @param nuevo
     */
    @Override
    public void eliminar(Usuario nuevo) {
        if (this.existe(nuevo.getNickname(), nuevo)) {
            this.clientes.remove((Cliente) nuevo);
            System.out.println(">> ELIMINACION EXITOSA <<");
        } else {
            System.out.println("ERROR: Esta informacion de cliente no ha sido encontrada.\n");
        }
    }

    /**
     * Metodo que busca a un usuario en el catalogo dado su nickname
     *
     * @param nick
     * @return Usuario
     */
    @Override
    public Usuario consulta(String nick) {
        if (this.existe(nick, null)) {
            for (Cliente c : this.clientes) {
                if (c.getNickname().equalsIgnoreCase(nick)) {
                    return c;
                }
            }
        }
        return null;
    }

    /**
     * Metodo que verifica que un usuario exista en el catalogo
     *
     * @param nick String
     * @param consulta Usuario
     * @return boolean
     */
    @Override
    public boolean existe(String nick, Usuario consulta) {
        if (consulta != null && this.clientes.contains((Cliente) consulta)) {
            return true;
        }
        for (Cliente c : this.clientes) {
            if (c.getNickname().equalsIgnoreCase(nick)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que reasigna valor de verdadero al atributo estado de un usuario
     *
     * @param actual
     */
    @Override
    public void activar(Usuario actual) {
        if (!this.clientes.contains(actual)) {
            System.out.println("ERROR: La informacion cliente que quiere activar no existe");
        } else if (actual.isEstado() == true) {
            System.out.println("ERROR: El cliente ya esta activo.");
        } else {
            System.out.println(">>ACTIVACION DE CLIENTE EXITOSA<<");
            this.clientes.get(this.clientes.indexOf((Cliente) actual)).activar();
        }
    }

    /**
     * Metodo que reasigna valor de false al atributo estado de un usuario
     *
     * @param actual
     */
    @Override
    public void desactivar(Usuario actual) {
        if (!this.clientes.contains(actual)) {
            System.out.println("ERROR: La informacion cliente que quiere activar no existe");
        } else if (actual.isEstado() == false) {
            System.out.println("ERROR: El cliente ya esta desactivado.");
        } else {
            System.out.println(">>INACTIVACION DE CLIENTE EXITOSA<<");
            this.clientes.get(this.clientes.indexOf((Cliente) actual)).desactivar();
        }
    }
}
