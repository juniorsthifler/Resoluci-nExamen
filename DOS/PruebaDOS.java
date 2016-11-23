/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOS;

import java.util.Scanner;

/**
 *
 * @author
 */
public class PruebaDOS {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PrestamosAutomovil[] automoviles = new PrestamosAutomovil[2];
        PrestamoEducativo[] educativo = new PrestamoEducativo[3];
        for (int i = 0; i < automoviles.length - 1; i++) {
            System.out.println("Ingrese el tipo de vehiculo");
            String tipoVehiculo = s.nextLine();
            System.out.println("Ingrese la marca del vehiculo");
            String marcaVehiculo = s.nextLine();
            System.out.println("Nombre Garante");
            String nombreGarante = s.nextLine();
            System.out.println("Apellido Garante");
            String apellidoGarante = s.nextLine();
            System.out.println("Sueldo Garante");
            double sueldoGarante = s.nextDouble();
            System.out.println("Nombre del Beneficiario");
            String nombreBeneficiario = s.nextLine();
            System.out.println("Sueldo");
            double sueldo = s.nextDouble();
            System.out.println("Prestamo");
            double prestamo = s.nextDouble();
            System.out.println("Interes");
            double interes = s.nextDouble();
            System.out.println("Tiempo de prestamo en años");
            int años = s.nextInt();
            System.out.println("Nombre Garante");
            String nombreGarante1 = s.nextLine();
            System.out.println("Apellido Garante");
            String apellidoGarante2 = s.nextLine();
            System.out.println("Salario Garante");
            double salarioGarante2 = s.nextDouble();
            automoviles[i] = new PrestamosAutomovil(tipoVehiculo, marcaVehiculo, nombreBeneficiario, sueldo, prestamo, interes, años, nombreGarante, apellidoGarante, sueldoGarante, nombreGarante1, apellidoGarante2, salarioGarante2);
            System.out.println("Datos insertados correctamente");
            System.out.println(automoviles[i].toString());
        }
        for (int i = 0; i < educativo.length - 1; i++) {
            System.out.println("Ingrese el tipo de vehiculo");
            String nivelEstudio = s.nextLine();
            System.out.println("Ingrese la marca del vehiculo");
            String nombreCentroEducativo = s.nextLine();
            System.out.println("Nombre Garante");
            String nombreGarante = s.nextLine();
            System.out.println("Apellido Garante");
            String apellidoGarante = s.nextLine();
            System.out.println("Sueldo Garante");
            double sueldoGarante = s.nextDouble();
            System.out.println("Nombre del Beneficiario");
            String nombreBeneficiario = s.nextLine();
            System.out.println("Sueldo");
            double sueldo = s.nextDouble();
            System.out.println("Prestamo");
            double prestamo = s.nextDouble();
            System.out.println("Interes");
            double interes = s.nextDouble();
            System.out.println("Tiempo de prestamo en años");
            int años = s.nextInt();
            System.out.println("Nombre Garante");
            String nombreGarante1 = s.nextLine();
            System.out.println("Apellido Garante");
            String apellidoGarante2 = s.nextLine();
            System.out.println("Salario Garante");
            double salarioGarante2 = s.nextDouble();
            System.out.println("Nombre Garante");
            String nombreGarante3 = s.nextLine();
            System.out.println("Apellido Garante");
            String apellidoGarante3 = s.nextLine();
            System.out.println("Sueldo Garante");
            double sueldoGarante3 = s.nextDouble();
            educativo[i] = new PrestamoEducativo(nivelEstudio, nombreCentroEducativo, nombreBeneficiario, sueldo, prestamo, interes, años, nombreGarante, apellidoGarante, sueldoGarante, nombreGarante1, apellidoGarante2, salarioGarante2, nombreGarante3, apellidoGarante3, sueldoGarante3);
            System.out.println("Datos insertados correctamente");
            System.out.println(educativo[i].toString());
        }

    }
}
