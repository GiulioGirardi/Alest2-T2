import java.util.ArrayList;
import java.util.PriorityQueue;

public class CaminhoMin{
    
    public CaminhoMin(){}

    public int CaminhoMinimo(Vert[][] verts,Vert c, Vert s,int numLinhas, int carLin){
        int quntMov = 0;
        
        c.setDist(0); 
        ArrayList<Vert> explorados = new ArrayList<>();
        PriorityQueue<Vert> pq = new PriorityQueue<>();

        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < carLin; j++) {
                pq.add(verts[i][j]);
            } 
        }

        while(!pq.isEmpty()){
            Vert u = pq.poll();
            explorados.add(u);

            for(Vert adj:u.getAdjs()){
                if(adj.getDist() > u.getDist() + 1){
                    adj.setDist(u.getDist() + 1);
                    adj.setPai(u); 
                }
            }
        }
        
        return s.getDist();
    }

    
}