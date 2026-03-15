/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4ejemplo_herencia;

/**
 *
 * @author licce
 */
public class Persona {
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String rfc;
    private int edad;
    private char genero;
    
    public Persona(){
    this.nombre = "";
    this.ap_paterno = "";
    this.ap_materno = "";
    this.rfc = "";
    this.edad = 0;
    this.genero = 'H';
    }
    
    public Persona(String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero){
    this.nombre = nombre;
    this.ap_paterno = ap_paterno;
    this.ap_materno = ap_materno;
    this.rfc = rfc;
    this.edad = edad;
    this.genero = genero;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
    public void setNombre(String valor){
    this.nombre = valor;
    }
    
     public String getApPaterno(){
    return this.ap_paterno;
    }
     
    public void setApPaterno(String valor){
    this.ap_paterno = valor;
    }
    
     public String getApMaterno(){
    return this.ap_materno;
    }
     
    public void setApMaterno(String valor){
    this.ap_materno = valor;
    }
    
     public String getRfc(){
    return this.rfc;
    }
     
    public void setRfc(String valor){
    this.rfc = valor;
    }
    
     public int getEdad(){
    return this.edad;
    }
     
    public void setEdad(int valor){
    this.edad = valor;
    }
    
     public char getGenero(){
    return this.genero;
    }
     
    public void setGenero(char valor){
    this.genero = valor;
    }
    
    public String generarNombreCom(){
    return nombre + " " + ap_paterno + " " + ap_materno;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + generarNombreCom());
        System.out.println("RFC: " + this.rfc);
        System.out.println("Edad: " + this.edad);
        System.out.println("Genero: " + this.genero);
    }
    
}
