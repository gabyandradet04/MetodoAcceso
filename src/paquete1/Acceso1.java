
package paquete1;


public class Acceso1 {
    
     private int edad;
     private double altura=35;
     private String nombre;
     private double peso;
      
    
    public static void main(String [] args){
    
    Acceso1 obj1 = new Acceso1();
    
        obj1.edad=15;
        obj1.nombre="juan";
        obj1.altura=1.5;
        obj1.peso=65;
        
    Acceso1 obj2= new Acceso1();
    
        obj2.edad=18;
        obj2.nombre="pedro";
        obj2.altura=1.3;
        obj2.peso=60;
        
        Acceso1 obj3= new Acceso1();
    
        obj3.edad=25;
        obj3.nombre="pericles";
        obj3.altura=1.6;
        obj3.peso=62;
        
        Acceso1 obj4= new Acceso1();
    
        obj4.edad=23;
        obj4.nombre="rodrigo";
        obj4.altura=1.63;
        obj4.peso=75;
        
        Acceso1 obj5= new Acceso1();
    
        obj5.edad=28;
        obj5.nombre="ramiro";
        obj5.altura=1.55;
        obj5.peso=69;
        
        
        System.out.println(obj1.nombre.toUpperCase());
        System.out.println(obj2.nombre.toUpperCase());
        System.out.println(obj3.nombre.toUpperCase());
        System.out.println(obj4.nombre.toUpperCase());
        System.out.println(obj5.nombre.toUpperCase());
        
        
  
   
    
    }
    
}
