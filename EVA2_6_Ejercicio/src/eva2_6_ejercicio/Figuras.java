/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_ejercicio;

/**
 *
 * @author licce
 */
public class Figuras extends Circulo {

    public Figuras(){
    super();
    }
    
    public Figuras(double radio, double base, double altura, double lados){
    super(radio, base, altura, lados);
    }
    
    public double areaCirculo(){
    double areaCirculo;
    
    areaCirculo = Math.PI * (getRadio() * getRadio());
    
    return areaCirculo;
    }
    
        public double areaTriangulo(){
    double areaTriangulo;
    
    areaTriangulo = (getBase() * getAltura()) / 2;
    
    return areaTriangulo;
    }
    
    public double perimetroCirculo(){
    double perimetroCirculo;
    
    perimetroCirculo = Math.PI * (2 * getRadio());
    return perimetroCirculo;
    }
    
    public double perimetroTriangulo(){
    double perimetroTriangulo;
    
    perimetroTriangulo = 3 * getLados();
    
    return perimetroTriangulo;
    }
    
    @Override
    public String toString(){
    String resu;
    resu = "--------AREAS------" + "\n" +
            "Area del circulo: " + areaCirculo() + "\n" +
            "Area del triangulo: " + areaTriangulo() + "\n" +
            "-------PERIMETROS-----" + "\n" +
            "Perimetro del circulo: " + perimetroCirculo() + "\n" +
            "Perimetro del triangulo: " + perimetroTriangulo() + "\n";
    
    return resu;
    }
}
