/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class ArchiEscuela {
    private String nombre;
    
    
       public ArchiEscuela(String n) {
        nombre = n;
    }
    
    
    public void crear() throws ClassNotFoundException,
            IOException {
        Scanner sc = new Scanner(System.in);
        File archivoFisico = new File(nombre);
        try {
            if (!archivoFisico.exists()) {
                ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(nombre));
                archi.close();
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe..!! ");
                System.out.println("Desea borrar sus datos??? s / n ");
                String resp = sc.next();
                if (resp.equals("s")) {
                    ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(nombre));
                    archi.close();
                }
            }
        } catch (IOException e) {
            System.out.println("Error al crear...."+e.getMessage());
        }
    }
    
    
    public void adicionarDeportista(Deportista deportista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(nombre, true))) {
            oos.writeObject(deportista);
            System.out.println("Deportista guardado en archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar deportista: " + e.getMessage());
        }
    }
    
   
    public void adicionarEntrenador(Entrenador entrenador) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("entrenadores.dat", true))) {
            oos.writeObject(entrenador);
            System.out.println("Entrenador guardado en archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar entrenador: " + e.getMessage());
        }
    }
    
    
    public void listarDeportistas() {
        List<Deportista> deportistas = new ArrayList<>();
        
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(nombre))) {
            
            System.out.println("\n=== LISTA DE DEPORTISTAS DEL ARCHIVO ===");
            
            while (true) {
                try {
                    Deportista d = (Deportista) ois.readObject();
                    deportistas.add(d);
                    d.mostrar();
                } catch (EOFException e) {
                    break; 
                }
            }
            
            System.out.println("\nTotal de deportistas: " + deportistas.size());
            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + nombre);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }
}
