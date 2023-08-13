/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _10labelledcontinue {
    public static void main(String [] args){
        out:
        for(int i=0;i<5;i++){
            System.out.println("from outer" +i);
            for(int j=1;j<=5;j++){
                if(j==2)
                    continue out;
            
         System.out.println("innse loop" + j);
            }
        }
    }
}
