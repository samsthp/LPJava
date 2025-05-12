package cefetmg.br.rdc.lista01.calculo;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int codigo1;
        int codigo2;
        int numPeca1;
        int numPeca2;
        double valorPeca1;
        double valorPeca2;
        double valorTotal;

        codigo1 = input.nextInt();
        numPeca1 = input.nextInt();
        valorPeca1 = input.nextDouble();

        codigo2 = input.nextInt();
        numPeca2 = input.nextInt();
        valorPeca2 = input.nextDouble();

        valorTotal = (valorPeca1 * numPeca1) + (valorPeca2 * numPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
}


