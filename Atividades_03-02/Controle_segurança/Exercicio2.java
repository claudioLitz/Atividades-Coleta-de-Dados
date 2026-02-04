/*
Exercício 2: Controlo de Segurança de um Tanque (Condicionais) 
Objetivo: Implementar uma lógica de intertravamento simples. 
● Lê um valor inteiro que representa o nível de um tanque (0 a 100%). 
● Se o nível for maior ou igual a 90, exibe: "ALERTA: Nível Crítico - Abrir 
Válvula de Escoamento!". 
● Se for menor que 10, exibe: "ALERTA: Nível Baixo - Ativar Bomba de 
Enchimento!". 
● Caso contrário, exibe: "Sistema Estável". 
 */




public class Exercicio2 { 
    public static void main(String[] args) { 

        //Define variables
        int nivelTanque = 95; 
        String log;

        //Log defined by the trigger corresponding
        if (nivelTanque >= 90){
            log = "ALERTA: Nível Crítico - Abrir Válvula de Escoamento!";
        }
        else if (nivelTanque < 10 ){ 
            log = "ALERTA: Nível Baixo - Ativar Bomba de Enchimento!";
        } else {
            log = "Sistema Estável";
        }

        //Log printed
        System.out.println(log);
    } 
} 