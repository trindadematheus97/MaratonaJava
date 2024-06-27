package academy.devdojo.maratonajava.introducao;


import java.time.LocalDate;


/*
crie váriaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, estou morando no endereço <endereço>, confirmo que recebi o salario de <salario>,
na data <data>.
 */
public class Aula03TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Matheus";
        String endereco = "Rua projetada, 787";
        double salario = 1232.2312;
        LocalDate data = LocalDate.of(2024, 6, 25);

        String mensagem = "Eu " + nome + ", estou morando no endereço " + endereco + ", confirmo que recebi o salario de " +
                salario + " , na data " + data + ".";

        System.out.println(mensagem);

    }
}
