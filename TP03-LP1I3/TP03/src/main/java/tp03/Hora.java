/*
 * IFSP - Campus Cubatão - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 03
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */

package tp03;

import java.util.Scanner;

public class Hora {
   private int hora=0;
   private int min=0;
   private int seg=0;
   
   public Hora(){ //Construtor que recebe os dados e atribui na classe
       Scanner read = new Scanner(System.in);
       int number;

       do{
           System.out.println("Informe o valor da hora (entre 0 e 23): ");
           while (!read.hasNextInt()) {
                   System.out.println("\n Não é um número!");
                   read.next();
               }
           number = read.nextInt();
           System.out.println();
       } while (number<0||number>23);   
       hora=number;

       do{
           System.out.println("Informe o valor do minuto (entre 0 e 59): ");
           while (!read.hasNextInt()) {
                   System.out.println("\n Não é um número!");
                   read.next();
               }
           number = read.nextInt();
           System.out.println();
       } while (number<0||number>59);   
       min=number;

       do{
           System.out.println("Informe o valor do segundo (entre 0 e 59): ");
           while (!read.hasNextInt()) {
                   System.out.println("\n Não é um número!");
                   read.next();
               }
           number = read.nextInt();
           System.out.println();
       } while (number<0||number>59);   
       seg=number;

    }   //Construtor que recebe os dados e atribui na classe  
   
   public Hora(int h, int m, int s){   //Construtor que recebe os dados e inicializa as propriedades da classe
       hora=h;
       min=m;
       seg=s;
   }   //Construtor que recebe os dados e inicializa as propriedades da classe
   
   public void setHor(int h){   //Setter da variavel hora
       this.hora=h;
   }   //Setter da variavel hora
     
   public void setMin(int m){   //Setter da variavel minuto
       this.min=m;
   }   //Setter da variavel minuto
      
   public void setSeg(int s){   //Setter da variavel segundo
       this.seg=s;
   }   //Setter da variavel segundo
   
   public void setHor(){   //Recebe e atribui um valor a variavel hora
       Scanner read = new Scanner(System.in);
       int number;
       
       do{
        System.out.println("Informe o valor da hora (entre 0 e 23): ");
        while (!read.hasNextInt()) {
                System.out.println("\n Não é um número!");
                read.next();
            }
        number = read.nextInt();
        System.out.println();
        } while (number<0||number>23);   
        hora=number;
   }   //Recebe e atribui um valor a variavel hora
   
   public void setMin(){   //Recebe e atribui um valor a variavel minuto
       Scanner read = new Scanner(System.in);
       int number;
       
       do{
        System.out.println("Informe o valor do minuto (entre 0 e 59): ");
        while (!read.hasNextInt()) {
                System.out.println("\n Não é um número!");
                read.next();
            }
        number = read.nextInt();
        System.out.println();
        } while (number<0||number>59);   
        min=number;
   }   //Recebe e atribui um valor a variavel minuto
   
   public void setSeg(){   //Recebe e atribui um valor a variavel segundo
       Scanner read = new Scanner(System.in);
       int number;
       
       do{
        System.out.println("Informe o valor do segundo (entre 0 e 59): ");
        while (!read.hasNextInt()) {
                System.out.println("\n Não é um número!");
                read.next();
            }
        number = read.nextInt();
        System.out.println();
        } while (number<0||number>59);   
        seg=number;
   }   //Recebe e atribui um valor a variavel segundo
   
   public int getHor(){   //Getter da variavel hora
       return hora;
   }   //Getter da variavel hora   
   
   public int getMin(){   //Getter da variavel minuto
       return min;
   }   //Getter da variavel minuto   
   
   public int getSeg(){   //Getter da variavel segundo
       return seg;
   }   //Getter da variavel segundo   
   
   public String getHora1(){   //Devolve a hora recebida      
       return String.format("%02d", hora)+":"+String.format("%02d", min)+":"+String.format("%02d", seg);
   }   //Devolve a hora recebida
   
   public String getHora2(){   //Devolve a hora recebida em AM/PM
       if(hora<12){
          return String.format("%02d", hora)+":"+String.format("%02d", min)+":"+String.format("%02d", seg)+" (AM)"; 
       }
       else{
          return String.format("%02d", hora-12)+":"+String.format("%02d", min)+":"+String.format("%02d", seg)+" (PM)";
       }
   }   //Devolve a hora recebida em AM/PM
   
   public int getSegundos(){   //Devolve a quantidade de segundos da hora recebida
       int segundos=(hora*3600)+(min*60)+seg;
       return segundos;
   }   //Devolve a quantidade de segundos da hora recebida
   
}