import java.util.*;
public class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int count=sc.nextInt();
        int[] arr=new int[count];

        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int high=1;
        int sum=0;

        for(int i=0;i<arr.length-1;){
            int temp=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    temp++;
                    i=j;
                }else{
                    i=j==arr.length-1?arr.length+1:j;
                    break;
                }

                sum+=temp;
                if(temp>high){
                    high=temp;
                }
            }
        }
        System.out.println(arr.length-high);
    }
}