import java.util.*;
public class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            int anotherCount=0;
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])<=1){
                    anotherCount++;
                }
            }
            if(anotherCount>count){
                count=anotherCount;
            }
        }
        System.out.println(count+1);
        // count+1 because we have to include the first element with which we are comparing all the elements
    }
}