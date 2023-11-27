package Graph;

import java.util.ArrayList;
import java.util.Collections;

public class KruskalAlgorithm {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int cost;

        public Edge(int s,int d,int c)
        {
            this.src=s;
            this.dest=d;
            this.cost=c;
        }
        @Override
        public int compareTo(Edge e2)
        {
            return this.cost-e2.cost;
        }
    }

    static void createGraph(ArrayList<Edge> edge)
    {
        edge.add(new Edge(0,1,10));
        edge.add(new Edge(0,2,15));
        edge.add(new Edge(0,3,30));
        edge.add(new Edge(1,3,40));
        edge.add(new Edge(2,3,50));
    }

    static int n=4;
    static int []par=new int[n];
    static int []rank=new int[n];

    static void init()
    {
        for(int i=0;i<n;i++)
        {
            par[i]=i;
        }
    }

    static int find(int x)
    {
        if(x==par[x])
        {
            return x;
        }
        return par[x]=find(par[x]);
    }

    static void union(int a,int b)
    {
        int parA=find(a);
        int parB=find(b);
        if(rank[parA]==rank[parB])
        {
            par[parB]=parA;
        }
        else if(rank[parA]<rank[parB])
        {
            par[parA]=parB;
        }
        else par[parB]=parA;
    }

    static void kruskal(ArrayList<Edge> edge)
    {
        init();
        Collections.sort(edge);
        int count=0;
        int finalCost=0;
        for(int i=0;count<n-1;i++)
        {
            Edge e=edge.get(i);
            int parA=find(e.src);
            int parB=find(e.dest);

            if(parA!=parB)
            {
                union(e.src,e.dest);
                finalCost+=e.cost;
                count++;
            }

        }
        System.out.println("Minimum cost: "+finalCost);
    }

    public static void main(String[] args) {
        ArrayList<Edge> edge=new ArrayList<>();
        createGraph(edge);

        kruskal(edge);
    }
}
