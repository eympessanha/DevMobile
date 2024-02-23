package control;

import model.Professor;
import model.Aluno;

public class Programa {
    public static void main(String[] args) {
        Professor prof1 = new Professor("1234","Esther",40);
        Professor prof2 = new Professor("4321","Talita",35);

        Aluno aluno1 = new Aluno("6584 ","Julia",true);
        Aluno aluno2 = new Aluno("8843 ","Lucas",false);
        Aluno aluno3 = new Aluno("9244 ","Fábio",true);

        System.out.println(prof1);
        System.out.println(prof2);
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
    }
}
