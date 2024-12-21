import  java.io.IOException;
import java.io.BufferedReader;

public class Tabela {
    public static  void  main(String[] args) {
        System.out.println("hello");
        double salary ,
                 fee1  ,
                    fee2 ,
                        fee3  ,
                            descount ,
                total;
        fee1  = 100;
        fee3 = 200;
        fee2 = 200;
        salary = 90;
        if(salary <=fee1 ){
            salary = salary + fee1;
            System.out.println("valuer of salary" + salary);
        }
        else if (salary <=fee2){
            salary = salary + fee2;
            System.out.println("salary with fee2 "+ salary);
        }
        else {
            salary = salary + fee3;
            System.out.println("salary with fee3" + salary);
        }
    }
}

