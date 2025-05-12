package cefetmg.br.rdc.lista01.media2;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double media;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
