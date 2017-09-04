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
        
        for(int i=0; i<6; i++){
            lvl.add(5);
            ArrayList<String> salami = new ArrayList<>();
            for(int j=0; j<7; j++){
                salami.add("0");
            }
            t.add(salami);
        }
        
        
        while(true){
            t.forEach((l)->{
                l.forEach((jaja) ->{
                    System.out.print(jaja+" ");
                });
                System.out.print("\n");
            });
            System.out.println("ROJOS:");
            int a = xd.nextInt();
            ArrayList<String> peperoni = new ArrayList<>();
            peperoni = t.get(lvl.get(a));
            
        }
    }
    
}
