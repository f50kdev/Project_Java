import java.time.Year;

class CSE{
   private int NumberofSection  = 4;
     private  String year;
     public int getNumberofSection(){
         return NumberofSection;
     }

     public void setYear(String a){
         year = a;
     }
}

public class Excercitando {
    public static void main(String[] args) {
        CSE obj = new CSE();
        //obj.setYear(a:"Faustino");
        System.out.println(obj.getNumberofSection());
        System.out.println(obj.getNumberofSection());

    }
}



class People{
    private int age;
    private String name;

    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        People objetos  = new People();
        objetos.getAge();
    }
}


