/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author licce
 */
public class Empleado extends Persona {
    private String puesto;
    private double salario;
    
    public Empleado(){
    super();
    this.puesto = "";
    this.salario = 0;
    }
    
    public Empleado(String nombre, String apellido, int edad, String puesto, double salario){
    super(nombre, apellido, edad);
    this.puesto = puesto;
    this.salario = salario;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   @Override
    public String datosPersona(){
   String valo;
   valo =  super.datosPersona() +
           "Puesto: " + getPuesto() + "\n" +
           "Salariol: " + getSalario() + "\n";
   return valo;
    }
   
}
