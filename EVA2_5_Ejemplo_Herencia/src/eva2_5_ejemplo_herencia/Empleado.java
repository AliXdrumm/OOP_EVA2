/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author licce
 */
public class Empleado extends Persona{
    private String numEmp;
    private String puesto;
    private int salario;
    
    public Empleado(){
        super();
this.numEmp = "";
this.salario = 0;
this.puesto = "";
}
    public Empleado(String numEmp, int salario, String puesto, String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero){
        super(nombre,ap_paterno,ap_materno, rfc, edad, genero);
    this.numEmp = numEmp; 
    this.salario = salario;
    this.puesto = puesto;
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
    
    public void setSalario(int valor){
    this.salario = valor;
    }
   
    public double calcularSalario(){
    double sala;
    sala = this.salario / 7;
    return sala;
    }
        
 @Override
 public void imprimirDatos(){
 super.imprimirDatos();//Llamo a imprimir datos
     System.out.println("Numero de empleado:  " + this.numEmp);
     System.out.println("Puesto:  " + this.puesto);
     System.out.println("Salario:  $" + this.calcularSalario());
 }
    
    @Override
    public String toString(){
    String resu = "";
    resu = "----------Datos del Empleado-------" + "\n" + 
            "Nombre: " + generarNombreCompleto() + "\n" +
            "RFC: " + getRfc() + "\n" +
            "Edad: " + getEdad() + "\n" +
            "Numero de empleado: " + numEmp + "\n" +
            "Puesto: " + puesto + "\n" +
            "Salario base: " + calcularSalario() + "\n";
    return resu;
    }

}
