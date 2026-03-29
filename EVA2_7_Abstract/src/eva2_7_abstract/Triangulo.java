/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_abstract;

/**
 *
 * @author licce
 */
public class Triangulo extends Figuras{
    private double base, altura, lados;
    
    public Triangulo(){
    this.altura = 0;
    this.base = 0;
    this.lados = 0;
    }
    
    public Triangulo(double base, double altura, double lados){
    this.altura = altura;
    this.base = base;
    this.lados = lados;
    }
    
    public double getBase(){
    return this.base;
    }
    
    public void setBase(double valor){
    this.base = valor;
    }
    
    public double getAltura(){
    return this.altura;
    }
    
    public void setAltura(double valor){
    this.altura = valor;
    }
    
    public double getLados(){
    return this.lados;
    }
    
    public void setLados(double valor){
    this.lados = valor;
    }

    @Override
    public double calcularArea() {
    double area;
    area = this.base * this.altura;
    return area;
    }

    @Override
    public double calcularPerimetro() {
    double perimetro;
    perimetro = 3 * this.lados;
    return perimetro;
    }
    
    @Override
    public String toString(){
    String valo;
    valo = "------TRIANGULO-----" + "\n" +
            "Base: " + this.base + "cm" + "\n" +
            "Altura: " + this.altura + "cm" + "\n" +
            "Lados: " + this.lados + "cm" + "\n" +
           "Area: " + calcularArea() + "cm^2" + "\n" +
            "Perimetro: " + calcularPerimetro() + "cm" + "\n";
    return valo;
    }
}
