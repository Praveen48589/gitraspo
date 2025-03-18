import java.util.*;
public class palindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the total values : ");
        int totalValues = sc.nextInt();
        sc.close();
        int[] myArr = new int[totalValues];
        for(int i = 0;i<totalValues;i++){
            System.out.print("enter the values"+(i+1)+": ");
            myArr[i] = sc.nextInt();
        }
        boolean isPalin = isPalindrome(myArr);
        if(isPalin){
            System.out.println("your array is palindrome ");
        }else{
            System.out.println("your array is not palindrome");
        }


    }
    
    public static boolean isPalindrome(int[] myArr){
        int i = 0;
        while (i<myArr.length/2) {
            if(myArr[i] !=  myArr[myArr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}            