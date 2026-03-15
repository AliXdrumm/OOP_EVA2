/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4ejemplo_herencia;

/**
 *
 * @author licce
 */
public class EVA2_4ejemplo_herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Alan", "Rodriguez", "Jimenez", "233EE5", 19, 'H');
        System.out.println("------DATOS DE LA PERSONA-------");
        persona.imprimirDatos();
        
        Empleado empleado = new Empleado("Alan", "Rodriguez", "Jimenez", "233EE5", 19, 'H', "2033", "Encargado de caja", 20000.56);
        System.out.println("------DATOS DEL EMPLEADO-----");
        empleado.imprimirDatos();
        
    }
    
}
