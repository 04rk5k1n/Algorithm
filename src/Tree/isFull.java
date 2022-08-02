package Tree;

public class isFull {
    public static class Node{
        public int value;
        Node left;
        Node right;
        public Node(int v){
            this.value=v;
        }
    }

    public static boolean isF(Node x){
        if(x==null){
            return true;
        }

        Info data=process(x);
        return data.nodes==(1<<data.height-1);

    }

    public static class Info{
        int height;
        int nodes;
        public Info(int h,int n){
            height=h;
            nodes=n;
        }
    }


    public static Info process(Node x){
        if(x==null){
            return new Info(0,0);
        }
        Info leftData=process(x.left);
        Info rightData=process(x.right);
        int height=Math.max(leftData.height,rightData.height)+1;
        int nodes=leftData.nodes+ rightData.nodes+1;

        return new Info(height,nodes);
    }






}
