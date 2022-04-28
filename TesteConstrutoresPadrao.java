import javax.swing.JOptionPane;

public class TesteConstrutoresPadrao{
    public static void main(String[] args) {
        Pessoa p;
        p = new Pessoa("José", 18);
        Aluno a;
        a = new Aluno("Maria", 27);

        System.out.println(p);

        JOptionPane.showMessageDialog(null, p);
    }
}