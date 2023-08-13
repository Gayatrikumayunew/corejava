/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */

import java.util.Scanner;
public class meoverid2 {
    public static void main(String [] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for batsman or 0 for bowler");
        int choice =sc.nextInt();
        sc.close();
        keter k;
        if(choice==1)
            k=new batsman("india","rohit",4,2);
         else
            k=new bowler("usa","gayu",45,4);
        k.print();// this print method depend on runtime 
        }
        
    }
class keter{
    String cname;
    String player;
    
    
    public keter ( String cname, String player)
    {
        this.cname=cname;
        this.player=player;
        
    }
    public void print(){
      //  System.out.println("this is keter method");
        System.out.println(cname+""+player);
    }

}

class batsman extends keter{
 int no5;
 int no10;
 
 public batsman(String cname,String player,int no5,int no10){
     super(cname,player);
     this.no5=no5;
     this.no10=no10;
     
 }
 public void print(){
     System.out.println("this is batsman method");
     super.print();
     
     System.out.println(no5+""+no10);
 }
}

class bowler extends keter{
 int wicker;
 int runs;
 
 public bowler(String cname,String player,int wicker,int runs){
     super(cname,player);
     this.wicker=wicker;
     this.runs=runs;
     
 }
 public void print(){
     System.out.println("this is bowler method");
     super.print();
     System.out.println(wicker+""+runs);
 }
}



    
        
    
    

