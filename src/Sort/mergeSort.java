package Sort;

public class mergeSort {
    public static void mergesort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        process(arr,0,arr.length-1);
    }

    public static void process(int[] arr,int left,int right){
        if(left==right){
            return;
        }
        int mid=left+((right-left)>>2);
        process(arr,left,mid);
        process(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public static void merge(int[] arr,int L,int M,int R){
        int[] help=new int[R-L+1];
        int i=0;
        int p1=L;
        int p2=M+1;
        while(p1<=M&&p2<=R){
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=M){
            help[i++]=arr[p1++];
        }
        while(p2<=R){
            help[i++]=arr[p2++];
        }
        for(int k=0;k<help.length;k++){
            arr[L+k]=help[k];
        }

    }

    public static void main(String args[]){
        int arr[]={3,4,1,5,4,6,5,7,1};
        mergesort(arr);
        for(int c:arr){
            System.out.println(c);
        }

    }
}
