
package estetica;

import java.net.*;
import java.io.*;
import java.util.Scanner;


public class ConexionCliente {
    private Socket socket;
    private DataInputStream bufferDeEntrada ;
    private DataOutputStream bufferDeSalida ;
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
        panel.mostrar(s);
    }
    
    public void abrirFlujos(){
        try{
            bufferDeEntrada = new DataInputStream(socket.getInputStream());
            bufferDeSalida = new DataOutputStream(socket.getOutputStream());
            bufferDeSalida.flush();
        }catch(IOException e){
            mostrarTexto("Error en la puerta de flujos");
        }
    }
    
    public void enviar(String s){
        try{
            bufferDeSalida.writeUTF(s);
            bufferDeSalida.flush();
        }catch(IOException e){
            mostrarTexto("IOException on enviar");
        }
    }
    
    public void cerrarConexion(){
        try {
            bufferDeEntrada.close();
            bufferDeSalida.close();
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
        String st = "";
        try {
            do{
                st = (String) bufferDeEntrada.readUTF();
                mostrarTexto("\n [Servidor] => " + st);
                System.out.println("\n [Usted] => ");
            }while(!st.equals(COMANDO_TERMINACION));
        } catch (IOException e) {
        }
    }
    
    public void escribirDatos(){
        String entrada="";
        while(true){
            System.out.println("[Usted] => ");
            entrada = teclado.nextLine();
            if(entrada.length() > 0)
                enviar(entrada);
        }
    }
}

