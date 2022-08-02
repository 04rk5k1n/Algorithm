package Sort;

public class GetMax {
    public static int getMax(int[] arr){
        return process(arr,0,arr.length-1);
    }

    public static int process(int[] arr,int left,int right){
        if(left==right){
            return arr[left];
        }

        int mid=left+(right-left)/2;
        int leftMax=process(arr,left,mid);
        int rightMax=process(arr,mid+1,right);
        return Math.max(leftMax,rightMax);
    }
    public static void main(String args[]){
        int[] arr=new int[]{1,5,4,9,8};
        System.out.println(getMax(arr));
    }



}
