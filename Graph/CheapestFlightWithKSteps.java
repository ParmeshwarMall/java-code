package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightWithKSteps {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    static void createGraph(int flight[][],ArrayList<Edge>[] graph)
    {
        for(int i=0;i< graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i< flight.length;i++)
        {
            int src=flight[i][0];
            int dest=flight[i][1];
            int wt=flight[i][2];

            Edge e=new Edge(src,dest,wt);
            graph[src].add(e);
        }
    }

    static class Info{
        int v;
        int cost;
        int stop;

        public Info(int v,int c,int s){
            this.v=v;
            this.cost=c;
            this.stop=s;
        }
    }
    static int cheapestFlight(int n,int flight[][],int src,int dest,int k)
    {
        ArrayList<Edge>[] graph=new ArrayList[n];
        createGraph(flight,graph);

        int []dist=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i!=src)
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }

        Queue<Info> q=new LinkedList<>();
        q.add(new Info(src,0,0));

        while(q.size()!=0)
        {
            Info curr=q.remove();
            if(curr.stop>k)
            {
                break;
            }

            for(int i=0;i<graph[curr.v].size();i++)
            {
                Edge e=graph[curr.v].get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;

                if(curr.cost+wt<dist[v] && curr.stop<=k)
                {
                    dist[v]=curr.cost+wt;
                    q.add(new Info(v,dist[v],curr.stop+1));
                }
            }
        }
        if(dist[dest]==Integer.MAX_VALUE)
        {
            return -1;
        }
        else return dist[dest];
    }
    public static void main(String[] args) {
        int n=4;
        int flight[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0,dest=3,k=1;

        System.out.println(cheapestFlight(n,flight,0,3,k));
    }
}
