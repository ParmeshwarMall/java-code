package Graph;

import java.util.*;

public class TopologicalSortingUsingDFS {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i=0;i<graph.length;i++)
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

    static void topSort(ArrayList<Edge>[] graph)
    {
        boolean[] isVis=new boolean[graph.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<graph.length;i++)
        {
            if(!isVis[i])
            {
                topSortUtil(graph,i,isVis,st);
            }
        }
        while(st.size()!=0)
        {
            System.out.print(st.pop()+" ");
        }
    }

    static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] isVis, Stack<Integer> st) {
        isVis[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!isVis[e.dest])
            {
                topSortUtil(graph,e.dest,isVis,st);
            }
        }
        st.push(curr);
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph=new ArrayList[6];
        createGraph(graph);

        topSort(graph);
    }
}
