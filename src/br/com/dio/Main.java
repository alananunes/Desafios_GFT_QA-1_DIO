package br.com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Desafio 1 - Diferença em Km entre duas motos
        System.out.println("############ Desafio 1 - Diferença em Km entre duas motos #######################################");
        DesafioKm.desafioKM();

        // Desafio 2 - Soma Simples
        System.out.println("############ Desafio 2 - Soma Simples ############################################");
        SomaSimples.soma();

        // Desafio 3 - Divisão
        System.out.println("############ Desafio 3 - Divisão ##################################################");
        Divisao.divisao();

        // Desafio 4 - Verifica se valor encaixa em outro
        System.out.println("############Desafio 4 - Verifica se valor encaixa em outro #######################################");
        EncaixaNaoEncaixa.encaixaValor();

        // Desafio 5 - Verifica se valores são múltiplos entre si
        System.out.println("############ Desafio 5 - Verifica se valores são múltiplos entre si #######################################");
        ValoresMultiplos.calculaMultiplos();

        // Desafio 6 - Verifica Tempo de jogo
        System.out.println("############ Desafio 6 - Verifica Tempo de jogo #######################################");
        TempoJogo.CalculaTempoJogo();

    }
}

