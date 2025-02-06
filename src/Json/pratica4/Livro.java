package Json.pratica4;

public class Livro {
    private String autor;
    private String titulo;
    private String editora;

    // construtos criado para poder ser chamado na Main,
    // este contrutor faz o aniamento com a recorde!
    public Livro(Livroo livroo){
        this.autor = livroo.autor();
        this.titulo = livroo.titulo();
        this.editora = livroo.editora();
    };

    public String getAutor() {
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getEditora(){
        return editora;
    }

    @Override
    public String toString() {
        return "Inforamções do Livro{" +
                "autor='" + autor+ '\'' +
                "titulo='" + titulo+ '\'' +
                "editora='" + editora+ '\'' +
                '}';
    }
}
