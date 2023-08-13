class rec{
    int len;
    int wid;
    
    rec(int len,int wid){
        this.len=len;
        this.wid=wid;
        
    }
    public String toString(){
        return "len is"+len+"wid is"+wid;
    }
    public boolean equals(Object obj){
        rec r3=(rec) obj; // casting object to rec
        //default behaviour of equals mehod is hashcode comparision but here we are comapring value
        if((len==r3.len)&&(wid==r3.wid))// you can use this keyword too
        {
            return true;
        }
        return false;
    }
    public static void main(String [] a){
        rec r=new rec(4,2);
        rec r1=new rec(4,2);
      //  rec r2=r;//pointing at a same point,here they are doing shallow copy
        System.out.println(r1+"\n"+r);
        if(r1.equals(r)){
            System.out.print("equal");
        }
        else{
            System.out.print("diff");
        }
        System.out.println();
     /*   if(r1==r){
            System.out.print("equal");
        }
        else{
            System.out.print("diff");
        }*/
        
    }
}