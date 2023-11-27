public class GetShortestPathInString {
    static float shortestPath(String d)
    {
        int x=0,y=0;
        for(int i=0;i<d.length();i++)
        {
            char dir=d.charAt(i);

            if(dir=='E')
                x++;
            else if(dir=='W')
                x--;
            else if(dir=='N')
                y++;
            else y--;
        }

        int X2=x*x;      // It is x square
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);     // Typecast into float value
    }

    public static void main(String[] args) {
        String d="WNEENESENNN";
        System.out.println(shortestPath(d));
    }
}
