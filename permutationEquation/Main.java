import java.util.*;
public class Main{

    private static int findIndex(int[] arr, int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i+1;
            }
        }
        return -1;
    }

    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int count=sc.nextInt();
        int[] arr=new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int x;
        for(int i=1;i<=arr.length;i++){
            x=i;
            int index=findIndex(arr,x);
            int indexOfIndex = findIndex(arr,index);
        System.out.println(indexOfIndex);
        }
    }
}