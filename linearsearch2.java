/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnvern2;

/**
 *
 * @author gayatri
 */
public class linearsearch2 {
    // here we are returning element;
     public static void main(String [] ar){
        int arr[]={5,6,78,96,12};
        int target=16;
        int ans=linearsearchmethod(arr,target);
        System.out.println(ans);
    }
    static int linearsearchmethod(int[] a,int target){
        if(a.length==0){
            return Integer.MAX_VALUE;
        }
        for(int index=0;index<a.length;index++){
            int ele=a[index];
            if(ele==target){
            return ele;}
        }
        return Integer.MAX_VALUE;// we can return -1 but -1 can we any element in array so we are using 
    }

}
