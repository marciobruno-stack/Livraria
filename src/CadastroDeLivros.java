public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789-10";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.isbn = "978-85-66250-46-6";
        livro.autor = autor;

        // Definindo o valor inicial do livro
        livro.adicionaValor(59.90);

        // Mostrando detalhes do livro antes do desconto
        livro.mostrarDetalhes();

        // Aplicando um desconto de 10%
        if (livro.aplicarDescontoDe(0.1)) {
            System.out.println("Desconto aplicado com sucesso!");
        } else {
            System.out.println("Desconto não pode ser aplicado.");
        }

        // Mostrando detalhes do livro após o desconto
        livro.mostrarDetalhes();
    }
}
