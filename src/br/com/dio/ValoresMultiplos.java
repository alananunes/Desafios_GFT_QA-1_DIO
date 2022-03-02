package br.com.dio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ValoresMultiplos {
    public static void calculaMultiplos(){
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Insira primeiro valor");
        a = sc.nextInt();

        System.out.println("Insira segundo valor inteiro");
        b = sc.nextInt();

        if((a % b == 0) || (b % a == 0)){
            System.out.println("OS valores são multiplos entre si");
        }else{
            System.out.println("Os valores não são multiplos entre si.");
        }

    }
}
