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
public class PrestamosAutomovil extends Prestamo {

    String tipoVehiculo, marcaVehiculo;
    Garante garante2;

    public PrestamosAutomovil(String tipoVehiculo, String marcaVehiculo, String nombreDeBeneficiario, double sueldo, double montoDePrestamo, double interes, int tiempoDePrestamoEnAnios, String nombreGarante, String apellidoGarante, double sueldoGarante, String nombreGarante2, String apellidoGarante2, double sueldo2) {
        super(nombreDeBeneficiario, sueldo, montoDePrestamo, interes, tiempoDePrestamoEnAnios, nombreGarante, apellidoGarante, sueldoGarante);
        this.tipoVehiculo = tipoVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.garante2 = new Garante(nombreGarante2, apellidoGarante2, sueldo2);
    }

    @Override
    public String toString() {
        String texto = "Nombre Beneficiario: " + getNombreDeBeneficiario() + "\n"
                + "Suelo Beneficiario:   " + getSueldo() + "\n"
                + "Monto de prestamo:    " + getMontoDePrestamo() + "\n"
                + "interes:  " + getInteres() + "\n"
                + "Tiempo de prestamo:   " + getTiempoDePrestamoEnAnios() + "\n"
                + "Datos del Garante 1\n"
                + "Nombre:   " + getGarante1().getNombre() + "\n"
                + "Apellido  " + getGarante1().getApellido() + "\n"
                + "Sueldo    " + getGarante1().getSueldo() + "\n"
                + "\n"
                + "Datos del Garante 2\n"
                + "Nombre:   " + getGarante2().getNombre() + "\n"
                + "Apellido  " + getGarante2().getApellido() + "\n"
                + "Sueldo    " + getGarante2().getSueldo() + "\n"
                + "\n"
                + "Datos del Vehiculo\n"
                + "Tipo: " + getTipoVehiculo() + "\n"
                + "Marca_    " + getMarcaVehiculo() + "\n"
                + "";
        return texto; //To change body of generated methods, choose Tools | Templates.
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }

}
