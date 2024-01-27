/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _33exception {
    
//    public static void main(String [] ar){
//        try{
//            int a=5;
//            int b=0;
//            int ans=a/b;
//            System.out.println(ans);
//        }
//        catch(Exception e){
//            System.out.print(e.getMessage());//generate user friendly message
//                     //   System.out.print(e.getStackTrace());
//                    e.printStackTrace();
//                  //   e.getCause();
//                     
//
//            
//        }
//    }
    public static void main(String [] ar)throws Exception{
        try{
            m1();
        }
        catch(Exception e){
            System.out.println("Cause" + e.getCause());
        }
        
    }
    public static void m1() throws Exception{
        int arr[]={1,2,3,4,5};
        
        
        try{
            arr[10]=43;
        }catch(ArrayIndexOutOfBoundsException ae){
            Exception e=new Exception();
            e.initCause(ae);
                    throw(e);
            
        }
    }
}
