import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição cursos JAVA");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição cursos JS");
        curso2.setCargahoraria(8);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.printf(String.valueOf(mentoria));*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos"+ devIgor.getConteudosInscritos());
        devIgor.progredir();
        devIgor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos"+ devIgor.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos"+ devIgor.getConteudosConcluidos());
        System.out.println("XP:" + devIgor.calcularTotalXp());

        System.out.println("----------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos"+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos"+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos"+ devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());




    }
}
