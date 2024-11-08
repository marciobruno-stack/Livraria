public class CalculaoraDeEstoque {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recusros da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        System.out.println("O nodo do livro é  " + livro.nome);

    }
}