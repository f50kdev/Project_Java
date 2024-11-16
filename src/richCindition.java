public class richCindition {
    public static void main(String[] args) {
        //age < 12 teeneger category
        //age >= && age < 18 teeneger younger
        //age > 18 old category.
        int age = 17;
        String  category="";
        if (age < 15) {
            category = "teeneger category";
        } else if (!(age >= 15 && age<18)) {
            category ="teeneger category";

        }
        System.out.println(category);
    }
}
