
package estetica;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Canino extends Thread{
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
    

    public Canino(int id, String nombre, String raza, String edad, boolean secado, boolean lavado, boolean corte, boolean unas, boolean limAreas, boolean humectacion, boolean hongos, servidor s, Estetica e) {
        this.id = id;
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
            limpiezaProfunda();
            quitarHongos();
            recortarUnas();
            humectar();
            lavar();
            cortar();
            
            if(secado && lavado &&corte&&unas&&limAreas&&humectacion&&hongos){
                terminar = true;
            }
        }
        s.mostrar("El perro "+nombre+ " termino su servicio");
    }
    
    public void limpiezaProfunda(){
        if(e.areaDisponible("limProfunda") && !limAreas){
            try {
                limAreas=e.limProfunda(id, nombre);
                sleep(4000);
                e.dejarLimProfunda(id, nombre);
            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void quitarHongos(){
        if(e.areaDisponible("hongos")&& !hongos){         
            try {
                hongos = e.hongos(id, nombre);
                sleep(4000);
                e.dejarHongos(id, nombre);
            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void recortarUnas(){
        if(e.areaDisponible("humectacion")&& !unas){
            try {
                unas = e.unas(id, nombre);
                sleep(4000);
                e.dejarUnas(id, nombre);
            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void humectar(){
         if(e.areaDisponible("humectacion")&& !humectacion){
            try {
                humectacion = e.humectacion(id, nombre);
                sleep(4000);
                e.dejarHumectacion(id, nombre);
            } catch (InterruptedException ex) {
                 Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void lavar(){
        if(e.areaDisponible("banos")&& !lavado){
            try {
                lavado = e.banar(id, nombre);      
                sleep(4000);
                e.dejarBanar(id, nombre);
            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
            secar();
        }
    }
    public void secar(){
        if(e.areaDisponible("secado")&& !secado && lavado){
            try {
                secado = e.secar(id, nombre);             
                sleep(4000);
                e.dejarSecar(id, nombre);
            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void cortar(){
        if(e.areaDisponible("recortes")&& !corte){
            try {
                corte = e.recortes(id, nombre);
                sleep(4000);
                e.dejarRecortes(id, nombre);
            } catch (InterruptedException ex) {
                Logger.getLogger(Canino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
