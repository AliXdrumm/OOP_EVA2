/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_14_polimorfismo;

/**
 *
 * @author licce
 */
public class Rectangulo implements Figuras{
    private double base;
    private double alto;
    
    public Rectangulo(){
    this.alto = 0;
    this.base = 0;
    }
    
    public Rectangulo(double base, double alto){
    this.alto = alto;
    this.base = base;
    }
    
    public double getBase(){
    return this.base;
    }
    
    public void setBase(double valo){
    this.base = valo;
    }
    
        public double getAlot(){
    return this.alto;
    }
    
    public void setAlto(double valo){
    this.alto = valo;
    }

    @Override
    public double calcularArea() {
        double resu;
        resu = this.base * this.alto;
        return resu;
    }

    @Override
    public double calcularPerimetro() {
        double resu;
        resu = (2 * this.alto) + (2 * this.base);
        return resu;
    }
    
    
}
