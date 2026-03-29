/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_abstract;

/**
 *
 * @author alan
 */
public class Circulo extends Figuras{
    private double radio;
    
    public Circulo(){
    this.radio = 0;
    }
    
    public Circulo(double radio){
    this.radio = radio;
    }
    
    public double getRadio(){
    return this.radio;
    }
    
    public void setRadio(double valor){
    this.radio = valor;
    }

    @Override
    public double calcularPerimetro() {
       double perimetro;
       perimetro = Math.PI * (2 * this.radio);
       return perimetro;
    }

    @Override
    public double calcularArea() {
        double area;
        area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }
    
    @Override
    public String toString(){
    String resu;
    resu = "-----CIRCULO----" + "\n" +
            "Radio: " + this.radio + "cm" + "\n" +
            "Area: " + calcularArea() + "cm^2" + "\n" +
            "Perimetro: " + calcularPerimetro() + "cm" + "\n";
    return resu;
    }
    
}
