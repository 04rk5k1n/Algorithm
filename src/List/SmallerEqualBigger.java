package List;

import java.util.List;

//给出一个链表 list 和 一个值 x 按照x 把链表分为小于x =x 大于x 三部分
public class SmallerEqualBigger {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }

        private void add(int data) {
            if (this.next == null) {
                this.next = new Node(data);        //如果当前节点的next为null,直接创建一个新的节点
            } else {
                this.next.add(data);            //否则进行递归调用，直到最后在某个为空的节点创建一个新节点
            }
        }
    }

// 方法一 用一个Node数组 把链表放入，然后partition，最后返回链表（适用于笔试，空间复杂度高）
        public static Node listPartition1(Node head,int pivot){
            if(head==null){
                return head;
            }
            Node cur=head;
            int list_length=0;
            while (cur!=null){
                cur=cur.next;
                list_length++;
            }
            Node nodeArr[]=new Node[list_length];
            cur=head;
            for(int i=0;i<list_length;i++){
                nodeArr[i]=cur;
                cur=cur.next;
            }
            arrPartition(nodeArr,pivot);
            for(int i=1;i<nodeArr.length;i++){
                nodeArr[i-1].next=nodeArr[i];
            }
            nodeArr[list_length-1].next=null;
            return nodeArr[0];
        }
        public static void arrPartition(Node[] arr,int p){
            int small=-1;
            int big=arr.length;
            int index=0;
            while(index!=big){
                if(arr[index].value<p){
                    swap(arr,++small,index++);
                }
                else if(arr[index].value==p){
                    index++;
                }
                else{
                    swap(arr,--big,index);
                }

            }
        }

        public static void swap(Node[] arr,int a,int b){
            Node tmp=arr[a];
            arr[a]=arr[b];
            arr[b]=tmp;
        }

    public static void main(String args[]){
    Node head=new Node(2);
    head.add(3);
        head.add(4);
        head.add(9);
        head.add(1);
        listPartition1(head,4);

        while(head!=null){
            System.out.println(head.value);
            head=head.next;
        }
        }






}
