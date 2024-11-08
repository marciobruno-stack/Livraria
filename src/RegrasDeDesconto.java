public class RegrasDeDesconto {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.retornaValor() ;

        System.out.println("Valor atual: " + livro.retornaValor());

        if (!livro.aplicarDescontoDe( 0.1)){
            System.out.println("Deconto não pode ser maior do que 30% ");
        } else {
            System.out.println("Valor com desconto: " + livro.retornaValor());
        }
    }
}
