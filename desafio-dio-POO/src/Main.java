import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrlção Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Camila está inscrita nos seguintes conteúdos: " + devCamila.getConteudosInscritos().toString());
        System.out.println("-----------------------");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Camila está inscrita nos seguintes conteúdos: " + devCamila.getConteudosInscritos().toString());
        System.out.println("-----------------------");
        System.out.println("Camila concluiu os seguintes conteúdos: " + devCamila.getConteudosConcluidos().toString());
        System.out.println("-----------------------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("João está inscrita nos seguintes conteúdos: " + devJoao.getConteudosInscritos().toString());
        System.out.println("-----------------------");
        devJoao.progredir();
        System.out.println("João está inscrita nos seguintes conteúdos: " + devJoao.getConteudosInscritos().toString());
        System.out.println("-----------------------");
        System.out.println("João concluiu os seguintes conteúdos: " + devJoao.getConteudosConcluidos().toString());
        System.out.println("-----------------------");

        System.out.println("Camila está com: "+ devCamila.calcularTotalXp() + "\nE João está com: "+ devJoao.calcularTotalXp());
    }
}
