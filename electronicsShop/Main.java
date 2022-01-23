import java.util.Scanner;
public class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int b;
        b=sc.nextInt();
        int lengthKeyboards,lengthDrives;
        lengthKeyboards=sc.nextInt();
        lengthDrives=sc.nextInt();
        int[] keyboards=new int[lengthKeyboards];
        int[] drives=new int[lengthDrives];

        for(int i=0;i<keyboards.length;i++){
            keyboards[i]=sc.nextInt();
        }
        for(int i=0;i<drives.length;i++){
            drives[i]=sc.nextInt();
        }

        int highest = -1;
        if(keyboards.length<drives.length){
            for(int i=0;i<drives.length;i++){
                for(int j=0;j<keyboards.length;j++){
                    if(drives[i]+keyboards[j]>highest && drives[i]+keyboards[j]<=b){
                        highest=drives[i]+keyboards[j];
                    }
                }
            }
        }else{
            for(int i=0;i<keyboards.length;i++){
                for(int j=0;j<drives.length;j++){
                    if(drives[j]+keyboards[i]>highest && drives[j]+keyboards[i]<=b){
                        highest=drives[j]+keyboards[i];
                    }
                }
            }
        }
        System.out.println(highest);
    }
}