import java.io.IOException;


public class Main{
    
    public static void main(String args[]) throws IOException{
        Leitura leitura = new Leitura();
        Tabuleiro tabu = new Tabuleiro();
        CaminhoMin cam = new CaminhoMin();
    
        Vert[][] matriz = tabu.adjacentes(leitura.LeituraArquivo(), leitura.getNumLinhas(), leitura.getCarLin());

        int caminhoMinimo = cam.CaminhoMinimo(matriz, leitura.getPosicao(), leitura.getSaida(), leitura.getNumLinhas(), leitura.getCarLin());

        System.out.println("\nQuantidade de movimentos: "+caminhoMinimo);
        
    }

}