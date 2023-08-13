/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _19tostringmet {
    public static void main(String args[]){
        demo5 d=new demo5();
        d.set(4,5);
        System.out.print(d);//default calling to toString
         //System.out.print(d.toString());
         
         //d.print();
    }
}
class demo5{
    int len;
    int wid;
    void set(int len,int wid){
        this.len=len;
        this.wid=wid;
    }
//    void print(){
//        System.out.println(len*wid);
//    }
 public String toString()//override toStirng method
 {
        String msg;
        msg="length"+len+"    "+"width"+wid;
        return msg;
    }
}