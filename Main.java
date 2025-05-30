import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Autor jkRowling = new Autor();
        jkRowling.setNome("J.K. Rowling");
        jkRowling.setNacionalidade(Nacionalidade.BRITANICA);

        
        LivroFisico livroFisico1 = new LivroFisico();
        livroFisico1.setTitulo("Harry Potter e a Pedra Filosofal");
        livroFisico1.setAnoPublicacao(1997);
        livroFisico1.setNumeroDePaginas(223);
        livroFisico1.setAutor(jkRowling);

        LivroFisico livroFisico2 = new LivroFisico();
        livroFisico2.setTitulo("Harry Potter e o Prisioneiro de Azkaban");
        livroFisico2.setAnoPublicacao(1999);
        livroFisico2.setNumeroDePaginas(317);
        livroFisico2.setAutor(jkRowling);

        LivroDigital livroDigital1 = new LivroDigital();
        livroDigital1.setTitulo("Harry Potter e a Câmara Secreta");
        livroDigital1.setAnoPublicacao(1998);
        livroDigital1.setTamanhoDoArquivoMB(2.5);
        livroDigital1.setAutor(jkRowling);

        LivroDigital livroDigital2 = new LivroDigital();
        livroDigital2.setTitulo("Harry Potter e o Cálice de Fogo");
        livroDigital2.setAnoPublicacao(2000);
        livroDigital2.setTamanhoDoArquivoMB(3.7);
        livroDigital2.setAutor(jkRowling);
      
        ArrayList<Livro> biblioteca = new ArrayList<>();
        biblioteca.add(livroFisico1);
        biblioteca.add(livroFisico2);
        biblioteca.add(livroDigital1);
        biblioteca.add(livroDigital2);

      
        for (Livro livro : biblioteca) {
            livro.exibirDetalhes();
        }
    }
}
