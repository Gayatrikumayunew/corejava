/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnvern2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gayatri
 */
//time complexity O(1);
public class arraylist {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>(10);// we habe decided size 10 but we can store more than 10 values
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
//        System.out.println(list);
//        System.out.println(list.contains(14));
//        list.set(1,12);
//        list.remove(2);//index
//        System.out.print(list);
   for(int j=0;j<5;j++){
       System.out.println(list.get(j));
   }
    }
}
