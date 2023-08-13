/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _18finalkey {
    public static void main(String [] ar){
        demo d=new demo(45,"1st");
        d.print();
        
    }
}

class demo{
final int  first;
String chance;
 demo(int first,String chance){
     this.first=first;
     this.chance=chance;
 }
   final void print(){
       //first=first+2; not modified because it is final
   System.out.println("this is final variable method and class"+first+""+chance);
     
 }

}

//cant override final metod------------------------------------------if class is final u canr inherit it
//class drive extends base{
//    void print(){
//      System.out.println("this is final variable method and class");
//     
//    }
//}
