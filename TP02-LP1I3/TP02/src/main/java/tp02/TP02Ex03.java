/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 02
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */
package tp02;

import java.util.Scanner;

/**
 *Exercicio 03: Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de 
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não 
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a 
digitação dos “N” valores, exibir: 
a. O maior valor; 
b. O menor valor; 
c. A soma dos valores; 
d. A média aritmética dos valores; 
e. A porcentagem de valores que são positivos; 
f. A porcentagem de valores negativos; 
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do 
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o 
programa em função dessa resposta.
 */
public class TP02Ex03 {
    public static void main(String[] args){
        
        boolean menu=true;
        do{
        
        Scanner ler = new Scanner(System.in);
        
        int qtde, number;
        
        do {
            System.out.println("Informe o quantidade de números que deseja digitar (entre 1 e 20): \n");
            while (!ler.hasNextInt()) {
                System.out.printf("\n");
                System.out.println("Não é um número! Informe o quantidade de números que deseja digitar (entre 1 e 20): \n");
                ler.next();
            }
            qtde = ler.nextInt();
            System.out.printf("\n");
            } while (qtde <= 0||qtde>20);
        
            System.out.printf("\n");
        
        int[] value;
        value=new int[qtde];
        int maior=0;
        int menor=0;
        int soma=0;
        int media;
        int negativo=0;
        int positivo=0;
        int pcneg;
        int pcpos;
                
        for(int i=0;i<qtde;i++){
            System.out.println("Informe o "+(i+1)+"º valor : \n");
            while (!ler.hasNextInt()) {
                System.out.println("\nNão é um número! Informe o "+(i+1)+"º valor : \n");
                ler.next();
            }
            number = ler.nextInt();          
            value[i]=number;
            System.out.printf("\n");
            
            if(i==0){
            menor=number;
            maior=number;
            }
            
            if(number>maior){
                maior=number;
            }
                        
            if(number<menor){
                    number=menor;
            }
            
            soma=soma+number;
            
            if(number>=0){
            positivo=positivo+1;
            }
            else{
                negativo=negativo+1;
            }
            
        }
             
        media=soma/value.length;
        pcneg=(negativo*100)/qtde;
        pcpos=(positivo*100)/qtde;
        
        System.out.println("O maior valor digitado é "+maior+".\n");
        System.out.println("O menor valor digitado é "+menor+".\n");
        System.out.println("A soma dos valores digitados é "+soma+".\n");
        System.out.println("A média dos valores digitados é "+media+".\n");
        System.out.println("Valores positivos: "+pcpos+"%.\n");
        System.out.println("Valores negativos: "+pcneg+"%.\n");
        
        String option;
        do{
            System.out.println("\nDeseja executar o programa novamente? Digite 'S' ou 'N'.\n");
            option=ler.next();
            System.out.printf("\n");
        }while(!"S".equals(option)&&!"N".equals(option));
        
        if("N".equals(option)){
            menu=false;
        }
        
        }while(menu==true);      
    }
}
