/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author licce
 */
public class EVA2_15_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado("Juan", "Perez", 19, "Ingeniero", 20000);
        System.out.println("------DATOS DEL EMPLEADO----------");
        imprimir(empleado);
        Cliente cliente = new Cliente("Jose", "Allende", 50, "ABCDEF1234", 20000, "Restaurante La Cucaracha");
        System.out.println("------DATOS DEL CLIENTE-------");
        imprimir(cliente);
        Persona persona = new Persona("Pedro", "Paramo", 50);
        System.out.println("--------DATOS DE LA PERSONA---------");
        System.out.println(persona.datosPersona());
        
        Persona perso = empleado;//SE DISFRAZA DE PERSONA
        System.out.println("--------EMPLEADO DISFRAZADO DE PERSONA-----------");
        System.out.println(perso.datosPersona());
        
        //int x = "Hola";
        Persona perso2 = cliente;
        System.out.println("---------CLIENTE DISFRAZADA DE PERSONA-------------");
        imprimir(perso2);
        
         //Cliente clienteX = persona; //NO SE PUEDE
        //CASTING
        Cliente cl = (Cliente)perso2;//aqui, en perso2 se almacena un objeto Cliente, se puede hacer CASTING
    }   //Cliente cl2 = (Cliente)perso;//aqui, en perso2 se almacena un objeto Empleado, NO se puede hacer CASTING
    public static void imprimir(Persona perso){
        System.out.println(perso.datosPersona());
        if(perso instanceof Empleado){
            System.out.println("Empleado");
        }
        if(perso instanceof Cliente){
            System.out.println("Cliente");
        }
        if(perso instanceof Persona){
            System.out.println("Persona");
        }
    }
}
