/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOS;

/**
 *
 * @author 
 */
public class Prestamo {
    String nombreDeBeneficiario;
    double sueldo, montoDePrestamo, interes;
    int tiempoDePrestamoEnAnios;
    Garante garante1;

    public Prestamo(String nombreDeBeneficiario, double sueldo, double montoDePrestamo, double interes, int tiempoDePrestamoEnAnios, String nombreGarante, String apellidoGarante,double sueldoGarante) {
        this.nombreDeBeneficiario = nombreDeBeneficiario;
        this.sueldo = sueldo;
        this.montoDePrestamo = montoDePrestamo;
        this.interes = interes;
        this.tiempoDePrestamoEnAnios = tiempoDePrestamoEnAnios;
        this.garante1 = new Garante(nombreGarante, apellidoGarante, sueldoGarante);
    }
    
    public void interes() {
        double interes = getMontoDePrestamo()/12;
        interes = ((interes*getInteres())/100)*12;
        System.out.println("Precio final con interes"+interes);
    }
    
    public String getNombreDeBeneficiario() {
        return nombreDeBeneficiario;
    }

    public void setNombreDeBeneficiario(String nombreDeBeneficiario) {
        this.nombreDeBeneficiario = nombreDeBeneficiario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getMontoDePrestamo() {
        return montoDePrestamo;
    }

    public void setMontoDePrestamo(double montoDePrestamo) {
        this.montoDePrestamo = montoDePrestamo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getTiempoDePrestamoEnAnios() {
        return tiempoDePrestamoEnAnios;
    }

    public void setTiempoDePrestamoEnAnios(int tiempoDePrestamoEnAnios) {
        this.tiempoDePrestamoEnAnios = tiempoDePrestamoEnAnios;
    }

    public Garante getGarante1() {
        return garante1;
    }

    public void setGarante1(Garante garante1) {
        this.garante1 = garante1;
    }
    
    
}
