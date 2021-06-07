import java.util.ArrayList;

public class Vert implements Comparable<Vert>{
    char nome;
    Integer dist;
    Vert pai;
    ArrayList<Vert> adjs = new ArrayList<>();

    public Vert(char nome){
        this.nome = nome;
        dist = 2147483647;
        pai = null;
    }

    public Integer getDist() {
        return dist;
    }

    public char getNome() {
        return nome;
    }

    public Vert getPai() {
        return pai;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    public void setPai(Vert pai) {
        this.pai = pai;
    }

    @Override
    public int compareTo(Vert vert){
        return this.getDist().compareTo(vert.getDist());
    }
}
