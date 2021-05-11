
public class Artigos {

    private String id;
    private String autor;
    private String conteudo;
    private String data;

    public Artigos(String id, String autor, String conteudo, String data) {

        this.id = id;
        this.autor = autor;
        this.conteudo = conteudo.trim();
        this.data = data;

    }

    public void obterTamanho() {

        System.out.println(conteudo.length());

    }

    @Override
    public String toString() {
        return "\nArtigos [autor: " + autor + ", conteudo: " + conteudo + ", data: " + data + ", id: " + id + "]";
    }

}
