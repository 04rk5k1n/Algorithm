package BigData;

public class Island {
    public int countIsland(int m[][]){
        if(m==null||m[0]==null){
            return 0;
        }
        int res=0;
        int N= m.length;
        int M=m[0].length;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(m[i][j]==1){
                    res++;
                    infect(m,i,j,N,M);
                }
            }
        }
        return res;
    }
    public void infect(int m[][],int i,int j,int N,int M){
        if(i<0||j<0||i>=N||j>=M||m[i][j]!=1){
            return;
        }
        m[i][j]=2;
        infect(m,i-1,j,N,M);
        infect(m,i+1,j,N,M);
        infect(m,i,j-1,N,M);
        infect(m,i,j+1,N,M);
    }


}
