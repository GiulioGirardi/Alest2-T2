import java.util.ArrayList;
import java.util.PriorityQueue;

public class CaminhoMin{
    
    public CaminhoMin(){}

    public int CaminhoMinimo(Vert[][] verts,Vert c, int saiX,int saiY,int numLinhas, int carLin){
        int quntMov = 0;
        
        c.setDist(0); 
        ArrayList<Vert> explorados = new ArrayList<>();
        PriorityQueue<Vert> pq = new PriorityQueue<>();

        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < carLin; j++) {
                pq.add(verts[i][j]);
            }
            System.out.print("\n");
        }

        while(!pq.isEmpty()){
            Vert u = pq.poll();
            explorados.add(u);
            
        }


        return quntMov;
    }

    
}