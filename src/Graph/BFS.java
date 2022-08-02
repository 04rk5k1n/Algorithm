package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void bfs(Node x){
        if(x==null){
            return;
        }
        Queue<Node> queue=new LinkedList<Node>();
        HashSet<Node> set=new HashSet<>();
        queue.add(x);
        set.add(x);
        while (!queue.isEmpty()){
            Node cur=queue.poll();
            System.out.println(cur.value);
            for(Node c:x.nexts){
                if(!set.contains(c)){
                    queue.add(c);
                    set.add(c);
                }
            }
        }

    }
}
