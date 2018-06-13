import java.util.*;
class G_beginner_1_9
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int f[]=new int[N];
        int sum=0;
         for(int i=0;i<N;i++)
             f[i]=sc.nextInt();
        for(int i=0;i<k;i++)
            sum=sum+f[i];
        System.out.print(sum);
    }
}
