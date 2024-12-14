package Catalogos;
import Usuarios.*;
public interface Catalogo {

    /**
     * Metodo definido para agregar Usuarios a catalogo
     * @param nuevo 
     */
    public void agregar(Usuario nuevo);

    /**
     * Metodo definido para eliminar Usuarios a catalogo
     * @param nuevo
     */
    public void eliminar(Usuario nuevo);

    /**
     * Metodo que busca a un usuario en el catalogo dado su nickname
     * @param nick
     * @return Usuario
     */
    public Usuario consulta(String nick);

    /**
     * Metodo que verifica que un usuario exista en el catalogo
     * @param nick String
     * @param consulta Usuario
     * @return boolean
     */
    public boolean existe(String nick, Usuario consulta);

    /**
     * Metodo que reasigna valor de verdadero al atributo estado de un usuario
     * @param actual
     */
    public void activar(Usuario actual);

    /**
     * Metodo que reasigna valor de false al atributo estado de un usuario
     * @param actual
     */
    public void desactivar(Usuario actual);
}
