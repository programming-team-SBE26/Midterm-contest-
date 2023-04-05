import java .util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static String sod(String s)
    {
        int sum = 0 ;
        for(int i = 0 ;i < s.length();i++)
        {
            sum+=s.charAt(i)-'0';
        }
        return Integer.toString(sum);
    }
    public static void solve()
    {
        String num = sc.next();
        int cnt = 0 ;
        while(num.length() >1)
        {
            num = sod(num);
            cnt++;
        }
        System.out.println(cnt);
    }
    public static void main(String []args)
    {
        int t = 1 ;
        // t = sc.nextInt();
        while(t-- != 0)
        {
            solve();
        }
    }
}
