class base1 {
    protected String name;
    protected int id;

    void setm(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void getm() {
        System.out.println("name: " + name + " id: " + id);
    }
}

class drive1 extends base1 {
    private String dept;

    void setm(String name, int id, String dept) {
        super.setm(name, id);
        this.dept = dept;
    }
    void getm(){
        System.out.println("name"+name+""+id+"" +dept);
    }
}

public class _17metovrid2 {
    public static void main(String[] a) {
        // Your main code goes here
        base1 b=new base1();
        b.setm("new", 45);
        b.getm();
        drive1 d=new drive1();
        d.setm("new1", 48, "cs");
        d.getm();
        
    }
}
