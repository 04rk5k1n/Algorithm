package GreedyAlgorithm;

import java.util.PriorityQueue;

public class LessMoneySplitGold {
    public static int lessMoney(int[] arr){
        PriorityQueue<Integer> pQ=new PriorityQueue<>();
        for(int c:arr){
            pQ.add(c);
        }
        int sum=0;
        int cur;
        while (pQ.size()>1){
            cur=pQ.poll()+pQ.poll();
            sum+=cur;
            pQ.add(sum);
        }
        return sum;
    }
}
