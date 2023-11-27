package Hashmap;

import java.util.*;

public class CreateOwnHashmap {
    public static class MyHashmap<k,v>
    {
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f;

        public class Node
        {
            k key;
            v value;
            Node(k key, v value)
            {
                this.key=key;
                this.value=value;
            }
        }

        int n;        // No of entries
        private LinkedList<Node>[] buckets;
        private void initBucket(int N)     // Capacity of Hashtable
        {
            buckets=new LinkedList[N];
            for(int i=0;i< buckets.length;i++)
            {
                buckets[i]=new LinkedList<>();
            }
        }

        public MyHashmap()
        {
            initBucket(DEFAULT_CAPACITY);
        }

        public int size()        // Return the no of entries
        {
            return n;
        }

         private int HashFun(k key)
         {
             int hc=key.hashCode();
             return Math.abs(hc)% buckets.length;
         }
         private int searchBucket(LinkedList<Node> ll,k key)
         {
             for(int i=0;i<ll.size();i++)
             {
                 if(ll.get(i).key==key)
                 {
                     return i;
                 }
             }
             return -1;
         }
         private void rehash()
         {
             LinkedList<Node> [] oldBuckets=buckets;
             initBucket(oldBuckets.length*2);
             n=0;
             for(var bucket: oldBuckets)
             {
                 for(var Node: bucket)
                 {
                     put(Node.key,Node.value);
                 }
             }
         }
        public void put(k key,v value)             // insert/update
        {
             int bi=HashFun(key);
             LinkedList<Node> currBucket=buckets[bi];
             int ei=searchBucket(currBucket,key);
             if(ei==-1)
             {
                 Node node=new Node(key,value);
                 currBucket.add(node);
                 n++;
             }
             else
             {
                 Node currNode=currBucket.get(ei);
                 currNode.value=value;
             }

             if(n>=buckets.length*DEFAULT_LOAD_FACTOR)
             {
                 rehash();
             }
        }

        public v get(k key)
        {
             int bi=HashFun(key);
             LinkedList<Node> currBucket=buckets[bi];
             int ei=searchBucket(currBucket,key);
             if(ei!=-1)
             {
                 Node currNode=currBucket.get(ei);
                 return currNode.value;
             }
             return null;
        }

        public v remove(k key)
        {
            int bi=HashFun(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchBucket(currBucket,key);
            if(ei!=-1)
            {
                Node currNode=currBucket.get(ei);
                v val=currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        MyHashmap<String,Integer> mp=new MyHashmap<>();
        mp.put("Raj",2);
        mp.put("Rohan",5);
        mp.put("Sohan",7);
        mp.put("Rahul",10);
        mp.put("x",15);
        mp.put("y",20);
        System.out.println(mp.size());
        System.out.println(mp.get("Rohan"));
        System.out.println(mp.remove("Sohan"));
        System.out.println(mp.get("Sohan"));
        System.out.println(mp.size());
        System.out.println(mp.get("x"));
        System.out.println(mp.get("y"));
        System.out.println(mp.size());
    }
}
