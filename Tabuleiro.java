import java.io.IOException;

public class Tabuleiro{
    Leitura leitura;

    Vert tabuleiro[][];

    Tabuleiro() throws IOException {
        leitura = new Leitura();
        tabuleiro = leitura.LeituraArquivo();
    }




}