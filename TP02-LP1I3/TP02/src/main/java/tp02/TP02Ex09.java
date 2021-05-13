/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 02
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */
package tp02;

import java.util.Scanner;

/**
 *Exercicio 09: Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário, 
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos 
elementos, calcular e exibir a matriz transposta.
 */
public class TP02Ex09 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        int row, col, number;
        int value[][],value2[][];
        
        do{
            System.out.println("Informe o total de linhas da matriz (até 10): ");    
            while (!read.hasNextInt()) {
                System.out.println("Não é um número!");
                read.next();
            }
            number = read.nextInt();
            } while (number <= 0||number>10);
        row=number;
        
        System.out.printf("\n");
        
        do{
            System.out.println("Informe o total de colunas da matriz (até 10): ");    
            while (!read.hasNextInt()) {
                System.out.println("Não é um número!");
                read.next();
            }
            number = read.nextInt();
            } while (number <= 0||number>10);
        col=number;
        
        System.out.printf("\n");
        
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
        
        value2=new int[col][row];
        
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                value2[i][j]=value[j][i];
            }
        }
        
        System.out.printf("Primeira matriz, com valores digitados: \n");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("%5d",value[i][j],"%5d");
            }
            System.out.printf("\n");
        }
        
        System.out.printf("\n");
        
        System.out.printf("Matriz transposta: \n");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.printf("%5d",value2[i][j],"%5d");
            }
            System.out.printf("\n");
        }
        
        System.out.printf("\n");
        
    }
}
