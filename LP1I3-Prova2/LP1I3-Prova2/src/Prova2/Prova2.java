package Prova2;

/*
 * IFSP - Campus Cubat�o - ADS371
 * Linguagem de Programacao LP1I3 - Prof Tuler
 * Prova 2 - Exercicio 3
 * Alunos: Grazielle da Silva Ribeiro CB3007316 e Josuel Joao dos Santos CB3005542
 */

import java.util.Scanner;

public class Prova2 {
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        int dia, mes, ano, hora, min, seg;
        String nomePaciente, nomeMedico;

        System.out.println("Marcando a primeira consulta.");
        System.out.println("Defina a data da consulta.");
        Data dataconsulta = new Data();
        dia=dataconsulta.retDia();
        mes=dataconsulta.retMes();
        ano=dataconsulta.retAno();
        
        System.out.println("Defina o horario da consulta.");
        Hora horaconsulta = new Hora();
        hora=horaconsulta.getHor();
        min=horaconsulta.getMin();
        seg=horaconsulta.getSeg();

        System.out.println("Informe o nome do paciente: ");
        nomePaciente=read.nextLine();
        System.out.println("");

        System.out.println("Informe o nome do médico: ");
        nomeMedico=read.nextLine();
        System.out.println("");

        ConsultaAgendada p1=new ConsultaAgendada(hora, min, seg, dia, mes, ano, nomePaciente, nomeMedico);
        System.out.println("Exibindo as propriedades do objeto p1: ");
        System.out.println("Data: "+p1.getData());
        System.out.println("Hora: "+p1.getHora());
        System.out.println("Nome do paciente: "+p1.getNomePaciente());
        System.out.println("Nome do médico: "+p1.getNomeMedico());
        System.out.println("");

        System.out.println("Marcando a proxima consulta.");
        ConsultaAgendada p2=new ConsultaAgendada();
        System.out.println("Exibindo as propriedades do objeto p2: ");
        System.out.println("Data: "+p2.getData());
        System.out.println("Hora: "+p2.getHora());
        System.out.println("Nome do paciente: "+p2.getNomePaciente());
        System.out.println("Nome do médico: "+p2.getNomeMedico());
        System.out.println("");

        System.out.println("Alterando as propriedades do objeto p1.");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        System.out.println("Reexibindo as propriedades do objeto p1: ");
        System.out.println("Data: "+p1.getData());
        System.out.println("Hora: "+p1.getHora());
        System.out.println("Nome do paciente: "+p1.getNomePaciente());
        System.out.println("Nome do médico: "+p1.getNomeMedico());
        System.out.println("");

        System.out.println("Quantidade total de consultas: "+p2.getAmostra());

        read.close();
    }
}
