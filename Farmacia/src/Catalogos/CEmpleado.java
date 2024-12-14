package Catalogos;

import Usuarios.*;
import java.io.Serializable;
import java.util.ArrayList;

public class CEmpleado implements Catalogo, Serializable {

    private ArrayList<Empleado> empleados = new ArrayList<>();

    /**
     * Constructor por omision
     */
    public CEmpleado() {

    }

    /**
     * Constructor que recibe un ArrayList
     *
     * @param nuevo
     */
    public CEmpleado(ArrayList<Empleado> nuevo) {
        this.empleados = nuevo;
    }

    /**
     * Metodo que retorna el valor del atributo empleados
     *
     * @return
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Metodo que asigna nuevo valor al atributo empleados
     *
     * @param empleados
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Metodo definido para agregar Usuarios a catalogo
     *
     * @param nuevo
     */
    @Override
    public void agregar(Usuario nuevo) {
        if (!this.existe(nuevo.getNickname(), nuevo)) {
            this.empleados.add((Empleado) nuevo);
            System.out.println(">> GUARDADO EXITOSO <<");
        } else {
            System.out.println("ERROR: Esta informacion de empleado ya ha sido registrada.\n");
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
            this.empleados.remove((Empleado) nuevo);
            System.out.println(">> ELIMINACION EXITOSA <<");
        } else {
            System.out.println("ERROR: Esta informacion de empleado no ha sido encontrada.\n");
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
            for (Empleado e : this.empleados) {
                if (e.getNickname().equalsIgnoreCase(nick)) {
                    return e;
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
        if (consulta != null && this.empleados.contains((Empleado) consulta)) {
            return true;
        }
        for (Empleado e : this.empleados) {
            if (e.getNickname().equalsIgnoreCase(nick)) {
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
        if (!this.empleados.contains(actual)) {
            System.out.println("ERROR: La informacion usuario que quiere activar no existe");
        } else if (actual.isEstado() == true) {
            System.out.println("ERROR: El empleado ya esta activo.");
        } else {
            System.out.println(">>ACTIVACION DE EMPLEADO EXITOSA<<");
            this.empleados.get(this.empleados.indexOf((Empleado) actual)).activar();
        }
    }

    /**
     * Metodo que reasigna valor de false al atributo estado de un usuario
     *
     * @param actual
     */
    @Override
    public void desactivar(Usuario actual) {
        if (!this.empleados.contains(actual)) {
            System.out.println("ERROR: La informacion usuario que quiere desactivar no existe");
        } else if (actual.isEstado() == false) {
            System.out.println("ERROR: El empleado ya esta desactivado.");
        } else {
            System.out.println(">>INACTIVACION DE EMPLEADO EXITOSA<<");
            this.empleados.get(this.empleados.indexOf((Empleado) actual)).desactivar();
        }
    }
}
