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
public class Inscripcion {

    private int idInscripcion;
    private String fecha, estado;
    private Deportista d = new Deportista();

    public void leer() {
        d.leer();
        System.out.println("Datos de la inscripcion");
        System.out.println("Digite idInscripcion, fecha, estado");
        Scanner scanner = new Scanner(System.in);
        idInscripcion = scanner.nextInt();
        scanner.nextLine();
        fecha = scanner.next();
        estado = scanner.next();
    }

    public void mostrar() {
        d.mostrar();
        System.out.println(idInscripcion + " " + fecha + " " + estado);
    }

    public Deportista getDeportista() {
        return d;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Deportista getD() {
        return d;
    }

    public void setD(Deportista d) {
        this.d = d;
    }

}
