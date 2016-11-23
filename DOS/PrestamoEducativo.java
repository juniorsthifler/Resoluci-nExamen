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
public class PrestamoEducativo extends Prestamo {

    String nivelEstudio, nombreCentroEducativo;
    Garante garante2;
    Garante garante3;

    public PrestamoEducativo(String nivelEstudio, String nombreCentroEducativo, String nombreDeBeneficiario, double sueldo, double montoDePrestamo, double interes, int tiempoDePrestamoEnAnios, String nombreGarante, String apellidoGarante, double sueldoGarante, String nombreGarante2, String apellidoGarante2, double sueldo2, String nombreGarante3, String apellidoGarante3, double sueldo3) {
        super(nombreDeBeneficiario, sueldo, montoDePrestamo, interes, tiempoDePrestamoEnAnios, nombreGarante, apellidoGarante, sueldoGarante);
        this.nivelEstudio = nivelEstudio;
        this.nombreCentroEducativo = nombreCentroEducativo;
        this.garante2 = new Garante(nombreGarante2, apellidoGarante2, sueldo2);
        this.garante3 = new Garante(nombreGarante3, apellidoGarante3, sueldo3);
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
                + "Datos del Garante 3\n"
                + "Nombre:   " + getGarante3().getNombre() + "\n"
                + "Apellido  " + getGarante3().getApellido() + "\n"
                + "Sueldo    " + getGarante3().getSueldo() + "\n"
                + "\n"
                + "Datos\n"
                + "Nivel de estudio:    " + getNivelEstudio() + "\n"
                + "Nombre del centro educativo: "+getNombreCentroEducativo();
        return texto;  //To change body of generated methods, choose Tools | Templates.
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String getNombreCentroEducativo() {
        return nombreCentroEducativo;
    }

    public void setNombreCentroEducativo(String nombreCentroEducativo) {
        this.nombreCentroEducativo = nombreCentroEducativo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }

    public Garante getGarante3() {
        return garante3;
    }

    public void setGarante3(Garante garante3) {
        this.garante3 = garante3;
    }

}
