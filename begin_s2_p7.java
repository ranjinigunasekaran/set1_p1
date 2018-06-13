import java.util.*;
class G_beginner_2_7
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int r=0,temp=s;
        double pow=0,sum=0;
        int l=Integer.toString(s).length();
        for(int i=0;i<l;i++)
        {
            r=s%10;
            pow=Math.pow(r,l);
            sum=sum+pow;
            s=s/10;
        }
        if(temp==sum)
         System.out.print("yes");
        else
         System.out.print("no");
    }
}
