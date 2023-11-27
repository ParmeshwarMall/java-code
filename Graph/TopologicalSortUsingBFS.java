package Graph;
import java.util.*;
public class TopologicalSortUsingBFS {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i=0;i< graph.length;i++)
        {
            graph[i]=new ArrayList<>();

        }
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[3].add(new Edge(3,1));

        graph[2].add(new Edge(2,3));
    }

    static void inDegree(ArrayList<Edge>[] graph,int inDeg[])
    {
        for(int i=0;i< graph.length;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                inDeg[e.dest]++;
            }
        }
    }

    static void topSort(ArrayList<Edge>[] graph)
    {
        int inDeg[]=new int[graph.length];
        inDegree(graph,inDeg);
        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<inDeg.length;i++)
        {
            if(inDeg[i]==0)
            {
                q.add(i);
            }
        }

        //bfs
        while(q.size()!=0)
        {
            int curr=q.remove();
            System.out.print(curr+" ");

            for(int i=0;i<graph[curr].size();i++)
            {
                Edge e=graph[curr].get(i);
                inDeg[e.dest]--;
                if(inDeg[e.dest]==0)
                {
                    q.add(e.dest);
                }
            }
        }
       // System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph=new ArrayList[6];
        createGraph(graph);
        topSort(graph);
    }
}
