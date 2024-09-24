import java.util.Scanner;
public class Reverse1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        for(int i=str.length();i>0;--i){
            System.out.print(str.charAt(i-1));
        }
    }
    
}
