package co4;
import java.util.*;

class Calculate{
    void calculate(int n){
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[n];
        int num, sum=0;
        for(int i =0; i<n; i++){
            System.out.printf("Enter number %d:",(i+1));
            num = scan.nextInt();
            if(num < 0){
                try{
                    throw new Exception();
                }
                catch(Exception e){
                    System.out.println("Please enter a non negative number");
                }
                i--;
            }
            else{
                arr[i] = num;
                sum = sum + arr[i];
            }
        }
        System.out.printf("The average of %d numbers is %d",n,(sum/n));
    }
}

public class q4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Calculate obj = new Calculate();
        System.out.println("How many numbers you want to input to find the average?");
        int n = sc.nextInt();
        obj.calculate(n);
    }
}