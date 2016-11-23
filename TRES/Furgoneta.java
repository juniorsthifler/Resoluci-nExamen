/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRES;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Furgoneta extends vehiculo{

    public Furgoneta(String matricula, String color, String marca, int dias) {
        super(matricula, color, marca, dias);
    }
    
    @Override
    public void alquiler() {
        double categoria=100;
        double precio = getPrecioBase()*getDias();
        precio+=categoria;
        System.out.println("El precio del alquiler es de: "+precio);
    }
    
}
