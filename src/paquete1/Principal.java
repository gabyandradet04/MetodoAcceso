/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Gabriela
 */
public class Principal {
    
    
    
    
    public static void main(String[] args) {
        
        Acceso1 objet1 = new Acceso1();
        
            objet1.setedad(15);
            System.out.println(objet1.getedad());
            
            objet1.setaltura(1.32);
            System.out.println(objet1.getaltura());
            
            objet1.setnombre("Pablito");
            System.out.println(objet1.getnombre());
            
            objet1.setpeso(65.3);
            System.out.println(objet1.getpeso());
            
            System.out.println("El es "+ objet1.getnombre()+",el tiene "+ objet1.getedad()+"años y mide "+ objet1.getaltura()+"y tiene un peso de "+objet1.getpeso());
        
    }
    
}
