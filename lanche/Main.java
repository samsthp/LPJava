package cefetmg.br.rdc.lista01.lanche;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numproduto;
        int quantidade;
        double valor;

        numproduto = input.nextInt();
        quantidade = input.nextInt();

        switch (numproduto) {
            case 1:
                valor = 4.0 * quantidade;
                System.out.printf("Total: R$ %.2f\n", valor);
                break;
            case 2:
                valor = 4.5 * quantidade;
                System.out.printf("Total: R$ %.2f\n", valor);
                break;
            case 3:
                valor = 5.0 * quantidade;
                System.out.printf("Total: R$ %.2f\n", valor);
                break;
            case 4:
                valor = 2.0 * quantidade;
                System.out.printf("Total: R$ %.2f\n", valor);
                break;
            case 5:
                valor = 1.5 * quantidade;
                System.out.printf("Total: R$ %.2f\n", valor);
                break;
        }
    }
}

