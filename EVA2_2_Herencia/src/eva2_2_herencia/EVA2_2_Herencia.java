/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_herencia;

/**
 *
 * @author licce
 */
public class EVA2_2_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        Cliente cliente = new Cliente();
        Proveedor proveedor = new Proveedor();
        
     
        
    }
    
}

class Persona{
private String nombre;
private String apellido;
private int edad;

public String getNombre(){
return this.nombre;
}

public void setNombre(String valor){
this.nombre = valor;
}

public String getApellido(){
return this.apellido;
}

public void setApellido(String valor){
this.apellido = valor;
}

public int getEdad(){
return this.edad;
}

public void setNombre(int valor){
this.edad = valor;
}

}

class Empleado extends Persona{
private double salario;

public double getSalario(){
return this.salario;
}
public void setSalario(double valor){
this.salario = valor;
}
    
}

class Cliente extends Persona{

    
}

class Proveedor extends Persona{

    
}
