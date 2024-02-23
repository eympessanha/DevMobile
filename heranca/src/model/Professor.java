package model;

public class Professor extends Pessoa{
    private int cargaHoraria;

    public Professor(String matricula, String nome, int cargaHoraria){
        super(matricula, nome);
        this.cargaHoraria = cargaHoraria;

    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCarga horária: " + getCargaHoraria();
    }
}
