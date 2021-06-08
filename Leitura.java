import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Leitura {

    Vert posicao = new Vert('v');
//
//    public Leitura(Vert posicao) {
//        this.posicao = posicao;
//    }
    Leitura(){

    }

    public Vert[][] LeituraArquivo() throws IOException{

        String linhas[] = new String[100000];
        int numLinhas = 0;

        Path filePath = Paths.get("Lab.txt");

        // Ler o arquivo
        try (BufferedReader reader = Files.newBufferedReader(filePath, Charset.defaultCharset())) {
            String line;
            while ((line = reader.readLine()) != null) {
                linhas[numLinhas] = line;
                numLinhas++;
            }
        } catch (IOException e) {
            System.err.format("Erro na leitura do arquivo: ", e);
        }

        //Conta caracter
        int carLin = linhas[0].replaceAll(" ","").length();
        char aux[] = new char[carLin];
        Vert matriz[][] = new Vert[numLinhas][carLin];

        for (int i = 0; i < numLinhas; i++) {

            for (int j = 0; j < carLin; j++) {
                aux[j] = linhas[i].charAt(j);
                matriz[i][j] = new Vert(aux[j]);
                if(matriz[i][j].getNome() == 'C'){
                    posicao = matriz[i][j];
                }
                System.out.print(matriz[i][j].getNome());
            }
            System.out.print("\n");
        }
        return matriz;
    }

}