/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_composicion;

/**
 *
 * @author licce
 */
public class Persona extends Direccion{
    private String nombre;
     private String apellido;
     private int edad;
     private Direccion direccion; //La persona TIENE una direccion
     
     //CONSTRUCTORES
     
     
     public Persona(){
      this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.direccion = new Direccion();
     }
     
    public Persona(String nombre, String apellido, int edad, String calle, int numero, String colonia, String cp){
        super(calle, numero, colonia, cp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = new Direccion(calle, numero, colonia, cp);
    }
    
        public Persona(String nombre, String apellido, int edad, Direccion direccion){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = new Direccion();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "DATOS DE LA PERSONA:" + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Edad: " + this.edad + "\n" +
                this.direccion;
                
    }
     
     
}
