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
