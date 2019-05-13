/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Gato implements Animalesl{
    
    private String nombre;
    private String raza;

    public Gato(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("miau");
    }

    @Override
    public void correr() {
        
    }

  
}
