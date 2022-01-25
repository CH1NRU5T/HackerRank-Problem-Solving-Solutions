import java.util.*;
public class Main{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int wLength=sc.nextInt();
        int[] w=new int[wLength];

        int casesLength=sc.nextInt();
        for(int i=0;i<w.length;i++){
            w[i]=sc.nextInt();
        }

        int[] cases=new int[casesLength*2];

        for(int i=0;i<cases.length;i++){
            cases[i]=sc.nextInt();
        }

        for(int i=0;i<cases.length;i+=2){
            int tempArrLength=cases[i+1]-cases[i]+1;
            int[] tempArr=new int[tempArrLength];
            for(int j=cases[i],k=0;j<=cases[i+1];j++,k++){
                tempArr[k]=w[j];
            }
            Arrays.sort(tempArr);
            System.out.println(tempArr[0]);
        }
    }
}