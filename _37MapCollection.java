
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gayatri
 */
public class _37MapCollection {

    int rno;
    String name;

    _37MapCollection(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
    
 public String toString(){
     return rno+"-->"+name;
 }
}

class Mapdemo {

    public static void main(String[] ar) {
        _37MapCollection obj1 = new _37MapCollection(101, "gayu");
        _37MapCollection obj2 = new _37MapCollection(102, "akbar");
        _37MapCollection obj3 = new _37MapCollection(103, "babur");
        _37MapCollection obj4 = new _37MapCollection(104, "humayu");
        Map<Integer, _37MapCollection> clg = new HashMap<Integer, _37MapCollection>();
        clg.put(1, obj1);
        clg.put(2, obj2);
        clg.put(3, obj3);
        clg.put(4, obj4);
        for(int i=1;i<clg.size();i++){
            _37MapCollection o;
            o=clg.get(i);
            System.out.println(o);
        }
        System.out.println("all keys"+clg.keySet());
                System.out.println("all values"+clg.values());
                clg.put(2,obj4);
                System.out.println(clg);

        
    }
}
