import java.util.ArrayList;
import java.util.List;

public class Editora {

    private String codigo_editora;
    private String nome;
    private String endereco;

    private List<Revista> revistas = new ArrayList<>();

    public Editora(String id, String nome, String endereco) {
        this.codigo_editora = id;
        this.nome = nome;
        this.endereco = endereco;

    }

    public Editora(String id, String nome, String endereco, Revista revista) {
        this.codigo_editora = id;
        this.nome = nome;
        this.endereco = endereco;
        this.revistas.add(revista);

    }



    public void imprimirRevistas() {

        for (var r : revistas) {
            System.out.println(r);
        }
    }

    public void salvarRevista(Revista revista) {

        this.revistas.add(revista);
    }

    @Override
    public String toString() {
        return "\nEditora [codigo editora: " + codigo_editora + ", endereco: " + endereco + ", nome: " + nome + "]";
    }

}