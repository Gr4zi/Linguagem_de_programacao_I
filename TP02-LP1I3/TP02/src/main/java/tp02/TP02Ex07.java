/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 02
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */
package tp02;

import java.util.Scanner;

/**
 *Exercicio 07: Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a 
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada 
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes. 
 */
public class TP02Ex07 {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        int row=3, col=4,number,mult;        
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
        
        System.out.printf("Valores digitados na matriz: \n");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println((i+1)+"ª linha e "+(j+1)+"ª coluna: "+value[i][j]+".");
            }
        }
        
        System.out.printf("\n");
        
        do{
            System.out.println("Informe o valor que deseja multiplicar a matriz: ");    
            while (!read.hasNextInt()) {
                System.out.println("Não é um número!");
                read.next();
            }
            number = read.nextInt();
            } while (number <= 0);
        mult=number;
        
        System.out.printf("\n");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                value[i][j]=value[i][j]*mult;
            }
        }
        
        System.out.printf("Valores encontrados após a multiplicação da matriz com o valor digitado: \n");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println((i+1)+"ª linha e "+(j+1)+"ª coluna: "+value[i][j]+".");
            }
        }
        
    }
}
