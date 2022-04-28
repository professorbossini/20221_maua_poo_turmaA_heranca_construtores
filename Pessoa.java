public class Pessoa{
    private String nome;
    private int idade;

    // // esse é o construtor padrão
    // // observe que ele tem a lista de parâmetros vazia
    // public Pessoa(){    
    //     System.out.println("Construindo uma pessoa...");
    // }

    public Pessoa(String nome, int idade){
        super();
        System.out.println("Construindo uma pesssoa...");
        setNome(nome);
        setIdade(idade);

    }


    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade >= 18)
            this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return String.format(
            "Nome: %s, Idade: %d",
            nome,
            idade
        );    
    }
}