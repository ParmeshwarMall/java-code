package Graph;

import java.util.ArrayList;

public class CycleDetectionUsingDFS1 {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i< graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        //graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
       // graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,0));

        graph[4].add(new Edge(4,2));
    }

    static boolean cycleDet(ArrayList<Edge>[] graph)
    {
        boolean []isVis=new boolean[graph.length];
        for(int i=0;i< graph.length;i++){
            if(!isVis[i])
            {
                if(cycleDetUtil(graph,isVis,i,-1))
                {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean cycleDetUtil(ArrayList<Edge>[] graph,boolean []isVis,int curr,int par)   //par-->parent
    {
        isVis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!isVis[e.dest])
            {
                if(cycleDetUtil(graph,isVis,e.dest,curr))
                {
                    return true;
                }
            }
            else if(isVis[e.dest] && e.dest!=par)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge>[] graph=new ArrayList[5];
        createGraph(graph);
        System.out.println(cycleDet(graph));
    }
}
