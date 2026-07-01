import br.com.desafio.dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setNome("Java Fundamentos & Programação Orientada a Objetos");
        curso1.setDescicao("Domine a linguagem que move o mercado corporativo. Do zero ao desenvolvimento de APIs robustas com boas práticas e testes de software.");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setNome("JavaScript Essencial para Desenvolvimento Web");
        curso2.setDescicao("Aprenda a criar interfaces dinâmicas e interativas, compreendendo manipulação de DOM, requisições assíncronas e lógica de programação moderna.");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setNome("Mentoria: Arquitetando sua Carreira no Back-End");
        mentoria.setDescicao("Encontro exclusivo com especialistas do mercado para desenhar seu plano de estudos, tirar dúvidas técnicas e otimizar seu perfil para processos seletivos.");
        mentoria.setCargaHoraria(5);
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Fullstack Java Developer");
        bootcamp.setDescricao("Um programa intensivo desenhado para transformar entusiastas em desenvolvedores de alto nível, unindo o poder do ecossistema Java no Back-End à flexibilidade do ecossistema Web.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("=========================================================================================");
        System.out.println("🎓 INFORMAÇÕES DO PROGRAMA: " + bootcamp.getNome().toUpperCase());
        System.out.println("=========================================================================================");
        System.out.println("📝 Descrição: " + bootcamp.getDescricao());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("📚 Grade Curricular do Bootcamp:");
        bootcamp.getConteudos().add(curso1);
        System.out.println("   • [CURSO] " + curso1.getNome() + " (" + curso1.getCargaHoraria() + "h)");
        System.out.println("     └─ " + curso1.getDescicao());
        System.out.println("   • [CURSO] " + curso2.getNome() + " (" + curso2.getCargaHoraria() + "h)");
        System.out.println("     └─ " + curso2.getDescicao());
        System.out.println("   • [MENTORIA] " + mentoria.getNome() + " (" + mentoria.getCargaHoraria() + "h)");
        System.out.println("     └─ " + mentoria.getDescicao());
        System.out.println("=========================================================================================\n");

        Dev dev1 = new Dev();
        dev1.setNome("Maria Silva");

        System.out.println("==================================================");
        System.out.println("🚀 INICIANDO JORNADA DE: " + dev1.getNome().toUpperCase());
        System.out.println("==================================================");

        dev1.inscreverBootcamp(bootcamp);
        System.out.println("\n📥 [Matrícula Realizada] Conteúdos Inscritos:");
        dev1.getConteudosInscritos().forEach(conteudo -> System.out.println("   -> " + conteudo.getNome()));

        System.out.println("\n🏃 [Progresso] Concluindo o primeiro conteúdo...");
        dev1.progredir();

        System.out.println("🏃 [Progresso] Concluindo o segundo conteúdo...");
        dev1.progredir();

        System.out.println("\n--------------------------------------------------");
        System.out.println("📊 STATUS ATUAL DE " + dev1.getNome().toUpperCase() + ":");
        System.out.println("--------------------------------------------------");

        System.out.println("⏳ Conteúdos Pendentes:");
        if (dev1.getConteudosInscritos().isEmpty()) {
            System.out.println("   (Nenhum conteúdo pendente!)");
        } else {
            dev1.getConteudosInscritos()
                    .forEach(conteudo -> System.out.println("   ❌ " + conteudo.getNome()));
        }

        System.out.println("\n🏆 Conteúdos Concluídos:");
        if (dev1.getConteudosConcluidos().isEmpty()) {
            System.out.println("   (Nenhum conteúdo concluído ainda.)");
        } else {
            dev1.getConteudosConcluidos().forEach(conteudo -> System.out.println("   ✅ " + conteudo.getNome()));
        }

        System.out.println("\n✨ Total de XP acumulado: " + dev1.calcXpTotal() + " XP");
        System.out.println("==================================================\n");

        Dev dev2 = new Dev();
        dev2.setNome("João Souza");

        System.out.println("==================================================");
        System.out.println("🚀 INICIANDO JORNADA DE: " + dev2.getNome().toUpperCase());
        System.out.println("==================================================");

        dev2.inscreverBootcamp(bootcamp);
        System.out.println("\n📥 [Matrícula] Conteúdos Inscritos:");
        dev2.getConteudosInscritos().forEach(conteudo -> System.out.println("   -> " + conteudo.getNome()));

        System.out.println("\n🏃 [Progresso] João está focado! Concluindo todas as etapas...");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("\n--------------------------------------------------");
        System.out.println("📊 STATUS ATUAL DE " + dev2.getNome().toUpperCase() + ":");
        System.out.println("--------------------------------------------------");

        System.out.println("⏳ Conteúdos Pendentes:");
        if (dev2.getConteudosInscritos().isEmpty()) {
            System.out.println("   🎉 Parabéns! Nenhum conteúdo pendente. Curso 100% Completo!");
        } else {
            dev2.getConteudosInscritos().forEach(conteudo -> System.out.println("   ❌ " + conteudo.getNome()));
        }

        System.out.println("\n🏆 Conteúdos Concluídos:");
        dev2.getConteudosConcluidos().forEach(conteudo -> System.out.println("   ✅ " + conteudo.getNome()));

        System.out.println("\n✨ Total de XP acumulado: " + dev2.calcXpTotal() + " XP");
        System.out.println("==================================================");
    }

}
