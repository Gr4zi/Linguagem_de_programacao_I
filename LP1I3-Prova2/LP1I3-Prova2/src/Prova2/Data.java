package Prova2;

/*
 * IFSP - Campus Cubatão - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Prova 2
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */

import java.util.Scanner;
import java.text.*;
import java.util.*;

 public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    Scanner read = new Scanner(System.in);
    int number, diastranscorridos;
    String mesporextenso;
    boolean bissexto=false;

    //Construtor que recebe os dados e atribui na classe - Inicio
    public Data(){
        do{
            System.out.println("Informe o valor do ano (entre 1900 e 2100): ");
            while(!read.hasNextInt()){
                System.out.println("\n Não é um número!");
                read.next();
            }
            number=read.nextInt();
            System.out.println();
        }while(number<1900||number>2100);
        ano=number;

        do{
            System.out.println("Informe o valor do mês (entre 1 e 12): ");
            while(!read.hasNextInt()){
                System.out.println("\n Não é um número!");
                read.next();
            }
            number=read.nextInt();
            System.out.println();
        }while(number<1||number>12);
        mes=number;

        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                do{
                    System.out.println("Informe o valor do dia (entre 1 e 31): ");
                    while(!read.hasNextInt()){
                        System.out.println("\n Não é um número!");
                        read.next();
                    }
                    number=read.nextInt();
                    System.out.println();
                }while(number<1||number>31);
                dia=number;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                do{
                    System.out.println("Informe o valor do dia (entre 1 e 30): ");
                    while(!read.hasNextInt()){
                        System.out.println("\n Não é um número!");
                        read.next();
                    }
                    number=read.nextInt();
                    System.out.println();
                    }while(number<1||number>30);
                dia=number;
                break;

            case 2:
                if(ano%400==0||(ano%4==0&&ano%100!=0)){
                    do{
                        System.out.println("Informe o valor do dia (entre 1 e 29): ");
                        while(!read.hasNextInt()){
                            System.out.println("\n Não é um número!");
                            read.next();
                        }
                        number=read.nextInt();
                        System.out.println();
                    }while(number<1||number>29);
                    dia=number;
                }

                else{
                    do{
                        System.out.println("Informe o valor do dia (entre 1 e 28): ");
                        while(!read.hasNextInt()){
                            System.out.println("\n Não é um número!");
                            read.next();
                        }
                        number=read.nextInt();
                        System.out.println();
                    }while(number<1||number>28);
                    dia=number;
                }
        }       

    }
    //Construtor que recebe os dados e atribui na classe - Fim

    //Construtor que recebe os dados e inicializa as propriedades da classe - Inicio
    public Data(int d, int m, int a){

        dia=d;
        mes=m;
        ano=a;

    }
    //Construtor que recebe os dados e inicializa as propriedades da classe - Fim

    //Setter da variavel dia - Inicio
    public void entraDia(int d){
        this.dia=d;
    }
    //Setter da variavel dia - Fim

    //Setter da variavel mes - Inicio
    public void entraMes(int m){
        this.mes=m;
    }
    //Setter da variavel mes - Fim

    //Setter da variavel ano - Inicio
    public void entraAno(int a){
        this.ano=a;
    }
    //Setter da variavel ano - Fim

    //Recebe e atribui um valor a variavel dia - Inicio
    public void entraDia(){
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                do{
                    System.out.println("Informe o novo valor para o dia (entre 1 e 31): ");
                    while(!read.hasNextInt()){
                        System.out.println("\n Não é um número!");
                        read.next();
                    }
                    number=read.nextInt();
                    System.out.println();
                }while(number<1||number>31);
                dia=number;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                do{
                    System.out.println("Informe o novo valor para o dia (entre 1 e 30): ");
                    while(!read.hasNextInt()){
                        System.out.println("\n Não é um número!");
                        read.next();
                    }
                    number=read.nextInt();
                    System.out.println();
                    }while(number<1||number>30);
                dia=number;
                break;

            case 2:
                if(ano%400==0||(ano%4==0&&ano%100!=0)){
                    do{
                        System.out.println("Informe o novo valor para o dia (entre 1 e 29): ");
                        while(!read.hasNextInt()){
                            System.out.println("\n Não é um número!");
                            read.next();
                        }
                        number=read.nextInt();
                        System.out.println();
                    }while(number<1||number>29);
                    dia=number;
                }

                else{
                    do{
                        System.out.println("Informe o novo valor para o dia (entre 1 e 28): ");
                        while(!read.hasNextInt()){
                            System.out.println("\n Não é um número!");
                            read.next();
                        }
                        number=read.nextInt();
                        System.out.println();
                    }while(number<1||number>28);
                    dia=number;
                }
        }
    }
    //Recebe e atribui um valor a variavel dia - Fim

    //Recebe e atribui um valor a variavel mes - Inicio
    public void entraMes(){
        do{
            System.out.println("Informe o novo valor para o mês (entre 1 e 12): ");
            while(!read.hasNextInt()){
                System.out.println("\n Não é um número!");
                read.next();
            }
            number=read.nextInt();
            System.out.println();
        }while(number<1||number>12);
        mes=number;
    }
    //Recebe e atribui um valor a variavel mes - Fim

    //Recebe e atribui um valor a variavel ano - Inicio
    public void entraAno(){
        do{
            System.out.println("Informe o novo valor para o ano (entre 1900 e 2100): ");
            while(!read.hasNextInt()){
                System.out.println("\n Não é um número!");
                read.next();
            }
            number=read.nextInt();
            System.out.println();
        }while(number<1900||number>2100);
        ano=number;
    }
    //Recebe e atribui um valor a variavel mes - Fim

    //Getter da variavel dia - Inicio
    public int retDia(){
        return dia;
    }
    //Getter da variavel dia - Fim

    //Getter da variavel mes - Inicio
    public int retMes(){
        return mes;
    }
    //Getter da variavel mes - Fim

    //Getter da variavel ano - Inicio
    public int retAno(){
        return ano;
    }
    //Getter da variavel ano - Fim

    //Devolve a data recebida - Inicio
    public String mostra1(){
        return String.format("%02d", dia)+"/"+String.format("%02d", mes)+"/"+ano;
    }
    //Devolve a data recebida - Fim

    //Devolve a data recebida por extenso - Inicio
    public String mostra2(){
        switch(mes){
            case 1:
                mesporextenso="Janeiro";
                break;

            case 2:
                mesporextenso="Fevereiro";
                break;

            case 3:
                mesporextenso="Março";
                break;

            case 4:
                mesporextenso="Abril";
                break;

            case 5:
                mesporextenso="Maio";
                break;

            case 6:
                mesporextenso="Junho";
                break;

            case 7:
                mesporextenso="Julho";
                break;

            case 8:
                mesporextenso="Agosto";
                break;

            case 9:
                mesporextenso="Setembro";
                break;

            case 10:
                mesporextenso="Outubro";
                break;

            case 11:
                mesporextenso="Novembro";
                break;

            case 12:
                mesporextenso="Dezembro";
                break;

        }
        return "A data recebida é "+String.format("%02d", dia)+"/"+mesporextenso+"/"+ano;
    }
    //Devolve a data recebida por extenso - Fim

    //Devolve booleano se o ano for bissexto - Inicio
    public boolean bissexto(){
        if(ano%400==0||(ano%4==0&&ano%100!=0)){
            bissexto=true;
        }
        else{
            bissexto=false;
        }

        return bissexto;
    }
    //Devolve booleano se o ano for bissexto - Fim

    //Devolve a quantidade de dias transcorridos - Inicio
    public int diasTranscorridos(){
        switch(mes){
            case 12:
                diastranscorridos=dia+334;
            break;

            case 11:
                diastranscorridos=dia+304;
            break;

            case 10:
                diastranscorridos=dia+273;
            break;

            case 9:
                diastranscorridos=dia+243;
            break;

            case 8:
                diastranscorridos=dia+212;
            break;

            case 7:
                diastranscorridos=dia+181;
            break;

            case 6:
                diastranscorridos=dia+151;
            break;

            case 5:
                diastranscorridos=dia+120;
            break;

            case 4:
                diastranscorridos=dia+90;
            break;

            case 3:
                diastranscorridos=dia+59;
            break;

            case 2:
                diastranscorridos=dia+31;
            break;

            case 1:
                diastranscorridos=dia;
            break;
        }

        if(ano%400==0||(ano%4==0&&ano%100!=0)){
            diastranscorridos++;
        }

        return diastranscorridos;
    }
    //Devolve a quantidade de dias transcorridos - Fim

    //Imprime a data atual - Inicio
    public void apresentaDataAtual(){
        Date datual = new Date();
        DateFormat today = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(today.format(datual));
    }
    //Imprime a data atual - Fim

}