/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_composicion;

/**
 *
 * @author licce
 */
public class EVA2_16_Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion direccion = new Direccion("Los Pinos", 2411, "Aires del sur", "31456");
        
        Persona persona = new Persona("Alan", "Rdriguez", 19, direccion);
        
        Persona persona2 = new Persona("Perdo", "Paramo", 80, "4ta", 25, "Centro", "25346");
        System.out.println(persona2);
        
        //Cambiar la direccion
        persona2.getDireccion().setCalle("Tecnologico");
        persona2.getDireccion().setNumero(50);
        persona2.getDireccion().setColonia("Santo niño");
        persona2.getDireccion().setCp("330000");
        System.out.println(persona2);
    }
    
}
