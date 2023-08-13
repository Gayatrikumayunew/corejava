/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */

public class _14copyclone {
    public static void main(String [] a){
        char []copyfrom={'j','a','v','a','i','s','l'};
        char[]copyto=new char[30];
        copyto[0]='k';
        System.arraycopy(copyfrom,2,copyto,1,3);
        System.out.print(copyto);
        
    }
}
