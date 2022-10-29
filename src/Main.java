import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java Spring");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("descrição curso java com Node.JS");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
/*
        System.out.println(curso1);
        System.out.println("---------------------------");
        System.out.println(curso2);
        System.out.println("---------------------------");
        System.out.println(mentoria);
*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCam Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Leonardo " + devLeonardo.getCounteudosInscritos());
        devLeonardo.progredir();
        devLeonardo.progredir();
        devLeonardo.progredir();
        System.out.println("-----");
        System.out.println("Conteudos Inscritos Leonardo " + devLeonardo.getCounteudosInscritos());
        System.out.println("Conteudos Concluidos Leonardo " + devLeonardo.getConteudosConcluidos());
        System.out.println(" XP " + devLeonardo.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devClau = new Dev();
        devClau.setNome("Claudiene");
        devClau.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Clau " + devClau.getCounteudosInscritos());
        devClau.progredir();
        devClau.progredir();
        devClau.progredir();
        System.out.println("-----");
        System.out.println("Conteudos Inscritos Clau " + devClau.getCounteudosInscritos());
        System.out.println("Conteudos Concluidos Clau"  + devClau.getConteudosConcluidos());
        System.out.println(" XP " + devClau.calcularTotalXp());







    }
}