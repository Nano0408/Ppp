package Servidor;
import Cliente.Paquete;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ServidorFarmacia extends javax.swing.JFrame implements Runnable {

    private Controlador myControlador;
    private Paquete myPaquete;

    /**
     * Constructor por omision
     */
    public ServidorFarmacia() {
        initComponents();
        this.setResizable(false);
    }
    
    /**
     * Metodo guardar, que escribe en el fichero
     *
     * @param paquete
     */
    public void guardar(Paquete paquete) {
        this.myControlador = new Controlador(paquete);
        this.myControlador.escribrir();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menServidor = new javax.swing.JLabel();
        texto = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menServidor.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        menServidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menServidor.setText("SERVIDOR");
        getContentPane().add(menServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 50));

        info.setEditable(false);
        info.setColumns(20);
        info.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        info.setRows(5);
        texto.setViewportView(info);

        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 420));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.guardar(myPaquete);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ServidorFarmacia server = new ServidorFarmacia();
                Thread leer = new Thread(server);
                leer.start();
                server.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JTextArea info;
    private javax.swing.JLabel menServidor;
    private javax.swing.JScrollPane texto;
    // End of variables declaration//GEN-END:variables
/**
 * Metodo run para activar el servidor
 */
    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(9999);
            while (true) {
                this.info.append("Leyendo...\n");
                Socket socketS = server.accept();
                ObjectInputStream in = new ObjectInputStream(socketS.getInputStream());
                try {
                    this.myPaquete = (Paquete) in.readObject();
                    in.close();
                    socketS.close();
                    this.info.append(myPaquete.toString());
                    JOptionPane.showMessageDialog(null, "PARA VISUALIZAR LOS CAMBIOS RECIBIDOS INGRESE COMO ADMINISTRADOR AL PROGRAMA");
                    if (this.myControlador != null) {
                        this.myControlador.limpiarArchivo();
                    }
                } catch (ClassNotFoundException ex) {
                    System.out.println("Error clase no encontrada.");
                }
            }
        } catch (IOException ex) {
            System.out.println("Error en metodo run()");
        }
    }
}
