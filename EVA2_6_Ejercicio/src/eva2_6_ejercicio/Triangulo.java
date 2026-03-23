/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_ejercicio;

/**
 *
 * @author licce
 */
public class Triangulo {
        private double base;
    private double altura;
    private double lados;
    
    public Triangulo(){
    this.base = 0;
    this.altura = 0;
    this.lados = 0;
    }
    
    public Triangulo(double base, double altura, double lados){
    this.base = base;
    this.altura = altura;
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
    
    public String toString(){
    String datos;
    datos = "------TRIANGULO------" + "\n" +
            "El triangulo presenta: " + "\n" +
            "Una base de: " + this.base + "cm" + "\n" +
            "Una altura de: " + this.altura + "cm" + "\n" +
            "Y unos lados de: " + this.lados + "cm" + "\n";
    return datos;
            
    }
}
