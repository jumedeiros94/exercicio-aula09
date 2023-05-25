import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#,##0.00");
        DecimalFormat formatadorPorcent = new DecimalFormat("0");


        System.out.println("[----- Folha de pagamento -----]");
        System.out.println("Digite quanto você ganha por hora trabalhada: ");
        double ganhoHora = entrada.nextDouble();
        System.out.println("Digite quantas horas você trabalhou este mês: ");
        double horasTrabalhada = entrada.nextDouble();

        double salarioBruto = ganhoHora * horasTrabalhada;
        System.out.println("Salário Bruto: (" + formatadorPorcent.format(ganhoHora) + " * "
                + formatadorPorcent.format(horasTrabalhada) + ")" + "            :" + " R$ "
                + formatador.format(salarioBruto));

        double salarioMenosIR = 0;

        if (salarioBruto >= 900 && salarioBruto < 1500){
            salarioMenosIR = (salarioBruto * 5) / 100;
            double porcentagemIR = 5;
            System.out.println("(-)  IR (" + formatadorPorcent.format(porcentagemIR) + "%)"
                    + "                        :"
                    + " R$ " + formatador.format(salarioMenosIR));
        } else if (salarioBruto >= 1500 && salarioBruto < 2500) {
            salarioMenosIR = (salarioBruto * 10) / 100;
            double porcentagemIR = 10;
            System.out.println("(-)  IR (" + formatadorPorcent.format(porcentagemIR) + "%)"
                    + "                        :"
                    + " R$ " + formatador.format(salarioMenosIR));
        } else if (salarioBruto >= 2500) {
            salarioMenosIR = (salarioBruto * 20) / 100;
            double porcentagemIR = 20;
            System.out.println("(-)  IR (" + formatadorPorcent.format(porcentagemIR) + "%)"
                    + "                        :"
                    + " R$ " + formatador.format(salarioMenosIR));
        } else {
            System.out.println("Sem desconto de IR" + formatador.format(salarioMenosIR));
        }


        double salarioMenosInss = (salarioBruto * 10) / 100;
        System.out.println("(-)  INSS (10%)" + "                     :"
                + " R$ " + formatador.format(salarioMenosInss));

        double salarioMenosFgts = (salarioBruto * 11) / 100;
        System.out.println("FGTS (11%)" + "                          :"
                + " R$ " + formatador.format(salarioMenosFgts));

        double totalDeDescontos = salarioMenosInss + salarioMenosIR;
        System.out.println("Total de descontos" + "                  :"                 + " R$ "
                + formatador.format(totalDeDescontos));

        double salarioLiquido = salarioBruto - salarioMenosInss - salarioMenosIR;
        System.out.println("Salário Liquido" + "                     :"                 + " R$ "
                + formatador.format(salarioLiquido));

    }
}
