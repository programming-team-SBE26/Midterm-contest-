import java .util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void solve()
    {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int n_zeros = 0;
        for(int i = 0 ;i < n;i++)
        {
            arr[i] = sc.nextInt();
            sum+=arr[i];
            if(arr[i] == 0)
                n_zeros++;
        }
        int cnt = n_zeros;
        System.out.println((n_zeros + sum == 0)?cnt+1:cnt);
    }
    public static void main(String []args)
    {
        int t = 1 ;t = sc.nextInt();
        while(t-- != 0)
        {
            solve();
        }
    }
}
