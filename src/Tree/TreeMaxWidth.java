package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//宽度优先（层序）
public class TreeMaxWidth {
    public static class Node{
        public int value;
        Node left;
        Node right;
        public Node(int v){
            this.value=v;
        }
    }
    //宽度优先遍历
    public static void w(Node head){
        if(head==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(head);
        HashMap<Node,Integer> levelMap=new HashMap<>();
        levelMap.put(head,1);
        int curLevel =1;
        int curLevelNodes=0;
        int max=-1;

        while (!queue.isEmpty()){
            Node cur=queue.poll();
            int curNodeLevel=levelMap.get(cur);
            if(curNodeLevel==curLevel){
                curLevelNodes++;
            }
            else{
                max=Math.max(max,curLevelNodes);
                curLevel++;
                curLevelNodes=0;

            }


            if(cur.left!=null){
                levelMap.put(cur.left,curNodeLevel++);
                queue.add(cur.left);
            }
            if(cur.right!=null){
                levelMap.put(cur.right,curLevelNodes++);
                queue.add(cur.right);
            }


        }

    }




}
