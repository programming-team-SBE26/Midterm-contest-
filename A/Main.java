import java .util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static boolean count(String s, char item)
    {
        for(int i = 0 ;i < s.length();i++)
        {
            if(s.charAt(i) == item)
                return true ;
        }
        return false;
    }
    public static void solve()
    {
        String s = "codeforces";
        char c = sc.next().charAt(0);
        System.out.println((count(s,c))?"Yes":"NO");
    }
    public static void main(String []args)
    {
        int t = 1 ;
        t = sc.nextInt();
        while(t-- != 0)
        {
            solve();
        }
    }
}
