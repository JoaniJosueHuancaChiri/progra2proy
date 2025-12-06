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
        EscuelaDeportiva escuela = new EscuelaDeportiva();

        int opcion;

        do {
            System.out.println("\n===== MENU ESCUELA DEPORTIVA =====");
            System.out.println("1. Registrar Escuela Deportiva");
            System.out.println("2. Registrar Disciplinas");
            System.out.println("3. Registrar Deportistas en una Disciplina");
            System.out.println("4. Registrar Asistencia");
            System.out.println("5. Mostrar toda la informacion");
            System.out.println("6. Mostrar asistencias");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- REGISTRO DE ESCUELA DEPORTIVA ---");
                    escuela.leer();
                    break;

                case 2:
                    if (escuela == null) {
                        System.out.println("Primero debe registrar la escuela.");
                    } else {
                        System.out.println("\n--- REGISTRO DE DISCIPLINAS ---");
                        escuela.registrarDisciplinas();
                    }
                    break;

                case 3:
                    if (escuela == null) {
                        System.out.println("Primero debe registrar la escuela.");
                    } else {
                        System.out.println("\n--- REGISTRO DE DEPORTISTAS EN DISCIPLINA ---");
                        escuela.registrarDeportistasEnDisciplina();
                    }
                    break;

                case 4:
                    if (escuela == null) {
                        System.out.println("Primero debe registrar la escuela.");
                    } else {
                        System.out.println("\n--- REGISTRO DE ASISTENCIA ---");
                        escuela.registrarAsistencia();
                    }
                    break;

                case 5:
                    System.out.println("\n--- MOSTRAR INFORMACIÓN COMPLETA ---");
                    escuela.mostrar();
                    break;

                case 6:
                    if (escuela == null) {
                        System.out.println("Primero debe registrar la escuela.");
                    } else {
                        System.out.println("\n--- MOSTRAR ASISTENCIAS ---");
                        escuela.mostrarAsistencias();
                    }
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);
    }
}

