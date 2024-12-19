import java.sql.SQLOutput;

public class ternarios {

    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pra Faustin";
        String  NaoDoar = "nao a Condicoes de doeam do dinheiro";

        if(salario <= 7000){
            System.out.println(mensagemDoar);

        }
        else {
            System.out.printf(NaoDoar);
        }

    }
}
