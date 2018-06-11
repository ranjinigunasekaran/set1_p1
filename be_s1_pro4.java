import java.util.*;
class G_beginner_1_4
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
          if(s>=65&&s<=90||s>=97&&s<=122)
             System.out.print("Alphabet");
          else
             System.out.print("No");
    }
}
