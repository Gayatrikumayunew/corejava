/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */

class person{
    protected String name;
    protected String address;
    public void setPerson(String name,String address){
        this.name=name;
        this.address=address;
    }
    public void display(){
        System.out.println(name +"" + address);
    }
}
class Employee1 extends person{
    protected String empId;
    protected String department;
     public void setEmployee1(String name,String address,String empId,String department){
        setPerson(name,address);
        this.empId=empId;
        this.department=department;
     }
     public void displayEmp(){
          System.out.println(name +"" + address+""+empId+""+department);
    
     }
    
}
class fresher1 extends Employee1{
    protected double lpa;
    public void setfres(String name,String address,String empId,String department,double lpa){
        setEmployee1(name,address,empId,department);
        this.lpa=lpa;
    }
     public void displayf(){
          System.out.println(name +"" + address+""+empId+""+department+""+""+lpa);
    
     }
    
}
public class inher2 {
    public static void main(String [] ar){
        person p=new person();
        p.setPerson("first","mumbai");
        p.display();
        Employee1 e1=new Employee1();
        e1.setEmployee1("second", "pune", "45j", "IT");
        e1.displayEmp();
        fresher1 f1=new fresher1();
        f1.setfres("freshr", "ujn", "45kh", "CS", 45000);
        f1.displayf();
        
        
    }
}
