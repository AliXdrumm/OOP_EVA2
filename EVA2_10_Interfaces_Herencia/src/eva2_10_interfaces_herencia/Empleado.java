/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_interfaces_herencia;

/**
 *
 * @author licce
 */
public class Empleado extends Persona implements Mensaje{
    
    private String puesto;
    private double salario;

    public Empleado() {
        this.puesto = "";
        this.salario = 0;
    }

    public Empleado(String nombre, String ap_paterno, String ap_materno, int edad, String puesto, double salario) {
        super(nombre, ap_paterno, ap_materno, edad);
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApPaterno() + " " + getApMaterno());
        System.out.println("Edad: " + getEdad());
        System.out.println("Puesto: " + this.puesto);
        System.out.println("Salario: " + this.salario);
    }
    
    
    
}
