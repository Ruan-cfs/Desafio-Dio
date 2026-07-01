import br.com.desafio.dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setNome("Curso de Java");
        curso1.setDescicao("Curso voltado para Beck-and e QA");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();

        curso1.setNome("Curso de JS");
        curso1.setDescicao("Curso voltado para frot-and e QA");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setNome("Mentoria de Java");
        mentoria.setCargaHoraria(8);
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("descricao bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Maria");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos por Maria: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos inscritos por Maria: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos por Maria: " + dev1.getConteudosConcluidos());
        System.out.println("Xp: " + dev1.calcXpTotal());



        Dev dev2 = new Dev();
        dev2.setNome("João");
    }
}
