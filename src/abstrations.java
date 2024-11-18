abstract class  animal{
    abstract  void soun();

    void eat(){
        System.out.println("this animal eats food");
    }
}

class Dog extends  animal{
    void soun(){
        System.out.println("the dogs barks");
    }
}

public class abstrations {
    public static void main(String[] args) {
        animal mydog  = new animal();
        mydog.soun(); //outputs
        mydog.eat(); //outputs


    }
}

