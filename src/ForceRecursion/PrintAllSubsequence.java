package ForceRecursion;

public class PrintAllSubsequence {
    public static void printAllSubsequence(String s){
        char[] chs=s.toCharArray();
        process(chs,0);
    }
    public static void process(char[] chs,int i){
        if(i==chs.length){
            System.out.println(String.valueOf(chs));
            return;
        }
        process(chs,i+1);
        char tmp=chs[i];
        chs[i]=0;
        process(chs,i+1);
        chs[i]=tmp;
    }

}
