/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
//this class return the object

public class _23getclass {
    void meth(){}
    public static void main(String [] a){
        _23getclass g=new _23getclass();
       String s= g.getClass().getName();
       String s1=g.getClass().getName();
       System.out.println(g.getClass().getSuperclass().getMethods());
       try{
       System.out.println(g.getClass().getConstructor());
       }
       catch(Exception e){}
       System.out.println(s);
       System.out.println(g.getClass().getName());
       
       System.out.println(s1.getClass().getName());
       
    }
}
