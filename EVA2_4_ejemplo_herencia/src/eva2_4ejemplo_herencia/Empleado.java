/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4ejemplo_herencia;

/**
 *
 * @author licce
 */
public class Empleado extends Persona {
    private String numEmp;
    private String puesto;
    private double salario;
    
    public Empleado(){
        super();
    this.numEmp = "";
    this.puesto = "";
    this.salario = 0;
    }
    public Empleado(String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero, String numEmp, String puesto, double salario){
        super(nombre, ap_paterno, ap_materno, rfc, edad, genero);
    this.numEmp = numEmp;
    this.puesto = puesto;
    this.salario = salario;
    
    }
    public String getNumEmpleado(){
    return this.numEmp;
    }
    
    public void setNumEmp(String valor){
    this.numEmp = valor;
    }
    
    public String getPuesto(){
    return this.puesto;
    }
    
    public void setPuesto(String valor){
    this.puesto = valor;
    }
    
    public double getSalario(){
    return this.salario;
    }
    
    public void setSalario(double valor){
    this.salario = valor;
    }
    
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Numero de empleado: " + this.numEmp);
        System.out.println("Puesto: " + this.puesto);
        System.out.println("Salario: $" + this.salario);
    }
}
