import java.util.*;
public class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            int n=sc.nextInt();
            // number of prisoners
            int m=sc.nextInt();
            // number of chocolates
            int s=sc.nextInt();
            int result;
                int temp=s-1+m;
                if(temp%n==0){
                    result= n;
                }else{
                    result= temp%n;
                }
           
            System.out.println(result);
        }
    }
}