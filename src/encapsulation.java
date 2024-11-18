

class Human{
   private int age  = 12;
     private String name = "George";

     public int getAge(){
         return  age;
     }

     public String  getName(){
         return  name;

     }

}

public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        ///obj.age = 7;
        //obj.name = "George";
        System.out.println(obj.getAge() +":"+ obj.getName());


    }

}
