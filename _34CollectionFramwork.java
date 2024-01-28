
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _34CollectionFramwork {
    int rno;
    String name;
     public _34CollectionFramwork(int rno,String name){
         this.rno=rno;
         this.name=name;
     }
     public String toString(){
         return rno +"roll number"+name;
         
     }
     
}
class Listinterface{
    static _34CollectionFramwork[] arr=new _34CollectionFramwork[10];
    static _34CollectionFramwork l;
    public static void main(String[]ar){
        int i=0;
        ArrayList <_34CollectionFramwork> tab1=new ArrayList<_34CollectionFramwork>();// replace ArrayList to Linkedlist by using just linked list in place of arraylist
        getData(arr);
        for( i=0;i<arr.length-1;i++){
            tab1.add(arr[i]);// a method for add
            
        }
        for(i=0;i<arr.length-1;i++){
            System.out.println(tab1.get(i));
        }
        tab1.add(5,new _34CollectionFramwork(15,"hello5")) ;
        System.out.println(tab1);
        Iterator it =tab1.iterator();
        System.out.println("iterating by iterator");
        while(it.hasNext()){
            _34CollectionFramwork s=(_34CollectionFramwork) it.next();//typecasting
            System.out.println(s);
            
        }
        //converting list to array
        _34CollectionFramwork[] obj1=new _34CollectionFramwork[5];// if length of array is more or equal to old array length no new momory location created but if less then created.
        
  _34CollectionFramwork[] obj2       = (_34CollectionFramwork [])tab1.toArray(obj1);
  
  if(obj1 ==obj2){
      System.out.println("same");
  }
  else{
            System.out.println("not same");

  }
  // creating list
  List < _34CollectionFramwork>sublist=tab1.subList(2, 5);
  ListIterator<_34CollectionFramwork>li=sublist.listIterator();
  System.out.println("Forward travesal of list");
  while(li.hasNext()){
      _34CollectionFramwork d=li.next();
      System.out.println( d);
  }
  System.out.println("Backward travesal of list");
  while(li.hasPrevious()){
      _34CollectionFramwork d=li.previous();
      if(d.rno==4)
          li.remove();
      System.out.println( d);
  }
   System.out.println(sublist);
   tab1.remove(8);
      System.out.println(tab1);


        
    }
    static void getData(_34CollectionFramwork [] A){
        A[0]=new _34CollectionFramwork(1,"hello");
         A[1]=new _34CollectionFramwork(2,"hello1");
          A[2]=new _34CollectionFramwork(3,"hello2");
                   A[3]=new _34CollectionFramwork(4,"hello3");
        A[4]=new _34CollectionFramwork(1,"hello4");
         A[5]=new _34CollectionFramwork(2,"hello51");
          A[6]=new _34CollectionFramwork(3,"hello6");
                   A[7]=new _34CollectionFramwork(4,"hello7");
                   
    }
} 