/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author olive
 */
public class Avion extends Vehiculo{
    private String uso_3;

    public Avion(String uso_3, String tipo, String linea, String chasis, String serie, String asientos, String color, String placa, String marca, String modelo, String vin, String motor, String cilindraje) {
        super(tipo, linea, chasis, serie, asientos, color, placa, marca, modelo, vin, motor, cilindraje);
        this.uso_3 = uso_3;
    }

 

    public String getUso_3() {
        return uso_3;
    }

    public void setUso_3(String uso_3) {
        this.uso_3 = uso_3;
    }
    
    public void agregar(){
    System.out.println("Uso: "+ this.getUso_3());
    System.out.println("Tipo: "+ this.getTipo());
    System.out.println("Linea: "+ this.getLinea());
    System.out.println("Chasis: "+ this.getChasis());
    System.out.println("Serie: "+ this.getSerie());
    System.out.println("Asientos: "+ this.getAsientos());
    System.out.println("Color: "+ this.getColor());
    System.out.println("Placa: "+ this.getPlaca());
    System.out.println("Marca: "+ this.getMarca());
    System.out.println("Modelo: "+ this.getModelo());
    System.out.println("Vin: "+ this.getVin());
    System.out.println("Motor: "+ this.getMotor());
    System.out.println("Cilindraje: "+ this.getCilindraje());
    System.out.println("_____________________________________________________");
    
    }
    
    
}
