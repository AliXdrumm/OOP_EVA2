/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_composicion;

/**
 *
 * @author licce
 */
public class Electrico extends Motor{
    private String tipoBateria;
    private int tiempoCarga;

    public Electrico(){
        super();
        this.tipoBateria = "";
        this.tiempoCarga = 0;
    }

    public Electrico(String tipoBateria, int tiempoCarga, double potencia) {
        super(potencia);
        this.tipoBateria = tipoBateria;
        this.tiempoCarga = tiempoCarga;
    }

    public int getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(int tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    @Override
    public String toString() {
 return  super.toString() + 
         "\tBateria: " + this.tipoBateria + "\n" +
         "\tTiempo de carga: " + this.tiempoCarga;       
    }
    
    
}
