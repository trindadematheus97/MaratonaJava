package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
    int numero01 = 10;
    int numero02 = 20;
    double resultado = numero01 / (double) numero02;

    System.out.println(resultado);

    boolean isDezMaiorQueVinte = 10 > 20;
    boolean isDezMenorQueVinte = 10 < 20;
    boolean isDezIgualVinte = 10 == 20;
    boolean isDezIgualDez = 10 == 10;
    System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
    System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
    System.out.println("isDezIgualQueVinte " + isDezIgualVinte);
    System.out.println("isDezIgualDez " + isDezIgualDez);

    //  OPERADORES DE WXCLAMAÇÃO

        int idade = 35;
        float salario = 3500F;
        boolean isDentrodaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentrodaLeiMaiorQueTrinta " + isDentrodaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
    }
}
