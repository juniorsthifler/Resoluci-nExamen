/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNO;

import java.util.Scanner;

/**
 *
 * @author
 */
public class PruebaUno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean aux = false;
        Alumno a;
        do {
            System.out.println("Ingrese los datos del estudiante");
            System.out.println("Nombre:");
            String nombre = s.nextLine();
            System.out.println("Apellido");
            String apellido = s.nextLine();

            System.out.println("Ingrese los datos del docente de Programacion");
            System.out.println("Nombre:");
            String nombreP = s.nextLine();
            System.out.println("Apellido");
            String apellidoP = s.nextLine();
            System.out.println("titulo");
            String tituloP = s.nextLine();

            System.out.println("Ingrese los datos del docente de Base de datos");
            System.out.println("Nombre:");
            String nombreB = s.nextLine();
            System.out.println("Apellido");
            String apellidoB = s.nextLine();
            System.out.println("titulo");
            String tituloB = s.nextLine();
            a = new Alumno(nombre, apellido, nombreP, apellidoP, tituloP, nombreB, apellidoB, tituloB);
            System.out.println("Desea ingresar otro estudiante"
                    + "S/N");
            String opc = s.nextLine();
            if ("S".equals(opc)) {
                aux = true;
            } else {
                aux = false;
            }
            System.out.println(a.toString());
        } while (aux == true);
    }
}
