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
public class Persona implements Serializable{  
    private String nombre, paterno, materno,fechaNacimiento;
    private int  ci, telefono;
    public void leer(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite nombre, paterno, materno, ci, celular, fechaNacimiento");
        nombre=scanner.next();
        paterno=scanner.next();
        materno=scanner.next();
        ci=scanner.nextInt();
        telefono=scanner.nextInt();
        fechaNacimiento=scanner.next();
    }
    public void mostrar(){
        System.out.println(nombre+ " "+ paterno+" "+materno);
        System.out.println("ci: "+ci);
        System.out.println("cel: "+telefono);
        System.out.println("Fecha nac: "+fechaNacimiento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
