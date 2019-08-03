package br.digitalHouse.objetosJava;

public class Cliente {

    private String nome;
    private String sobrenome;

    //construtor específico
    public Cliente (String novoNome, String novoSobrenome){
        nome = novoNome;
        sobrenome= novoSobrenome
    }

    //GET
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }

    //SET
    public void setNome (String novoNome){
        nome = novoNome;
    }
    public void setSobrenome (String novoSobrenome){
        sobrenome = novoSobrenome;
    }



}