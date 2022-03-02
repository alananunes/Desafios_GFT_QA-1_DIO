package br.com.dio;

import java.util.Scanner;

public class DesafioKm {

    public static void desafioKM(){
        int km;
        System.out.println("Insira a km de  distancia");
        Scanner leitor = new Scanner(System.in);
         km = leitor.nextInt();
        int minutos = (km * 2)/1;

        System.out.println(minutos + " minutos");
    }
}
