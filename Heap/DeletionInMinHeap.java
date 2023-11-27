package Heap;

import java.util.ArrayList;
import java.util.List;

public class DeletionInMinHeap {
    static void swap(List<Integer> heap,int i,int j)
    {
        int temp=heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);
    }

    static void deletion(List<Integer> heap)
    {
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);
        pushDownCorrPos(heap,0);
    }

    static void pushDownCorrPos(List<Integer> heap,int idx)
    {
        int n=heap.size()-1;
        if(idx==n)
            return;

        int left=(2*idx)+1;
        int right=(2*idx)+2;

        int smallest=idx;
        if(left<=n && heap.get(left)<heap.get(smallest))
        {
            smallest=left;
        }
        if(right<=n && heap.get(right)<heap.get(smallest))
        {
            smallest=right;
        }
        if(smallest==idx)
            return;
        swap(heap,idx,smallest);
        pushDownCorrPos(heap,smallest);
    }
    public static void main(String[] args) {
        List<Integer> heap=new ArrayList<>();
        heap.add(5);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);
        System.out.println(heap);
        deletion(heap);
        System.out.println();
        System.out.println(heap);
    }
}
