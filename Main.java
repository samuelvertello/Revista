public class Main {

    public static void main(String[] args) {

        String id = "1000";
        String nome = "Época";
        String endereco = "av. Afonso pena 2500 centro - BH";

        // ********************************************************************* */

        var editora = new Editora(id, nome, endereco);

        var artigo = new Artigos("0001", "Nina Finco", "A bolha dos ultrajovens", "10/04/2021");

        var revista = new Revista("N° 01", "Um futuro melhor", artigo);

        editora.salvarRevista(revista);

        var artigo2 = new Artigos("0002", "C.S Lewis",
                "Dificuldades preparam pessoas comuns para destinos extraordinários", "15/04/2021");

        revista.salvarArtigos(artigo2);

        System.out.println(editora.toString());
        editora.imprimirRevistas();

        revista.imprimirArtigos();

    }

}
