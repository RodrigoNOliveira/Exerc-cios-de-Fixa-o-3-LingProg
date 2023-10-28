package classes;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> listaLivros = new ArrayList<>();
    private Livro livro;
    private int status;

    public Biblioteca() {
    }

    public void addLivro(String nome) {
        if (procuraLivro(nome) == false) {
            livro = new Livro(nome);
            listaLivros.add(livro);
            System.out.println("Livro " + nome + " cadastrado com sucesso!");
        } else {
            System.out.println("O livro " + nome + " ja foi cadastrado!");
        }
    }

    public void emprestaLivro(String nome) {
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getNome().equals(nome)) {
                verifica(nome);
                if (status == 0) {
                    listaLivros.get(i).setStatus(true);
                    System.out.println("Livro " + nome + " emprestado com sucesso!");
                } else{
                    System.out.println("Livro " + nome + " não esta disponivel para ser emprestado!");
                }
            }
        }
    }

    public void devolveLivro(String nome) {
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getNome().equals(nome)) {
                verifica(nome);
                if (status == 1) {
                    System.out.println("Livro devolvido");
                    listaLivros.get(i).setStatus(false);
                }
            }
        }
    }


    public void verifica(String nome){
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getNome().equals(nome)) {
                if (listaLivros.get(i).getStatus() == false) {
                    status = 0;
                } else {
                    status = 1;
                }
            }
        }
    }


    public void statusLivro(String nome) {
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getNome().equals(nome)) {
                verifica(nome);
                if(status == 1){
                    System.out.println("Livro não pode ser emprestado!");
                }
                else{
                    System.out.println("Livro pode ser emprestado!");
                }
            }
        }
    }

    public boolean procuraLivro(String nome) {
        if (listaLivros.size() > 0) {
            for (int i = 0; i < listaLivros.size(); i++) {
                if (listaLivros.get(i).getNome().equals(nome)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Biblioteca [listaLivros=" + listaLivros + ", livro=" + livro + ", status=" + "]";
    }

    

}
