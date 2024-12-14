package Servidor;

import Cliente.*;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Controlador {

    private Paquete miPaquete;
    private final String RUTA = "Paquetes.txt";

    /**
     * Constructor de clase
     *
     * @param miPaquete
     */
    public Controlador(Paquete miPaquete) {
        this.miPaquete = miPaquete;
    }

    /**
     * Metodo get para atributo miPaquete
     *
     * @return Paquete
     */
    public Paquete getMiPaquete() {
        return miPaquete;
    }

    /**
     * Metodo set para atributo miPaquete
     *
     * @param miPaquete
     */
    public void setMiPaquete(Paquete miPaquete) {
        this.miPaquete = miPaquete;
    }

    /**
     * Metodo que escribe el atributo miPaquete en e fichero
     */
    public void escribrir() {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(RUTA));
            os.writeObject(this.miPaquete);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("ERROR: Metodo escribir()");
        }

    }

    /**
     * Metodo que lee la informacion del fichero
     */
    public void leer() {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(RUTA));

            this.miPaquete = (Paquete) is.readObject();
            System.out.println("\t>>Lectura realizada<<");

        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("ERROR: Metodo leer() o la lectura ha sido vacia");
        } catch (ClassNotFoundException ex) {
            System.out.println("ERROR: Clase no encontrada");
        }
    }

    /**
     * Metodo que elimina la informacion del fichero
     */
    public void limpiarArchivo() {
        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA))) {
                bw.write("");
            }
        } catch (IOException ex) {
            System.out.println("ERROR: Metodo limpiarArchivo()");
        }
    }
}
