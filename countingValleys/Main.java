import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distanceFromSeaLevel=0;
        int numberOfSteps;
        numberOfSteps=sc.nextInt();
        boolean isBelowSeaLevel=false;
        sc.nextLine();
        int numberOfValleys=0;
        boolean belowSeaLevel=false;
        String steps;
        steps=sc.nextLine();
        for(int i=0;i<steps.length();i++){
            if(steps.charAt(i)=='U'){
                distanceFromSeaLevel++;
            }else if(steps.charAt(i)=='D'){
                distanceFromSeaLevel--;
            }
            if(distanceFromSeaLevel>0){
                isBelowSeaLevel=false;
            }else if(distanceFromSeaLevel<0){
                isBelowSeaLevel=true;
            }
            // System.out.println("Index: "+i+", numberOfSteps = "+distanceFromSeaLevel+", isBelowSeaLevel = "+isBelowSeaLevel);
            if(isBelowSeaLevel)
            {
                if(distanceFromSeaLevel==0 && (steps.charAt(i-1)=='U'||steps.charAt(i)=='U')){
                    // System.out.println("Incrementing!");
                numberOfValleys++;
            }
        }
        }
        System.out.println(numberOfValleys);
    }
}