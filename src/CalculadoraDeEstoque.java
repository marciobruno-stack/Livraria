public class CalculadoraDeEstoque {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.adicionaValor(59.90);  // Define o valor usando o método adicionaValor
        livro.isbn = "978-85-66250-46-6";

        System.out.println("O nome do livro é " + livro.nome);
        System.out.println("O valor do livro é " + livro.retornaValor());
    }
}
