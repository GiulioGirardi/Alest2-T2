public class Tabuleiro{

    public Tabuleiro(){}

    public Vert[][] adjacentes(Vert matriz[][],int numLinhas,int carLin){
        for(int i = 0;i<numLinhas;i++){
            for(int j = 0;j<carLin;j++){
                Vert vert = matriz[i][j];
                
                if(vert.getNome()!='x'){
                    try {
                        if(matriz[i][j-2].getNome()!='x'){
                            vert.getAdjs().add(matriz[i][j-2]);
                        }
                    } catch (Exception e) {
                        
                    }

                    try {
                        if(matriz[i][j+2].getNome()!='x'){
                            vert.getAdjs().add(matriz[i][j+2]);
                        }
                    } catch (Exception e) {
                        
                    }

                    try {
                        if(matriz[i+2][j].getNome()!='x'){
                            vert.getAdjs().add(matriz[i+2][j]);
                        }
                    } catch (Exception e) {
                        
                    }

                    try {
                        if(matriz[i-2][j].getNome()!='x'){
                            vert.getAdjs().add(matriz[i-2][j]);
                        }
                    } catch (Exception e) {
                        
                    }

                    try {
                        if(matriz[i-1][j-1].getNome()!='x'){
                            vert.getAdjs().add(matriz[i-1][j-1]);
                        }
                    } catch (Exception e) {
                        
                    }

                    try {
                        if(matriz[i+1][j-1].getNome()!='x'){
                            vert.getAdjs().add(matriz[i+1][j-1]);
                        }
                    } catch (Exception e) {
                        
                    }

                    try {
                        if(matriz[i-1][j+1].getNome()!='x'){
                            vert.getAdjs().add(matriz[i-1][j+1]);
                        }
                    } catch (Exception e) {
                        
                    }

                    try {
                        if(matriz[i+1][j+1].getNome()!='x'){
                            vert.getAdjs().add(matriz[i+1][j+1]);
                        }
                    } catch (Exception e) {
                        
                    }
                }
            }   
        }
        return matriz;
    }


}