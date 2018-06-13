import java.util.*;
class G_beginner_2_9
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int r=1;
        for(int d=1;d<=s;d++)
        {
            r=r*d;
        }  
         System.out.print(r+" ");
    }
}
