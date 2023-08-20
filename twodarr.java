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
public class twodarr {
    public static void main(String[]ar){
        int arr[][]={
            {1,2,3,4},
            {4,8,45},
            {8,45,65}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
