package Usuarios;

public class Cliente extends Usuario {

    /**
     * Constructor de clase
     *
     * @param nombre
     * @param apellidos
     * @param nickname
     * @param password
     * @param ciudad
     * @param direccion
     * @param telefono
     * @param correo
     */
    public Cliente(String nombre, String apellidos, String nickname, String password, String ciudad, String direccion, String telefono, String correo) {
        super(nombre, apellidos, nickname, password, ciudad, direccion, telefono, correo);
    }

    /**
     * Metodo activar
     */
    @Override
    public void activar() {
        this.setEstado(true);
    }

    /**
     * Metodo desactivar
     */
    @Override
    public void desactivar() {
        this.setEstado(false);
    }
}
