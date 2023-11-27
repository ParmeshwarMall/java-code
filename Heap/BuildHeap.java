package Heap;

import java.util.ArrayList;
import java.util.List;

public class BuildHeap {
    static void swap(List<Integer> heap, int i, int j)
    {
        int temp=heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);
    }
    static void pushDownCorrPos(List<Integer> heap,int idx)
    {
        int n=heap.size()-1;
        if(idx==n)
            return;

        int left=(2*idx)+1;
        int right=(2*idx)+2;

        int largest=idx;
        if(left<=n && heap.get(left)<heap.get(largest))
        {
            largest=left;
        }
        if(right<=n && heap.get(right)<heap.get(largest))
        {
            largest=right;
        }
        if(largest==idx)
            return;
        swap(heap,idx,largest);
        pushDownCorrPos(heap,largest);
    }

    static void minHeapify(List<Integer> arr)
    {
        int leafNode=((arr.size()-1)-1)/2;
        for(int i=leafNode;i>=0;i--)
        {
            pushDownCorrPos(arr,i);
        }
    }

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(5);
        l.add(15);
        System.out.println(l);
        minHeapify(l);
        System.out.println(l);
    }
}
