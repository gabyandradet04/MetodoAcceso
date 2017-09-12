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
import java.util.Scanner;
public class Principal {
    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        /*Persona objet1 = new Persona();
        
            objet1.setedad(15);
            System.out.println(objet1.getedad());
            
            objet1.setaltura(1.32);
            System.out.println(objet1.getaltura());
            
            objet1.setnombre("Pablito");
            System.out.println(objet1.getnombre());
            
            objet1.setpeso(65.3);
            System.out.println(objet1.getpeso());
            
            System.out.println("El es "+ objet1.getnombre()+",el tiene "+ objet1.getedad()+"años y mide "+ objet1.getaltura()+"y tiene un peso de "+objet1.getpeso());
        */
        Animales obj1= new Animales();
        
        System.out.println("Ingrese la edad del animal");
          int ani=sc.nextInt();
          obj1.setedad(ani);
        System.out.println("La edad del animal es "+ obj1.getedad());
        
        
        System.out.println("Ingrese el color del animal");
        
        String x =sc.next();//se usa para Scaner en String
        obj1.setcolor(x);
        
        System.out.println(obj1.getcolor());
        
        System.out.println("Ingrese la altura del animal");
        
        double alt =sc.nextDouble();//se usa para Scaner en double
        obj1.setaltura(alt);
        
        System.out.println(obj1.getaltura());
        
        System.out.println("Ingrese la especie del animal");
        
        String esp  =sc.next();//se usa para Scaner en String
        obj1.setespecie(esp);
        
        System.out.println(obj1.getespecie());
        
      
    }
     
}
