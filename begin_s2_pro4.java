import java.util.*;
class G_beginner_2_4
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a+1;i<b;i++)
         if(i%2==1)
            System.out.print(i+" ");
    }
}
