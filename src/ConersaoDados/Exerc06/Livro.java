package ConersaoDados.Exerc06;

import java.time.LocalDate;

public class Livro {

    private String isbn;
    private String tituloOriginal;
    private String tituloPortugues;
    private String autor;
    private int qtdPaginas;
    private int edicao;
    private int anoPublic;

    public String exibirTitulos() {
      //  return "TÍTULO: " +tituloOriginal+ "/"+ " TÍTULO EM PORTUGUÊS: "+tituloPortugues;  ***** usando o + para concatenar *****

         return "TÍTULO: "
                 .concat(tituloOriginal)
                 .concat(" / TÍTULO EM PORTUGUÊS: ")
                 .concat(tituloPortugues);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getTituloPortugues() {
        return tituloPortugues;
    }

    public void setTituloPortugues(String tituloPortugues) {
        this.tituloPortugues = tituloPortugues;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAnoPublic() {
        return anoPublic;
    }

    public void setAnoPublic(int anoPublic) {
        this.anoPublic = anoPublic;
    }
}
