import java.util.*;
public class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int count=sc.nextInt();
        int score=5;
        int likedScore=0;
        for(int i=1;i<=count;i++){
            int currentLikedScore=(int)Math.floor(score/2);
            likedScore+=(int)currentLikedScore;
            score=currentLikedScore*3;
        }
        System.out.println(likedScore);
    }
}