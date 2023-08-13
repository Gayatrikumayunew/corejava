/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
import java.lang.Math;
public class _16moverloading {
    static float area(int r){
        return 22/7 *r*r;
    }
    static float area(int l,int b){
        return l*b;
    }
    static float area (int a,int c,int d){
        float s=(float)(a+c+d)/2;
        return (float)Math.sqrt(s*(s-a)*(s-c)*(s-d));
    }
public static void main(String [] args){
    int radius=5;
    int lenght=5,width=4;
    int g=5,h=7,k=6;
 System.out.println("circle area"+ area(radius));
 System.out.println("rectangle area"+ area(lenght,width));
 System.out.println("triangle area"+ area(g,h,k));
}    
}
