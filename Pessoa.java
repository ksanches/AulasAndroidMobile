package br.digitalHouse.objetosJava;

public class Pessoa {

    private String nomePessoa;

    //construtor específico
    public Pessoa (String novoNome){
        nomePessoa = novoNome;
    }

    //GET
    public String getNomePessoa(){
        return nomePessoa;
    }

    //SET
    public void setNomePessoa (String novoNome){
        nomePessoa = novoNome;
    }

}
