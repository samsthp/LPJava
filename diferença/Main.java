package cefetmg.br.rdc.lista01.diferença;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int dfca;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        dfca = ((a * b) - (c * d));

        System.out.println("DIFERENCA = " + dfca);
    }
}
