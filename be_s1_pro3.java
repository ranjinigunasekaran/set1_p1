import java.util.*;
class G_beginner_1_3
{
    public static void main(String[] arg)
    {
        int v=0;
        Scanner sc=new Scanner(System.in);
        char[] ch={'a','e','i','o','u','A','E','I','O','U'};
        char s=sc.next().charAt(0);
        for(int i=0;i<10;i++)
          if(s==ch[i])
          {
          System.out.print("Vowel");
          v++;
          }
        if(v==0)
          System.out.print("Consonent");
    }
}
