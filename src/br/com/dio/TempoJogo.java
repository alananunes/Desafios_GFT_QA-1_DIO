package br.com.dio;

import java.util.Scanner;

public class TempoJogo {
    public static void CalculaTempoJogo(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira primeiro valor");
        int horaInicial = scan.nextInt();
        System.out.println("Insira primeiro valor");
        int horaFinal = scan.nextInt();

        if (horaInicial == 0 && horaFinal ==0){
            System.out.println("O jogo durou 24 horas");
        }else if(horaInicial > horaFinal){
            System.out.println("O jogo durou " + (24-horaInicial)+horaFinal + "Horas");
        }else if(horaInicial < horaFinal){
            System.out.println("O jogo durou " + (horaFinal  - horaInicial) + "Horas");
        }else{
            System.out.println("Não teve jogo ou durou menos de 1 hora");
        }

    }
}
