import classes.Biblioteca;

public class App {
    public static void main(String[] args) throws Exception {

        Biblioteca bibliotecaIf = new Biblioteca();

        //cadastrando livros
        bibliotecaIf.addLivro("Sei la");
        bibliotecaIf.addLivro("Sei la 2");
        bibliotecaIf.addLivro("Sei la 3");

        //tentando cadastrar um livro ja existente
        bibliotecaIf.addLivro("Sei la");
        System.out.println();



        //verificando status do livro antes de ser emprestado
        bibliotecaIf.statusLivro("Sei la"); //pode

        //pegando livro emprestado
        bibliotecaIf.emprestaLivro("Sei la"); //pode
        
        //verificando status apos ser emprestado
        bibliotecaIf.statusLivro("Sei la");  //não pode

        //devolvendo livro emprestado
        bibliotecaIf.devolveLivro("Sei la");
        
        //verificando status apos ser devolvido
        bibliotecaIf.statusLivro("Sei la");

        System.out.println(bibliotecaIf.toString());
    }
}
