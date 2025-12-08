/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Sony Vaio
 */
import java.io.Serializable;
import java.util.Scanner;

public class SeccionDeportes implements Serializable{

    private String nomSeccion;
    private int nroEscuelas = 0;
    private EscuelaDeportiva[] e = new EscuelaDeportiva[50];

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de la Seccion de Deportes: ");
        nomSeccion = scanner.nextLine();
    }

    public void registrarEscuelas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas escuelas desea registrar ahora? (max " + (50 - nroEscuelas) + "): ");
        int nuevas = scanner.nextInt();

        if (nuevas <= 0 || nroEscuelas + nuevas > 50) {
            System.out.println("Cantidad invalida.");
            return;
        }

        for (int i = 0; i < nuevas; i++) {
            e[nroEscuelas] = new EscuelaDeportiva();
            System.out.println("\n=== REGISTRANDO ESCUELA " + (nroEscuelas + 1) + " ===");
            e[nroEscuelas].leer();
            nroEscuelas++;
        }
        System.out.println(nuevas + " escuela(s) registrada(s) correctamente.\n");
    }

    public void inscribirDeportistasEnDisciplina() {
        EscuelaDeportiva escuela = seleccionarEscuela();
        if (escuela == null) {
            return;
        }

        Disciplina disciplina = escuela.getD();  // o getDisciplina(), ambos funcionan

        if (disciplina == null) {
            System.out.println("Error: esta escuela no tiene disciplina registrada.");
            return;
        }

        System.out.println("\n=== INSCRIPCION DE DEPORTISTAS ===");
        System.out.println("Escuela     : " + escuela.getNombre());
        System.out.println("Disciplina  : " + disciplina.getNombre());
        System.out.println("Cupo actual : " + disciplina.getNroDeportistas() + "/" + disciplina.getCupoMax());
        System.out.println("─────────────────────────────────");

        disciplina.registrarDeportistas();
    }

    public void registrarAsistencia() {
        EscuelaDeportiva escuela = seleccionarEscuela();
        if (escuela == null) {
            return;
        }

        Disciplina disciplina = escuela.getD();

        if (disciplina == null) {
            System.out.println("Esta escuela no tiene disciplina registrada.");
            return;
        }

        if (disciplina.getNroDeportistas() == 0) {
            System.out.println("No hay deportistas inscritos en " + disciplina.getNombre() + ".");
            return;
        }

        System.out.println("\n=== REGISTRO DE ASISTENCIA ===");
        System.out.println("Disciplina: " + disciplina.getNombre());
        System.out.println("Fecha: " + java.time.LocalDate.now());
        System.out.println("─────────────────────────────────");

        Inscripcion[] inscritos = disciplina.getM();
        Asistencia[] lista = disciplina.getS();
        int pos = disciplina.getNroAsistencias();

        for (int i = 0; i < disciplina.getNroDeportistas(); i++) {
            Deportista dep = inscritos[i].getDeportista();
            System.out.println("\n" + (i + 1) + ". " + dep.getNombre() + " " + dep.getPaterno() + " " + dep.getMaterno());

            Asistencia a = new Asistencia(dep);
            a.registrar();  // pide fecha y si/no

            lista[pos] = a;
            pos++;
        }

        disciplina.setNroAsistencias(pos);
        System.out.println("\nAsistencias registradas para " + disciplina.getNroDeportistas() + " deportistas.\n");
    }

    private EscuelaDeportiva seleccionarEscuela() {
        if (nroEscuelas == 0) {
            System.out.println("No hay escuelas registradas.");
            return null;
        }
        mostrarEscuelas();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione escuela (1-" + nroEscuelas + "): ");
        int esc = scanner.nextInt() - 1;
        if (esc >= 0 && esc < nroEscuelas) {
            return e[esc];
        } else {
            System.out.println("Escuela no valida.");
            return null;
        }
    }

    private void mostrarEscuelas() {
        System.out.println("\nEscuelas registradas:");
        for (int i = 0; i < nroEscuelas; i++) {
            System.out.println((i + 1) + ". " + e[i].getNombre());
        }
    }

    public void mostrar() {
        if (nomSeccion == null) {
            System.out.println("No hay registros de la seccion");
            return;
        }
        System.out.println("SECCION DE DEPORTES: " + nomSeccion.toUpperCase());
        System.out.println("Total de escuelas: " + nroEscuelas);

        for (int i = 0; i < nroEscuelas; i++) {
            System.out.println("\n>>> ESCUELA " + (i + 1) + " <<<");
            e[i].mostrar();
        }
    }

    // Getters y setters
    public String getNomSeccion() {
        return nomSeccion;
    }

    public void setNomSeccion(String nomSeccion) {
        this.nomSeccion = nomSeccion;
    }

    public int getNroEscuelas() {
        return nroEscuelas;
    }

    public void setNroEscuelas(int nroEscuelas) {
        this.nroEscuelas = nroEscuelas;
    }

    public EscuelaDeportiva[] getE() {
        return e;
    }

    public void setE(EscuelaDeportiva[] e) {
        this.e = e;
    }

}
