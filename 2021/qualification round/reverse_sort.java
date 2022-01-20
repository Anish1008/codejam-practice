/**
 * reverse_sort
 */
import java.util.*;
public class reverse_sort {
    public static int min(int arr[],int min) {
        int minimum=Integer.MAX_VALUE;
        int p=0;
        for(int i=min;i<arr.length;i++)
        {
            if(arr[i]<minimum)
            {
                minimum=arr[i];
                p=i;
            }
        }
        // System.out.println(p);
        return p;
    }
    public static int[] reverse(int arr[],int l,int r) {
        int arr1[]=new int[arr.length];
        int c=0;
        // System.out.println(l+" "+r);
        for(int i=0;i<=l-1;i++)
        {
            arr1[c++]=arr[i];
        }
        for(int i=r;i>=l;i--)
        {
            arr1[c++]=arr[i];
        }
        for(int i=r+1;i<arr.length;i++)
        {
            arr1[c++]=arr[i];
        }
        // print(arr1);
        return arr1;
    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int m=0,score=0;
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }

            for(int j=0;j<n-1;j++)
            {
                m=min(arr,j);
                score+=m-j+1;
                arr=reverse(arr,j,m);
                // print(arr);
            }
            System.out.println("Case #"+i+": "+score);
        }
        sc.close();
    }
}