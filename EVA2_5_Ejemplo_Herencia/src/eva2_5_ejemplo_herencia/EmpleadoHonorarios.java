/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author licce
 */
public class EmpleadoHonorarios extends EmpleadoBase {
    private int horas;
    
    public EmpleadoHonorarios(){
    super();
    this.horas = 0;
    }
    
    public EmpleadoHonorarios(int horas, int annioingreso, String numEmp, int salario, String puesto, String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero ){
    super(annioingreso, numEmp, salario, puesto, nombre, ap_paterno, ap_materno, rfc, edad, genero);
    this.horas = horas;
    }
    
    public int getHoras(){
    return this.horas;
    }
    public void setHoras(int valor){
    this.horas = valor;
    }
    
    public double calcularSalario(){
    return getSalario() * this.horas;
    }
    
    @Override
    public String toString(){
    String resu = super.toString() + "\n" +
            "Horas: " + this.horas + "\n" +
            "Salario: " + calcularSalario() + "\n";
    return resu;
    }
}
