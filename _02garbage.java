/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _02garbage {
    public void finalize(){
        System.out.println("object going to destroye");
    }
    public static void main(String [] at){
        _02garbage gi=new _02garbage();
        _02garbage g1=new _02garbage();
        
        gi=null;
        g1=null;
        System.out.println("null ojects");
        System.gc();
    }
    
}
