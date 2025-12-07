/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Sony Vaio
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeccionDeportes seccion = new SeccionDeportes();
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE GESTION DEPORTIVA =====");
            System.out.println("1. Registrar Seccion de Deportes");
            System.out.println("2. Registrar Escuelas Deportivas");
            System.out.println("3. Inscribir Deportistas en una Disciplina");
            System.out.println("4. Registrar Asistencia");
            System.out.println("5. Mostrar toda la informacion");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- REGISTRO DE SECCION DE DEPORTES ---");
                    seccion.leer();
                    break;

                case 2:
                    if (seccion.getNomSeccion() == null) {
                        System.out.println("Primero registre la Seccion de Deportes.");
                    } else {
                        System.out.println("\n--- REGISTRO DE ESCUELAS DEPORTIVAS ---");
                        seccion.registrarEscuelas();
                    }
                    break;

                case 3:
                    if (seccion.getNroEscuelas() == 0) {
                        System.out.println("No hay escuelas registradas.");
                    } else {
                        seccion.inscribirDeportistasEnDisciplina();
                    }
                    break;

                case 4:
                    if (seccion.getNroEscuelas() == 0) {
                        System.out.println("No hay datos para registrar asistencia.");
                    } else {
                        seccion.registrarAsistencia();
                    }
                    break;

                case 5:
                    System.out.println("\n=== MOSTRANDO TODA LA INFORMACION ===");
                    seccion.mostrar();
                    break;

                default:
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}
