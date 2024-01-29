/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _39Thread extends Thread{
    _39Thread(String name){
    super(name);}
    

public void run(){
for(int i=1;i<10;i++){
System.out.println(getName()+":"+i);
try{
    Thread.sleep(3000);

}
catch(InterruptedException e){
    e.printStackTrace() ;
}
};

}
public static void main(String[] ar){
_39Thread t=new _39Thread("gayu");
_39Thread t1=new _39Thread("gayu1");
 t.start();
t1.start();
for(int i=1;i<=10;i++){
System.out.println("main Thread"+i);
try{
    Thread.sleep(500);

}
catch(InterruptedException e1){
    e1.printStackTrace();
}
}
}
}