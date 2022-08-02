package ForceRecursion;
//暴力递归是动态规划的基础。
//
//暴力递归其实就是尝试。
//
//暴力递归的过程：
//
//1. 把问题转化为规模缩小了的同类问题的子问题；
//
//2. 有明确的不需要继续递归的条件（base case）；
//
//3. 有当得到子问题的结果后的决策过程；
//
//4. 不记录每一个子问题的解。
public class Hanoi {
    public static void hanoi(int n){
        if(n>0){
            func(n,"左","右","中");
        }
    }

    public static void func(int n,String start,String end,String other){
        if(n==1){
            System.out.println("move 1 from"+start+"to"+end);
        }
        else {
            func(n - 1, start, other, end);
            System.out.println("move" + n + "from" + start + "to" + "end");
            func(n - 1, other, end, start);
        }
    }

}
