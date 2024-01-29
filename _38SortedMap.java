
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gayatri
 */
class Student implements Comparable {

    int rno;
    String name;
    public int compareTo(Object o){
        Student s=(Student) o;
        return this.name.compareTo(s.name); //sorting acc to name
    }

    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
        

    public String toString() {
        return name + "-->" + rno;
    }



}
public class _38SortedMap {

    public static void main(String[] ar) {
        SortedMap<Student, Integer> sm = new TreeMap<>();
        Student s1=new Student(101,"gayu");
                Student s2=new Student(102,"kuma");
        Student s3=new Student(103,"CS");
        Student s4=new Student(104,"IT");
        Student s5=new Student(105,"MCA");

        sm.put(s1, 1);
        sm.put(s2, 2);
        sm.put(s3, 3);
        sm.put(s4, 4);
        System.out.println(sm);
//        System.out.println("tail" + sm.tailMap("hello"));//after hello
//        System.out.println("head" + sm.headMap("kuma"));//before kuma

    }
}
