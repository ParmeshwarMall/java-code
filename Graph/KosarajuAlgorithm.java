package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgorithm {
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
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }

    static void topSort(ArrayList<Edge>[]graph,int curr,Stack<Integer> st,boolean isVis[])
    {
        isVis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!isVis[e.dest])
            {
                topSort(graph,e.dest,st,isVis);
            }
        }
        st.push(curr);
    }

    static void dfs(ArrayList<Edge>[] graph,int curr,boolean []isVis)
    {
        isVis[curr]=true;
        System.out.print(curr+" ");

        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if (!isVis[e.dest])
            {
                dfs(graph,e.dest,isVis);
            }
        }
    }
    static void kosaraju(ArrayList<Edge>[] graph,int v)
    {
        //Step 1
        Stack<Integer> st=new Stack<>();
        boolean[] isVis=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(!isVis[i])
            {
                topSort(graph,i,st,isVis);
            }
        }

        // Step 2
        ArrayList<Edge>[]transpose=new ArrayList[v];
        for(int i=0;i<v;i++)
        {
            isVis[i]=false;
            transpose[i]=new ArrayList<>();
        }
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));   //reverse edge
            }
        }

        // Step 3
        while(st.size()!=0)
        {
            int curr=st.pop();
            if(!isVis[curr])
            {
                System.out.print("SCC: ");
                dfs(transpose,curr,isVis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        kosaraju(graph,v);
    }
}
