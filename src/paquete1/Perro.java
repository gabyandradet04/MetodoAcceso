/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Español
 */
public class Perro extends Animales{
    
    private String raza = "caniche";
    public static void main(String[] args) {
        Perro perro3 = new Perro();
        
        System.out.println(perro3.getnombre());
        
        
        System.out.println(perro3.getojos());
        
    }
    
}
