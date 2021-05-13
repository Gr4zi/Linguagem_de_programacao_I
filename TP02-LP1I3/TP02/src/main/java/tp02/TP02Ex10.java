/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 02
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */
package tp02;

import java.util.Scanner;

/**
 *Exercicio 10: Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,sendo que no máximo será de ordem 10 e quadrática.
 * Após a digitação dos elementos, calcular e exibir a matriz inversa.
 * Exibir as matrizes na tela, sob a forma matricial (linhas x colunas).
 */
public class TP02Ex10 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        int mn, number;
        double value[][],number2;
        
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
       
        System.out.printf("Primeira matriz, com valores digitados: \n");
        for(int i=0;i<mn;i++){
            for(int j=0;j<mn;j++){
                System.out.printf(" |  "+value[i][j]+"  | ");
            }
            System.out.printf("\n");
        }
        
        System.out.printf("\n");
              
        double value2[][]=invert(value);
        
        System.out.printf("Matriz inversa: \n");
        for(int i=0;i<mn;i++){
            for(int j=0;j<mn;j++){
                System.out.printf(" |  "+value2[i][j]+"  | ");
            }
            System.out.printf("\n");
        }
        
    }
    
    public static double[][] invert(double value[][]) 
    {
        int n = value.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i=0; i<n; ++i) 
            b[i][i] = 1;
 
 // Transform the matrix into an upper triangle
        gaussian(value, index);
 
 // Update the matrix b[i][j] with the ratios stored
        for (int i=0; i<n-1; ++i)
            for (int j=i+1; j<n; ++j)
                for (int k=0; k<n; ++k)
                    b[index[j]][k]
                    	    -= value[index[j]][i]*b[index[i]][k];
 
 // Perform backward substitutions
        for (int i=0; i<n; ++i) 
        {
            x[n-1][i] = b[index[n-1]][i]/value[index[n-1]][n-1];
            for (int j=n-2; j>=0; --j) 
            {
                x[j][i] = b[index[j]][i];
                for (int k=j+1; k<n; ++k) 
                {
                    x[j][i] -= value[index[j]][k]*x[k][i];
                }
                x[j][i] /= value[index[j]][j];
            }
        }
        return x;
    }
 
// Method to carry out the partial-pivoting Gaussian
// elimination.  Here index[] stores pivoting order.
 
    public static void gaussian(double value[][], int index[]) 
    {
        int n = index.length;
        double c[] = new double[n];
 
 // Initialize the index
        for (int i=0; i<n; ++i) 
            index[i] = i;
 
 // Find the rescaling factors, one from each row
        for (int i=0; i<n; ++i) 
        {
            double c1 = 0;
            for (int j=0; j<n; ++j) 
            {
                double c0 = Math.abs(value[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }
 
 // Search the pivoting element from each column
        int k = 0;
        for (int j=0; j<n-1; ++j) 
        {
            double pi1 = 0;
            for (int i=j; i<n; ++i) 
            {
                double pi0 = Math.abs(value[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) 
                {
                    pi1 = pi0;
                    k = i;
                }
            }
 
   // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i=j+1; i<n; ++i) 	
            {
                double pj = value[index[i]][j]/value[index[j]][j];
 
 // Record pivoting ratios below the diagonal
                value[index[i]][j] = pj;
 
 // Modify other elements accordingly
                for (int l=j+1; l<n; ++l)
                    value[index[i]][l] -= pj*value[index[j]][l];
            }
        }
    }
}