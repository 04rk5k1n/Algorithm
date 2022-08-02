package Graph;

import java.util.*;

public class TopologySort {
    public static List<Node> topSort(Graph g){
        //key 节点
        //value 入度
        HashMap<Node,Integer> inMap=new HashMap<>();

        Queue<Node> zeroInList=new LinkedList<Node>();

        for(Node c:g.nodes.values()){
            inMap.put(c, c.in);
            if(c.in==0){
                zeroInList.add(c);
            }
        }

        List<Node> result=new ArrayList<>();
        while(!zeroInList.isEmpty()){
            Node cur=zeroInList.poll();
            result.add(cur);
            for(Node c:cur.nexts){
                inMap.put(c, inMap.get(c)-1);
                if(inMap.get(c)==0){
                    zeroInList.add(c);
                }
            }


        }
        return result;

    }


}
