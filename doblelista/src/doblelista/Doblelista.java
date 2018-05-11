/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doblelista;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;


public class Doblelista {

    public static void main(String[] args) {
        System.out.println("P:");
        LinkedList<Integer[]> P = new LinkedList<>();
        for (int i=3; i>0; i--){
            Integer[] a = {i+1,i+1};
            System.out.print(Arrays.toString(a));
            P.add(a);
        }
        System.out.println("\nQ:");
        LinkedList<Integer[]> Q = new LinkedList<>();
        for (int i=3; i>0; i--){
            Integer[] a = {i+2,i+3};
            System.out.print(Arrays.toString(a));
            Q.add(a);
        }
        
        LinkedList<Integer[]> R = new LinkedList<>();
        
        ListIterator<Integer[]> ptr1 = P.listIterator(0);
        ListIterator<Integer[]> ptr2 = Q.listIterator(0);

        Integer[] it1 = ptr1.next();
        Integer[] it2 = ptr2.next();
        while(ptr1.hasNext() && ptr2.hasNext()){
            if(Objects.equals(it1[1], it2[1])){
                it1[0]=it1[0]+it2[0];
                R.add(it1);
                it1 = ptr1.next();
                it2 = ptr2.next();
            }
            else{
                if(it2[1]<it1[1]){
                    R.add(it1);
                    it1 = ptr1.next();
                }
                else{
                    R.add(it2);
                    it2 = ptr2.next();
                }
            }
        }
        while(ptr1.hasNext()){
            R.add(ptr1.next());
        }
        while(ptr2.hasNext()){
            R.add(ptr2.next());
        }
        ListIterator<Integer[]> ptr3 = R.listIterator(0);
        System.out.println("\nR:");
        while(ptr3.hasNext()){
            Integer[] a = ptr3.next();
            System.out.print("["+a[0].toString()+", "+a[1]+"]");
        }
    }
}
    
