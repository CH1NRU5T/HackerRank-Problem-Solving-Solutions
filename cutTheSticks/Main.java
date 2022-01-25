import java.util.*;
public class Main{

    private static List<Integer> removeElement(List<Integer> arr, int n){
        arr.remove(n);
        return arr;
    }

    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int count=sc.nextInt();
        List<Integer> arr=new ArrayList<Integer>();

        for(int i=0;i<count;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        for(int i=0;i<arr.size();){
            int temp=arr.get(i);
            arr.remove(i);
            for(int j=0;j<arr.size();){
                if(arr.get(j)==temp){
                    arr.remove(j);
                }else{
                    break;
                }
            }
        System.out.print(arr.size()!=0?arr.size()+"\n":"");
        }
    }
}