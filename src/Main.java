/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Animalesl animal = new Perro("XX", "Border");
        
        animal.hacerSonido();
        animal.correr();
        
        Gato gato = new Gato("YY", "raza");
        
        gato.hacerSonido();
        gato.correr();
    }
}
