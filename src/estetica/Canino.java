package estetica;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Canino extends Thread{

    private String familia;

    private int id;

    private String nombre;
    private String raza;
    private String edad;
    
    private boolean secado;
    private boolean lavado;
    private boolean corte;
    private boolean unas;
    private boolean limAreas;
    private boolean humectacion;
    private boolean hongos;
    
    private boolean terminar;
    private servidor s;
    private Estetica e;
    

    public Canino(String familia, String nombre, String raza, String edad, boolean secado, boolean lavado, boolean corte, boolean unas, boolean limAreas, boolean humectacion, boolean hongos, servidor s, Estetica e) {
        this.familia = familia;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.secado = secado;
        this.lavado = lavado;
        this.corte = corte;
        this.unas = unas;
        this.limAreas = limAreas;
        this.humectacion = humectacion;
        this.hongos = hongos;
        this.terminar = false;
        this.s=s;
        this.e = e;
    }
    
    public void run(){
        while (!terminar){

            lavar();
            recortarUnas();
            cortar();
            limpiezaProfunda();
            quitarHongos();
            humectar();           
            
            if(secado && lavado &&corte&&unas&&limAreas&&humectacion&&hongos){
                terminar = true;
            }
        }
        s.mostrar("El perro "+nombre+ " termino su servicio");

        s.aviso("El perro " +nombre+ " de la familia " +familia+ " termino su servicio");
    }
    
    public void limpiezaProfunda(){
        if(e.areaDisponible("limProfunda") && !limAreas){
            try {
                limAreas=e.limProfunda(familia, nombre);
                sleep(5000);
                e.dejarLimProfunda(familia, nombre);
            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void quitarHongos(){
        if(e.areaDisponible("hongos")&& !hongos){         
            try {
                hongos = e.hongos(familia, nombre);
                sleep(4000);
                e.dejarHongos(familia, nombre);
            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void recortarUnas(){
        if(e.areaDisponible("humectacion")&& !unas){
            try {

                unas = e.unas(familia, nombre);
                sleep(6000);
                e.dejarUnas(familia, nombre);

            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void humectar(){
         if(e.areaDisponible("humectacion")&& !humectacion){
            try {

                humectacion = e.humectacion(familia, nombre);
                sleep(3000);
                e.dejarHumectacion(familia, nombre);
            } catch (InterruptedException ex) {
                 Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void lavar(){
        if(e.areaDisponible("banos")&& !lavado){
            try {
                lavado = e.banar(familia, nombre);      
                sleep(5000);
                e.dejarBanar(familia, nombre);

            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
            secar();
        }
    }
    public void secar(){

        while (!secado) { 
            if(e.areaDisponible("secado")&& !secado && lavado){
                try {
                    secado = e.secar(familia, nombre);             
                    sleep(8000);
                    e.dejarSecar(familia, nombre);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }  
        }
    }
    public void cortar(){
        if(e.areaDisponible("recortes")&& !corte){
            try {
                corte = e.recortes(familia, nombre);
                sleep(6000);
                e.dejarRecortes(familia, nombre);

            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
