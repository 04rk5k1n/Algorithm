package KMP;

public class KMP {
    public static int getIndex(String s,String m){
        if(s==null||m==null||s.length()<m.length()||m.length()<1){
            return -1;
        }
        char[] str1=s.toCharArray();
        char[] str2=m.toCharArray();
        int i1=0;
        int i2=0;
        int[] next=getNextArray(str2);
        while(i1<str1.length&&i2<str2.length){
            if(str1[i1]==str2[i2]){
                i1++;
                i2++;
            }
            else if(i2==0){
                i1++;
            }
            else {
                i2=next[i2];
            }
        }
        return i2== str2.length? -1:i2;
    }
    public static int[] getNextArray(char[] s){
        if(s.length==1){
            return new int[]{-1};
        }
        int[] next=new int[s.length];
        next[0]=-1;
        next[1]=0;
        int i=2;
        int cn=0;
        while (i<s.length){
            if(s[i-1]==s[cn]){
                next[i++]=++cn;
            } else if (cn>0) {
                cn=next[cn];
            }
            else {
                next[i++]=0;
            }

        }
        return next;
    }


}
