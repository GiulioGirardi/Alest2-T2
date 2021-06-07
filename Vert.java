public class Vert {
    char nome;
    int dist;
    Vert pai;

    public Vert(char nome){
        this.nome = nome;
        dist = 2147483647;
        pai = null;
    }

    public int getDist() {
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
}
