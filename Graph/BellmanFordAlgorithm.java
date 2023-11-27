package Graph;

import java.util.ArrayList;

public class BellmanFordAlgorithm {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i=0;i< graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }

    static void bellman(ArrayList<Edge>[] graph,int src)
    {
        int v1=graph.length;
        int []dist=new int[v1];
        for(int i=0;i<v1;i++)
        {
            if(i!=src)
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }

        for(int i=0;i<v1-1;i++)
        {
            for(int j=0;j<graph.length;j++)
            {
                for(int k=0;k<graph[j].size();k++)
                {
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v])
                    {
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }
        for(int i=0;i<v1;i++)
        {
            System.out.print(dist[i]+" ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph=new ArrayList[5];
        createGraph(graph);

        bellman(graph,0);
    }
}
