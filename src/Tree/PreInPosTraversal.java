package Tree;
//递归方法 非递归方法再去学一下
public class PreInPosTraversal {

    public static class Node{
        public int value;
        Node left;
        Node right;
        public Node(int v){
            this.value=v;
        }
    }

    public static void preOrderReCur(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.value);
        preOrderReCur(head.left);
        preOrderReCur(head.right);
    }

    public static void inOrderReCur(Node head){
        if(head==null){
            return;
        }

        inOrderReCur(head.left);
        System.out.println(head.value);
        inOrderReCur(head.right);
    }

    public static void posOrderReCur(Node head){
        if(head==null){
            return;
        }

        posOrderReCur(head.left);

        posOrderReCur(head.right);
        System.out.println(head.value);
    }





}
