/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_herencia_interfaces;

/**
 *
 * @author licce
 */
public class EVA2_11_Herencia_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Demostracion demostracion = new Demostracion();
        demostracion.mostrarMensaje();
        
    }
    
}
class Demostracion implements OtraPrueba{

    @Override
    public void saludar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola, Mundo!!!");
    }

}

interface Prueba{
public void mostrarMensaje();
}

interface OtraPrueba extends Prueba{
public void saludar(String mensaje);

}