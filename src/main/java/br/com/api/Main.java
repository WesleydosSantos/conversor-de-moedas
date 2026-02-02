package br.com.api;

import java.util.Scanner;

import br.com.api.conversor.ConversorDeMoeda;
import br.com.api.model.Menu;
import br.com.api.model.Moeda;
import br.com.api.model.MoedaEnum;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoeda conversorDeMoeda = new ConversorDeMoeda();
        Menu menu = new Menu();

        boolean ficar = true;
        double valor;
        Moeda moeda = new Moeda();

        while (ficar) {
            menu.escolheOpcao();
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nInforme o valor que deseja converter: ");
                    valor = scanner.nextDouble();
                    moeda = conversorDeMoeda.converterMoeda(MoedaEnum.USD, MoedaEnum.ARS, valor);
                    System.out.println("\nO valor de " + valor + " [" + MoedaEnum.USD + "]"
                            + " corresponde ao valor final de --> "
                            + moeda.getResultadoConversao()
                            + " [" + MoedaEnum.ARS
                            + "]");
                    break;
                case 2:
                    System.out.println("\nInforme o valor que deseja converter: ");
                    valor = scanner.nextDouble();
                    moeda = conversorDeMoeda.converterMoeda(MoedaEnum.ARS, MoedaEnum.USD, valor);
                    System.out.println("\nO valor de " + valor + " [" +
                            MoedaEnum.ARS + "]"
                            + " corresponde ao valor final de --> " + moeda.getResultadoConversao()
                            + " [" + MoedaEnum.USD
                            + "]");
                    break;
                case 3:
                    System.out.println("\nInforme o valor que deseja converter: ");
                    valor = scanner.nextDouble();
                    moeda = conversorDeMoeda.converterMoeda(MoedaEnum.USD, MoedaEnum.BRL, valor);
                    System.out.println("\nO valor de " + valor + " [" +
                            MoedaEnum.USD + "]"
                            + " corresponde ao valor final de --> " + moeda.getResultadoConversao() + " [" +
                            MoedaEnum.BRL
                            + "]");
                    break;
                case 4:
                    System.out.println("\nInforme o valor que deseja converter: ");
                    valor = scanner.nextDouble();
                    moeda = conversorDeMoeda.converterMoeda(MoedaEnum.BRL, MoedaEnum.USD, valor);
                    System.out.println("\nO valor de " + valor + " [" +
                            MoedaEnum.BRL + "]"
                            + " corresponde ao valor final de --> " + moeda.getResultadoConversao() + " [" +
                            MoedaEnum.USD
                            + "]");
                    break;
                case 5:
                    System.out.println("\nInforme o valor que deseja converter: ");
                    valor = scanner.nextDouble();
                    moeda = conversorDeMoeda.converterMoeda(MoedaEnum.USD, MoedaEnum.COP, valor);
                    System.out.println("\nO valor de " + valor + " [" +
                            MoedaEnum.USD + "]"
                            + " corresponde ao valor final de --> " + moeda.getResultadoConversao() + " [" +
                            MoedaEnum.COP
                            + "]");
                    break;
                case 6:
                    System.out.println("\nInforme o valor que deseja converter: ");
                    valor = scanner.nextDouble();
                    moeda = conversorDeMoeda.converterMoeda(MoedaEnum.COP, MoedaEnum.USD, valor);
                    System.out.println("\nO valor de " + valor + " [" +
                            MoedaEnum.COP + "]"
                            + " corresponde ao valor final de --> " + moeda.getResultadoConversao() + " [" +
                            MoedaEnum.USD
                            + "]");
                    break;
                case 7:
                    System.out.println("\nSaindo, até logo!");
                    ficar = false;
                    break;
                default:
                    System.out.println("\nOpcao invalida");
                    break;
            }
        }

        scanner.close();
    }
}