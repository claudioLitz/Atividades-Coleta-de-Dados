/*
Exercício 4: Histórico de Estados da Máquina (Arrays/Vetores) 
Objetivo: Armazenar e analisar o estado de uma máquina durante o dia. 
● Cria um array de inteiros de tamanho 4. 
● Preenche o array com estados (0 para "Parada", 1 para "Em Operação"). 
● Percorre o array e conta quantas vezes a máquina esteve "Em Operação". 
 */


public class Exercicio4 { 
    public static void main(String[] args) { 
        int[] historico = {1, 0, 1, 1}; //Array exemple 
        int TotalOperacao = 0; //Total times that the machine was in "Em Operação"


        //Loop to analyze each index of array, if it is equals 1 ("Em Operação")
        for (int i = 0; i < historico.length; i++){
            if (historico[i] = 1){


                //If the value is equals "1", sum 1 in TotalOperacao
                TotalOperacao++;
            } 
        }
    } 
} 