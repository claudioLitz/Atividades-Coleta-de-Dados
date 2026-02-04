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

        Random gerador = new Random(); //Open random numbers generator
        int somaTotal = 0; 
        int i = 0; //Loop control variable  
        double media;

        //------------------------------Variable Change by User----------------------------------------//
        //max -> Maximum value of random number generator
        //min -> Minimun value of random number generator
        //horas -> How many itens will be analyzed
        int max = 100, min = 50 , horas = 5;


        System.out.println("Números aleatórios sendo gerados...");
        while (true){
            i++;

            //Random number generator in a given range
            int numero = gerador.nextInt((max - min ) + 1) + min;
            System.out.println(numero);
            somaTotal = somaTotal + numero;

            //Break loop condition
            if (i == horas){
                media = somaTotal / i;
                break;
            }
        }

        //Final print
        System.out.println("A média final ficou: " + media);

    } 
} 