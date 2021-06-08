import java.util.ArrayList;

public class Vert implements Comparable<Vert>{
    private char nome;
    private Integer dist;
    private Vert pai;
    private ArrayList<Vert> adjs = new ArrayList<>();

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

    public ArrayList<Vert> getAdjs() {
        return adjs;
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

    public void setAdjs(ArrayList<Vert> adjs) {
        this.adjs = adjs;
    }

    @Override
    public int compareTo(Vert vert){
        return this.getDist().compareTo(vert.getDist());
    }
}
