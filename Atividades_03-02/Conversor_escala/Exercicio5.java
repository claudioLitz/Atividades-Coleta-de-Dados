/*
Exercício 5: Conversor de Escala Analógica (Métodos/Funções) 
Objetivo: Criar um método reutilizável para converter dados brutos de um PLC. 
● Cria um método chamado converterEscala que recebe um valor de 0 a 1023 
(resolução de 10 bits) e o converte para uma escala de 0 a 100%. 
● Fórmula: (valor / 1023.0) * 100. 
*/



public class Exercicio5 { 
    public static void main(String[] args) { 
    double valorBruto = 512; 
    String resultado = String.format("%.2f", converterEscala(valorBruto));
    System.out.println("O valor na escala de 0-100% é: " + resultado); 
    } 


    public static double converterEscala(double valorBruto){
        return (valorBruto / 1023.0) * 100;

    }
} 