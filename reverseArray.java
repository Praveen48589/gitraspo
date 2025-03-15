import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the total values : ");
        int totalValues = sc.nextInt();
        int[] myArr = new int[totalValues];
        for(int i = 0;i<totalValues;i++){
            System.out.print("enter the values"+(i+1)+": ");
            myArr[i] = sc.nextInt();
            
        }
        reverse(myArr);
        System.out.print("your array is reverse : ");
        displayArray(myArr);
    }
    public static void reverse(int[] num){
        int i = 0;
        while (i<num.length/2) {
            int swap = num[i];
            num[i] = num[(num.length-1)-i];
            num[(num.length-1)-i] = swap;
            i++; 
        }
    }
    public static int displayArray(int[] num){
        int i = 0;
        while (i<num.length) {
            System.out.print(num[i]+" ");
            i++;
        }System.out.println();
                return i;

    }
}    
