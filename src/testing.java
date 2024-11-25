public class testing {
    String name;
    int age , id;

    void geting(String name1){
        name = name1;

    }

    public String getName(){
        return  name;
    }
}

public static void main(String[] args) {
    testing  objectes = new testing();
    objectes.age = 123;
    objectes.geting("faustino");
    System.out.println(objectes.age);
}