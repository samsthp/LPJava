package cefetmg.br.rdc.lista01.sort;

import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[3];
        int k;

        for(k = 0; k < 3; k++){
            numeros[k] = input.nextInt();
        }

        int[] ordem = Arrays.copyOf(numeros, 3);

        Arrays.sort(ordem);

        for(k = 0; k < 3; k++){
            System.out.println(ordem[k]);
        }

        System.out.println();

        for (k = 0; k < 3; k++){
            System.out.println(numeros[k]);
        }
    }
}
