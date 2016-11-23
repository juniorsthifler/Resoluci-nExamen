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
public class Coches extends vehiculo{
    int numeroPasajeros;

    public Coches(int numeroPasajeros, String matricula, String color, String marca, int dias) {
        super(matricula, color, marca, dias);
        this.numeroPasajeros = numeroPasajeros;
    }
    

    @Override
    public void alquiler() {
        double categoria= getNumeroPasajeros()*5;
        double precio = getPrecioBase()*getDias();
        precio+=categoria;
        System.out.println("El precio del alquiler es de: "+precio);
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
    
}
