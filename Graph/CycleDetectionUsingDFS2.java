package Graph;

import java.util.ArrayList;

public class CycleDetectionUsingDFS2 {
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
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,3));
    }

    static boolean isCycle(ArrayList<Edge>[] graph)
    {
        boolean []isVis=new boolean[graph.length];
        boolean []stack=new boolean[graph.length];

        for(int i=0;i<graph.length;i++)
        {
            if(!isVis[i])
            {
                if(isCycleUtil(graph,i,isVis,stack))
                {
                    return true;
                }
            }
        }
        return false;
    }

     static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr,boolean[] isVis,boolean[] stack) {
        isVis[curr]=true;
        stack[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(stack[e.dest])      // e.dest is neighbour of curr
            {
                return true;
            }
            if(!isVis[e.dest] && isCycleUtil(graph,e.dest,isVis,stack))
            {
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph=new ArrayList[4];
        createGraph(graph);

        System.out.println(isCycle(graph));
    }
}
