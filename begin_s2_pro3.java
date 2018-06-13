import java.util.*;
class G_beginner_2_3
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=2;i<a;i++)
         if(a%i==0)
          c++;
        if(c==0)
         System.out.print("yes");
        else
         System.out.print("no");
    }
}
