/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author licce
 */
public class Cliente extends Persona{
    private String rfc;
    private double credito;
    private String trabajo;
    
    public Cliente(){
    super();
    this.rfc = "";
    this.credito = 0;
    this.trabajo = "";
    }
    
    public Cliente(String nombre, String apellido, int edad, String rfc, double credito, String trabajo){
     super(nombre, apellido, edad);
    this.rfc = rfc;
    this.credito = credito;
    this.trabajo = trabajo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    @Override
    public String datosPersona(){
        String valo;
        valo = super.datosPersona() +
        "RFC: " + getRfc() + "\n" +
        "Credito: " + getCredito() + "\n" +
        "Trabajo: " + getTrabajo() + "\n";
        
        return valo;
    }
    
}
