/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_ejercicio;

/**
 *
 * @author licce
 */
public class Circulo extends Triangulo{
    private double radio;
    
    public Circulo(){
        super();
    this.radio = 0;
    }
    
    public Circulo(double radio, double base, double altura, double lados){
        super(base, altura, lados);
    this.radio = radio;
    }
    
    public double getRadio(){
    return this.radio;
    }
    
    public void setRadio(double valor){
    this.radio = valor;
    }
   
    @Override
    public String toString(){
    String datos;
    datos = "--------CIRCULO---------" + "\n" +
            "El circulo presenta: " + "\n" +
            "Un radio de: " + this.radio + "\n";
    return datos;
    }
    
}
