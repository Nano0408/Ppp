package Usuarios;

import Cliente.Carrito;
import Cliente.Factura;
import Cliente.Paquete;
import Farmaceuticas.CasaFabricante;
import Farmaceuticas.Categoria;
import Farmaceuticas.Producto;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Enlace {
    // Conexión del socket y el sistema con la interfaz grafica 
    private Paquete myPaquete;
    private final String IPSERVER = "127.0.0.1";
    private final int puerto = 9999;

    /**
     * Constructor de clase
     *
     * @param paquete
     */
    public Enlace(Paquete paquete) {
        this.myPaquete = paquete;
    }

    /**
     * Metodo que conecta con el servidor
     */
    public void enlazar() {
        Socket socket;
        
        try {
            InetAddress address = InetAddress.getLocalHost();
            socket = new Socket(this.IPSERVER, this.puerto);
            
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(this.myPaquete);
            socket.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Direccion ip del servidor es invalida");
            System.exit(0);   
        } 
    }
}
