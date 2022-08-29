package Tree;

import java.util.List;

public class MaxHappy {
    public static class Employee{
        public int happy;
        public List<Employee> nexts;
    }

    public class Info{
        public int laiMaxHappy;
        public int buMaxHappy;
        public Info(int lai,int bu){
            laiMaxHappy=lai;
            buMaxHappy=bu;
        }
    }

    public Info process(Employee x){
        if(x.nexts.isEmpty()){
            return new Info(x.happy,0);
        }

        int lai=x.happy;
        int bu=0;
        for(Employee next:x.nexts){
            Info nextInfo=process(next);
            lai+=nextInfo.buMaxHappy;
            bu+=Math.max(nextInfo.buMaxHappy, nextInfo.laiMaxHappy);
        }
        return new Info(lai,bu);
    }
}
