package Graph;

public class UnionAndFind {
    static int n=7;
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
        if(par[x]==x)
        {
            return x;
        }
        //return find(par[x]);
        return par[x]=find(par[x]);       //Path compression
    }

    static void union(int a,int b)
    {

        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB])
        {
            par[parB]=parA;              // b jake a ke saath judega
            rank[parA]++;
        }
        else if(rank[parA]<rank[parB])
        {
            par[parA]=parB;
        }
        else par[parB]=parA;
    }

    public static void main(String[] args) {
        init();
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));

    }
}
