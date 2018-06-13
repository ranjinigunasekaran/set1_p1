import java.util.*;
class G_beginner_2_2
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0,r=0;
        int t=a;
        while(a>0)
        {
            r=a%10;
            s=(s*10)+r;
            a=a/10;
        }
        if(s==t)
         System.out.print("yes");
        else
         System.out.print("no");
    }
}
