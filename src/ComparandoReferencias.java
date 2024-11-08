public class ComparandoReferencias {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.adicionaValor(59.90);

        // Mostra o valor inicial
        System.out.println("Valor atual: " + livro.retornaValor());

        // Tenta aplicar um desconto de 4%
        if (livro.aplicarDescontoDe(0.04)) {
            System.out.println("Desconto aplicado com sucesso!");
            // Exibe o valor com o desconto aplicado
            System.out.println("Valor com desconto: " + livro.retornaValor());
        } else {
            System.out.println("Desconto não pode ser maior que 30%");
        }
    }
}
