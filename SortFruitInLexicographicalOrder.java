public class SortFruitInLexicographicalOrder {
    static void sort(String[] fruits)
    {
        int n=fruits.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if((fruits[j].compareTo(fruits[min]))<0)
                {
                   min=j;
                }
            }
            String temp=fruits[min];
            fruits[min]=fruits[i];
            fruits[i]=temp;
        }
    }


    public static void main(String[] args) {
        String fruits[]={"papaya","kiwi","apple","mango"};
        System.out.println("Sorted String is:");
        sort(fruits);
        for(String val: fruits)
        {
            System.out.print(val+" ");
        }
}
}
