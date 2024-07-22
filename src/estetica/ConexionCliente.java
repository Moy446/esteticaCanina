package estetica;

import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexionCliente {
    private Socket socket;
    private DataInputStream bufferDeEntrada ;
    private ObjectOutputStream enviaObjeto;
    Scanner teclado = new Scanner(System.in);
    final String COMANDO_TERMINACION = "salir()";
    cliente panel;
    
    public ConexionCliente(cliente panel){
        this.panel=panel;
    }
    
    public void LevantarConexion(String ip, int puerto){
        try{
        socket = new Socket(ip, puerto);
        mostrarTexto ("Conectado a: "+ socket.getInetAddress().getHostName());
        }catch(Exception e){
            mostrarTexto("Excepcion al realizar conexion: " + e.getMessage());
        }
    }
        
    public void mostrarTexto(String s) {
        System.out.println(s);
    }
    
    public void abrirFlujos(){
        try{
            bufferDeEntrada = new DataInputStream(socket.getInputStream());
            enviaObjeto = new ObjectOutputStream(socket.getOutputStream());
            enviaObjeto.flush();
        }catch(IOException e){
            mostrarTexto("Error en la puerta de flujos");
        }
    }
    
    public void enviar(Data data){
        try{
            enviaObjeto.writeObject(data);
            enviaObjeto.flush();
        }catch(IOException e){
            mostrarTexto("IOException on enviar");
        }
    }
    
    public void cerrarConexion(){
        try {
            bufferDeEntrada.close();
            enviaObjeto.close();
            socket.close();
            mostrarTexto("Conexion terminada");
        } catch (IOException e) {
            mostrarTexto("Error en cerrar conexion");
        }finally{
            System.exit(0);
        }
    }
    
    public void ejecutarConexion(String ip, int puerto){
        Thread hilo = new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    LevantarConexion(ip, puerto);
                    abrirFlujos();
                    recibirDatos();
                } finally {
                    cerrarConexion();
                }
            }
        });
        hilo.start();
        }
    
    public void recibirDatos(){
        String noti;
        try {
            do{
               noti = bufferDeEntrada.readUTF(); 
                JOptionPane.showMessageDialog(null, noti);
            }while (!noti.equals(COMANDO_TERMINACION));
        } catch (IOException ex) {
            Logger.getLogger(ConexionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

