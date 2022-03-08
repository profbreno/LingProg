package duvidas;

public class Escola {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Breno", "123", 123);
        Aluno aluno1 = new Aluno("Italo", "1234", 1234);
        System.out.println(professor1.getSiape());
        System.out.println(aluno1.getMatricula());
    }
}
