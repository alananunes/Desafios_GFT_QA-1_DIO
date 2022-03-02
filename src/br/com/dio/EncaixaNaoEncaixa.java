package br.com.dio;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EncaixaNaoEncaixa {
    public static void encaixaValor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidadde de testes");
        int count = scan.nextInt();
        int a, b;

        for (int i = 0; i < count; i++){
            System.out.println("Insira valor 1");
                 a = scan.nextInt();
            System.out.println("Insira valor 2");
                 b = scan.nextInt();
            //convertendo para String os valores inteiros
            String valorA = Integer.toString(a);
            String valorB = Integer.toString(b);

            if(valorA.endsWith(valorB)){
                System.out.println("encaixa");
            }else{
                System.out.println("Não Encaixa");
            }


        }


    }
}
