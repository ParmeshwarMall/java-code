package GreedyAlgorithm;

import java.util.*;

public class JobSequencingProblem {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        List<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++)
        {
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }

        Collections.sort(jobs,(a,b)->b.profit-a.profit);   // Sort jobs according to their profit int

        List<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i< jobs.size();i++)
        {
            Job curr=jobs.get(i);
            if(curr.deadline>time)
            {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max jobs= "+seq.size());
        System.out.println("Jobs is: "+seq);
    }
}
