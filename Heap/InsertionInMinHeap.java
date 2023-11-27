package Heap;

import java.util.*;

public class InsertionInMinHeap {
    static void pushUpCorrPos(List<Integer> heap,int idx)
    {
        int parIdx=(idx-1)/2;
        if(idx==0 || heap.get(idx)>heap.get(parIdx))
            return;
        if(heap.get(idx)<heap.get(parIdx))
        {
            int temp=heap.get(idx);
            heap.set(idx, heap.get(parIdx));
            heap.set(parIdx,temp);
        }
        pushUpCorrPos(heap,parIdx);

    }
    static void insertion(List<Integer> heap,int element)
    {
        heap.add(element);
        int idx=heap.size()-1;
        pushUpCorrPos(heap,idx);

    }
    public static void main(String[] args) {
        List<Integer> heap=new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
        System.out.println();
        insertion(heap,5);
        System.out.println(heap);
    }
}
