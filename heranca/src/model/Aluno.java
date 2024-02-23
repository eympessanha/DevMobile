package model;

public class Aluno extends Pessoa{
    private boolean bolsista;

    public Aluno(String matricula, String nome, boolean bolsista){
        super(matricula,nome);
        this.bolsista = bolsista;
    }

    //ao inves de get, vira is quando é boolean
    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBolsista: " + isBolsista();
    }
}
