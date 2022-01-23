import java.util.*;
public class Main{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr=new int[26];
        String input;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        input=sc.nextLine();
        int highest=0;
        for(int i=0;i<input.length();i++){
            int temp=input.charAt(i);
            if((arr[temp-97])>highest){
                highest=arr[temp-97];
            }
        }
        System.out.println(highest*(input.length()));
    }
}