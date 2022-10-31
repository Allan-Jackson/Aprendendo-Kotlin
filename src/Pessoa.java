public class Pessoa {
    private int anoNascimento;
    private String nome;

    public int getAnoNascimento() {
        return anoNascimento + 2;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa(int anoNasc, String nome){ //construtor da classe
        this.anoNascimento = anoNasc;
        this.nome = nome;
    }

}
