import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#,##0.00");

        double precoGasolina = 2.50;
        double precoAlcool = 1.90;

        System.out.println("[----- Calculadora de combustivel -----]");
        System.out.println("Quantos litros foram vendidos?");
        double qtdLitrosVendidos = entrada.nextDouble();

        System.out.println("Qual combustivel foi abastecido? " +
                "(Ex: A = Alcool e G = Gasolina)");
        String combustivelAbastecido = entrada.next();

        System.out.println("Foi vendido " + qtdLitrosVendidos + " litros");

        if (combustivelAbastecido.equalsIgnoreCase("a")){
            if (qtdLitrosVendidos <= 20){
                double descontoAlcool = (qtdLitrosVendidos * precoAlcool) * 0.03;
                double precoNormal = qtdLitrosVendidos * precoAlcool;
                double precoFinalComDesconto = (qtdLitrosVendidos * precoAlcool) - descontoAlcool;
                System.out.println("O valor sem desconto é R$ " + formatador.format(precoNormal));
                System.out.println("O cliente recebeu 3% de desconto, ficando o total de: R$ " + formatador.format(precoFinalComDesconto));
            } else {
                double descontoAlcool = (qtdLitrosVendidos * precoAlcool) * 0.05;
                double precoNormal = qtdLitrosVendidos * precoAlcool;
                double precoFinalComDesconto = (qtdLitrosVendidos * precoAlcool) - descontoAlcool;
                System.out.println("O valor sem desconto é R$ " + formatador.format(precoNormal));
                System.out.println("O cliente recebeu 5% de desconto, ficando o total de: R$ " + formatador.format(precoFinalComDesconto));
            }

        } else if (combustivelAbastecido.equalsIgnoreCase("g")) {
            if (qtdLitrosVendidos <= 20){
                double descontoGasolina = (qtdLitrosVendidos * precoGasolina) * 0.04;
                double precoNormal = qtdLitrosVendidos * precoGasolina;
                double precoFinalComDesconto = (qtdLitrosVendidos * precoGasolina) - descontoGasolina;
                System.out.println("O valor sem desconto é R$ " + formatador.format(precoNormal));
                System.out.println("O cliente recebeu 4% de desconto, ficando o total de: R$ " + formatador.format(precoFinalComDesconto));
            } else {
                double descontoGasolina = (qtdLitrosVendidos * precoGasolina) * 0.06;
                double precoNormal = qtdLitrosVendidos * precoGasolina;
                double precoFinalComDesconto = (qtdLitrosVendidos * precoGasolina) - descontoGasolina;
                System.out.println("O valor sem desconto é R$ " + formatador.format(precoNormal));
                System.out.println("O cliente recebeu 6% de desconto, ficando o total de: R$ " + formatador.format(precoFinalComDesconto));
            }
        }
    }
}
