public class LivroFisico extends Livro {
    private int numeroDePaginas;

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.print("Livro Físico - ");
        super.exibirDetalhes();
        System.out.println("Páginas: " + numeroDePaginas + "\n");
    }
}
