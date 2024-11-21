class animal{
    void eat(){
        System.out.println("this animal eats food;");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("the dog bark");
    }
}

public class inhiritance2 {
    public static void main(String[] args) {
        dog object = new dog();
        object.eat();
        object.bark();

    }
}
