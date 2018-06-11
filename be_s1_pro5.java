import java.util.*;
class G_beginner_1_5
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int big=0;
        if(a>b&&a>c)
          big=a;
        else if(b>c) 
          big=b;
        else 
          big=c;
        System.out.print(big);
    }
}
