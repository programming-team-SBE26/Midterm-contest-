import java .util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void solve()
    {
        String s = sc.next().toLowerCase();
        System.out.println((s.equals("yes"))?"YES":"NO");
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
