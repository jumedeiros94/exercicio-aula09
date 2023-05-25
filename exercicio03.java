import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Responda as seguintes perguntas sobre o crime:");
        System.out.println("Telefonou para a vítima? (S/N):");
        String resposta1 = entrada.nextLine();
        System.out.println("Esteve no local do crime? (S/N):");
        String resposta2 = entrada.nextLine();
        System.out.println("Mora perto da vítima? (S/N):");
        String resposta3 = entrada.nextLine();
        System.out.println("Devia para a vítima? (S/N):");
        String resposta4 = entrada.nextLine();
        System.out.println("Já trabalhou com a vítima? (S/N):");
        String resposta5 = entrada.nextLine();

        int quantidadeDeSim = 0;

        if(resposta1.equalsIgnoreCase("s")){
            quantidadeDeSim++;
        }
        if(resposta2.equalsIgnoreCase("s")){
            quantidadeDeSim++;
        }
        if(resposta3.equalsIgnoreCase("s")){
            quantidadeDeSim++;
        }
        if(resposta4.equalsIgnoreCase("s")){
            quantidadeDeSim++;
        }
        if(resposta5.equalsIgnoreCase("s")){
            quantidadeDeSim++;
        }

        System.out.println("Essa é a quantidade de sim: " + quantidadeDeSim);

        if(quantidadeDeSim == 2 ){
            System.out.println("Ele(a) é Suspeito(a)");
        } else if (quantidadeDeSim >= 3 && quantidadeDeSim <= 4) {
            System.out.println("Ele(a) é Cúmplice");
        } else if (quantidadeDeSim == 5) {
            System.out.println("Ele(a) é o(a) Assasino(a)");
        } else {
            System.out.println("Inocente");
        }

    }
}
