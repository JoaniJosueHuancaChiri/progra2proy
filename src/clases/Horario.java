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
    private int idHorario;
    private String dia, horaInicio, horaFin;
    public void leer(){
        System.out.println("Digite idHorario, dia, horaInicio, horaFin");
        Scanner scanner=new Scanner(System.in);
        idHorario=scanner.nextInt();
        dia=scanner.next();
        horaInicio=scanner.next();
        horaFin=scanner.next();
    }
    public void mostrar(){
        System.out.println(idHorario+" "+dia+" "+ horaInicio+" "+horaFin);
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
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
