/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author licce
 */
public class EVA2_5_Ejemplo_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Persona persona = new Persona("Alan", "Rodriguez", "Jimenez", "2230EE", 19, 'H');
    persona.imprimirDatos();
    
    Empleado empleado = new Empleado("22", 20000, "Administador", "Alan", "Rodriguez", "Jimenez", "2230EE", 19, 'H');
    empleado.imprimirDatos();
    
    EmpleadoBase empleadobase = new EmpleadoBase(2030, "22", 200000, "Administrador", "Alan", "Rodriguez", "Jimenez", "2230EE", 19, 'H');
    empleadobase.imprimirDatos();
    
    EmpleadoHonorarios empleadohonorarios = new EmpleadoHonorarios(8, 2030, "22", 200000, "Administrador", "Alan", "Rodriguez", "Jimenez", "2230EE", 19, 'H');
    empleadohonorarios.imprimirDatos();
    }
    
}
