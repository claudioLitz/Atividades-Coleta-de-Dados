/*
Exercício 1: Leitura de Dados de Sensores (Variáveis e Entrada/Saída) 
Objetivo: Criar um programa que simule a identificação de um sensor no sistema. 
● Pede ao utilizador o nome do sensor (Ex: "PT100"). 
● Pede o valor da leitura (Ex: 25.5). 
● Exibe no ecrã a mensagem: "Sensor [NOME] registado com o valor [VALOR] 
unidades." 
 */

//import library
import java.util.Scanner; 

public class Exercicio1 { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 

        //Sensor name scanned
        System.out.print("Digite por favor o nome do sensor: ");
        String sensor = input.nextLine();

        //Sensor value scanned
        System.out.print("Digite o valor registrado da leitura: ");
        int leitura = input.nextInt();

        //Scan buffer cleaned
        input.nextLine();

        //Print the message 
        System.out.println("Sensor " + sensor + " registrado com o valor " + leitura + " unidades");
        input.close(); 
    } 
} 