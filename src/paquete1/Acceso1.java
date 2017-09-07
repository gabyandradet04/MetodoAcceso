
package paquete1;


public class Acceso1 {
    
     private int edad;
     private double altura=35;
     static String nombre;//deja fihçjo un valor y toma el ultimo cambio que se realizo
     private double peso;
     public void setedad (int e){
         edad=e;
         
     }//metodo para asignar valor
     public int getedad(){
         return edad;
     }//metodo para obtener valor, depende del tipo de atributo(
      
     public void setaltura (double e){
         altura=e;
         
     }
     public double getaltura(){
         return altura;
     }
     
      public void setnombre (String e){
         nombre=e;
         
     }
     public String getnombre(){
         return nombre;
     }
      public void setpeso (double e){
         peso=e;
         
     }
     public double getpeso(){
         return peso;
     }
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
        obj3.nombre="rodrigo";
        obj3.altura=1.6;
        obj3.peso=62;
        
        Acceso1 obj4= new Acceso1();
    
        obj4.edad=23;
        obj4.nombre="rodrigo";
        obj4.altura=1.63;
        obj4.peso=75;
        
        Acceso1 obj5= new Acceso1();
    
        obj5.edad=28;
        obj5.nombre="pericles";
        obj5.altura=1.55;
        obj5.peso=69;
        
        
        System.out.println(obj1.nombre.toUpperCase());
        System.out.println(obj2.nombre.toUpperCase());
        System.out.println(obj3.nombre.toUpperCase());
        System.out.println(obj4.nombre.toUpperCase());
        System.out.println(obj5.nombre.toUpperCase());
        
        
  
   
    
    }
    
}
