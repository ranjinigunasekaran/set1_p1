import java.util.*;
class G_beginner_2_10
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int r=1;
        for(int d=1;d<=5;d++)
        {
            r=d*s;
         System.out.print(r+" ");
        }
    }
}
