package estetica;


public class Data {
     String familia;
     String nombre;
     String raza;
     String edad;
    
     boolean secado;
     boolean lavado;
     boolean corte;
     boolean unas;
     boolean limAreas;
     boolean humectacion;
     boolean hongos;
    
    
    public Data(String familia, String nombre, String raza, String edad, boolean secado, boolean lavado, boolean corte, boolean unas, boolean limAreas, boolean humectacion, boolean hongos) {
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
    }
}
