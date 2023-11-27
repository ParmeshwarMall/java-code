package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
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

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }

    static class Pair implements Comparable<Pair>{
        int v;
        int cost;

        public Pair(int v,int c)
        {
            this.v=v;
            this.cost=c;
        }
        @Override
        public int compareTo(Pair p2)
        {
            return this.cost- p2.cost;    //Ascending order sorting based on cost
        }
    }
    static void prims(ArrayList<Edge>[] graph)
    {
        boolean []isVis=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int finalCost=0;

        pq.add(new Pair(0,0));
        while(pq.size()!=0)
        {
            Pair curr=pq.remove();
            if(!isVis[curr.v])
            {
                isVis[curr.v]=true;
                finalCost+= curr.cost;
                for(int i=0;i<graph[curr.v].size();i++)
                {
                    Edge e=graph[curr.v].get(i);
                    pq.add(new Pair(e.dest,e.wt));
                }
            }
        }
        System.out.println("Total minimum cost= "+finalCost);
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph=new ArrayList[4];
        createGraph(graph);

        prims(graph);
    }
}