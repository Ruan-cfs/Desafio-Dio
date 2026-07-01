import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setNome("Curso de Java");
        curso1.setDescicao("Curso voltado para Beck-and e QA");
        curso1.setCargaHoraria(12);
        System.out.println(curso1);
        Mentoria mentoria = new Mentoria();
        mentoria.setNome("Mentoria de Java");
        mentoria.setCargaHoraria(8);
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}
