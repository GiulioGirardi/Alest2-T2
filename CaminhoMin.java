import java.util.ArrayList;
import java.util.PriorityQueue;

public class CaminhoMin{
    
    public CaminhoMin(){}

    public int CaminhoMinimo(Vert[][] verts,Vert c, Vert s,int numLinhas, int carLin){
        
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

            if(u.getDist()==Integer.MAX_VALUE){
                break;
            }
        
            for(Vert adj:u.getAdjs()){
                if(adj.getDist() > u.getDist() + 1){
                    pq.remove(adj);
                    pq.add(adj);
                    adj.setDist(u.getDist() + 1);
                    adj.setPai(u); 
                
                }
                
            }

            
        }
        
        if(s.getDist()==Integer.MAX_VALUE)return 0;
        else return s.getDist();
        
    }

    
}