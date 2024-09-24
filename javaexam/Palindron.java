import java.util.*;
public class Palindron {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to check if it is palindrom or not");
        int n=sc.nextInt();
        int r,temp,sum=0;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+"  number is  palindrom");
        }else{

            System.out.println(temp+"   number  not a palindrom");
        }
    }
    
}
