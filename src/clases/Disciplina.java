/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class Disciplina {

    private String nombre, categoria;
    private int cupoMax = 0, nroDeportistas;
    private Entrenador e = new Entrenador();
    private Horario h = new Horario();
    private Inscripcion m[] = new Inscripcion[cupoMax];

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nombre, categoria, cupoMaximo, nro de Deportistas");
        nombre = scanner.next();
        categoria = scanner.next();
        cupoMax = scanner.nextInt();
        m = new Inscripcion[cupoMax];
        nroDeportistas = scanner.nextInt();
        e.leer();
        h.leer();
        for (int i = 0; i < nroDeportistas; i++) {
            m[i] = new Inscripcion();
            m[i].leer();
        }
    }

    public void mostrar() {
        System.out.println(nombre + " " + categoria + " " + cupoMax + " " + nroDeportistas);
        e.mostrar();
        h.mostrar();
        for (int i = 0; i < nroDeportistas; i++) {
            m[i].mostrar();
        }
    }

    public void registrarDeportistas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos deportistas quiere inscribir? (máx " + cupoMax + ")");
        int nuevos = scanner.nextInt();

        if (nroDeportistas + nuevos > cupoMax) {
            System.out.println("Excede el cupo máximo.");
            return;
        }

        // Agregar nuevos deportistas al arreglo existente
        for (int i = 0; i < nuevos; i++) {
            m[nroDeportistas] = new Inscripcion();
            System.out.println("\n--- INSCRIPCION " + (nroDeportistas + 1) + " ---");
            m[nroDeportistas].leer();
            nroDeportistas++;
        }
    }

    public Deportista getDeportista(int i) {
        if (i >= 0 && i < nroDeportistas) {
            return m[i].getDeportista();
        } else {
            return null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }

    public int getNroDeportistas() {
        return nroDeportistas;
    }

    public void setNroDeportistas(int nroDeportistas) {
        this.nroDeportistas = nroDeportistas;
    }

    public Entrenador getE() {
        return e;
    }

    public void setE(Entrenador e) {
        this.e = e;
    }

    public Horario getH() {
        return h;
    }

    public void setH(Horario h) {
        this.h = h;
    }

    public Inscripcion[] getM() {
        return m;
    }

    public void setM(Inscripcion[] m) {
        this.m = m;
    }

}
