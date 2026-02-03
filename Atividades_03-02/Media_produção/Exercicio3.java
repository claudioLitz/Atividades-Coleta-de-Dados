/*
Exercício 3: Média de Produção de um Turno (Ciclos/Loops) 
Objetivo: Calcular a média de peças produzidas numa linha de montagem durante 
5 horas. 
● Utiliza um ciclo for ou while para pedir ao utilizador 5 valores (produção por 
hora). 
● No final, calcula e exibe a soma total e a média horária.
 */


import java.util.Random;


public class Exercicio3 { 
    public static void main(String[] args) { 

        Random gerador = new Random(); //Abre o gerador de números aleatórios
        int somaTotal = 0; 
        int i = 0; //Variavel de controle do loop, 
        double media;


        //------------------------------Variaveis mutaveis pelo usuário----------------------------------------//
        //max -> maximo dos valores que podem ser atingido pelo gerador de números random
        //min -> minimo dos valores que podem ser atingido pelo gerador de números random
        //horas -> quantos valores irá ser feito a média (x pçs/h)
        int max = 100, min = 50 , horas = 5;


        System.out.println("Números aleatórios sendo gerados...");
        while (true){
            i++;

            //Gerador random num determinado intervalo
            int numero = gerador.nextInt((max - min ) + 1) + min;
            System.out.println(numero);
            somaTotal = somaTotal + numero;

            //Condicional para quebrar o loop
            if (i == horas){
                media = somaTotal / i;
                break;
            }
        }

        //Imprime o resultado final
        System.out.println("A média final ficou: " + media);

    } 
} 