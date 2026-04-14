/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_final;

/**
 *
 * @author licce
 */
public class EVA2_13_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class Persona{
private String nombre;

public Persona(){
this.nombre = "";
}

public Persona(String nombre){
this.nombre = nombre;
}

public String getNombre(){
return this.nombre;
}

public void setNombre(String valo){
this.nombre = valo;
}

}
final class Empleado extends Persona{
private String puesto;

    public Empleado() {
        super();
        this.puesto = "";
    }

    public Empleado(String nombre, String puesto) {
        super(nombre);
        this.puesto = puesto;
    }

    public String getPuesto(){
    return this.puesto;
    }
    
    public void setPuesto(String valo){
    this.puesto = valo;
    }
    
//class CEO extends Empleado{}

}