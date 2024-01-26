
import java.io.IOException;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _31trycatch {
    
 
   // when you want to generate a exception use throw
//     int a ,b;
//     try{
//         a=0;
//         b=5;
//         if(b<=0 || a<=0)
//             throw new ArithmeticException();
//         int ans=a/b;
//         System.out.println(ans);
//     }
//     catch(ArithmeticException e){
//         System.out.print("cant divide by 0");
//     }
     // throws for used declare exception 
    void m1(int a) throws IOException{
        if(a<10){
            throw new IOException();}
        System.out.print( "valid value"+a);
}
    public static void main(String [] ar)throws IOException
    {
        _31trycatch obj=new _31trycatch();
//        try{
//                    obj.m1(4);
//
//        }catch( IOException e){
//            System.out.println("IOexception");
//        }
obj.m1(4);
    }}