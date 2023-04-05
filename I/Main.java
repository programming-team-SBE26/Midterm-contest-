import java .util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void solve()
    {
        String k = "qwertyuiopasdfghjkl;zxcvbnm,./";
        String s = sc.nextLine();
        String in = sc.next();
        for(int i = 0 ;i < in.length();i++)
        {
            System.out.print((s.equals("R"))?k.charAt(k.indexOf(in.charAt(i))-1):k.charAt(k.indexOf(in.charAt(i))+1));
        }
    }
    public static void main(String []args)
    {
        int t = 1 ;//t = sc.nextInt();
        while(t-- != 0)
        {
            solve();
        }
    }
}
