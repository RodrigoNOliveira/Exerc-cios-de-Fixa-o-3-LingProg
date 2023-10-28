package classes;

public class Livro {
    private String nome;
    private boolean status = false;

    public Livro(String nome) {
        this.nome = nome;
    }



    public Livro() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", status=" + status + "]";
    }

}
