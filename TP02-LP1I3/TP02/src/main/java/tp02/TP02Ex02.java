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
 * Exercício 02: Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. Após a digitação, exibir: 
    a. O maior valor; 
    b. A soma dos valores; 
    c. A média aritmética dos valores.
 */
public class TP02Ex02 {
    public static void main(String[] args){
     
       Scanner ler = new Scanner(System.in);
       
        int[] value;
        value=new int[10];
        int number;
        int maior=0, soma=0, media;
        
        for(int i=0;i<10;i++){
            do {
            System.out.println("Informe o "+(i+1)+"º valor (deve ser positivo): \n");
            while (!ler.hasNextInt()) {
                System.out.println("Não é um número!");
                ler.next();
            }
            number = ler.nextInt();
            } while (number <= 0);
            
            value[i]=number;
            
            if(number>maior){
                maior=number;
            }
            
            soma=soma+number;
            
            System.out.printf("\n");
        }
        
        media=soma/value.length;
        
        System.out.printf("O maior valor digitado é "+maior+".\n");
        System.out.printf("\n");
        
        System.out.printf("A soma dos valores é "+soma+".\n");
        System.out.printf("\n");
        
        System.out.printf("A média dos valores é "+media+".\n");
        System.out.printf("\n");
        
        }
        
    }
