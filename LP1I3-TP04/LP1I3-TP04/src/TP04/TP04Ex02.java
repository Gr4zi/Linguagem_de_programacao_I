package TP04;
/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Trabalho Pratico 04
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */

/**
 * Exercício 02: Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no exercício anterior.  
 */

import java.util.Scanner;

public class TP04Ex02 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a, m, d, number, choice;

        //Construtor que recebe os dados e inicializa as propriedades da classe - Inicio
        do{
            System.out.println("Informe o valor do ano (entre 1900 e 2100): ");
            while(!read.hasNextInt()){
                System.out.println("\n Não é um número!");
                read.next();
            }
            number=read.nextInt();
            System.out.println();
        }while(number<1900||number>2100);
        a=number;

        do{
            System.out.println("Informe o valor do mês (entre 1 e 12): ");
            while(!read.hasNextInt()){
                System.out.println("\n Não é um número!");
                read.next();
            }
            number=read.nextInt();
            System.out.println();
        }while(number<1||number>12);
        m=number;

        switch(m){
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
                d=number;
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
                d=number;
                break;

            default:
                if(a%400==0||(a%4==0&&a%100!=0)){
                    do{
                        System.out.println("Informe o valor do dia (entre 1 e 29): ");
                        while(!read.hasNextInt()){
                            System.out.println("\n Não é um número!");
                            read.next();
                        }
                        number=read.nextInt();
                        System.out.println();
                    }while(number<1||number>29);
                    d=number;
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
                    d=number;
                }
        }

        Data data=new Data(d, m, a);
        //Construtor que recebe os dados e inicializa as propriedades da classe - Fim
        
        System.out.println("Bem vindo ao menu de testes da classe Data.java! \n");

        do{
            System.out.println("Agora escolha qual método utilizar: ");
            System.out.println("1 - Método entraDia(int d)");
            System.out.println("2 - Método entraMes(int m)");
            System.out.println("3 - Método entraAno(int a)");
            System.out.println("4 - Método entraDia()");
            System.out.println("5 - Método entraMes()");
            System.out.println("6 - Método entraAno()");
            System.out.println("7 - Método retDia():int");
            System.out.println("8 - Método retMes():int");
            System.out.println("9 - Método retAno():int");
            System.out.println("10 - Método mostra1(): String");
            System.out.println("11 - Método mostra2(): String");
            System.out.println("12 - Método bissexto(): boolean");
            System.out.println("13 - Método diasTranscorridos(): int");
            System.out.println("14 - Método apresentaDataAtual (): void");
            System.out.println("15 - Finalizar programa");
            System.out.println();

            while(!read.hasNextInt()){
                System.out.println("\n Opção inválida! Escolha um valor entre 1 e 15. \n");
                read.next();
            }

            choice = read.nextInt();
            System.out.println();

            switch(choice){
                case 1:
                    switch(m){
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
                            d=number;
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
                            d=number;
                            break;
            
                        case 2:
                            if(a%400==0||(a%4==0&&a%100!=0)){
                                do{
                                    System.out.println("Informe o novo valor para o dia (entre 1 e 29): ");
                                    while(!read.hasNextInt()){
                                        System.out.println("\n Não é um número!");
                                        read.next();
                                    }
                                    number=read.nextInt();
                                    System.out.println();
                                }while(number<1||number>29);
                                d=number;
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
                                d=number;
                            }
                    }
                    data.entraDia(d);
                    System.out.println("Método finalizado! \n");
                    break;

                case 2:
                    do{
                        System.out.println("Informe o novo valor para o mês (entre 1 e 12): ");
                        while(!read.hasNextInt()){
                            System.out.println("\n Não é um número!");
                            read.next();
                        }
                        number=read.nextInt();
                        System.out.println();
                    }while(number<1||number>12);
                    m=number;
                    data.entraMes(m);
                    System.out.println("Método finalizado! \n");
                    break;

                case 3:
                    do{
                        System.out.println("Informe o novo valor para o ano (entre 1900 e 2100): ");
                        while(!read.hasNextInt()){
                            System.out.println("\n Não é um número!");
                            read.next();
                        }
                        number=read.nextInt();
                        System.out.println();
                    }while(number<1900||number>2100);
                    a=number;
                    data.entraAno(a);
                    System.out.println("Método finalizado! \n");
                    break;
                
                case 4:
                    data.entraDia();
                    System.out.println("Método finalizado! \n");
                    break;

                case 5:
                    data.entraMes();
                    System.out.println("Método finalizado! \n");
                    break;

                case 6:
                    data.entraAno();
                    System.out.println("Método finalizado! \n");
                    break;

                case 7:
                    System.out.println("O dia recebido é "+data.retDia());
                    System.out.println("Método finalizado! \n");
                    break;

                case 8:
                    System.out.println("O mês recebido é "+data.retMes());
                    System.out.println("Método finalizado! \n");
                    break;

                case 9:
                    System.out.println("O ano recebido é "+data.retAno());
                    System.out.println("Método finalizado! \n");
                    break;

                case 10:
                    System.out.println(data.mostra1());
                    System.out.println("Método finalizado! \n");
                    break;

                case 11:
                    System.out.println(data.mostra2());
                    System.out.println("Método finalizado! \n");
                    break;

                case 12:
                    System.out.println(data.bissexto());
                    System.out.println("Método finalizado! \n");
                    break;

                case 13:
                    System.out.println("A quantidade de dias transcorridos do ano até a data recebida: "+data.diasTranscorridos());
                    System.out.println("Método finalizado! \n");
                    break;

                case 14:
                    data.apresentaDataAtual();
                    System.out.println("Método finalizado! \n");
                    break;
                
                case 15:
                    System.out.println("Finalizando o programa. Obrigado!");
                    break;
                
                default:
                    System.out.println("Opção inválida! Escolha um valor entre 1 e 15. \n");
            }

        }while(choice!=15);

    }
}
