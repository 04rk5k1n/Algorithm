package Tree;

public class Morris {
    public static class Node{
        public int value;
        Node left;
        Node right;
        public Node(int v){
            this.value=v;
        }
    }
    public static void morris(Node head){
        if(head==null){
            return;
        }
        Node cur=head;
        Node mostRight=null;
        while (cur!=null){
            if(cur.left!=null){
                mostRight=cur.left;
                while (mostRight.right!=null&&mostRight.right!=cur){
                    mostRight=mostRight.right;
                }
                if(mostRight.right!=null){
                    mostRight.right=null;
                }
                else {
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                }
            }
            cur=cur.right;
        }
    }
}
