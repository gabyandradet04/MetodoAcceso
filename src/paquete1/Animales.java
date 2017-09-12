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
public class Animales {
    
    private String color;
    private int edad;
    private String especie;
    private double altura;
    private double peso;
    private int cantojos=2;
    private String nombre="pichicho";
    
    public void setcolor(String e){
         color=e;
     }
     public String getcolor(){
         return color;
     }
     
    public void setedad (int e){
         edad=e;
         
     }//metodo para asignar valor
     public int getedad(){
         return edad;
     }
     public void setespecie(String e){
         especie=e;
     }
     public String getespecie(){
         return especie;
     }
      public void setaltura(double e){
         altura=e;
     }
     public double getaltura(){
         return altura;
     }
      public void setpeso (double e){
         peso=e;
         
     }
      
     public double getpeso(){
         return peso;
     }
     
     public void setojos (int e){
         cantojos=e;
         
     }//metodo para asignar valor
     public int getojos(){
         return cantojos;
   
     }
     public String getnombre(){
         return nombre;
     }
    public static void main(String [] args){
    
    Persona obj2 = new Persona();
    
    
    obj2.setedad(25);
    
    /*obj2.edad=25;
    
        System.out.println(obj2.edad);
        System.out.println(obj2.altura);
             */
    
    }
    
    
}
