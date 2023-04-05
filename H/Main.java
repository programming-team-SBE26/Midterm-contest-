import java .util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void solve()
    {
        String s = sc.next();
        System.out.println(((s.charAt(0)-'0')+(s.charAt(2)-'0')));
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
