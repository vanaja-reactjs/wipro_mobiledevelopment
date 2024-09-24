import java.util.*;
public class Rev2 {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter string");
String str=sc.nextLine();
System.out.println("Original string :   "+str);
System.out.println("After reverse string :");
for(int i=str.length();i>0;--i){
    System.out.print(str.charAt(i-1));
}

    }
    
}
