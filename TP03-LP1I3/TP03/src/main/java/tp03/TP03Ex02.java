/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 03
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */
package tp03;

import java.util.Scanner;

/**
 * Exercício 02: Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no exercício anterior.  
 */

public class TP03Ex02 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
                
        int choice, h, m, s, number;
        
        System.out.println("Bem vindo ao menu de testes da classe Hora.java! \n");
        
        Hora horario=new Hora();
       
        do{
            System.out.println("Agora escolha qual método utilizar: ");
            System.out.println("1 - Método SetHor(int h)");
            System.out.println("2 - Método SetMin(int m)");
            System.out.println("3 - Método SetSeg(int s)");
            System.out.println("4 - Método SetHor()");
            System.out.println("5 - Método SetMin()");
            System.out.println("6 - Método SetSeg()");
            System.out.println("7 - Método getHor():int");
            System.out.println("8 - Método getMin():int");
            System.out.println("9 - Método getSeg():int");
            System.out.println("10 - Método getHora1(): String");
            System.out.println("11 - Método getHora2(): String");
            System.out.println("12 - Método getSegundos(): int");
            System.out.println("13 - Finalizar programa");
            System.out.println();
            
            while (!read.hasNextInt()) {
                   System.out.println("\n Opção inválida! Escolha um valor entre 1 e 13. \n");
                   read.next();
               }
           choice = read.nextInt();
           System.out.println();
           
           switch(choice){ 
                
                case 1:                 
                    do{
                       System.out.println("Informe o novo valor para a variavel hora (entre 0 e 23): ");
                        while (!read.hasNextInt()) {
                            System.out.println("\n Não é um número!");
                            read.next();
                        }
                    number = read.nextInt();
                    System.out.println();
                   }while (number<0||number>23);
                   h=number;
                   
                    horario.setHor(h);
                    System.out.println("Método finalizado! \n");
                    
                   break;   
                
                case 2:
                   do{
                       System.out.println("Informe o novo valor para a variavel minuto (entre 0 e 59): ");
                        while (!read.hasNextInt()) {
                            System.out.println("\n Não é um número!");
                            read.next();
                        }
                    number = read.nextInt();
                    System.out.println();
                   }while (number<0||number>59);
                   m=number;
                   
                    horario.setMin(m);
                    System.out.println("Método finalizado! \n");
                    
                   break;   
                
                case 3:
                   do{
                       System.out.println("Informe o novo valor para a variavel segundo (entre 0 e 59): ");
                        while (!read.hasNextInt()) {
                            System.out.println("\n Não é um número!");
                            read.next();
                        }
                    number = read.nextInt();
                    System.out.println();
                   }while (number<0||number>59);
                   s=number;
                   
                    horario.setSeg(s);
                    System.out.println("Método finalizado! \n");
                    
                   break;   
                
                case 4:
                   horario.setHor();
                   break;   
                
                case 5:
                   horario.setMin();
                   break;   
                
                case 6:
                   horario.setSeg();
                   break;   
                
                case 7:
                   System.out.println("A hora recebida é "+horario.getHor());
                   System.out.println("Método finalizado! \n");
                   break;   
                
                case 8:
                   System.out.println("O minuto recebido é "+horario.getMin());
                   System.out.println("Método finalizado! \n");
                   break;   
                
                case 9:
                   System.out.println("O segundo recebido é "+horario.getSeg());
                   System.out.println("Método finalizado! \n");
                   break;   
                
                case 10:
                   System.out.println("Hora recebida: "+horario.getHora1()+"\n");
                   break;   
                
                case 11:
                   System.out.println("Hora recebida: "+horario.getHora2()+"\n");
                   break;   
                
                case 12:
                   System.out.println(horario.getHora1()+ " corresponde a "+horario.getSegundos()+" segundos.\n");
                   break;   
                
                case 13:
                   System.out.println("Finalizando o programa. Obrigado!");
                   break;   
                
                default:   
                   System.out.println("Opção inválida! Escolha um valor entre 1 e 13. \n");
                    
           }
            
        }while(choice!=13);
        
        
    }
}
