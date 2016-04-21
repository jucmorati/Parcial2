/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Camilo
 */
public class Main2 {
    
    static final int MOD = 26;
    static final int CORR = 3;
    static ArrayList<Person> personas;
    static int salariosStaff(){
        
        int x=0;
        for(int i=0;i<personas.size();i++){
            if(personas.get(i) instanceof Staff){
                System.out.println(personas.get(i).getNombre());
                if(((Staff)personas.get(i)).getTitulo().equals("JHUHQWH")){
                    x+=personas.get(i).getSalario();
                }
            }
            
        }
       return x; 
    }
     static int salariosTodos(){
        
        int x=0;
        for(int i=0;i<personas.size();i++){
            
                
                    x+=personas.get(i).getSalario();
                
            
            
        }
       return x; 
    }
    
    static String dec(String line){
        char[] l = line.toCharArray();
        String r = "";
        for(int i = 0; i < line.length(); i++){
            r += (char)((((l[i]-'A' )-CORR+MOD)%MOD)+'A');
        }
        return r;
    }
    
    static String enc(String line){
        char[] l = line.toCharArray();
        String r = "";
        for(int i = 0; i < line.length(); i++){
            r += (char)(((( l[i]-'A')+CORR)%MOD)+'A');
        }
        return r;
    }
    
     public static void main (String [] args) throws IOException{
        personas  = new ArrayList<>();
        
        
         Scanner sc = new Scanner( new FileInputStream( "datos.txt" ) );
         
         while(sc.hasNext()) {
             String rol = sc.nextLine();
             String[] palabras = rol.split(",");

             if(palabras[0].equals("STUDENT")) {
                 Student q = new Student(palabras[3],palabras[1],palabras[2], Integer.parseInt(palabras[4]));
                 System.out.println(palabras[0]+" "+ dec(q.getNombre()) + " " + dec(q.getApellido())+" "+(dec(q.getStatus()))+" "+(q.getSalario()));           
             personas.add(q);
             } 
             else if (palabras[0].equals("FACULTY")){
                Faculty f=new Faculty (palabras[1],Integer.parseInt(palabras[2]),palabras[3],palabras[4],palabras[5],Integer.parseInt(palabras[6]));
                System.out.println(palabras[0]+" "+ dec(f.getRango()) + " " +(f.getOficina())+" "+ f.getFechacontratacion()+" "+(dec(f.getNombre()))+" "+(dec(f.getApellido()))+" "+(f.getSalario()));
                 personas.add(f);
             }
             else if (palabras[0].equals("STAFF")){
                 Staff g=new Staff (palabras[1],Integer.parseInt(palabras[2]),palabras[3],palabras[4],palabras[5],Integer.parseInt(palabras[6]));
                 System.out.println(palabras[0]+" "+ dec(g.getTitulo()) + " " +(g.getOficina())+" "+ g.getFechacontratacion()+" "+(dec(g.getNombre()))+" "+(dec(g.getApellido()))+" "+(g.getSalario()));             
             personas.add(g);
             }   
         }
         for(int i=0;i<personas.size();i++){//listar personas
             System.out.println(dec(personas.get(i).getNombre())+" "+dec(personas.get(i).getApellido()));
         }
      
     System.out.println(salariosStaff());//salarios de los staff gerente
     System.out.println(salariosTodos());//salarios de todos
     }
     
}
