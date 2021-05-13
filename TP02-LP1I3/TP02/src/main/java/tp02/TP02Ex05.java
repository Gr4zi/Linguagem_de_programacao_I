/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 02
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */
package tp02;

import java.util.Scanner;

/**
 *Exercicio 05: Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela. 
 */
public class TP02Ex05 {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        int row=3, col=2,number;        
        int value[][];
        value=new int[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Informe o valor da "+(i+1)+"ª linha e "+(j+1)+"ª coluna: ");
                while (!read.hasNextInt()) {
                    System.out.println("Não é um número! Digite um número válido: ");
                    read.next();
                    System.out.printf("\n");
                }
                number = read.nextInt();
                value[i][j]=number;
                System.out.printf("\n");
            }
        }
        
        System.out.printf("\n");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Valor da "+(i+1)+"ª linha e "+(j+1)+"ª coluna: "+value[i][j]+".");
            }
        }
        
    }
}