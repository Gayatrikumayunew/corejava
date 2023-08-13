/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _20hashcode {
    
    public static void main(String [] ar){
        base2 b2=new base2();
         System.out.println(b2);//return hashcode 
       //  System.out.println(b2.hashCode());// return decimal value of hexcode
         System.out.println(Integer.toHexString(b2.hashCode()));//return hashcode,we are converting decimal to hexadecimal
         System.out.println(b2.hashCode());
    
    }
   
}
class base2{
    int rollno=45;
    void print(){
       }
     public int hashCode(){
        return rollno;
    }
}
