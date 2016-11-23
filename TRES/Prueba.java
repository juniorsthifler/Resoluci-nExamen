/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRES;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<vehiculo> vehiculos = new ArrayList();
        vehiculo v1 = new Camiones(4, "LPO-344", "Azul", "Toyota", 2);
        vehiculo v2 = new Camiones(2, "OJT", "Negro", "Hinno", 1);
        vehiculo v3 = new Coches(5, "LUI", "rojo", "toyota", 5);
        vehiculo v4 = new Coches(5, "POE-123", "Verde", "Nissan", 4);
        vehiculo v5 = new Furgoneta("PEQ-876", "rojo", "hinno", 3);
        vehiculo v6 = new Furgoneta("HIJ", "Negro", "Chevrolet", 1);
        vehiculo v7 = new Microbuses(1, "PUB-432", "Azul", "Mercedes", 1);
        vehiculo v8 = new Microbuses(3, "ZOE", "Blanco", "OvniBus", 3);
        vehiculo v9;
        System.out.println("Menu");
        System.out.println("1) Añadir vehiculo\n"
                + "2) Precio de Alquiler\n");
        int opc = s.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Que tipo de vehiculo es:"
                        + "1)Coche"
                        + "2)Microbus"
                        + "3)Furgoneta de Carga"
                        + "4)Camion");
                opc = s.nextInt();
                System.out.println("Ingrese la matricula");
                String matricula = s.nextLine();
                System.out.println("Ingrese el color");
                String color = s.nextLine();
                System.out.println("Ingrese marca");
                String marca = s.nextLine();
                System.out.println("Ingrese dias");
                int dias = s.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Numero de pasajeros");
                        int numero=s.nextInt();
                        v9 = new Coches(numero, matricula, color, marca, dias);
                        System.out.println("Vehiculo añadido");
                        break;
                    case 2:
                        System.out.println("Numero de rutas diarias");
                        int numeroRutasDiarias = s.nextInt();
                        v9 = new Microbuses(numeroRutasDiarias, matricula, color, marca, dias);
                        System.out.println("Vehiculo añadido");
                        break;
                    case 3:
                        v9 = new Furgoneta(matricula, color, marca, dias);
                        System.out.println("Vehiculo añadido");
                        break;
                    case 4:
                        System.out.println("Numero de Toneladas");
                        int toneladas = s.nextInt();
                        v9 = new Camiones(toneladas, matricula, color, marca, dias);
                        System.out.println("Vehiculo añadido");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                break;
            case 2:
                System.out.println("Que tipo de vehiculo desea alquilar:\n"
                        + "1)Coche\n"
                        + "2)Microbus\n"
                        + "3)Furgoneta de Carga\n"
                        + "4)Camion\n");
                opc = s.nextInt();
                System.out.println("Cuantos dias desea alquilar");
                dias=s.nextInt();
                switch (opc) {
                    case 1:
                        v1.setDias(dias);
                        v1.alquiler();
                        break;
                    case 2:
                        v3.setDias(dias);
                        v3.alquiler();
                        break;
                    case 3:
                        v5.setDias(dias);
                        v5.alquiler();
                        break;
                    case 4:
                        v7.setDias(dias);
                        v7.alquiler();
                        break;
                    default:
                        break;
                }
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }

    }

}
