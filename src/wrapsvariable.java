class People{
   private int age ;
     private String  name;
      public  int getAge(){
          return age;
      }
      public  String getName(){
          return name;
      }
      public void setAge(int a){
          age = a;
      }
}

public class wrapsvariable {
    public static void main(String[] args) {
        People obj = new People();
        obj.setAge(12);
       /// obj.age = 12;
      /// obj.name = "Faustino henriqus";
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
