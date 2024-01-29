
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gayatri
 */
public class _36sortedset implements Comparable{

    int rno;
    String name;
   
    public int compareTo(Object O){ ///comparing rno,to compare name=name.compareTo(obj.name)
        _36sortedset obj=(_36sortedset) O;
        
   if (this.rno==obj.rno){
            return 0;
        }
        else if(this.rno <obj.rno){
            return -1;
        }
        else{
            return 1;
        }
        
        
    }
    
    
    _36sortedset(int rno, String name) {
        this.rno = rno;
        this.name = name;

    }

    public String toString() {
        return rno + "-->" + name;
    }
}

class Sorted {

    public static void main(String[] ar) {
//        
//        TreeSet<Integer> t = new TreeSet<Integer>();
//        t.add(45);
//
//        t.add(12);
//        t.add(55);
//        t.add(98);
//        t.add(78);
//        t.add(78);
//        t.add(72);
//
//        System.out.println(t); // ordered value
//
//        TreeSet<Integer> header = (TreeSet<Integer>) t.headSet(70);
//        System.out.println(header);
//
//        TreeSet<Integer> tail = (TreeSet<Integer>) t.tailSet(70);
//        System.out.println(tail);
//        System.out.println("printing first");
//        System.out.println(t.first());
//
//        System.out.println("printing last");
//
//        System.out.println(t.last());
//
TreeSet <_36sortedset> clg=new TreeSet<_36sortedset>();
_36sortedset o1=new _36sortedset(101,"gg");
_36sortedset o2=new _36sortedset(102,"humayu");
_36sortedset o3=new _36sortedset(103,"babur");
_36sortedset o4=new _36sortedset(104,"gayu");
clg.add(o1);
clg.add(o2);
clg.add(o3);
clg.add(o4);
System.out.print(clg);








    }
}
