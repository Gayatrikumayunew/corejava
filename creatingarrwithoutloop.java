/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnvern2;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author gayatri
 */
public class creatingarrwithoutloop {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        int[]arr= newarr(n);
        System.out.print("output");
        for(int num:arr){
            System.out.println(num+" ");
        }
        sc.close();
    }
    public static int[] newarr(int n){
        return IntStream.rangeClosed(1,n).toArray();
    }
}
