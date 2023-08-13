/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */

class Employee{
    protected String empid;
    protected String empName;
    
    public void setEmployee(String id,String Name){
    empid=id;
    empName=Name;
    
}
    public void displayEmp(){
        System.out.println(empid + " "+ empName);
        
    }
}

class fresher extends Employee{
    private double salary;
    
    public void setfresher(String empid,String empName,double salary){
       setEmployee(empid,empName);
       this.salary=salary;
       
        
    }
    public void display(){
    System.out.println(empid+""+empName+""+salary);
}}
public class inherdemo {
    public static void main(String [] args){
        Employee e=new Employee();
        e.setEmployee("E101", "ram");
        e.displayEmp();
        fresher f=new fresher();
        f.setfresher("f101", "shyam", 20000);
        f.display();
    }
}
