/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Sony Vaio
 */
// ArchiSeccion.java
import clases.EscuelaDeportiva;
import clases.SeccionDeportes;
import java.io.*;
import java.util.Scanner;

public class ArchiSeccion {

    private String nombre;

    public ArchiSeccion(String n) {
        nombre=n;
    }

    // 1. CREAR ARCHIVO (exactamente como tu ejemplo
    public void crear() {
        Scanner sc = new Scanner(System.in);
        File archivoFisico = new File(nombre);
        try {
            if (!archivoFisico.exists()) {
                ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(nombre));
                archi.close();
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe..!! ");
                System.out.println("Desea borrar sus datos??? s / n ");
                String resp = sc.next();
                if (resp.equalsIgnoreCase("s")) {
                    ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(nombre));
                    archi.close();
                    System.out.println("Datos borrados y archivo reiniciado.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al crear: " + e.getMessage());
        }
    }

    // 2. REGISTRAR SECCIÓN
    public void registrarSeccion() {
        SeccionDeportes seccion = cargar();
        if (seccion.getNomSeccion() != null) {
            System.out.println("Ya existe la seccion: " + seccion.getNomSeccion());
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de la Seccion de Deportes: ");
        seccion.setNomSeccion(sc.nextLine());
        guardar(seccion);
        System.out.println("Seccion registrada correctamente!\n");
    }

    // 3. ADICIONAR ESCUELA
    public void adicionarEscuela() {
        SeccionDeportes seccion = cargar();
        if (seccion.getNomSeccion() == null) {
            System.out.println("Primero registre la Seccion de Deportes.");
            return;
        }
        EscuelaDeportiva nueva = new EscuelaDeportiva();
        nueva.leer();
        seccion.getE()[seccion.getNroEscuelas()] = nueva;
        seccion.setNroEscuelas(seccion.getNroEscuelas() + 1);
        guardar(seccion);
        System.out.println("Escuela agregada correctamente!\n");
    }

    // 4. INSCRIBIR DEPORTISTA
    public void inscribirDeportista() {
        SeccionDeportes seccion = cargar();
        if (seccion.getNroEscuelas() == 0) {
            System.out.println("No hay escuelas registradas.");
            return;
        }
        seccion.inscribirDeportistasEnDisciplina();
        guardar(seccion);
    }

    // 5. REGISTRAR ASISTENCIA
    public void registrarAsistencia() {
        SeccionDeportes seccion = cargar();
        if (seccion.getNroEscuelas() == 0) {
            System.out.println("No hay escuelas registradas.");
            return;
        }
        seccion.registrarAsistencia();
        guardar(seccion);
    }

    // 6. MOSTRAR TODO
    public void mostrarTodo() {
        SeccionDeportes seccion = cargar();
        if (seccion.getNomSeccion() == null) {
            System.out.println("No hay datos registrados.");
            return;
        }
        seccion.mostrar();
    }

// GUARDAR
    private void guardar(SeccionDeportes seccion) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombre))) {
            oos.writeObject(seccion);
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    // CARGAR
    private SeccionDeportes cargar() {
        File f = new File(nombre);
        if (!f.exists()) {
            return new SeccionDeportes();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombre))) {
            return (SeccionDeportes) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error al cargar, iniciando nuevo.");
            return new SeccionDeportes();
        }
    }
    public void mostrarAsistencias() {
        SeccionDeportes seccion = cargar();
        if (seccion.getNroEscuelas() == 0) {
            System.out.println("No hay escuelas registradas.");
            return;
        }

        System.out.println("\n===== REPORTE DE ASISTENCIAS =====");
        for (int i = 0; i < seccion.getNroEscuelas(); i++) {
            EscuelaDeportiva esc = seccion.getE()[i];
            Disciplina d = esc.getD();
            System.out.println("\nEscuela: " + esc.getNombre());
            System.out.println("Disciplina: " + d.getNombre());

            Asistencia[] lista = d.getS();
            int total = d.getNroAsistencias();

            if (total == 0) {
                System.out.println("   No hay asistencias registradas aun.");
            } else {
                for (int j = 0; j < total; j++) {
                    System.out.println("   - " + lista[j].getFecha() + " -> " 
                        + lista[j].getD().getNombre() + " " 
                        + lista[j].getD().getPaterno() + " -> " 
                        + (lista[j].getPresente().equalsIgnoreCase("si") ? "PRESENTE" : "AUSENTE"));
                }
            }
        }
        System.out.println("=====================================\n");
    }
}
