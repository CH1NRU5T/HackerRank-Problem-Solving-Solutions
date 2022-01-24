import java.util.*;
public class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        // number of clouds
        int k=sc.nextInt();
        // jump distance

        int[] c=new int[n];

        for(int i=0;i<n;i++)
        {
            c[i]=sc.nextInt();
        }
        int e=100;
        int cloudIndex=1;
        int i=0;
        while(cloudIndex!=0){
        cloudIndex=(i+k)%n;
        i=cloudIndex;
        if(c[cloudIndex]==1){
            e-=2;}
            e--;
        }
        System.out.println(e);
    }
}