/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class EscuelaDeportiva implements Serializable{

    private String nombre, descripcion;
    private Disciplina d = new Disciplina();

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nombre, descripcion");
        nombre = scanner.nextLine();
        descripcion = scanner.nextLine();
        d.leer();
    }

    public void mostrar() {
        System.out.println(nombre + " " + descripcion);
        d.mostrar();
    }
    public void inscribirDeportistas() {
        if (d != null) {
            System.out.println("\nInscribiendo en la disciplina de " + nombre + ":");
            d.registrarDeportistas();
        } else {
            System.out.println("No hay disciplina registrada en esta escuela.");
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

    public Disciplina getD() {
        return d;
    }

    public void setD(Disciplina d) {
        this.d = d;
    }
}
