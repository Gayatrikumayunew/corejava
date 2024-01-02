import java.util.Scanner;

class vehicle{
    int seats;
    String fuel;
    int speed;
    public vehicle (int seats,String fuel,int speed){
        this.seats=seats;
        this.fuel=fuel;
        this.speed=speed;
    }
    
    public String toString(){
        return "no of seats"+seats+"fuel"+fuel+"speed"+speed;
    } 
    
}
interface flyingobje{
    int height=2000;
   
}
class aeroplane extends vehicle implements flyingobje{
    int takeoffspeeed;
     public aeroplane(int seats,String fuel,int speed,int takeoffspeed){
         super(seats,fuel,speed);
         this.takeoffspeeed=takeoffspeed;

     }
public String toString(){
    String aeroprint="attributes of aeroplane\n";
    aeroprint= "no of seats"+seats+"fuel"+fuel+"speed"+speed;
    aeroprint=aeroprint+"maxheight"+height+"takeoff"+takeoffspeeed;
    
return aeroprint;
}}
class bus extends vehicle{
    String type;
    public bus(int seats,String fuel,int speed,String type){
        super(seats,fuel,speed);
        this.type=type;
    }
    public String toString(){
    String aeroprint="attributes of aeroplane\n";
    aeroprint= "no of seats"+seats+"fuel"+fuel+"speed"+speed;
    aeroprint="type"+type;
    
return aeroprint;
    }
}

class _28interfacedemo{
    public static void main(String []ar){
        
        vehicle v[]=new vehicle[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("enter 1 to create bus and 2 to create aeroplane");
            int choice=sc.nextInt();
            if(choice==1){
                int seats;
                String fuel;
                int speed;
                String type;
                System.out.println("enter no of seats,fuel ,speed and type of bus");
                seats=sc.nextInt();
                fuel=sc.next();
                speed=sc.nextInt();
                type=sc.next();
                v[i]=new bus(seats,fuel,speed,type);
            }
            else{
                 int seats;
                String fuel;
                int speed;
               int takeoffspeed;
               System.out.println("enter no of seats,fuel ,speed and takeoffspeed of aeroplane");
                seats=sc.nextInt();
                fuel=sc.next();
                speed=sc.nextInt();
                takeoffspeed=sc.nextInt();
                v[i]=new aeroplane(seats,fuel,speed,takeoffspeed);
            }
        }
        int count=0;
        for(int i=0;i<5;i++){
            if(v[i] instanceof flyingobje){
                count++;
            }
            
        }
        System.out.println("total flying obj"+count);
    }
}