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
public class Asistencia {

    private String fecha, presente;
    private Deportista d;

    public Asistencia(Deportista deportista) {
        this.d = deportista;
    }

    public void registrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese fecha (dd/mm/aaaa): ");
        fecha = scanner.next();

        System.out.println("Asistio? (si, no): ");
        presente = scanner.next();;
    }

    public void mostrar() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Asistencia: " + presente);
        System.out.println("Deportista: " + d.getNombre()+" "+ d.getPaterno()+" "+d.getMaterno());
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPresente() {
        return presente;
    }

    public void setPresente(String presente) {
        this.presente = presente;
    }

    public Deportista getD() {
        return d;
    }

    public void setD(Deportista d) {
        this.d = d;
    }
}
