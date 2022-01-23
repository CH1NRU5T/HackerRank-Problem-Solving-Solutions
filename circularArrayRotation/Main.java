import java.util.*;
public class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        // number of elements in the integer array
        int k=sc.nextInt();
        // the rotation count
        int q=sc.nextInt();
        // number of queries

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] queries=new int[q];
        for(int i=0;i<q;i++){
            queries[i]=sc.nextInt();
        }

        int[] newArr=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            newArr[(i+k)%(arr.length)]=arr[i];
        }

        for(int i=0;i<queries.length;i++){
            System.out.println(newArr[queries[i]]);
        }
    }
}