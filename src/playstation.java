public class playstation {
    public static void main(String[] args) {
         int idade = 25;
         int salary  =3500;
            boolean DentroDaLeiMaiorQueTrinta =  idade>=  25 &&  salary>=4612;
            boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salary >= 3381;
        System.out.println("DentroDaLeiMaiorQueTrinta: " + DentroDaLeiMaiorQueTrinta  );
        System.out.println(" isDentroDaLeiMenorQueTrinta: " +  isDentroDaLeiMenorQueTrinta);

        double valorTotalContaConrrente = 200;
         double valorTotalContaPoucapanca = 10000;

         float  valorPlaystation = 5000;

        boolean isPlaystationCncoCompravel = valorTotalContaConrrente >  valorPlaystation || valorTotalContaPoucapanca>valorPlaystation;
    }
}
