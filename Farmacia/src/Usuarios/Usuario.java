package Usuarios;
import java.io.Serializable;

public abstract class Usuario implements Serializable {

    private String nombre, apellidos, nickname, password, ciudad, direccion, telefono, correo;
    private boolean estado;

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
    public Usuario(String nombre, String apellidos, String nickname, String password, String ciudad, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nickname = nickname;
        this.password = password;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
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
     * Metodo get para atributo apellidos
     *
     * @return String
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Metodo set para atributo apellidos
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Metodo get para atributo nickname
     *
     * @return String
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Metodo set para atributo nickname
     *
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Metodo get para atributo password
     *
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * Metodo set para atributo password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Metodo get para atributo ciudad
     *
     * @return String
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Metodo set para atributo ciudad
     *
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Metodo get para atributo direccion
     *
     * @return String
     */
    public String getDirección() {
        return direccion;
    }

    /**
     * Metodo set para atributo direccion
     *
     * @param direccion
     */
    public void setDirección(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo get para atributo telefono
     *
     * @return String
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo set para atributo telefono
     *
     * @param teléfono
     */
    public void setTelefono(String teléfono) {
        this.telefono = teléfono;
    }

    /**
     * Metodo get para atributo correo
     *
     * @return String
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo set para atributo correo
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
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
     * Metodo toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Nickname: " + nickname + ", Password:" + password + ", Ciudad: " + ciudad + ", Direccion: "
                + direccion + ", Telefono: " + telefono + ", Correo: " + correo + ", Estado=" + estado;
    }

    /**
     * Metodo activar
     */
    public abstract void activar();

    /**
     * Metodo desactivar
     */
    public abstract void desactivar();
}
