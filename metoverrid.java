/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
class base{
    protected void print(){
        System.out.println("this is base class");
    }
    base(){
        System.out.println("constructor");
                
    }
}

class derive extends base{
//    protected void print()//overrude method
//    {
//        System.out.println("this is derive class");
//    }
   // base(){
       // System.out.println("constructor");
                
  //  }
}


public class metoverrid {
 public static void main(String []a ){
   //  base b=new base();
     derive d=new derive();
    // b.print();
     d.print();
 }   
}
