import java.time.LocalDate;

import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(10);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1.toString());
        System.out.println(curso2.toString());
        System.out.println(mentoria.toString());
    }
}
