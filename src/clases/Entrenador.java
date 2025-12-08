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
public class Entrenador extends Persona implements Serializable{
    private String especialidad;
    private int aniosExp;
    public void leer(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Datos del Entrenador");
        super.leer();
        System.out.println("Digite especialidad, aniosExp");
        especialidad=scanner.next();
        aniosExp=scanner.nextInt();
    }
    public void mostrar(){
        super.mostrar();
        System.out.println(especialidad+" "+aniosExp);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }
    
}
