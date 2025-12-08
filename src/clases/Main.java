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

// Main.javaexactamente como tu ejemplo
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArchiSeccion archi = new ArchiSeccion("datosMedicos.dat");
        boolean sw = true;

        while (sw) {
            System.out.println("\n===== SISTEMA DE GESTION DEPORTIVA =====");
            System.out.println("1. Crear archivo");
            System.out.println("2. Registrar Seccion de Deportes");
            System.out.println("3. Registrar Escuela Deportiva");
            System.out.println("4. Inscribir Deportista");
            System.out.println("5. Registrar Asistencia");
            System.out.println("6. Mostrar toda la informacion");
            System.out.println("7. Mostrar todas las asistencias");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            String op = sc.nextLine();

            switch (op) {
                case "1":
                    archi.crear();
                    break;
                case "2":
                    archi.registrarSeccion();
                    break;
                case "3":
                    archi.adicionarEscuela();
                    break;
                case "4":
                    archi.inscribirDeportista();
                    break;
                case "5":
                    archi.registrarAsistencia();
                    break;
                case "6":
                    archi.mostrarTodo();
                    break;
                case "7":
                    archi.mostrarAsistencias();
                    break;
                
                default:
                    sw=false;
            }
        }
        sc.close();
    }
}
