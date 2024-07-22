package estetica;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionServidor {

    private Socket socket;
    private ServerSocket serverSocket;
    private ObjectInputStream recibeObjeto = null;
    private DataOutputStream bufferDeSalida = null;
    Scanner escaner = new Scanner(System.in);
    final String COMANDO_TERMINACION = "salir()";
    servidor Panel;
    Estetica estetica;

    public ConexionServidor(servidor Panel, Estetica estetica) {
        this.Panel = Panel;
        this.estetica = estetica;
    }

    public void levantarConexion(int puerto) {
        try {
            serverSocket = new ServerSocket(puerto);
            mostrarTexto("Esperando conexión entrante en el puerto " + String.valueOf(puerto) + "...");
            socket = serverSocket.accept();
            mostrarTexto("Conexión establecida con: " + socket.getInetAddress().getHostName() + "\n\n\n");
        } catch (Exception e) {
            mostrarTexto("Error en levantarConexion(): " + e.getMessage());
            System.exit(0);
        }
    }
    public void flujos() {
        try {
            recibeObjeto = new ObjectInputStream(socket.getInputStream());
            bufferDeSalida = new DataOutputStream(socket.getOutputStream());
            bufferDeSalida.flush();
        } catch (IOException e) {
            mostrarTexto("Error en la apertura de flujos");
        }
    }

    public void recibirDatos() {
        try {
            Data data = (Data) recibeObjeto.readObject();
            
         String familia = data.familia;
         String nombre = data.nombre;
         String raza = data.raza;
         String edad = data.edad;

         boolean secado = data.secado;
         boolean lavado = data.lavado;
         boolean corte = data.corte;
         boolean unas = data.unas;
         boolean limAreas = data.limAreas;
         boolean humectacion = data.humectacion;
         boolean hongos = data.hongos;
         
         Canino canino = new Canino(familia, nombre, raza, edad, secado, lavado, corte, unas, limAreas, humectacion, hongos, Panel, estetica);
         
            
        } catch (IOException ex) {
            Logger.getLogger(ConexionServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void enviar(String s) {
        try {
            bufferDeSalida.writeUTF(s);
            bufferDeSalida.flush();
        } catch (IOException e) {
            mostrarTexto("Error en enviar(): " + e.getMessage());
        }
    }

    public static void mostrarTexto(String s) {
        System.out.print(s);
    }

    public void cerrarConexion() {
        try {
            recibeObjeto.close();
            bufferDeSalida.close();
            socket.close();
        } catch (IOException e) {
          mostrarTexto("Excepción en cerrarConexion(): " + e.getMessage());
        } finally {
            mostrarTexto("Conversación finalizada....");
            System.exit(0);

        }
    }

    public void ejecutarConexion(int puerto) {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        levantarConexion(puerto);
                        flujos();
                        recibirDatos();
                    } finally {
                        cerrarConexion();
                    }
                }
            }
        });
        hilo.start();
    }
}