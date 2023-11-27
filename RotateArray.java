import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter element of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter no. of rotation");
        int k=sc.nextInt();
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=a[i];
        }
        for(int i=0;i<(n-k);i++)
        {
            ans[j++]=a[i];
        }
        for(int i=0;i<n;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
