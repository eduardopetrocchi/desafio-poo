
import java.time.LocalDate;
import com.desafio.dominio.Curso;
import com.desafio.dominio.Mentoria;


public class App {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now()); //a data é atribuida no momento da criação

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
 