/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
abstract class Demo{
    abstract public void f();
    public void g(){
        System.out.println("hi im g method");
    }
}
class derived extends Demo{
    public void f(){
        System.out.println("f called");
    }
    public void g()// 
    {
        System.out.println("Derived g method");
    }
    
}

public class _26Abstractdemo2 {
    public static void main(String [] args){
    derived d=new derived();
    d.f();
    d.g();}
    
}
