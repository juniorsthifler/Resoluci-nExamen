/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRES;

/**
 *
 * @author
 */
public class Camiones extends vehiculo{
    double toneladas;

    public Camiones(double toneladas, String matricula, String color, String marca, int dias) {
        super(matricula, color, marca, dias);
        this.toneladas = toneladas;
    }
    
    @Override
    public void alquiler() {
        double categoria=getToneladas()*20;
        double precio = getPrecioBase()*getDias();
        precio+=categoria;
        System.out.println("El precio del alquiler es de: "+precio);
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }
    
    
    
}
