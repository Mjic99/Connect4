/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equispe;

import java.util.*;

/**
 *
 * @author r4105
 */
public class Clasesita {
    
    public static void main(String[] args) {
        
        Scanner xd = new Scanner(System.in);
        
        ArrayList<ArrayList<String>> t = new ArrayList<>();
        
        ArrayList<Integer> lvl = new ArrayList<>();
        
        int a;
            
        ArrayList<String> peperoni = new ArrayList<>();
        
        for(int i=0; i<6; i++){
            lvl.add(5);
            ArrayList<String> salami = new ArrayList<>();
            for(int j=0; j<7; j++){
                salami.add("0");
            }
            t.add(salami);
        }
        
        while(true){
            
            Draw(t);
            
            System.out.println("ROJOS:");
            
            a = xd.nextInt();
            
            Turn(t, lvl, a, "R");
            
            Draw(t);
            
            System.out.println("AMARILLOS:");
            
            a = xd.nextInt();
            
            
            Turn(t, lvl, a, "A");
            
        }
        
    }
    
    public static void Draw(ArrayList<ArrayList<String>> table){
        table.forEach((l)->{
                l.forEach((jaja) ->{
                    System.out.print(jaja+" ");
                });
                System.out.print("\n");
            });
    }
    
    public static void Turn(ArrayList<ArrayList<String>> t, ArrayList<Integer> lvl, int a, String col){
        try{
                ArrayList<String> peperoni = new ArrayList<>();
                peperoni = t.get(lvl.get(a));
                peperoni.set(a, col);
                t.set(lvl.get(a), peperoni);
                lvl.set(a, lvl.get(a)-1);
            }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No puedes colocar fichas aquí");
        }
        catch(IndexOutOfBoundsException x){
            System.out.println("Fuera del tablero!");
        }
        catch(InputMismatchException ex){
            System.out.println("Valor no válido");
        }
    }
}
