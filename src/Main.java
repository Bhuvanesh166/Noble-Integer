import java.util.Arrays;
import java.util.Scanner;
class NobleInteger{
    public static int findNobelIntegers(int[] arr){
        int sum=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==((arr.length-1)-i)){
                sum++;
            }
        }
        return sum>0?sum:-1;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter size of array:");
        int sze=scanner.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Noble Count "+findNobelIntegers(arr));
    }
}
