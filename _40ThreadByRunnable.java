/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
//why runnable interface-because we  already have class which we are inherited so we cant inherit two classes so we need interface. 
public class _40ThreadByRunnable implements Runnable{
    Thread t;
    _40ThreadByRunnable(String name){
        t=new Thread(this,name);
        t.start();
    }
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(t.getName()+":"+i);
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String [] ar){
        _40ThreadByRunnable ct1=new _40ThreadByRunnable("gayu");
                _40ThreadByRunnable ct2=new _40ThreadByRunnable("gayu2");
        _40ThreadByRunnable ct3=new _40ThreadByRunnable("gayu3");

        
        for(int i=1;i<=10;i++){
            System.out.println("main"+i);
             try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}