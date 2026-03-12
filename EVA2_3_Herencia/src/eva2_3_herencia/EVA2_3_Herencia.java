/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_herencia;

/**
 *
 * @author licce
 */
public class EVA2_3_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------ANIMAL-----");
        Animal animal = new Animal();
        animal.comer();
        
        System.out.println("------MAMIFERO-----");
        Mamifero mamifero = new Mamifero();
        mamifero.comer();
        mamifero.tenerPelo();
        
        System.out.println("------PERSONA-------");
        Persona persona = new Persona("Hola mundo!!!!");
        persona.pensar();
    }
    
}
class Animal{//Principal, Padre, Superclase
public Animal(){
    System.out.println("Animal!!!");
}
public void comer(){
    System.out.println("Comer!!!!");
}
}
class Mamifero extends Animal{//Hijo, subclase, derivado
public Mamifero(){
    super();//constructor de la superclase (Animal)
    System.out.println("Mamifero!!!!!");
}
public void tenerPelo(){
    System.out.println("Tiene pelo!!!!");
}
}
class Persona extends Mamifero{
public Persona(String mensaje){
    super();//constructor default de la superclase (Mamifero)
    System.out.println(mensaje);
}
public void pensar(){
    System.out.println("Piensa!!!!");
}
}