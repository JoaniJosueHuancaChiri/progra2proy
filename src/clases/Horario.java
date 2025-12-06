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
public class Horario {
    private String dia, horaInicio, horaFin;
    public void leer(){
        System.out.println("Digite dia, horaInicio, horaFin");
        Scanner scanner=new Scanner(System.in);
        dia=scanner.next();
        horaInicio=scanner.next();
        horaFin=scanner.next();
    }
    public void mostrar(){
        System.out.println(dia+" "+ horaInicio+" "+horaFin);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
}
