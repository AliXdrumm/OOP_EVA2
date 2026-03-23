/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author licce
 */
public class EmpleadoBase extends Empleado {
   private int annioingreso;
   
   public EmpleadoBase(){
       super();
   this.annioingreso = 0;
   }
public EmpleadoBase(int annioingreso, String numEmp, int salario, String puesto, String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero){
   super(numEmp, salario, puesto, nombre, ap_paterno, ap_materno, rfc, edad, genero);
this.annioingreso = annioingreso;
   }
    
    public int getAnnioIngreso(){
    return this.annioingreso;
    }
    
    public void setAnnioIngreso(int valor){
    valor = this.annioingreso;
    }
    
    public int antiguedad(){
    int antiguedad = 2026 - this.annioingreso;
    return antiguedad;
    }
    
    public double calcularSalario(){
    return getSalario() * (1 + (antiguedad() * 0.1));
    }
    
    @Override
    public String toString(){
    String resu = super.toString() + "\n" +
            "Antiguedad: " + antiguedad() + "\n" +
            "Salario total: " + calcularSalario();
    return resu;
    }
}
