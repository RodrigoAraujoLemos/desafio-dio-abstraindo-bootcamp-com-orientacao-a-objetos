package br.com.dio.desafio;

public class Curso extends  Conteudo {
    private int cargaHoraria;

    public Curso(){

    }

    public Curso(String titulo, String descricao, int cargaHoraria){
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override 
    public double calcularXp(){
        return XP_PADRAO;
    }

    @Override 
    public String toString(){
        return "{ Nome: "+ titulo +" || Descriçao: "+ descricao + " || Carga Horária: "+ cargaHoraria + " }";
    }
}
