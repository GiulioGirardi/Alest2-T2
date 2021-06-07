import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Leitura {
    
    public Leitura() {}

    public char[][] LeituraArquivo() throws IOException{

        String linhas[] = new String[100000];
        int numLinhas = 0;

        Path filePath = Paths.get("lab.txt");

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

        int carLin = linhas[0].replaceAll(" ","").length();
        String aux[];
        char matriz[][] = new char[numLinhas][carLin];

        for (int i = 0; i < numLinhas; i++) {
            aux = linhas[i].split(" ");
            for (int j = 0; j < carLin; j++) {
                matriz[i][j] = aux[j].charAt(0);
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }

        return matriz;
        
    }

}