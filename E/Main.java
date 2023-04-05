import java .util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void solve()
    {
        int n  = sc.nextInt();
        int x = 0;
        while(n--!=0)
        {
            if(sc.next().charAt(1) == '+')
                x++;
            else x--;
        }
        System.out.println(x);
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
