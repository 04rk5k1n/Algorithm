package Graph;

import java.util.HashSet;
import java.util.Stack;

public class DFS {
    public static void dfs(Node x){
        if(x==null){
            return;
        }
        Stack<Node> stack=new Stack<>();
        HashSet<Node> set=new HashSet<>();
        stack.push(x);
        set.add(x);
        System.out.println(x.value);
        while (!stack.isEmpty()){
            Node cur=stack.pop();
            for(Node c: cur.nexts){
                if(!set.contains(c)){
                    stack.push(cur);
                    stack.push(c);
                    set.add(c);
                    System.out.println(c.value);
                    break;
                }

            }

        }



    }
}
