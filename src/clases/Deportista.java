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
public class Deportista extends Persona {

    private int matriculaEst, semestre;
    private String carrera, facultad;

    public void leer() {
        System.out.println("Datos Deportista");
        Scanner scanner = new Scanner(System.in);
        super.leer();
        System.out.println("Digite matricula, semestre(1-9), carrera, facultad");
        matriculaEst = scanner.nextInt();
        semestre = scanner.nextInt();
        carrera = scanner.next();
        facultad = scanner.next();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println(matriculaEst + " " + carrera + " " + facultad + " " + semestre);
    }

    public int getMatriculaEst() {
        return matriculaEst;
    }

    public void setMatriculaEst(int matriculaEst) {
        this.matriculaEst = matriculaEst;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

}
