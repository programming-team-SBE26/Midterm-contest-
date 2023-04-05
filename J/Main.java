import java .util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void solve()
    {
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ;i < n; i++)
            arr[i] = sc.nextInt();
        for(int i = 0 ; i< n;i++)
        {
            int q = sc.nextInt();
            String s = sc.next();
            for(int j =0 ;j <q;j++)
            {
                if(s.charAt(j) =='D')
                    if(arr[i] == 9)
                        arr[i] = 0;
                    else arr[i]++;
                else if(arr[i] == 0)
                    arr[i] = 9;
                else arr[i]--;
            }
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
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
