package estetica;

public class Estetica{
    private int bañosActuales;
    private int secadorasActuales;
    private int limpiezaProfundaActual;
    private int recortesActuales;
    private int hongosActual;
    private int humetacionUnasActual;
    private servidor s;
   
    public Estetica(servidor s) {
        bañosActuales =0;
        secadorasActuales = 0;
        limpiezaProfundaActual = 0;
        recortesActuales = 0;
        hongosActual = 0;
        humetacionUnasActual = 0;
        this.s = s;
    }
    
    public synchronized boolean banar (int idPerro, String nombre){
        bañosActuales ++;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se esta banando\n");
        return true;
    }
    
    public synchronized boolean secar(int idPerro, String nombre){
        secadorasActuales ++;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se esta secando\n");
        return true;
    }
    
    public synchronized boolean limProfunda (int idPerro, String nombre){
        limpiezaProfundaActual ++;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le esta haciendo su limpieza profunda\n");
        return true;
    }
    
    public synchronized boolean recortes (int idPerro, String nombre){        
        recortesActuales ++;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le esta recortando su pelaje\n");
        return true;
    }
    
    public synchronized boolean hongos (int idPerro, String nombre){        
        hongosActual ++;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le estan limpiando los hongos\n");
        return true;
    }
    
    public synchronized boolean humectacion (int idPerro, String nombre){
        humetacionUnasActual ++;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le esta humectando la piel\n");
        return true;
    }
    
    public synchronized boolean unas(int idPerro, String nombre){
        humetacionUnasActual++;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le esta cortando las unas\n");
        return true;
    }
    
    
    public synchronized void dejarBanar (int idPerro, String nombre){
        bañosActuales --;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le dejo banar\n");
        notifyAll();
    }
    
    public synchronized void dejarSecar(int idPerro, String nombre){
        secadorasActuales --;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le dejo de secar\n");
        notifyAll();
    }
    
    public synchronized void dejarLimProfunda (int idPerro, String nombre){
        limpiezaProfundaActual --;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le dejo de hacer su limpieza profunda\n");
        notifyAll();
    }
    
    public synchronized void dejarRecortes (int idPerro, String nombre){        
        recortesActuales --;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le dejo de recortar su pelaje\n");
        notifyAll();
    }
    
    public synchronized void dejarHongos (int idPerro, String nombre){        
        hongosActual --;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le dejo de limpiar los hongos\n");
        notifyAll();
    }
    
    public synchronized void dejarHumectacion (int idPerro, String nombre){
        humetacionUnasActual --;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le dejo de humectar la piel\n");
        notifyAll();
    }
    
    public synchronized void dejarUnas(int idPerro, String nombre){
        humetacionUnasActual--;
        s.mostrar("El perro "+nombre+" con id "+idPerro+" se le dejo de cortar las unas\n");
        notifyAll();
    }
    
    public synchronized boolean areaDisponible(String area){
        switch (area) {
            case "banos":
                return bañosActuales<2;
            case "secado":
                return secadorasActuales<2;
            case "limProfunda":
                return limpiezaProfundaActual<1;
            case "recortes":
                return recortesActuales<2;
            case "hongos":
                return hongosActual<1;
            case "humectacion":
                return humetacionUnasActual<1;
            default:
                return false;
        }
    }
    
}
