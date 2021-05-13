/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 02
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */
package tp02;

import java.util.Scanner;

/**
 *Exercicio 11: Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo será de ordem 10 e quadrática.
 * Após a digitação dos elementos, calcular e exibir determinante da matriz.
 */
public class TP02Ex11 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        int mn, number;
        double value[][],number2,x;
        
        do{
            System.out.println("Informe o total de linhas e colunas da matriz quadrada (até 10): ");    
            while (!read.hasNextInt()) {
                System.out.println("Não é um número!");
                read.next();
            }
            number = read.nextInt();
            } while (number <= 0||number>10);
        mn=number;
        
        System.out.printf("\n");
        
        value=new double[mn][mn];
        
        for(int i=0;i<mn;i++){
            for(int j=0;j<mn;j++){
                System.out.println("Informe o valor da "+(i+1)+"ª linha e "+(j+1)+"ª coluna: ");
                while (!read.hasNextDouble()) {
                    System.out.println("Não é um número! Digite um número válido: ");
                    read.next();
                    System.out.printf("\n");
                }
                number2 = read.nextDouble();
                value[i][j]=number2;
                System.out.printf("\n");
            }
        }
        
        System.out.printf("\n");
       
        System.out.printf("Matriz, com valores digitados: \n");
        for(int i=0;i<mn;i++){
            for(int j=0;j<mn;j++){
                System.out.printf(" |  "+value[i][j]+"  | ");
            }
            System.out.printf("\n");
        }
        
        System.out.printf("\n");
        
        x=laplace(value);
        
        System.out.println("A determinante da matriz é: "+x+".");
        
    }    
    
    public static double laplace(double[][] value) {
        double determinante = 0;
        if (value.length == 1) {
            determinante = value[0][0];
        } else if (value.length == 2) {
            determinante = value[0][0] * value[1][1] - value[0][1] * value[1][0];
        } else if (value.length == 3) {
            determinante = value[0][0] * value[1][1] * value[2][2]
                    + value[0][1] * value[1][2] * value[2][0]
                    + value[0][2] * value[1][0] * value[2][1]
                    - value[0][2] * value[1][1] * value[2][0]
                    - value[0][0] * value[1][2] * value[2][1]
                    - value[0][1] * value[1][0] * value[2][2];
        } else {
            double[][] aux;
            int i_aux, j_aux, linha, coluna, i;

            for (i = 0; i < value.length; i++) {
                if (value[0][i] != 0) {
                    aux = new double[value.length - 1][value.length - 1];
                    i_aux = 0;
                    j_aux = 0;
                    for (linha = 1; linha < value.length; linha++) {
                        for (coluna = 0; coluna < value.length; coluna++) {
                            if (coluna != i) {
                                aux[i_aux][j_aux] = value[linha][coluna];
                                j_aux++;
                            }
                        }
                        i_aux++;
                        j_aux = 0;
                    }
                    determinante += Math.pow(-1, i) * value[0][i] * laplace(aux);
                }

            }
        }
        return determinante;
    }
    
}
