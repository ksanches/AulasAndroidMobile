package br.digitalHouse.objetosJava;

public class Animal {

    private String nomeAnimal;
    private String raça;
    private int idade;
    private String cor;
    private Pessoa donoAnimal;


    //construtor específico - melhores práticas: construtores virem logo após a declaração das variáveis
    public Animal(String novoNomeAnimal){
        nomeAnimal= novoNomeAnimal;
    }
    //construtor padão
    public Animal (){

    }
// método:
    public void brincar(){
        System.out.println("O Animal está brincando");
    }

// exemplo de método get
    public String getNomeAnimal(){
        return nomeAnimal;
    }
    public String getRaça(){
        return raça;
    }
    public String getCor(){
        return cor;
    }
    public int getIdade(){
        return idade;
    }

    // método set
    public void setNomeAnimal(String novoNomeAnimal){
        nomeAnimal=novoNomeAnimal;
    }
    public void setRaça(String novaRaça){
        raça=novaRaça;
    }
    public void setCor(String novaCor){
        cor=novaCor;
    }
    public void setIdade(int novaIdade){
        idade =novaIdade;
    }

    public Pessoa getDonoAnimal(){
        return donoAnimal;
    }

    public void setDonoAnimal(Pessoa novoDonoAnimal){
        donoAnimal=novoDonoAnimal;

    }
}
