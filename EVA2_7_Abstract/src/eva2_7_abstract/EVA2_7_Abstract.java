/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_abstract;

/**
 *
 * @author licce
 */
public class EVA2_7_Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*// TODO code application logic here
        Figuras figu = new Figuras();//NO SE PUEDEN INSTANCIAR*/
        Circulo circulo = new Circulo(20);
        System.out.println(circulo);
        
        Triangulo triangulo = new Triangulo(12, 36, 48);
        System.out.println(triangulo);
    }
    
}
