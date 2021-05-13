/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 02
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */
package tp02;

import java.util.Scanner;

/**
 *
 * Exercício 01: Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor. 
 */
public class TP02Ex01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int valor1, valor2;
        System.out.printf("Informe o primeiro valor:\n");
        valor1=ler.nextInt();
        System.out.printf("\n");
        
        System.out.printf("Informe o segundo valor:\n");
        valor2=ler.nextInt();
        System.out.printf("\n");
        
        while(valor2<=valor1){
            System.out.printf("O segundo valor ("+valor2+") deve ser maior que o primeiro ("+valor1+"). Digite o segundo valor:\n");
            valor2=ler.nextInt();
            System.out.printf("\n");
        }
        
        System.out.printf("\n");
        System.out.printf("Primeiro valor digitado: "+valor1+".");
        System.out.printf("\n");
        System.out.printf("Segundo valor digitado: "+valor2+".");
    
    }
    
}
