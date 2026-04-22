/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_composicion;

/**
 *
 * @author licce
 */
public class Direccion {
     private String calle;
      private int numero;
       private String colonia;
        private String cp;

        public Direccion(){
         this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.cp = "";
        }
    public Direccion(String calle, int numero, String colonia, String cp) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
        
    @Override
    public String toString(){
    return "DIRECCION" + "\n" +
            "Calle: " + this.calle + "\n" +
            "Numero: " + this.numero + "\n" +
            "Colonia: " + this.colonia + "\n" +
            "CP: " + this.cp + "\n";
    }
}
