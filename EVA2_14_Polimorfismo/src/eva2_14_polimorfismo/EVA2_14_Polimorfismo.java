/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_polimorfismo;

/**
 *
 * @author licce
 */
public class EVA2_14_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CIRCULO:");
        Circulo circulo = new Circulo(30);
        imprimir(circulo);
        
        System.out.println("RECTANGULO:");
        Rectangulo rectangulo = new Rectangulo(10, 20);
        imprimir(rectangulo);
        
        //MULTIPLES FIGURAS
        Figuras[] figuras = new Figuras[5];
        figuras[0] = new Circulo(10);
        figuras[1] = new Rectangulo(20,30);
        figuras[2] = new Circulo(30);
        figuras[3] = new Rectangulo(40,60);
        figuras[4] = new Circulo(50);
        
        for(int i = 0; i < figuras.length; i++) {
            imprimir(figuras[i]);
            
        }
        
    }
    public static void imprimir(Figuras figu){
        System.out.println("Area= " + figu.calcularArea());
        System.out.println("Perimetro= " + figu.calcularPerimetro());
    }
}
