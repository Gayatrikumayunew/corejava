
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _35SetInterfaceCollection {
    int book_id;
    String title,author,publisher;
    int quan;
     _35SetInterfaceCollection(int book_id,String title,String author,String publisher,int quan){
      this.book_id=book_id;
      this.title=title;
      this.author=author;
      this.publisher=publisher;
      this.quan=quan;
     }
     public String toString(){
         return book_id + "-->"+title+"-->"+author+"-->"+publisher+"-->"+quan;
         
     }
     public boolean equals( Object o){
         return (this.book_id ==((_35SetInterfaceCollection) o).book_id);
     }
     public int hashCode(){
         return book_id;
     }
}
class SetDemo{
    public static void main(String[] ar){
        LinkedHashSet <_35SetInterfaceCollection> lib=new LinkedHashSet<_35SetInterfaceCollection>();//no order in hashset,ordering in linkedhashset
        _35SetInterfaceCollection b1=new _35SetInterfaceCollection(101,"dsa","yashh","bpp",12);
        _35SetInterfaceCollection b2=new _35SetInterfaceCollection(102,"dsa1","yashh1","bpp1",13);
        _35SetInterfaceCollection b3=new _35SetInterfaceCollection(103,"dsa2","yashh2","bpp2",14);
        _35SetInterfaceCollection b4=new _35SetInterfaceCollection(104,"dsa3","yashh3","bpp3",15);
// add to set
lib.add(b1);
lib.add(b2);
lib.add(b3);
lib.add(b4);

for(_35SetInterfaceCollection n:lib){
    System.out.println(n);
}
        _35SetInterfaceCollection b5=new _35SetInterfaceCollection(104,"dsa3","yashh3","bpp3",15);
        lib.add(b5);
        Iterator<_35SetInterfaceCollection> it=lib.iterator();
                    System.out.println("using iterator");

        while(it.hasNext()){
            _35SetInterfaceCollection b=it.next();
            System.out.println(b);
        }


    }
}
