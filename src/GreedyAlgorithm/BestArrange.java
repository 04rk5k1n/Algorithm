package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class BestArrange {
    public class Program{
        int start;
        int end;
        Program(int s,int e){
            this.start=s;
            this.end=e;
        }
    }
    public static class ProgramComparator implements Comparator<Program>{
        public int compare(Program p1,Program p2){
            return p1.end-p2.end;
        }
    }

    public static int bestArrange(Program[] programs,int timePoint){
        Arrays.sort(programs,new ProgramComparator());
        int res=0;
        for(int i=0;i<programs.length;i++){
            if(timePoint<=programs[i].start){
                res++;
                timePoint=programs[i].end;
            }
        }
        return res;

    }

}
