/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author licce
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){
    this.nombre = "";
    this.apellido = "";
    this.edad = 0;
    
    }
        public Persona(String nombre, String apellido, int edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    }
    
    public String getNombre(){
    return this.nombre;
    }    
    
    public void setNombre(String valo){
    this.nombre = valo;
    }
    
       public String getApellido(){
    return this.apellido;
    }    
    
    public void setApellido(String valo){
    this.apellido = valo;
    }
    
     public int getEdad(){
    return this.edad;
    }    
    
    public void setNombre(int valo){
    this.edad = valo;
    }

    public String datosPersona() {
        String valo;
        valo =  "Nombre: " + getNombre() + "\n" +
                "Apellido: " + getApellido() + "\n" +
                "Edad: " + getEdad() + "\n";
        return valo;
    }
    
    
}    

