/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
final class Finalclass{
    public Finalclass(){
        System.out.println("Hi im final class");
    }
    final void f(){
        System.out.println("method called");
    }
}
public class _25Abstract_Final_method {
    public static void main(String [] args){
        Finalclass  f= new Finalclass();
        f.f();
        
    }
}
