/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_clases_anonimas;

/**
 *
 * @author licce
 */
public class EVA2_12_Clases_Anonimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //POLIMORFISMO -----> HACE QUE ALGO SE COMPORTE COMO OTRA COSA
        Prueba prueba = new Prueba(){//CLASE ANONIMA (SIN NOMBRE)
        @Override
       public void mostrarMensaje(){
            System.out.println("Hola, Mundo cruel!!!!");
       }

        };
        prueba.mostrarMensaje();
    }
    
}
/*class MiClase implements Prueba{

    @Override
    public void mostrarMensaje() {
        
    }

}*/

interface Prueba{
void mostrarMensaje();
}