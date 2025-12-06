/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class EscuelaDeportiva {

    private String nombre, descripcion;
    private int nroDisciplinas;
    private Disciplina d[] = new Disciplina[50];
    private ArrayList<Asistencia> asistencias = new ArrayList<>();

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nombre, descripcion, nro de Disciplinas");
        nombre = scanner.next();
        descripcion = scanner.next();
        nroDisciplinas = scanner.nextInt();
        for (int i = 0; i < nroDisciplinas; i++) {
            d[i] = new Disciplina();
            d[i].leer();
        }
    }

    public void mostrar() {
        System.out.println(nombre + " " + descripcion + " " + nroDisciplinas);
        for (int i = 0; i < nroDisciplinas; i++) {
            d[i].mostrar();
        }
    }

    public void registrarDisciplinas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el nro de Disciplinas");
        nroDisciplinas = scanner.nextInt();

        d = new Disciplina[nroDisciplinas];

        for (int i = 0; i < nroDisciplinas; i++) {
            d[i] = new Disciplina();
            System.out.println("\n--- DISCIPLINA " + (i + 1) + " ---");
            d[i].leer();
        }
    }

    public void registrarDeportistasEnDisciplina() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione nº de disciplina (1-" + nroDisciplinas + "):");
        int op = scanner.nextInt() - 1;

        if (op < 0 || op >= nroDisciplinas) {
            System.out.println("Disciplina no valida.");
            return;
        }

        d[op].registrarDeportistas();
    }

    public void registrarAsistencia() {

        Scanner sc = new Scanner(System.in);

        if (nroDisciplinas == 0) {
            System.out.println("No hay disciplinas registradas.");
            return;
        }

        System.out.println("Seleccione la disciplina:");
        for (int i = 0; i < nroDisciplinas; i++) {
            System.out.println((i + 1) + "). " + d[i].getNombre());
        }
        int opDisc = sc.nextInt() - 1;

        Disciplina disc = d[opDisc];

        if (disc.getNroDeportistas() == 0) {
            System.out.println("No hay deportistas inscritos en esta disciplina.");
            return;
        }

        System.out.println("Seleccione al deportista:");
        for (int i = 0; i < disc.getNroDeportistas(); i++) {
            System.out.println((i + 1) + "). " + disc.getDeportista(i).getNombre());
        }
        int opDep = sc.nextInt() - 1;

        Deportista dep = disc.getDeportista(opDep);

        Asistencia a = new Asistencia(dep, disc);
        a.registrar();

        asistencias.add(a);

        System.out.println("Asistencia registrada correctamente.");
    }

    public void mostrarAsistencias() {
        if (asistencias.isEmpty()) {
            System.out.println("No hay asistencias registradas.");
            return;
        }

        System.out.println("===== LISTA DE ASISTENCIAS =====");

        for (Asistencia a : asistencias) {
            a.mostrar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNroDisciplinas() {
        return nroDisciplinas;
    }

    public void setNroDisciplinas(int nroDisciplinas) {
        this.nroDisciplinas = nroDisciplinas;
    }

    public Disciplina[] getD() {
        return d;
    }

    public void setD(Disciplina[] d) {
        this.d = d;
    }

}
