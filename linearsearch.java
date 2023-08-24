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
// here we are return index of searched element;
public class linearsearch {
    public static void main(String [] ar){
        int arr[]={5,6,78,96,12};
        int target=6;
        int ans=linearsearchmethod(arr,target);
        System.out.println(ans);
    }
    static int linearsearchmethod(int[] a,int target){
        if(a.length==0){
            return -1;
        }
        for(int index=0;index<a.length;index++){
            int ele=a[index];
            if(ele==target){
            return index;}
        }
        return -1;
    }
}
