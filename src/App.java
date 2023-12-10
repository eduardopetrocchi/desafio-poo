
import java.time.LocalDate;
import java.util.stream.*;

import com.desafio.dominio.Bootcamp;
import com.desafio.dominio.Curso;
import com.desafio.dominio.Dev;
import com.desafio.dominio.Mentoria;


public class App {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de mentoria de Java");
        mentoria.setData(LocalDate.now()); 
        

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev.");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        

        Dev dev1 = new Dev();
        dev1.setNome("Eduardo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos MATRICULADOS de: " + dev1.getNome() + "\n" + dev1.getConteudosInscritos().stream().map(Object::toString).collect(Collectors.joining("\n")));
        dev1.progredir();
        dev1.progredir();
        System.out.println("Quantidade de cursos concluídos: " + dev1.getConteudosConcluidos().size());
        System.out.println("Conteúdos CONCLUÍDOS de: " + dev1.getNome() + "\n" + dev1.getConteudosConcluidos().stream().map(Object::toString).collect(Collectors.joining("\n")));
        System.out.println("Conteúdos INSCRITOS (ainda não concluídos) de: " + dev1.getNome() + "\n" + dev1.getConteudosInscritos().stream().map(Object::toString).collect(Collectors.joining("\n")));
        System.out.println("XP: " + dev1.calcularTotalXp());
        

        System.out.println("---------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Luiz");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos MATRICULADOS de: " + dev2.getNome() + "\n" + dev2.getConteudosInscritos().stream().map(Object::toString).collect(Collectors.joining("\n")));
        dev2.progredir();
        System.out.println("Quantidade de cursos concluídos: " + dev2.getConteudosConcluidos().size());
        System.out.println("Conteúdos CONCLUÍDOS de: " + dev2.getNome() + "\n" + dev2.getConteudosConcluidos().stream().map(Object::toString).collect(Collectors.joining("\n")));
        System.out.println("Conteúdos INSCRITOS (ainda não concluídos) de: " + dev2.getNome() + "\n" + dev2.getConteudosInscritos().stream().map(Object::toString).collect(Collectors.joining("\n")));
        System.out.println("XP: " + dev2.calcularTotalXp());
       



       
  
    }
}
 