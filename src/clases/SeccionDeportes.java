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
public class SeccionDeportes {
    private String nomSeccion;
    private int nroEscuelas;
    private EscuelaDeportiva e[]=new EscuelaDeportiva[50];
    public void leer(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite el nombre y el nro de escuelas");
        nomSeccion=scanner.next();
        nroEscuelas=scanner.nextInt();
        for (int i = 0; i < nroEscuelas; i++) {
            e[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("Nombre Seccion: "+nomSeccion);
        for (int i = 0; i < nroEscuelas; i++) {
            e[i].mostrar();
        }
    }

    public String getNomSeccion() {
        return nomSeccion;
    }

    public void setNomSeccion(String nomSeccion) {
        this.nomSeccion = nomSeccion;
    }

    public int getNroEscuelas() {
        return nroEscuelas;
    }

    public void setNroEscuelas(int nroEscuelas) {
        this.nroEscuelas = nroEscuelas;
    }

    public EscuelaDeportiva[] getE() {
        return e;
    }

    public void setE(EscuelaDeportiva[] e) {
        this.e = e;
    }
    
}
