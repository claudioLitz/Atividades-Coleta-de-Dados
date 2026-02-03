/*
Exercício 4: Histórico de Estados da Máquina (Arrays/Vetores) 
Objetivo: Armazenar e analisar o estado de uma máquina durante o dia. 
● Cria um array de inteiros de tamanho 4. 
● Preenche o array com estados (0 para "Parada", 1 para "Em Operação"). 
● Percorre o array e conta quantas vezes a máquina esteve "Em Operação". 
 */


public class Exercicio4 { 
    public static void main(String[] args) { 
        int[] historico = {1, 0, 1, 1}; //Array exemplo
        int TotalOperacao = 0; //Quantidade total de vezes que a máquina esteve "Em Operação"


        //Loop responsavel por percorrer cada um dos indices do array e conferir se é igual 1 ("Em Operação")
        for (int i = 0; i < historico.length; i++){
            if (historico[i] = 1){

                //Se o valor era igual 1, aumenta o valor de TotalOperacao em mais 1
                TotalOperacao++;
            } 
        }
    } 
} 