import java.util.Arrays;
import java.util.Scanner;

public class DynamicProg
{
    static int max(int a,int b)
    {
        if(a>b) return a;
        else return b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();
        int [][] f = new int[2010][2010];
        int [] a = new int [2010];
        for(int i=1;i<=n;i++)
            a[i]=scan.nextInt();
        for(int i=1;i<=n+1;i++)
            for(int j=0;j<h;j++)
                f[i][j]=-1000000;

        int ans = 0;
        f[1][0]=0;
        for(int i=1;i<=n;i++)
            for(int j=0;j<h;j++)
            {
                int goal = (j + a[i])%h;
                if(goal>=l && goal<=r)
                    f[i+1][goal] = max(f[i+1][goal],f[i][j]+1);
                else
                    f[i+1][goal] = max(f[i+1][goal],f[i][j]);
                if(f[i+1][goal] > ans) ans = f[i+1][goal];
                goal = (j+a[i]-1+h)%h;
                if(goal>=l && goal<=r)
                    f[i+1][goal] = max(f[i+1][goal],f[i][j]+1);
                else
                    f[i+1][goal] = max(f[i+1][goal],f[i][j]);
                if(f[i+1][goal] > ans) ans = f[i+1][goal];
            }
        System.out.println(ans);
    }
}