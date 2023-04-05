import java .util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void solve()
    {
        int n = sc.nextInt();
        String s = sc.next();
        char max = s.charAt(0);
        for(int i = 0 ;i < n ;i++)
        {
            if(s.charAt(i) > max)
                max = s.charAt(i);
        }
        System.out.println((max - 'a' +1));
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
