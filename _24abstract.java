/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */

// it is a abstract method we cant initciate it

import java.util.Scanner;
abstract class Animal{
   public void makesound(){
        
    }
}
class Dog extends Animal{
    public void makesound(){
        System.out.println("bow...bow");
    }
}
class Cat extends Animal{
      public void makesound(){
        System.out.print("Meow..Meow");
    }
}
public class _24abstract {
    public static void  main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1 for Dog and 2 for Cat");
        int choice = sc.nextInt();
        Animal d;
      if(choice ==1){
             d=new Dog();
            
        }
        else{
            d=new Cat();
        }
        d.makesound();
    }
}
