import java .util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void solve()
    {
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ;i < n;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(int i : arr)System.out.print(i + " ");
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
