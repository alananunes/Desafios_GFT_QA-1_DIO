package br.com.dio;

import java.util.Scanner;

public class SomaSimples {
    public static void soma(){
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira primeiro valor");
        a = sc.nextInt();

        System.out.println("Insira um segundo valor");
        b = sc.nextInt();;

        int soma = a + b;

        System.out.println("Soma = " +soma);

    }
}
