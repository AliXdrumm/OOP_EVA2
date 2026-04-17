/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_14_polimorfismo;

/**
 *
 * @author licce
 */
public class Circulo implements Figuras{
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
    public double calcularArea() {
        double resu;
        resu = Math.PI * (Math.pow(radio, 2));
        return resu;
    }

    @Override
    public double calcularPerimetro() {
       double resu;
       resu = Math.PI * (2 * radio);
       return resu;
    }    
}
