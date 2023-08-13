/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _22clone implements Cloneable{
    int len;
    int wid;
    
    public _22clone(int len,int wid){
        this.len=len;
        this.wid=wid;
    }
    public String toString(){
        return "len" +len+"wid"+wid;
    }
    public static void main(String [] ar){
        _22clone c =new _22clone(4,2);
        try{
        _22clone c1=(_22clone)c.clone();
        System.out.println(c);
         System.out.println(c1);
         c1.len=45;
         System.out.print("after clonning");
          System.out.println(c); System.out.println(c1);
        }
        catch(Exception e){
            
        }
    }
}
