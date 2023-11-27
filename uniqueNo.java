import java.util.Scanner;

public class uniqueNo {
    static int unique(int a[],int n)
    {
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[i]=-1;
                    a[j]=-1;
                }

            }
        }
        for(int i=0;i<n;i++) {
            if (a[i] > 0) {
               ans=a[i];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" element of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Unique No.= "+unique(a,n));

    }
}
