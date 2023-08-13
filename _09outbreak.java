/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _09outbreak {
    public static void main(String [] args){
        
       // out:
        for(int i=1;i<=5;i++){
            System.out.print("from outer" + i);
            out:
            for (int j=0; i<5;j++){
                System.out.print(j);
                if(j==2){
                    break out;
                }
            }
        }
        System.out.print("out from loop");
    }
}
