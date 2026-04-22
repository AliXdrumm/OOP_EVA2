/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_composicion;

/**
 *
 * @author licce
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int annio;
    private Motor motor;

    public Vehiculo() {
        this.marca = "";
        this.modelo = "";
        this.annio = 0;
        this.motor = null;
    }
    
    public Vehiculo(String marca, String modelo, int annio, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Marca:" + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Año: " + this.annio + "\n" +
                 "Motor: " + this.motor + "\n";
    }
    
    
}
