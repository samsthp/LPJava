package cefetmg.br.rdc.lista01.extremamente;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        int a;
        int b;
        int x;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();

        x = a + b;

        System.out.println("X = " + x);
    }
}
