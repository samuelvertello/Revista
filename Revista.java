import java.util.ArrayList;
import java.util.List;

public class Revista {

    private String id_revista;
    private String nome;

    private List<Artigos> artigos = new ArrayList<>();

    public Revista(String id, String nome, Artigos artigo) {
        this.id_revista = id;
        this.nome = nome;
        artigos.add(artigo);

    }

    public void salvarArtigos(Artigos artigo) {

        artigos.add(artigo);

    }

    public void imprimirArtigos() {

        for (Artigos a : artigos) {
            System.out.println(a);
            System.out.print("Quantidade de caracteres no conteudo do artigo: ");
            a.obterTamanho();
        }

    }

    @Override
    public String toString() {
        return "\nRevista [id: " + id_revista + ", nome: " + nome + "]";

    }

    public List<Artigos> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigos> artigos) {
        this.artigos = artigos;
    }

}
