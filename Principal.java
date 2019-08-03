package br.digitalHouse.objetosJava;

public class Principal {

    public static void main(String[] args) {

        Animal animalMamifero = new Animal("Bidu");
        System.out.println(animalMamifero.getNomeAnimal());
       // System.out.println(animalMamifero.getCor());
        //System.out.println(animalMamifero.getIdade());
        //System.out.println(animalMamifero.getRaça());

        Animal animalDomestico = new Animal();
        animalDomestico.setNomeAnimal("Ted");
        System.out.println(animalDomestico.getNomeAnimal());

        System.out.println("****************************");

        //criação de objeto do tipo pessoa e que já tem o nome Erika
        Pessoa pessoaJovem = new Pessoa("Erika");

        //Mostrando o nome do objeto pessoaJovem pelo método SET
        System.out.println(pessoaJovem.getNomePessoa());

        //Mostrando o nome do dono do Animal a partir do pbjeto animalDomestico
        animalDomestico.setDonoAnimal(pessoaJovem);

        System.out.println(animalDomestico.getNomeAnimal().getNomePessoa());
    }

}
