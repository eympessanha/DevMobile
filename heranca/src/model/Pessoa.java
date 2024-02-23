package model;

public  abstract class Pessoa {
    private String matricula;
    private String nome;

    public Pessoa(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nMatricula: " + getMatricula() +
                "\nNome: " + getNome();
    }
}
