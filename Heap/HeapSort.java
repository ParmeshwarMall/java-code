package Heap;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {
    static void swap(List<Integer> heap, int i, int j)
    {
        int temp=heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);
    }
    static void pushDownCorrPos(List<Integer> heap,int idx,int n)
    {
//        int n=heap.size()-1;
        if(idx==n)
            return;

        int left=(2*idx)+1;
        int right=(2*idx)+2;

        int largest=idx;
        if(left<=n && heap.get(left)>heap.get(largest))
        {
            largest=left;
        }
        if(right<=n && heap.get(right)>heap.get(largest))
        {
            largest=right;
        }
        if(largest==idx)
            return;
        swap(heap,idx,largest);
        pushDownCorrPos(heap,largest,n);
    }
    static void maxHeap(List<Integer> arr)  // Converting the given arr into max heap
    {
        int leafNode=((arr.size()-1)-1)/2;
        for(int i=leafNode;i>=0;i--)
        {
            pushDownCorrPos(arr,i,arr.size()-1);
        }
    }

    static void heapSort(List<Integer> arr)
    {
        maxHeap(arr);
        int n=arr.size()-1;
        for(int i=n;i>0;i--)
        {
            swap(arr,0,i);
            pushDownCorrPos(arr,0,i-1);
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
        heapSort(l);
        System.out.println(l);
    }
}
