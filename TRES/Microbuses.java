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
public class Microbuses extends vehiculo{
    int numeroRutasDiarias;

    public Microbuses(int numeroRutasDiarias, String matricula, String color, String marca, int dias) {
        super(matricula, color, marca, dias);
        this.numeroRutasDiarias = numeroRutasDiarias;
    }
    
    @Override
    public void alquiler() {
        double categoria=getNumeroRutasDiarias()*10;
        double precio = getPrecioBase()*getDias();
        precio+=categoria;
        System.out.println("El precio del alquiler es de: "+precio);
    }

    public int getNumeroRutasDiarias() {
        return numeroRutasDiarias;
    }

    public void setNumeroRutasDiarias(int numeroRutasDiarias) {
        this.numeroRutasDiarias = numeroRutasDiarias;
    }
    
    
    
}
