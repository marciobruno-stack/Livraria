public class Livro {

    String nome;
    String descricao;
    private double valor;
    String isbn;
    Autor autor;
    boolean temAutor(){
        return this.autor != null;
    }

    void adicionaValor(double valor){
        this.valor = valor;
    }
    double retornaValor(){
        return this.valor;
    }

void mostrarDetalhes(){
    String mensagem = "Mostrando detalhes do Livro ";
    System.out.println(mensagem);
    System.out.println("Nome: " + nome);
    System.out.println("Descrição: " + descricao);
    System.out.println("Valor: " + retornaValor());
    System.out.println("ISBN: " + isbn);
    autor.mostrarDetalhes();

    if (temAutor()){
        autor.mostrarDetalhes();
    }

    System.out.println("--");
}

//if(livro.temAutor()){
//        System.out.println("O nome do autor desse livro é: ");
//        System.out.println(livro.autor.nome);
//    }
public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 0.3){
            return false;
        }
    this.valor -= this.valor * porcentagem;
        return true;


    }

}
