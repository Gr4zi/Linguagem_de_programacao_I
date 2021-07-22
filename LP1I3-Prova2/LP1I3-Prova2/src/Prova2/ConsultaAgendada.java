package Prova2;

/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Prova 2
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */

import java.util.Scanner;

public class ConsultaAgendada {
    
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade=0;
    private String nomeMedico;

    Scanner read = new Scanner(System.in);

    public ConsultaAgendada(){
        
        System.out.println("Defina a data da consulta: ");
        Data data= new Data();
        this.data=data;
        System.out.println("Defina o horario da consulta: ");
        Hora hora= new Hora();
        this.hora=hora;
        
        System.out.println("Informe o nome do paciente: ");
        nomePaciente=read.nextLine();
        System.out.println();

        System.out.println("Informe o nome do médico: ");
        nomeMedico=read.nextLine();
        System.out.println();

        quantidade++;
        System.out.println("Consulta "+quantidade+" marcada!");
        System.out.println();

    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String M){
        
        Data data= new Data(d, m, a);
        this.data=data;

        Hora hora= new Hora(h, mi, s);
        this.hora=hora;

        nomePaciente=p;

        nomeMedico=M;

        quantidade++;
        System.out.println("Consulta "+quantidade+" marcada!");
        System.out.println();

    }

    public ConsultaAgendada (Data d, Hora h, String p, String m){

        data=d;

        hora=h;

        nomePaciente=p;

        nomeMedico=m;

        System.out.println("Consulta marcada!");
        System.out.println();
        quantidade++;

    }

    public void setData(int a, int b, int c){

        Data data = new Data(a, b, c);
        this.data=data;
        System.out.println("Data definida!");
        System.out.println();

    }

    public void setData(){

        Data data= new Data();
        this.data=data;
        System.out.println("Data definida!");
        System.out.println();

    }

    public void setHora(int a, int b, int c){

        Hora hora = new Hora(a, b, c);
        this.hora=hora;
        System.out.println("Hora definida!");
        System.out.println();
    }

    public void setHora(){

        Hora hora = new Hora();
        this.hora=hora;
        System.out.println("Hora definida!");
        System.out.println();

    }

    public void setNomePaciente(String p){

        nomePaciente=p;
        System.out.println("Nome do paciente definido!");
        System.out.println();

    }

    public void  setNomePaciente(){

        System.out.println("Informe o nome do paciente: ");
        nomePaciente=read.nextLine();
        System.out.println();
        System.out.println("Nome do paciente definido!");
        System.out.println();

    }

    public void setNomeMedico(String m){

        nomeMedico=m;
        System.out.println("Nome do médico definido!");
        System.out.println();

    }

    public void setNomeMedico(){

        System.out.println("Informe o nome do médico: ");
        nomeMedico=read.nextLine();
        System.out.println();
        System.out.println("Nome do médico definido!");
        System.out.println();

    }

    public int getAmostra(){

        return quantidade;

    }

    public String  getData(){

        return data.mostra1();

    }

    public String getHora(){

        return hora.getHora1();

    }

    public String getNomePaciente (){

        return nomePaciente;

    }

    public String getNomeMedico(){

        return nomeMedico;

    }

}
