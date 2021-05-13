/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 02
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */
package tp02;

import java.util.Scanner;

/**
 *Exercicio 08: Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a 
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada 
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições 
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por 
colunas.
 */
public class TP02Ex08 {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        int row=3, col=4,number,mult;        
        int value[][],value2[][];
        value=new int[row][col];
        value2=new int [row][col];
        
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
                value2[i][j]=value[i][j]*mult;
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
        
        System.out.printf("Segunda matriz, com valores multiplicados: \n");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("%5d",value2[i][j],"%5d");
            }
            System.out.printf("\n");
        }
        
    }
}
