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
        String s = sc.next();
        int cnt = 0;
        for(char i = 'a' ;i <= 'z';i++)
            if(count(s,i))cnt++;
        System.out.println((cnt % 2 == 1)?"IGNORE HIM!":"CHAT WITH HER!");
    }
    public static void main(String []args)
    {
        int t = 1 ;
        //t = sc.nextInt();
        while(t-- != 0)
        {
            solve();
        }
    }
}
