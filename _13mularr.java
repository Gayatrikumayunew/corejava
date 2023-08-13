/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _13mularr {
 public static void main(String [] a){
     int i;
     int num[][]=new int[3][];
     for(i=0;i<num.length;i++){
         num[i]=new int[3];
         
     }
     for(i=0;i<num.length;i++){
         for( int j=0;j<num.length;j++){
             num[i][j]=i*j;
         }
     }
     for(i=0;i<num.length;i++){
         for(int j=0;j<num[i].length;j++){
             System.out.print(num[i][j] +"\t");
         
         }
         System.out.println("\n");
     }
     
 }   
}
