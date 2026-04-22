/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_composicion;

/**
 *
 * @author lic
 */
public class EVA2_17_Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Vehiculo Electrico
        Electrico motElec = new Electrico("Litio", 100, 100);
        Vehiculo vehiculo = new Vehiculo("Tesla", "X", 2025, motElec);
        System.out.println("VEHICULO ELECTRICO");
        System.out.println(vehiculo);
        
        //Vehiculo Combustion    
        Combustion motCombus = new Combustion("Gasolina", 8, 400);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Mustang", 1975, motCombus);
        System.out.println("VEHICULO DE COMBUSTIBLE");
        System.out.println(vehiculo2);
    }
    
}
