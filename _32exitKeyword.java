/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _32exitKeyword {
    public static void main(String []ar){
        int a=0;
        int b=5;
        try{
            
        
        if(a==0||b==0){
            throw new ArithmeticException();
            
        }
        if(a<0||b<0){
            throw new Exception();
       //   System.out.println("im exception");  
        }}
        catch(ArithmeticException ae){
            System.out.println("this is arithmatic exception");
           // System.exit(1);---end without finally execution
        //   return;--end with finally execution
        }
        catch(Exception e){
            System.out.println("exception");
                }
        finally{
            
            System.out.println("im finally");
        }
        //cannot have multiple finally block
//        finally{
//            
//            System.out.println("im finally");
//        }
        
    }
}
