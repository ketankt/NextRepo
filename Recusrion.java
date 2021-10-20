//static method recursion
import java.util.*;
public class Recusrion
{
    public static boolean rec(int x, int n, int sum, int [] a)
    {
        if(x==n)
        {
            if(sum%360==0) return true;
            else return false;
        }
        boolean ans=false;
        ans=ans|rec(x+1,n,sum+a[x],a);
        ans=ans|rec(x+1,n,sum-a[x],a);
        return ans;
    }
    public static void main(String[] args)
    {
        // Solution of https://codeforces.com/contest/1097/problem/B
        Scanner sc= new Scanner(System.in);
        int t=1;
        //t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int [] a= new int [n];
            for(int i=0 ; i<n ; i++)
            {
                a[i]=sc.nextInt();
            }
            if(rec(0,n,0,a)==true)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t--;
        }
    }
}