package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
            int idade = 15;
            boolean autorizadoComprarBebida = idade >= 18;

            if (autorizadoComprarBebida){
                System.out.println("Autorizado a comprar bebida alcólica.");
            }

        if (autorizadoComprarBebida == false){
            System.out.println("Não autorizado a comprar bebida alcólica.");
        }
    }
}
