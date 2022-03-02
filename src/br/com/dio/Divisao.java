package br.com.dio;

import java.util.Scanner;

public class Divisao {
    public static void divisao(){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira a quantidade de testes:");
        int N = leitor.nextInt();

        int a, b;

        for (int i = 0; i < N; i ++){
            System.out.println("Insira primeiro valor ");
                 a = leitor.nextInt();
            System.out.println("Insira segundo valor ");
                 b = leitor.nextInt();

            if( b == 0){
                System.out.println("Divisão Impóssivel");
            }else{
                System.out.println("A divisão é: " + (double)a/b );
            }

        }

    }

}
