package cefetmg.br.rdc.lista01.salario;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numero;
        int horas;
        double salario;
        double salarioTotal;

        numero = input.nextInt();
        horas = input.nextInt();
        salario = input.nextDouble();

        salarioTotal = salario * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salarioTotal);
    }
}