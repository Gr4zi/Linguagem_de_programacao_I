/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 02
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */
package tp02;

import java.util.Scanner;

/**
 *Exercicio 06: Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela. 
 */
public class TP02Ex06 {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        int row=2, col=3,number;        
        String names[][];
        names=new String[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Informe o nome da "+(i+1)+"ª linha e "+(j+1)+"ª coluna: ");
                names[i][j]=read.next();
                System.out.printf("\n");
            }
        }
        
        System.out.printf("\n");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Nome da "+(i+1)+"ª linha e "+(j+1)+"ª coluna: "+names[i][j]+".");
            }
        }
        
    }
}