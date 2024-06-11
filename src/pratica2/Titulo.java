package pratica2;

public class Titulo implements Comparable<Titulo>{
    private String titulo;

    
     public Titulo(String titulo){
        this.titulo = titulo;
}
    
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String toString(){
        return "Titulo: "+getTitulo();
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getTitulo().compareTo(outroTitulo.getTitulo());
    }

    
}
